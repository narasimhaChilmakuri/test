package com.discretebody.test.services;


import com.discretebody.test.entity.Users;
import com.discretebody.test.repository.UsersRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UsersService {


    @Autowired
    public UsersRepo usersRepo;

    public Users register(Users user) {
        return usersRepo.save(user);
    }


}
