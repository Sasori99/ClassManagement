package com.k001.studentManagement;

public class Student extends Human {
    private String major;
    private int numberOfLate;
    private int team;
    private int ID;
    Student(){
        super();
        this.numberOfLate = 0;
        this.major = "";
        this.team = 0;
        this.ID = 0;
    }

    public void inputMajor(){
        System.out.print("Major: ");
        this.major = inputString();
    }

    public void inputTeam(){
        System.out.print("Team: ");
        this.team = inputInteger();
        skipSpace();
    }

    public void input(){
        super.input();
        this.inputMajor();
        this.inputTeam();
    }

    public void displayMajor(){
        System.out.println("Major: " + this.major);
    }

    public void displayID(){
        System.out.println("ID: " + this.ID);
    }

    public void displayTeam(){
        System.out.println("Team: " + this.team);
    }

    public void displayNumberOfLate(){
        System.out.println("Number of late: " + this.numberOfLate);
    }

    public void display(){
        super.display();
        this.displayMajor();
        this.displayID();
        this.displayTeam();
        this.displayNumberOfLate();
    }

    public void updateNumberOfLate(){
        this.numberOfLate++;
    }

    public void setMajor(String major) {
        this.major = major;
    }

    public void setNumberOfLate(int numberOfLate) {
        this.numberOfLate = numberOfLate;
    }

    public void setTeam(int team) {
        this.team = team;
    }

    public void setID(int ID) {
        this.ID = ID;
    }

    public String getMajor() {
        return major;
    }

    public int getNumberOfLate() {
        return numberOfLate;
    }

    public int getTeam() {
        return team;
    }

    public int getID() {
        return ID;
    }
}

