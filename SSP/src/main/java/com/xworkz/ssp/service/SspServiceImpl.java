package com.xworkz.ssp.service;

import com.xworkz.ssp.dto.SspDto;
import com.xworkz.ssp.entity.SspEntity;
import com.xworkz.ssp.repo.SspRepo;
import com.xworkz.ssp.repo.SspRepoImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class SspServiceImpl implements SspService{
    @Autowired
    SspRepo sspRepo;
    @Autowired
    SspRepoImpl sspRepoImlp;
    @Override
    public boolean validation(SspDto sspDto) {
        System.out.println("Service"+sspDto);
        if (sspDto.getUserName() != null && sspDto.getUserName().length() > 3
                && sspDto.getNumber() != null && sspDto.getNumber() == 10
                && sspDto.getLocation() != null && sspDto.getLocation().length() > 5) {

            SspEntity sspEntity =new SspEntity();

            sspEntity.setUserName(sspEntity.getUserName());
            sspEntity.setNumber(sspEntity.getNumber());
            sspEntity.setLocation(sspEntity.getLocation());

             sspRepo.insertData(sspEntity);
            return true;

        }else {

        }
        return false;
    }
}

