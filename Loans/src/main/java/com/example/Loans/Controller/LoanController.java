package com.example.Loans.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.example.Loans.Model.Loan;
import com.example.Loans.Service.LoanService;

@RestController
public class LoanController {

	@Autowired
	private LoanService loanService;

	@GetMapping("/loans")
	public ResponseEntity<List<Loan>> getAllProduct() {
		return ResponseEntity.ok().body(loanService.getAllLoans());

	}

	@GetMapping("/loan/{id}")
	public ResponseEntity<List<Loan>> getLoanByCustomerId(@PathVariable int id) {
		return ResponseEntity.ok().body(loanService.getAllLoansByCustomerId(id));
	}

}