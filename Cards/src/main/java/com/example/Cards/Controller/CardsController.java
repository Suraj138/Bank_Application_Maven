package com.example.Cards.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.Cards.Model.Cards;
import com.example.Cards.Model.Customers;
import com.example.Cards.Repository.CardsRepository;



@RestController
public class CardsController {

	@Autowired
	private CardsRepository cardsRepository;

	@PostMapping("/cards")
	public List<Cards> getCardDetails(@RequestBody Customers customer) {
		List<Cards> cards = cardsRepository.findByCustomerId(customer.getCustomerId());
		return cards;
	}

}
