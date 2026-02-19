package com.xworkz.prizemoney.repo;

import com.xworkz.prizemoney.entity.PrizeEntity;

import java.util.List;

public interface MoneyRepo {
    void saveDB(PrizeEntity prizeEntity);

    List<PrizeEntity> getData();
}
