package com.cts.dao;

import java.util.List;
import java.util.Optional;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.cts.model.Bank;

@Repository
public interface BankDAO extends CrudRepository<Bank,Integer> {


	public Optional<Bank> findByBankName(String bankName);

	public List<Bank> findByBankCity(String bankCity);

	public Optional <Bank> findByBankBranch(String bankBranch);

	
	
}
