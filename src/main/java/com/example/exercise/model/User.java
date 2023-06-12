package com.example.exercise.model;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.validation.constraints.*;

@Entity
public class User {
    @Id
    @NotBlank (message = "ten khong duoc chong")
    @Size(min = 5,max =45,message = "ten khong duoc ngan hon 45 ky tu,va dai hon 5 ky tu")
    private String lastname;
    @NotBlank (message = "ten khong duoc chong")
    @Size(min = 5,max =45,message = "ten khong duoc ngan hon 45 ky tu,va dai hon 5 ky tu")
    private String firstname;
    private String phonenumber;
    @Min(value = 18)
    private int age;
    @Email
    private String email;

    public User() {
    }

    public User(String lastname, String firstname, String phonenumber, int age, String email) {
        this.lastname = lastname;
        this.firstname = firstname;
        this.phonenumber = phonenumber;
        this.age = age;
        this.email = email;
    }

    public String getLastname() {
        return lastname;
    }

    public void setLastname(String lastname) {
        this.lastname = lastname;
    }

    public String getFirstname() {
        return firstname;
    }

    public void setFirstname(String firstname) {
        this.firstname = firstname;
    }

    public String getPhonenumber() {
        return phonenumber;
    }

    public void setPhonenumber(String phonenumber) {
        this.phonenumber = phonenumber;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
}
