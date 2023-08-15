package com.bank.bank.bank.service.serviceimpl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.bank.bank.bank.entity.BankDetails;
import com.bank.bank.bank.repository.BankDetailsRepository;
import com.bank.bank.bank.service.BankService;

@Service

public class BankServiceImpl implements BankService{
	
	@Autowired
	BankDetailsRepository bankDetailsRepository;
	
	@Override
	public BankDetails saveBank(BankDetails bankDetails) {
		BankDetails bankDetails2 = new BankDetails();
		bankDetails2 = bankDetailsRepository.save(bankDetails);
		return bankDetails2;
	}
	


	

}
