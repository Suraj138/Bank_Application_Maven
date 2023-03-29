package com.example.Loans.Service;

import java.util.List;

import com.example.Loans.Model.Loan;

public interface LoanService {

	List<Loan> getAllLoans();

	List<Loan> getAllLoansByCustomerId(int customerId);

}
