package com.xworkz.airtel.repo;

import com.xworkz.airtel.dto.AirtelDto;
import com.xworkz.airtel.entity.AirtelEntity;

import java.util.List;

public interface AirtelRepo {
    void insertData(AirtelEntity airtelEntity);

    List<AirtelEntity> getData();
}
