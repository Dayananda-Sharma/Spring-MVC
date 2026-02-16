package com.xworkz.phonepay.service;

import com.xworkz.phonepay.dto.PhonepayDto;
import com.xworkz.phonepay.entity.PhonepayEntity;
import com.xworkz.phonepay.repository.PhonepayRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class PhonepayImp implements Phonepay{

    @Autowired
    PhonepayRepository phonepayRepository;

    @Override
    public void validation(PhonepayDto phonepayDto) {



        System.out.println("service==="+phonepayDto);

        PhonepayEntity phonepayEntity=new PhonepayEntity();
        phonepayEntity.setUserName(phonepayDto.getUserName());
        phonepayEntity.setLocation(phonepayDto.getLocation());
        phonepayEntity.setNumber(phonepayDto.getNumber());

        phonepayRepository.saveDb(phonepayEntity);


    }
}
