package com.xworkz.train.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "train_db")
@NamedQuery(name = "name",query = "select e from TrainEntity e")

@NamedQuery(
        name = "gmail",
        query = "select e from TrainEntity e where e.gmail = :gmail")
public class TrainEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private String gender;
    private String name;
    private String age;
    private String number;
    private String gmail;
    private String location;
}
