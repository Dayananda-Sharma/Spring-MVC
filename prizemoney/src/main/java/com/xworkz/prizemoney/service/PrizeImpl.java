package com.xworkz.prizemoney.service;

import com.sun.istack.NotNull;
import com.xworkz.prizemoney.dto.PrizeDto;
import com.xworkz.prizemoney.entity.PrizeEntity;
import com.xworkz.prizemoney.repo.MoneyRepo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class PrizeImpl implements Prize {

    @Autowired
    MoneyRepo moneyRepo;

    @Override
    public boolean validation(PrizeDto prizeDto) {
        System.out.println("Service==" + prizeDto);

        if (prizeDto.getUserName() != null && prizeDto.getUserName().length() > 4 &&
                prizeDto.getNumber()!= null
                && prizeDto.getLocation() != null && prizeDto.getLocation().length() > 4

        ) {
            PrizeEntity prizeEntity = new PrizeEntity();

            prizeEntity.setUserName(prizeDto.getUserName());
            prizeEntity.setNumber(prizeDto.getNumber());
            prizeEntity.setLocation(prizeDto.getLocation());

            moneyRepo.saveDB(prizeEntity);
            return true;

        } else {
            return false;
        }
    }
}
