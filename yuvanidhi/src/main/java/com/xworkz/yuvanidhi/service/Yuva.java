package com.xworkz.yuvanidhi.service;

import com.xworkz.yuvanidhi.dto.YuvaDto;
import com.xworkz.yuvanidhi.entity.YuvaEntity;

import java.util.List;

public interface Yuva {
     boolean  validation(YuvaDto yuvaDto);

     List<YuvaDto> getData();
}
