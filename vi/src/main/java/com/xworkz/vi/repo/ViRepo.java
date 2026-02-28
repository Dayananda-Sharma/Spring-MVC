package com.xworkz.vi.repo;

import com.xworkz.vi.dto.ViDto;
import com.xworkz.vi.entity.ViEntity;

import java.util.List;

public interface ViRepo {
    boolean insertData(ViEntity viEntity);

    List<ViEntity> AllData();

    ViEntity getGmailValidation(String gmail);

    ViEntity getNumberValidation(String number);

    ViEntity GetIdValidation(Integer id);
}
