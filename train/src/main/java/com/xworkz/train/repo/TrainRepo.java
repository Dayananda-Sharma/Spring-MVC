package com.xworkz.train.repo;

import com.xworkz.train.entity.TrainEntity;

import java.util.List;

public interface TrainRepo {
    boolean saveDB(TrainEntity trainEntity);

    List<TrainEntity> getData();

    TrainEntity gmailValidation(String gmail);

    TrainEntity idValidation(int id);
}
