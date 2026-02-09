package com.xworkz.apollo.service;

import com.xworkz.apollo.custom.InvalidException;
import com.xworkz.apollo.dto.ApolloDto;
import com.xworkz.apollo.repository.ApolloDB;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ApolloService {

    @Autowired
    ApolloDB apolloDB;

    public boolean validation(ApolloDto apolloDto) throws InvalidException {
        if (apolloDto.getName() != null && apolloDto.getName().length() >= 3
                && apolloDto.getNumber() >= 10 &&
                apolloDto.getAddress() != null && apolloDto.getAddress().length() >= 5
                && apolloDto.getCity().length() >= 3 && apolloDto.getState().length() >= 5) {

            apolloDB.apolloDB(apolloDto);
            return true;
        } else {
            throw new InvalidException();
        }
    }
}
