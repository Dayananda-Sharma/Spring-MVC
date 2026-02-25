package com.xworkz.airtel.service;

import com.xworkz.airtel.dto.AirtelDto;

import java.util.List;

public interface Airtel {
    boolean validation(AirtelDto airtelDto);

    List<AirtelDto> AllData();
}
