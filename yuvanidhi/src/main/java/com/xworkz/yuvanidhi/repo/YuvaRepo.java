package com.xworkz.yuvanidhi.repo;

import com.xworkz.yuvanidhi.entity.YuvaEntity;

import java.util.List;

public interface YuvaRepo {
    void insertData(YuvaEntity yuvaEntity);

    List<YuvaEntity> allData();
}
