package com.xworkz.vi.service;

import com.xworkz.vi.dto.ViDto;
import com.xworkz.vi.entity.ViEntity;
import com.xworkz.vi.repo.ViRepo;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

@Service
public class VIImpli implements VI {
    @Autowired
    ViRepo viRepo;

    @Override
    public String validation(ViDto viDto) {
        if (viDto != null && viDto.getName() != null && viDto.getName().length() >= 3
                && viDto.getName().matches("^[A-Za-z]+$")

                && viDto.getAge() != null
                && viDto.getAge().matches("^[0-9]+$")
                && Integer.parseInt(viDto.getAge()) >= 10
                && Integer.parseInt(viDto.getAge()) <= 60

                && viDto.getNumber() != null
                && viDto.getNumber().matches("^[0-9]{10}$")

                && viDto.getGmail() != null
                && viDto.getGmail().matches("^[a-zA-Z0-9._%+-]+@gmail\\.com$")

                && viDto.getLocation() != null && viDto.getLocation().length() >= 4) {


            ViDto vidtos = getEmailBasedOnService(viDto.getGmail());
            ViDto vidtoNum = getNumberBasedOnService(viDto.getNumber());
            if (vidtos==null && vidtoNum==null) {
                ViEntity viEntity = new ViEntity();

                BeanUtils.copyProperties(viDto, viEntity);

                viRepo.insertData(viEntity);
                return "register successfully";
            }
            return "not register";

        }

        return "already data exist";


    }

    @Override
    public List<ViDto> getData() {

        List<ViEntity> viEntities = viRepo.AllData();

        if (!viEntities.isEmpty()) {
            List<ViDto> viDtos = new ArrayList<>();

            viEntities.forEach(allEntites -> {
                ViDto viDto = new ViDto();
                BeanUtils.copyProperties(allEntites, viDto);
                viDtos.add(viDto);
            });
            return viDtos;
        } else {


            return Collections.emptyList();
        }


    }

    @Override
    public ViDto getEmailBasedOnService(String gmail) {
        ViEntity viEntity = viRepo.getGmailValidation(gmail);

        if (viEntity!=null){
            ViDto viDto=new ViDto();
            BeanUtils.copyProperties(viEntity,viDto);

            return viDto;
        }
        return null;
    }

    @Override
    public ViDto getNumberBasedOnService(String number) {
        ViEntity numberValidation = viRepo.getNumberValidation(number);

        if (numberValidation!=null){
            ViDto viDto=new ViDto();
            BeanUtils.copyProperties(numberValidation,viDto);

            return viDto;
        }
        return null;
    }

    @Override
    public ViDto GetIdBasedOnService(Integer id) {
        ViEntity viEntity = viRepo.GetIdValidation(id);

        if (id!=0){
            ViDto viDto=new ViDto();
            BeanUtils.copyProperties(viEntity,viDto);
            return viDto;
        }
        return null;
    }
}