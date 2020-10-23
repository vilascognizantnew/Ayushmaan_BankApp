package com.cts.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cts.dao.BankDAO;
import com.cts.model.Bank;

@Service
public class BankService {
	
	@Autowired
	BankDAO bankDao;
	
	public List<Bank> allBanks(){
		return (List<Bank>) bankDao.findAll();
	}
	
	
	public Bank searchBankById(int id){
		Optional<Bank> b = bankDao.findById(id);
		if(b.isPresent()){
			return b.get();
		}
		return null;
	}
	
	public Bank searchBankByName(String bankName){
		Optional<Bank> bn = bankDao.findByBankName(bankName);
		if(bn.isPresent()){
			return bn.get();
		}
		return null;
	}
	public Bank searchBankByBranch(String bankBranch){
		Optional <Bank> bb = bankDao.findByBankBranch(bankBranch);
		if(bb.isPresent()){
			return bb.get();
		}
		return null;
	}
	

	

}
