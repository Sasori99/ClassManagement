package com.k001.studentManagement;

public class Teacher extends Human {
    private String company;

    Teacher(){
        super();
        company = "";
    }

    public void inputCompany(){
        System.out.print("Company: ");
        this.company = inputString();
    }

    public void input(){
        super.input();
        this.inputCompany();
    }

    public void displayCompany(){
        System.out.println("Company: " + this.company);
    }

     public void display(){
        super.display();
        this.displayCompany();
     }
}
