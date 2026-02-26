package com.xworkz.vi.repo;

import com.xworkz.vi.dto.ViDto;
import com.xworkz.vi.entity.ViEntity;

import java.util.List;

public interface ViRepo {
    void insertData(ViEntity viEntity);

    List<ViEntity> AllData();
}
