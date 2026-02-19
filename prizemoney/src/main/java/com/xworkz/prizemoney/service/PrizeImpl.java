package com.xworkz.prizemoney.service;

import com.sun.istack.NotNull;
import com.xworkz.prizemoney.dto.PrizeDto;
import com.xworkz.prizemoney.entity.PrizeEntity;
import com.xworkz.prizemoney.repo.MoneyRepo;

import com.xworkz.prizemoney.repo.MoneyRepoImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

@Service
public class PrizeImpl implements Prize {

    @Autowired
    MoneyRepo moneyRepo;
    @Autowired
    MoneyRepoImpl moneyRepoImpl;

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

    @Override
    public List<PrizeDto> allData() {
      List<PrizeEntity> entities= moneyRepoImpl.getData();

      if (!entities.isEmpty()) {
          List<PrizeDto> prizeDtoList=new ArrayList<>();

          entities.forEach(allentities -> {

              PrizeDto prizeDto = new PrizeDto();
              prizeDto.setUserName(allentities.getUserName());
              prizeDto.setNumber(allentities.getNumber());
              prizeDto.setLocation(allentities.getLocation());

              prizeDtoList.add(prizeDto);

          });
          return prizeDtoList;
      }else {
          return  Collections.emptyList();
      }
    }
}
