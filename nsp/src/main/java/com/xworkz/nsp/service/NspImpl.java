package com.xworkz.nsp.service;

import com.xworkz.nsp.dto.NspDto;
import com.xworkz.nsp.entity.NspEntity;
import com.xworkz.nsp.repo.NspRepo;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

@Service
public class NspImpl implements Nsp{
    @Autowired
    NspRepo nspRepo;
    @Override
    public boolean validation(NspDto nspDto) {
        System.out.println("Service=="+nspDto);

        if (nspDto !=null &&
                nspDto.getUserName() != null && nspDto.getUserName().length() >= 3
                && nspDto.getNumber() != null && nspDto.getNumber().length() == 10
                && nspDto.getLocation() != null && nspDto.getLocation().length() >= 4) {

            NspEntity nspEntity = new NspEntity();

           BeanUtils.copyProperties(nspDto,nspEntity);

            nspRepo.insertData(nspEntity);

            return true;
        }else {
            System.out.println("inserted values");
        }
        return false;
    }

    @Override
    public List<NspDto> getAllData() {
        List<NspEntity> entities = nspRepo.repoData();

        if (!entities.isEmpty()){

            List<NspDto> nspDtos=new ArrayList<>();

            entities.forEach(allentities->{
                NspDto nspDto =new NspDto();
                BeanUtils.copyProperties(allentities,nspDto);

                nspDtos.add(nspDto);

            });

            return nspDtos;

        }else {
            return Collections.emptyList();

        }


    }
}