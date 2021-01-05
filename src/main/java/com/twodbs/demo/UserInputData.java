package com.twodbs.demo;


import javax.persistence.*;

@Entity
@Table(name = "testpostgres")
public class UserInputData {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "testpostgres_id")
    private Long id;
    @Column(name = "firstname")
    private String firstName;
    @Column(name = "lastname")
    private String lastName;

    public UserInputData(String firstName, String lastName) {
        this.firstName = firstName;
        this.lastName = lastName;
    }
    public UserInputData(){

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
