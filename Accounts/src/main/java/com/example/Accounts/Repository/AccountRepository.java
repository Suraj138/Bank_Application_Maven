package com.example.Accounts.Repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.example.Accounts.Model.Accounts;

@Repository
public interface AccountRepository extends CrudRepository<Accounts, Long> {

	Accounts findByCustomerId(int customerId);

}