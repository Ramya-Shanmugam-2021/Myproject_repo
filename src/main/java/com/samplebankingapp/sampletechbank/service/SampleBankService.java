package com.samplebankingapp.sampletechbank.service;

import com.samplebankingapp.sampletechbank.dto.CustomerDto;
import java.util.List;

import org.springframework.stereotype.Service;


import com.samplebankingapp.sampletechbank.entity.Customer;

public interface SampleBankService {
	
	void saveUser(CustomerDto customerDto);

	 Customer findByEmail(String email);	

}
