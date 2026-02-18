package com.xworkz.prizemoney.repo;

import com.xworkz.prizemoney.entity.PrizeEntity;

public interface MoneyRepo {
    void saveDB(PrizeEntity prizeEntity);
}
