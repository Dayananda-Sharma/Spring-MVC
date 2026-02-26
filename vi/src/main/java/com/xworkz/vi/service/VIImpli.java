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
    public boolean validation(ViDto viDto) {

        if (viDto != null && viDto.getName() != null && viDto.getName().length() >= 3
                && viDto.getAge() != null && viDto.getAge().length() == 2
                && viDto.getNumber() != null && viDto.getNumber().length() == 10
                && viDto.getGmail() != null
                && viDto.getGmail().matches("^[a-zA-Z0-9._%+-]+@gmail\\.com$")
                && viDto.getLocation() != null && viDto.getLocation().length() >= 4) {

            ViEntity viEntity = new ViEntity();

            BeanUtils.copyProperties(viDto, viEntity);

            viRepo.insertData(viEntity);
            return true;
        } else {

        }
        return false;
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
}