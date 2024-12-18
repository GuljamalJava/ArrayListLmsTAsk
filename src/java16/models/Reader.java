package java16.models;

import java16.enums.Gender;

public class Reader extends Library {
    private Long id;
    private String fullName;
    private String email;
    private String phoneNumber;
    private Gender gender;

    public Reader() {

    }

    public Reader(Long id,String address, String name) {
        super(id,address, name);
    }

    public Reader(Long id, String email, String fullName, Gender gender, String phoneNumber) {
        this.id = id;
        this.email = email;
        this.fullName = fullName;
        this.gender = gender;
        this.phoneNumber = phoneNumber;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getFullName() {
        return fullName;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public Gender getGender() {
        return gender;
    }

    public void setGender(Gender gender) {
        this.gender = gender;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    @Override
    public Long getId() {
        return id;
    }

    @Override
    public void setId(Long id) {
        this.id = id;
    }

    @Override
    public String toString() {
        return "Reader{" +
                "email='" + email + '\'' +
                ", id=" + id +
                ", fullName='" + fullName + '\'' +
                ", phoneNumber='" + phoneNumber + '\'' +
                ", gender=" + gender +
                '}';
    }
}
