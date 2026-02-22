package com.xworkz.ssp.service;

import com.xworkz.ssp.dto.SspDto;
import com.xworkz.ssp.entity.SspEntity;

import java.util.List;

public interface SspService {
    boolean validation(SspDto sspDto);

    List<SspDto> allData();
}
