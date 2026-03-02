package com.xworkz.train.service;

import com.xworkz.train.dto.TrainDto;
import com.xworkz.train.entity.TrainEntity;
import com.xworkz.train.repo.TrainRepo;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

@Service
public class TrainServiceImpl implements TrainService {
    @Autowired
    TrainRepo trainRepo;

    @Override
    public String validation(TrainDto trainDto) {
        System.out.println("Service"+trainDto);
        if (trainDto != null && trainDto.getName() != null && trainDto.getName().length() >= 3
                && trainDto.getName().matches("^[A-Za-z]+$")

                && trainDto.getAge() != null
                && trainDto.getAge().matches("^[0-9]+$")
                && Integer.parseInt(trainDto.getAge()) >= 10
                && Integer.parseInt(trainDto.getAge()) <= 60

                && trainDto.getNumber() != null
                && trainDto.getNumber().matches("^[0-9]{10}$")

                && trainDto.getGmail() != null
                && trainDto.getGmail().matches("^[a-zA-Z0-9._%+-]+@gmail\\.com$")

                && trainDto.getLocation() != null && trainDto.getLocation().length() >= 4) {

            TrainDto gmailValidation = gmailValidationOnService(trainDto.getGmail());
            if (gmailValidation == null) {


                TrainEntity trainEntity = new TrainEntity();
                BeanUtils.copyProperties(trainDto, trainEntity);
                if (trainRepo.saveDB(trainEntity)){
                    return "register successfully";

                }else {

                    return "User Data failed to save";
                }
            }else {

                return "User Data already exist in DataBase";
            }
        }else

        return "Enter valid User Data";
    }

    @Override
    public List<TrainDto> getAllData() {
        List<TrainEntity> entities = trainRepo.getData();

        if (!entities.isEmpty()) {
            List<TrainDto> trainDtos = new ArrayList<>();

            entities.forEach(allEntities -> {
                TrainDto trainDto = new TrainDto();
                BeanUtils.copyProperties(allEntities, trainDto);

                trainDtos.add(trainDto);

            });
            return trainDtos;
        } else {
            return Collections.emptyList();

        }
    }

    @Override
    public TrainDto gmailValidationOnService(String gmail) {
        TrainEntity entities = trainRepo.gmailValidation(gmail);

        if (entities!=null){
            TrainDto train =new TrainDto();
            BeanUtils.copyProperties(entities,train);

            return  train;
        }
        return null;
    }

    @Override
    public TrainDto idValidationOnService(int id) {
        TrainEntity trainEntity = trainRepo.idValidation(id);

        if (id!=0){
            TrainDto trainDto=new TrainDto();
            BeanUtils.copyProperties(trainEntity,trainDto);

            return trainDto;
        }
        return null;
    }

}
