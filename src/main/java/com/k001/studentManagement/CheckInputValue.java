package com.k001.studentManagement;

import java.util.Scanner;

public class CheckInputValue {
    private Scanner scanner = new Scanner(System.in);
    public int inputInteger(){
        int number = 0;
        boolean checkInput = false;
        while (!checkInput){
            try{
                number = scanner.nextInt();
                checkInput = true;
            } catch (Exception e){
                System.out.println("Illegal input integer! Please input again!");
                scanner.nextLine();
            }
        }
        return number;
    }
    public double inputDouble(){
        double number = 0;
        boolean checkInput = false;
        while (!checkInput) {
            try {
                number = scanner.nextDouble();
                checkInput = true;
            } catch (Exception e) {
                System.out.println("Illegal input double! Please input again!");
                scanner.nextLine();
            }
        }
        return number;
    }
    public String inputString(){
        return scanner.nextLine();
    }
    public void skipSpace(){
        scanner.nextLine();
    }
}
