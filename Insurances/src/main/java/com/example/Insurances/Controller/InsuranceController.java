package com.example.Insurances.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.Insurances.Model.Insurances;
import com.example.Insurances.Repository.InsuranceRepository;



@RestController
public class InsuranceController {

	@Autowired
	private InsuranceRepository insuranceRepository;

	@PostMapping(value = "/insurance")
	public List<Insurances> getAccountDetails(@RequestBody Insurances account) {

		List<Insurances> accounts = insuranceRepository.getInsuranceByCustomerId(account.getCustomerId());
		return accounts;
	}
}
