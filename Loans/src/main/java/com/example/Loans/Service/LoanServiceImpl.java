package com.example.Loans.Service;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.Loans.Model.Loan;
import com.example.Loans.Repository.LoanRepository;

@Service
@Transactional
public class LoanServiceImpl implements LoanService {

	@Autowired
	private LoanRepository loanRepository;

	public List<Loan> getAllLoans() {
		return this.loanRepository.findAll();
	}

	public List<Loan> getAllLoansByCustomerId(int customerId) {
		return this.loanRepository.searchByCustomerId(customerId);
	}

}
