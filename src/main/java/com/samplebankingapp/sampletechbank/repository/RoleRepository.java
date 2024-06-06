package com.samplebankingapp.sampletechbank.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.samplebankingapp.sampletechbank.entity.Role;

@Repository
public interface RoleRepository extends JpaRepository<Role,Long>{

}
