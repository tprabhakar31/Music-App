package com.user.repo;

import java.io.Serializable;

import org.springframework.data.jpa.repository.JpaRepository;

import com.user.entities.VerificationToken;

public interface VerificationTokenRepo extends JpaRepository<VerificationToken, Serializable> {

}
