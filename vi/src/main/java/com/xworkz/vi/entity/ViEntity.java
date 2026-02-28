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
@NamedQuery(
        name = "findByMail",
        query = "select entity from ViEntity entity where entity.gmail = :gmail")
@NamedQuery(name = "findByNumber",
            query = "select num from ViEntity num where num.number = :number")
public class ViEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    @Column(name = "gender")
    private String gender;

    private String name;
    private String age;
    private  String number;
    @Column(name = "gmail")
    private String gmail;
    private String location;
}
