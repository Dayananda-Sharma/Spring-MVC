package com.xworkz.politics.service;

import com.xworkz.politics.dto.PoliticsDto;
import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.RequestMapping;

@Component

public class PoliticsService {
  public boolean validation(PoliticsDto politicsDto){
      if (politicsDto.getName()!=null && politicsDto.getLocation()!=null
              && politicsDto.getAge()<60 && politicsDto.getAge()>18
              && politicsDto.getPhoneNumber()>10 &&
              politicsDto.getState()!=null){
          return true;
      }else {
          return false;
      }
  }


}
