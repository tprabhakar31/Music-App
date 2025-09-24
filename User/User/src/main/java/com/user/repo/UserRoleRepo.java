package com.user.repo;

import java.io.Serializable;

import org.springframework.data.jpa.repository.JpaRepository;

import com.user.entities.UserRole;

public interface UserRoleRepo extends JpaRepository<UserRole, Serializable> {

}
