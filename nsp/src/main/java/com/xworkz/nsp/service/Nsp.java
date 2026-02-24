package com.xworkz.nsp.service;

import com.xworkz.nsp.dto.NspDto;

import java.util.List;

public interface Nsp {
    boolean validation(NspDto nspDto);

    List<NspDto> getAllData();
}
