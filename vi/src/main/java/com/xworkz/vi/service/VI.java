package com.xworkz.vi.service;

import com.xworkz.vi.dto.ViDto;

import java.util.List;

public interface VI {
    boolean validation(ViDto viDto);

    List<ViDto> getData();
}
