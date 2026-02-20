package com.xworkz.ssp.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class SspDto {
    private String userName;
    private Long number;
    private String location;
}
