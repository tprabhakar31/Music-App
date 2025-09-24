package com.user.repo;

import java.io.Serializable;

import org.springframework.data.jpa.repository.JpaRepository;

import com.user.entities.Role;

public interface Rolerepo extends JpaRepository<Role, Serializable> {

}
