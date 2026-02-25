package com.xworkz.airtel.service;

import com.xworkz.airtel.dto.AirtelDto;
import com.xworkz.airtel.entity.AirtelEntity;
import com.xworkz.airtel.repo.AirtelRepo;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

@Service
public class AirtelImpl implements Airtel{
    @Autowired
    AirtelRepo airtelRepo;
    @Override
        public boolean validation(AirtelDto airtelDto) {
        System.out.println("inserted"+airtelDto);
            if (airtelDto != null && airtelDto.getName() != null && airtelDto.getName().length() >= 3
                    && airtelDto.getAge() != null && airtelDto.getAge().length() == 2
                    && airtelDto.getNumber() != null && airtelDto.getNumber().length() == 10
                    && airtelDto.getGmail() != null
                    && airtelDto.getGmail().matches("^[a-zA-Z0-9._%+-]+@gmail\\.com$")
                    && airtelDto.getLocation() != null && airtelDto.getLocation().length() >= 4) {

                AirtelEntity airtelEntity = new AirtelEntity();

                BeanUtils.copyProperties(airtelDto,airtelEntity);
                airtelRepo.insertData(airtelEntity);

                return true;
            }else {
                System.out.println("inserted Data");
            }
            return false;
        }

    @Override
    public List<AirtelDto> AllData() {

        List<AirtelEntity> entities = airtelRepo.getData();

        if (!entities.isEmpty() ){
            List<AirtelDto> dtos =new ArrayList<>();

            entities.forEach(AllEnties->{
                AirtelDto airtelDto=new AirtelDto();
                BeanUtils.copyProperties(AllEnties,airtelDto);
                dtos.add(airtelDto);
            });
            return dtos;

        }else {

            return Collections.emptyList();
        }
    }
}
