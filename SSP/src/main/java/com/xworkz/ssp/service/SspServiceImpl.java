package com.xworkz.ssp.service;

import com.xworkz.ssp.dto.SspDto;
import com.xworkz.ssp.entity.SspEntity;
import com.xworkz.ssp.repo.SspRepo;
import com.xworkz.ssp.service.SspService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class SspServiceImpl implements SspService {

    @Autowired
    private SspRepo sspRepo;   // only interface

    @Override
    public boolean validation(SspDto sspDto) {

        System.out.println("Service : " + sspDto);

        if (sspDto != null
                && sspDto.getUserName() != null && sspDto.getUserName().length() >= 3
                && sspDto.getNumber() != null && sspDto.getNumber() == 10   // 10 digit check
                && sspDto.getLocation() != null && sspDto.getLocation().length() >= 5) {

            // DTO → Entity mapping
            SspEntity sspEntity = new SspEntity();
            sspEntity.setUserName(sspDto.getUserName());
            sspEntity.setNumber(sspDto.getNumber());
            sspEntity.setLocation(sspDto.getLocation());

            sspRepo.insertData(sspEntity);
            return true;

        } else {
            System.out.println("Validation failed ❌");
        }
        return false;
    }
}