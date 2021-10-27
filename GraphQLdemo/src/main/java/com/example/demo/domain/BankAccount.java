package com.example.demo.domain;

import java.util.UUID;

import lombok.Builder;
import lombok.Value;

@Builder
@Value
public class BankAccount {


	UUID id;
	String name;
	Currency currency;
	
	public BankAccount(UUID id, String name, Currency currency) {
		super();
		this.id = id;
		this.name = name;
		this.currency = currency;
	}
}
