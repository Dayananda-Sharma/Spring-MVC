package com.xworkz.vi.service;

import com.xworkz.vi.dto.ViDto;

import java.util.List;

public interface VI {
    String validation(ViDto viDto);

    List<ViDto> getData();

   ViDto getEmailBasedOnService(String gmail);

   ViDto getNumberBasedOnService(String number);

   ViDto GetIdBasedOnService(Integer id);

}
