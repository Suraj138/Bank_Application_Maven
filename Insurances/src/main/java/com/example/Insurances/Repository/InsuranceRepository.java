package com.example.Insurances.Repository;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

import com.example.Insurances.Model.Insurances;

public interface InsuranceRepository extends CrudRepository<Insurances, Long> {

	List<Insurances> getInsuranceByCustomerId(int customerId);
}