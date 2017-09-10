package com.linrz.wsc.repository;

import com.linrz.wsc.domain.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, String>{

    public String findByEmail(String email);
}


