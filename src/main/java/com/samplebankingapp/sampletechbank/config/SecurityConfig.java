package com.samplebankingapp.sampletechbank.config;

import org.springframework.security.config.Customizer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.security.web.SecurityFilterChain;
import org.springframework.security.web.util.matcher.AntPathRequestMatcher;

@Configuration
public class SecurityConfig {

	  @Bean
	    SecurityFilterChain defaultSecurityFilterChain(HttpSecurity http) throws Exception {
	        http.csrf((csrf) -> csrf.disable())
	                .authorizeHttpRequests((requests) -> requests
	                        .requestMatchers("/index",  "/register", "/login").permitAll()
	           .requestMatchers("/loggedInUser").hasRole("USER"))
	                .formLogin(
	                        form -> form
	                                .loginPage("/login")
	                                .loginProcessingUrl("/login")
	                                .defaultSuccessUrl("/loggedInUser")
	                                .permitAll()
	                ).logout(
	                        logout -> logout
                            .logoutRequestMatcher(new AntPathRequestMatcher("/logout"))
                            .permitAll()
            )
	                .httpBasic(Customizer.withDefaults());
	        return http.build();
	    }

	
	 @Bean
	    public PasswordEncoder passwordEncoder() {
	        return new BCryptPasswordEncoder();
	    }
}


