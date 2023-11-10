package com.staragile.banking;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

;

@Service
public class BankServices {

	@Autowired
	BankDAORepository bankDAORepository; 
	
	public List<Bank> getBank()
	{
		List<Bank> bankList = new ArrayList<Bank>();
		bankDAORepository.findAll().forEach(bankList::add);
		return bankList;
	}
	
	public void createAccount (Bank bank)
	{
		bankDAORepository.save(bank);
	}
	
	public Optional<Bank> viewAccount (String accNo)
	{
		return bankDAORepository.findById(accNo);
	}
	
	public void updateAccount(String id, Bank bank)
	{
		bankDAORepository.save(bank);
	}
	
	public void deleteAccount(String id)
	{
		bankDAORepository.deleteById(id);
	}
}
