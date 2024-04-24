package io.zipcoder.crudapp;

import javax.persistence.*;

@Entity
public class Person {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_number")
    private Long id;
    @Column(name = "first_name")
    private String fName;
    @Column(name = "last_name")
    private String lName;

    public Person(){

    }

    public Person(String fName, String lName){
        this.fName = fName;
        this.lName = lName;
    }

    public Person(Long id, String fName, String lName){
        this.id = id;
        this.fName = fName;
        this.lName = lName;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getfName() {
        return fName;
    }

    public void setfName(String fName) {
        this.fName = fName;
    }

    public String getlName() {
        return lName;
    }

    public void setlName(String lName) {
        this.lName = lName;
    }
}
