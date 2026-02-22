package com.xworkz.ssp.service;

import com.xworkz.ssp.dto.SspDto;
import com.xworkz.ssp.entity.SspEntity;
import com.xworkz.ssp.repo.SspRepo;
import com.xworkz.ssp.repo.SspRepoImpl;
import com.xworkz.ssp.service.SspService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

@Service
public class SspServiceImpl implements SspService {

    @Autowired
    private SspRepo sspRepo;
    @Autowired
    SspRepoImpl sspRepoImpl;

    @Override
    public boolean validation(SspDto sspDto) {

        System.out.println("Service : " + sspDto);

        if (sspDto != null
                && sspDto.getUserName() != null && sspDto.getUserName().length() >= 3
                && sspDto.getNumber() != null
                && sspDto.getLocation() != null && sspDto.getLocation().length() >= 5) {

            SspEntity sspEntity = new SspEntity();
            sspEntity.setUserName(sspDto.getUserName());
            sspEntity.setNumber(sspDto.getNumber());
            sspEntity.setLocation(sspDto.getLocation());

            sspRepo.insertData(sspEntity);
            return true;

        } else {
            System.out.println("Validation failed ");
        }
        return false;
    }

    @Override
    public List<SspDto> allData() {

        List<SspEntity> entities = sspRepoImpl.getData();

        if (!entities.isEmpty()){
            List<SspDto> sspDtos=new ArrayList<>();

            entities.forEach(allentities->{
                SspDto sspDto=new SspDto();
                sspDto.setUserName(allentities.getUserName());
                sspDto.setNumber(allentities.getNumber());
                sspDto.setLocation(allentities.getLocation());

                sspDtos.add(sspDto);
            });
            return sspDtos;
        }

        return Collections.emptyList();
    }

}
