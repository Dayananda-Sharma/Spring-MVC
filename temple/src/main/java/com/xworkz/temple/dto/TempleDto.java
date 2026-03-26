package com.xworkz.temple.dto;

import com.sun.istack.NotNull;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.validation.constraints.Max;
import javax.validation.constraints.Min;
import javax.validation.constraints.Pattern;
import javax.validation.constraints.Size;

@Data
@NoArgsConstructor
public class TempleDto {
    @NotNull
    @Size(min = 3,max = 10,message = "invalid name")
    private String name;

    @NotNull()
    @Min(value = 18, message = "Minimum age is 18")
    @Max(value = 60, message = "Maximum age is 60")
    private Integer age;
    @NotNull
    @Pattern(regexp = "^[0-9]{10}$", message = "Enter valid 10-digit number")
    private String number;
}
