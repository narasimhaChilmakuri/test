package com.discretebody.test.repository;

import com.discretebody.test.entity.Users;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UsersRepo extends JpaRepository<Users, Integer> {

    Users findByUsername(String username);

}
