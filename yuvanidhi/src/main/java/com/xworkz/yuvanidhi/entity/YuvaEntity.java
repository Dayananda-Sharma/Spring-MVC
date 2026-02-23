package com.xworkz.yuvanidhi.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "money_tab")
@NamedQuery(name ="yuva" ,query = "select e from YuvaEntity e")
public class YuvaEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private String userName;
    private String number;
    private String location;
}
