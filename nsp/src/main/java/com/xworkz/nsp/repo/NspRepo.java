package com.xworkz.nsp.repo;

import com.xworkz.nsp.dto.NspDto;
import com.xworkz.nsp.entity.NspEntity;

import java.util.List;

public interface NspRepo {
    void insertData(NspEntity nspEntity);

    List<NspEntity> repoData();
}
