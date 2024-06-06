package com.samplebankingapp.sampletechbank.config;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.authentication.AuthenticationProvider;
import org.springframework.security.authentication.BadCredentialsException;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.AuthenticationException;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import com.samplebankingapp.sampletechbank.entity.Customer;
import com.samplebankingapp.sampletechbank.entity.Role;
import com.samplebankingapp.sampletechbank.repository.CustomerRepository;
import com.samplebankingapp.sampletechbank.repository.RoleRepository;

@Service
public class BankUsernamepwdAuthenticationProvider implements AuthenticationProvider{

	@Autowired 
	private CustomerRepository customerRepository;

	@Autowired
	private PasswordEncoder passwordEncoder;
	
	@Autowired
	private RoleRepository roleRepository;

	public Authentication authenticate(Authentication authentication) throws AuthenticationException{

	String username = authentication.getName();
	String pwd = authentication.getCredentials().toString();
	Customer customer = customerRepository.findByEmail(username);
	
	if(customer != null){
		Optional<Role> role =  roleRepository.findById(customer.getId());
	
		if(passwordEncoder.matches(pwd , customer.getPassword())){
			
		List<GrantedAuthority> authorities = new ArrayList<>();
	    authorities.add(new SimpleGrantedAuthority(role.get().getName()));
	
	return new UsernamePasswordAuthenticationToken(username , pwd , authorities);
	}
	else{
	throw new BadCredentialsException("Invalid password");
	}
	}
	else{
	throw new BadCredentialsException("No user registred with this deta");
	}
}

	@Override
	public boolean supports(Class<?> authentication) {
		return (UsernamePasswordAuthenticationToken.class.isAssignableFrom(authentication));
	}
}