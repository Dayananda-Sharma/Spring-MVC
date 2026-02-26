package com.xworkz.vi.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Entity
@Table(name = "customers_db")
@Data
@AllArgsConstructor
@NoArgsConstructor
@NamedQuery(name = "name",query = "select e from ViEntity e")
public class ViEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    @Column(name = "gender")
    private String gender;

    private String name;
    private String age;
    private  String number;
    private String gmail;
    private String location;
}
