package com.samplebankingapp.sampletechbank.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.samplebankingapp.sampletechbank.entity.Customer;

@Repository
public interface CustomerRepository extends JpaRepository<Customer , Long> {

	Customer findByEmail(String email);
}
