package com.discretebody.test.services;


import com.discretebody.test.entity.Users;
import com.discretebody.test.repository.UsersRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Service;

@Service
public class UsersService {


    @Autowired
    public UsersRepo usersRepo;

    private BCryptPasswordEncoder encoder = new BCryptPasswordEncoder(12);

    public Users register(Users user) {
        System.out.println("Registering user: " + user.getUsername());
        System.out.println(encoder.encode("admin"));
        user.setPassword(encoder.encode(user.getPassword()));
        return usersRepo.save(user);
    }


}
