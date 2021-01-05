package com.twodbs.demo;

import javax.persistence.*;

@Entity
@Table(name = "testlocaldb")
public class ProductInputDAta {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="testlocaldb_id")
    private String Long;
    @Column(name = "firstname")
    private String firstName;
    @Column(name = "lastname")
    private String lastName;

    public ProductInputDAta(String firstName, String lastName) {
        this.firstName = firstName;
        this.lastName = lastName;
    }
    public ProductInputDAta(){

    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }
}
