package com.example.demo.resolver;

import java.util.UUID;

import org.slf4j.Logger;
import org.springframework.stereotype.Component;

import com.example.demo.domain.BankAccount;
import com.example.demo.domain.Currency;

import graphql.kickstart.tools.GraphQLQueryResolver;
import lombok.extern.slf4j.Slf4j;

@Slf4j
@Component
public class bankAccountResolver implements GraphQLQueryResolver {

	public BankAccount bankAccount1(UUID id) {
		return new BankAccount(id, "Harshit", Currency.USD);
	}
}
