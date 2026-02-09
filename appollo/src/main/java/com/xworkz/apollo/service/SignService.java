package com.xworkz.apollo.service;

import com.xworkz.apollo.repository.ApolloDB;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import sun.security.util.Password;

@Service
public class SignService {

    @Autowired
    ApolloDB apolloDB;

    public boolean detailsRetrive(String name ,Integer number){

        String dbPassword= apolloDB.getDataDB(name);

        if (dbPassword == null){
            return false;
        }
        return dbPassword.equals(number);
    }
}
