package com.xworkz.yuvanidhi.service;

import com.xworkz.yuvanidhi.dto.YuvaDto;
import com.xworkz.yuvanidhi.entity.YuvaEntity;
import com.xworkz.yuvanidhi.repo.YuvaRepo;
import com.xworkz.yuvanidhi.repo.YuvaRepoImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

@Service
public class YuvaImpl implements Yuva {

    @Autowired
    YuvaRepo yuvaRepo;

    @Autowired
    YuvaRepoImpl yuvaRepoImpl;
    @Override
    public boolean validation(YuvaDto yuvaDto) {
        System.out.println("service==" + yuvaDto);
        if (yuvaDto != null
                && yuvaDto.getUserName() != null && yuvaDto.getUserName().length() >= 3
                && yuvaDto.getNumber() != null && yuvaDto.getNumber().length() == 10
                && yuvaDto.getLocation() != null && yuvaDto.getLocation().length() >= 4) {

            YuvaEntity yuvaEntity = new YuvaEntity();
            yuvaEntity.setUserName(yuvaDto.getUserName());
            yuvaEntity.setNumber(yuvaDto.getNumber());
            yuvaEntity.setLocation(yuvaDto.getLocation());

            yuvaRepo.insertData(yuvaEntity);

            return true;
        } else {
            System.out.println("validation failed");
        }
        return false;
    }

    @Override
    public List<YuvaDto> getData() {
        List<YuvaEntity> yuvaEntities = yuvaRepoImpl.allData();
        if (!yuvaEntities.isEmpty()){
            List<YuvaDto> yuvaDtos=new ArrayList<>();

            yuvaEntities.forEach(allEntities->{
                YuvaDto yuvaDto=new YuvaDto();
                yuvaDto.setUserName(allEntities.getUserName());
                yuvaDto.setNumber(allEntities.getNumber());
                yuvaDto.setLocation(allEntities.getLocation());

                yuvaDtos.add(yuvaDto);
            });
            return yuvaDtos;
        }else {

            return Collections.emptyList();
        }
    }


}
