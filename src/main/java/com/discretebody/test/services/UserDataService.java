package com.discretebody.test.services;

import com.discretebody.test.dto.UserData;
import com.discretebody.test.entity.Users;
import com.discretebody.test.repository.UsersRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

@Service
public class UserDataService implements UserDetailsService {

    @Autowired
    private UsersRepo usersRepo;

    @Override
    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {

        Users user = usersRepo.findByUsername(username);

        if(user==null){
            System.out.println("User not found with username: " + username);
        }else{
            System.out.println("User found with user: " + user);
        }


        return new UserData(user);
    }
}
