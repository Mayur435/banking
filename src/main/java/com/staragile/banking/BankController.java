package com.staragile.banking;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController	
public class BankController {

	@Autowired
	BankServices bankServices;
	
	@RequestMapping("hello")
	public String doSomething()
	{
		return "hello world";
	}
	
	@RequestMapping("bank")
	public List<Bank> getBank()
	{
		return bankServices.getBank();
	}
	
	@RequestMapping(method = RequestMethod.POST, value = "bank")
	public String createAccount(@RequestBody Bank bank)
	{
		bankServices.createAccount(bank);
		return "Value added ";
	}
	
	@RequestMapping("bank/{accNo}")
	public Optional<Bank> viewAccount (@PathVariable String accNo)
	{
		System.out.println("Inside account");
		return bankServices.viewAccount(accNo);
	}
	
	@RequestMapping(method = RequestMethod.PUT, value = "bank{id}")
	public String updateAccount(@RequestBody Bank bank, @PathVariable String id)
	{
		bankServices.updateAccount(id, bank);
		return "Updated successfully";
	}
	
	@RequestMapping(method = RequestMethod.DELETE, value = "bank{id}")
	public String deleteAccount( @PathVariable String id)
	{
		bankServices.deleteAccount(id);
		return "Delete successfully";
	}
	
}
