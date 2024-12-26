package ru.kata.taskPP_3_1_1.model;


import jakarta.persistence.*;
import jakarta.validation.constraints.*;

@Entity
@Table(schema = "user")
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "user_id")
    private long id;

    @Size(min = 1, max = 50, message = "Name should be between 1 and 50 characters")
    @Column(name = "first_name")
    private String firstName;

    @Size(min = 1, max = 50, message = "Last name should be between 1 and 50 characters")
    @Column(name = "last_name")
    private String lastName;

    @Min(value = 0, message = "Age should be greater then 0")
    @Max(value = 127, message = "Age should be less then 128")
    @Column(name = "age")
    private byte age;

    @NotEmpty(message = "The field should not be empty")
    @Email(message = "Wrong format")
    @Column(name = "email")
    private String email;

    public User() {
    }

    public User(long id, String firstName, String lastName, byte age, String email) {
        this.id = id;
        this.firstName = firstName;
        this.lastName = lastName;
        this.age = age;
        this.email = email;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
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

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public byte getAge() {
        return age;
    }

    public void setAge(byte age) {
        this.age = age;
    }
}
