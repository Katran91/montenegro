package com.katran.model;



import javax.persistence.*;
import java.io.Serializable;
import java.util.Date;

/**
 * Created by astratii on 3/26/2015.
 */

@Entity
@Table(name = "STUDENT")
public class Student implements Serializable{
    private static final long serialVersionUID = -7501756457273825764L;

    @Id
    @Column(name = "ID")
    @GeneratedValue
    private Integer id;
    @Column(name = "FIRST_NAME")
    private String firstName;
    @Column(name = "LAST_NAME")
    private String lastName;
    @Column(name = "GIVEN_NAME")
    private String givenName;
    @Column(name = "BIRTH_DATE")
    private Date birthDate;
    @Column(name = "KURS")
    private int kurs;

    public Student(String firstName, String lastName, String givenName, Date birthDate, int kurs) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.givenName = givenName;
        this.birthDate = birthDate;
        this.kurs = kurs;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
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

    public String getGivenName() {
        return givenName;
    }

    public void setGivenName(String givenName) {
        this.givenName = givenName;
    }

    public Date getBirthDate() {
        return birthDate;
    }

    public void setBirthDate(Date birthDate) {
        this.birthDate = birthDate;
    }

    public int getKurs() {
        return kurs;
    }

    public void setKurs(int kurs) {
        this.kurs = kurs;
    }
}
