package com.example.Loans.Repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.example.Loans.Model.Loan;

public interface LoanRepository extends JpaRepository<Loan, Integer> {

	@Query(value = "select * from loans 1 where 1.customer_id=?1", nativeQuery = true)

	List<Loan> searchByCustomerId(int customerId);
}
