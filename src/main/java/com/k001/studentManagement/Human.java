package com.k001.studentManagement;
public class Human extends CheckInputValue {
    private String name;
    private int sex;
    private String address;
    private String phoneNumber;
    private String dateOfBirth;
    Human(){
        this.name = "";
        this.address = "";
        this.phoneNumber = "";
        this.dateOfBirth = "";
        this.sex = 1;
    }

    public void inputSex(){
        System.out.print("Sex (1: Male 2: Female): ");
        do {
            this.sex = inputInteger();
            if (this.sex < 1 || this.sex > 2) System.out.println("ERROR!!Please make a choice");
        }while (this.sex <1 || this.sex > 2);
        skipSpace();
    }
    public void inputName() {
        System.out.print("Name: ");
        this.name = inputString();
    }

    public void inputAddress() {
        System.out.print("Address: ");
        this.address = inputString();
    }

    public void inputPhoneNumber() {
        System.out.print("PhoneNumber: ");
        this.phoneNumber = inputString();
    }

    public void inputDateOfBirth() {
        System.out.print("Date Of Birth: ");
        this.dateOfBirth = inputString();
    }

    public void  input(){
        this.inputName();
        this.inputSex();
        this.inputAddress();
        this.inputPhoneNumber();
        this.inputDateOfBirth();
    }

    public void displayName() {
        System.out.println("Name: " + this.name);
    }

    public void displaySex(){
        System.out.print("Sex: ");
        if (this.sex == 1) System.out.println("Male");
        else System.out.println("Female");
    }

    public void displayAddress() {
        System.out.println("Address: " + this.address);
    }

    public void displayPhoneNumber() {
        System.out.println("PhoneNumber: " + this.phoneNumber);
    }

    public void displayDateOfBirth() {
        System.out.println("Date Of Birth: " + this.dateOfBirth);
    }

    public void display(){
        this.displayName();
        this.displaySex();
        this.displayAddress();
        this.displayPhoneNumber();
        this.displayDateOfBirth();
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public void setDateOfBirth(String dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
    }

    public String getName() {
        return name;
    }

    public String getAddress() {
        return address;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public String getDateOfBirth() {
        return dateOfBirth;
    }

}
