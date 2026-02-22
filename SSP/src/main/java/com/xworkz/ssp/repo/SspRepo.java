package com.xworkz.ssp.repo;

import com.xworkz.ssp.entity.SspEntity;

import java.util.List;

public interface SspRepo {
    void insertData(SspEntity sspEntity);

    List<SspEntity>getData();
}
