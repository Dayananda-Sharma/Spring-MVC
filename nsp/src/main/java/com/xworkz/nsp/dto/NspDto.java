package com.xworkz.nsp.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class NspDto {
    private String userName;
    private String number;
    private String location;
}
