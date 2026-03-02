package com.xworkz.train.service;

import com.xworkz.train.dto.TrainDto;

import java.util.List;

public interface TrainService {
    String validation(TrainDto trainDto);

    List<TrainDto> getAllData();

    TrainDto gmailValidationOnService(String gmail);

    TrainDto idValidationOnService(int id);
}
