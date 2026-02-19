package com.xworkz.prizemoney.service;

import com.xworkz.prizemoney.dto.PrizeDto;
import com.xworkz.prizemoney.entity.PrizeEntity;

import java.util.List;

public interface Prize {
    boolean validation(PrizeDto prizeDto);

    List<PrizeDto> allData();
}
