package com.xworkz.ssp.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Entity
@Table(name = "money_tab")
@Data
@AllArgsConstructor
@NoArgsConstructor
@NamedQuery(name = "ssp", query = "select e from SspEntity e")
public class SspEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private String userName;
    private Long number;
    private String location;
}
