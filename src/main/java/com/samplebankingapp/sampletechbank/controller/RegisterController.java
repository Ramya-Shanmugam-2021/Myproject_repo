package com.samplebankingapp.sampletechbank.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.security.core.Authentication;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

//import com.example.registrationlogindemo.dto.UserDto;
//import com.example.registrationlogindemo.entity.User;
import com.samplebankingapp.sampletechbank.dto.CustomerDto;
import com.samplebankingapp.sampletechbank.entity.Customer;
import com.samplebankingapp.sampletechbank.repository.CustomerRepository;
import com.samplebankingapp.sampletechbank.service.SampleBankService;

@Controller
public class RegisterController {
	
	@Autowired
	CustomerRepository customerRepository;
	
	@Autowired
	private PasswordEncoder passwordEncoder;

	@Autowired
	private SampleBankService sampleBankService;

	    
	    // handler method to handle register user form submit request
	    @PostMapping("/register")
	    public String registration(@Validated @ModelAttribute("customer") CustomerDto customer,
	                               BindingResult result,
	                               Model model){
	        Customer existing = sampleBankService.findByEmail(customer.getEmail());
	        if (existing != null) {
	            result.rejectValue("email", null, "There is already an account registered with that email");
	        }
	        if (result.hasErrors()) {
	            model.addAttribute("customer", customer);
	            return "register";
	        }
	        sampleBankService.saveUser(customer);
	        return "redirect:/register?success";
	    }
	@GetMapping("/index")
	public String getIndex() {
		return "index";
	}
	
	@GetMapping("/login")
	public String getLoginPage() {
		return "login";
	}
	
	 @GetMapping("register")
	    public String showRegistrationForm(Model model){
		 CustomerDto customer = new CustomerDto();
	        model.addAttribute("customer", customer);
	        return "register";
	    }
	    
	  @RequestMapping("/loggedInUser")
	    public String getUserDetailsAfterLogin(Authentication authentication , Model model) {
       Customer customer = customerRepository.findByEmail(authentication.getName());
        if (customer != null) {
        	  model.addAttribute("customer", customer);
            
            return "users";
        } else {
        	return "not authenticated propoerly";
        }
        
}
}




