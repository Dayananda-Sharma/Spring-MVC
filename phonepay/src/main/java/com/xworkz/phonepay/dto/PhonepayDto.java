package com.xworkz.phonepay.dto;

import lombok.*;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class PhonepayDto {

    private String userName;
    private String location;
    private Long number;

}
