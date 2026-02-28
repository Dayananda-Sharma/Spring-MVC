package com.xworkz.vi.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Id;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class ViDto {

    private Integer id;
    private String gender;
    private String name;
    private String age;
    private  String number;
    private String gmail;
    private String location;
}
