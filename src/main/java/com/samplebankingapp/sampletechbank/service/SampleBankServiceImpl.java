package com.samplebankingapp.sampletechbank.service;

import java.util.Arrays;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

import com.samplebankingapp.sampletechbank.entity.Role;
import com.samplebankingapp.sampletechbank.dto.CustomerDto;
import com.samplebankingapp.sampletechbank.entity.Customer;
import com.samplebankingapp.sampletechbank.repository.CustomerRepository;
import com.samplebankingapp.sampletechbank.repository.RoleRepository;

@Service
public  class SampleBankServiceImpl implements SampleBankService{

	@Autowired
	private CustomerRepository customerRepository;
	
	@Autowired
	private RoleRepository roleRepository;
	
	@Autowired
	private PasswordEncoder passwordEncoder;
	
	 @Override
	    public Customer findByEmail(String email) {
	        return customerRepository.findByEmail(email);
	    }

	@Override
	public void saveUser(CustomerDto customerDto) {
		// TODO Auto-generated method stub
		
		Customer customer = new Customer();
		 customer.setFirstName(customerDto.getFirstName());
		 customer.setLastName( customerDto.getLastName());
		 customer.setEmail(customerDto.getEmail());

	        //encrypt the password once we integrate spring security
	        //user.setPassword(userDto.getPassword());
		 customer.setPassword(passwordEncoder.encode(customerDto.getPassword()));
	            
	        Role role = new Role();
	 	   role.setName("ROLE_USER");
	 	        customer.setRole(Arrays.asList(role));
	 	     customerRepository.save(customer);
		
	}

}
