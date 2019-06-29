package com.k001.studentManagement;

public class Main {
    public static void main(String[] args) {
        Class k001 = new Class();
        System.out.println("Input information of teacher: ");
        k001.addTeacher();
        int option;
        do {
            System.out.println("Choose an option:");
            System.out.println("1: Add a new student.");
            System.out.println("2: Find student.");
            System.out.println("3: Delete a student.");
            System.out.println("4: Fix information of student.");
            System.out.println("5: Add a late student.");
            System.out.println("6: Display list of student.");
            System.out.println("7: Fix information of teacher.");
            System.out.println("8: Display information of teacher.");
            System.out.println("9: Display information of class.");
            System.out.println("0: Exit.");
            do {
                option = k001.inputInteger();
                if (option < 0 || option > 9) System.out.println("ERORR!! Please make a choice");
            } while (option < 0 || option > 9);
            switch (option) {
                case 1: {
                    k001.addNewStudent();
                    break;
                }
                case 2: {
                    k001.skipSpace();
                    k001.findStudent();
                    break;
                }
                case 3: {
                    k001.deleteStudent();
                    break;
                }
                case 4: {
                    k001.fixStudentInformation();
                    break;
                }
                case 5: {
                    k001.addLateStudent();
                    break;
                }
                case 6:{
                    k001.displayListOfStudent();
                    break;
                }
                case 7: {
                    k001.fixTeacherInformation();
                    break;
                }
                case 8:{
                    k001.displayTeacherInformation();
                    break;
                }
                case 9:{
                    k001.displayClassInformation();
                    break;
                }
            }
        } while (option != 0);
    }
}
