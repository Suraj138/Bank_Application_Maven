package com.example.Insurances.Model;

import java.time.LocalDate;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "insurance")
public class Insurances {
	@Column(name = "customer_id")
	private int customerId;

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "insurance_id")
	private int insuranceId;

	@Column(name = "insurance_type")
	private String insuranceType;

	@Column(name = "insured_amount")
	private int insuredAmount;

	@Column(name = "insurance_end_date")
	private LocalDate insuranceEndDate;

	public int getCustomerId() {
		return customerId;
	}

	public void setCustomerId(int customerId) {
		this.customerId = customerId;
	}

	public int getInsuranceId() {
		return insuranceId;
	}

	public void setInsuranceId(int insuranceId) {
		this.insuranceId = insuranceId;
	}

	public String getInsuranceType() {
		return insuranceType;
	}

	public void setInsuranceType(String insuranceType) {
		this.insuranceType = insuranceType;
	}

	public int getInsuredAmount() {
		return insuredAmount;
	}

	public void setInsuredAmount(int insuredAmount) {
		this.insuredAmount = insuredAmount;
	}

	public LocalDate getInsuranceEndDate() {
		return insuranceEndDate;
	}

	public void setInsuranceEndDate(LocalDate insuranceEndDate) {
		this.insuranceEndDate = insuranceEndDate;
	}

}
