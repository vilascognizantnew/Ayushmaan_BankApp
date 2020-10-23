package com.cts.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import com.cts.model.Bank;
import com.cts.service.BankService;

@Controller
public class BankController {

	
	@Autowired
	BankService bankService;
	

	@GetMapping(value="/allBanks")
	public ResponseEntity<?> bankList()
	{
		return new ResponseEntity<List<Bank>>(bankService.allBanks(),HttpStatus.OK);
		
	}
	
	
	
	@GetMapping(value="/searchBankById/{id}")
	public ResponseEntity<?> searchBanksById(@PathVariable("id") int id)
	{
		Bank bi = bankService.searchBankById(id);
		if(bi==null){
			return new ResponseEntity<String>("not found", HttpStatus.NOT_FOUND);
		}
		return new ResponseEntity<Bank>(bi,HttpStatus.OK);
	}
	
	@GetMapping(value="/searchBankByName/{bankName}")
	public ResponseEntity<?> searchBanksByName(@PathVariable("bankName") String bankName)
	{
		Bank bn = bankService.searchBankByName(bankName);
		if(bn==null){
			return new ResponseEntity<String>("not found", HttpStatus.NOT_FOUND);
		}
		return new ResponseEntity<Bank>(bn,HttpStatus.OK);
	}
	
	@GetMapping(value="/searchBankByBranch/{bankBranch}")
	public ResponseEntity<?> searchBanksByBranch(@PathVariable("bankName") String bankBranch)
	{
		Bank bn = bankService.searchBankByBranch(bankBranch);
		if(bn==null){
			return new ResponseEntity<String>("not found", HttpStatus.NOT_FOUND);
		}
		return new ResponseEntity<Bank>(bn,HttpStatus.OK);
	}
	
	
}
