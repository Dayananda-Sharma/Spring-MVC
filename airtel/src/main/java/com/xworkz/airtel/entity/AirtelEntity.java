package com.xworkz.airtel.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "customers_tb")
@NamedQuery(name = "name",query = "select r from AirtelEntity r")
public class AirtelEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private String name;
    private String age;
    private String number;
    private String gmail;
    private String location;
}
