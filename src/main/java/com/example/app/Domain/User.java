package com.example.app.Domain;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import javax.persistence.*;
import java.util.Date;

@Entity
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Table(name = "userdata")
public class User {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id",  unique = true)
    private Long id;
    @Column(name = "price",nullable = true)
    private double price;
    @Column(name = "brand", nullable = true)
    private String brand;
    @Column(name = "model", nullable = true)
    private String model;
    @Column(name = "performance", nullable = true)
    private String performance;
    @Column(name = "description", nullable = true)
    private String description;
    @Column(name = "location", nullable = true)
    private String location;
    @Temporal(TemporalType.TIMESTAMP)
    @Column( nullable = true,name = "create_date")
    private Date createDate;

}
