package com.booking.airlinebookingsystem.services;

import com.booking.airlinebookingsystem.dao.RegisterRepository;
import com.booking.airlinebookingsystem.entities.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class RegisterService {

    @Autowired
    private RegisterRepository registerRepository;
    public int addUser(User user){
        List<User> list = registerRepository.findByEmail(user.getEmail());
        if(list.size() == 1){
            return 1;
        }
        return 0;
    }

}
