package model;

import java.sql.Date;

public abstract class Person {
    /* ATTRIBUTES */
    private String lastName;
    private String firstName;
    private String middleName;
    private String gender;
    private int age;
    private Date dateOfBirth;
    private String civilStatus;
    private int contactNumber;
    private String address;


    /* CONSTRUCTOR(S) */    
    public Person() {
        
    }


    /* GETTERS & SETTERS */
    public String getLastName() {
        return lastName;
    }

    public String getFirsttName() {
        return firstName;
    }

    public String getMiddleName() {
        return middleName;
    }

    public String getGender() {
        return gender;
    }

    public int getAge() {
        return age;
    }

    public Date getDateOfBirth() {
        return dateOfBirth;
    }

    public String getCivilStatus() {
        return civilStatus;
    }

    public int getContactNumber() {
        return contactNumber;
    }

    public String getAddress() {
        return address;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public void setMiddleName(String middleName) {
        this.middleName = middleName;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setDateOfBirth(Date dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
    }

    public void setCivilStatus(String civilStatus) {
        this.civilStatus = civilStatus;
    }

    public void setContactNumber(int contactNumber) {
        this.contactNumber = contactNumber;
    }

    public void setAddress(String address) {
        this.address = address;
    }


    /* METHODS */
    
}