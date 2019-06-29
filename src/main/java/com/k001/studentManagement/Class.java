package com.k001.studentManagement;

public class Class extends CheckInputValue{

    private int numberOfStudent;
    private int numberOfTeam;
    private Team[] listOfTeam = new Team[101];
    private Teacher teacher = new Teacher();

    Class(){
        numberOfTeam = 100; //Deafault number of team is 100
        numberOfStudent = 0;
        for(int i = 1;i <= numberOfTeam;i++)
            listOfTeam[i] = new Team();
    }

    public void addNewStudent(){
        numberOfStudent++;
        Student student = new Student();
        student.input();
        student.setID(numberOfStudent);
        int team = student.getTeam();
        listOfTeam[team].addMember(student);
    }

    public void findStudent(){
        String name;
        boolean OK = true;
        System.out.print("Input name of student need to find: ");
        name = inputString();
        for(int i = 1;i <= numberOfTeam;i++){
            for(int j = 1;j <= listOfTeam[i].numberOfMember;j++)
                if (listOfTeam[i].listOfMember[j].getName().equals(name)) {
                    if (OK) System.out.println("List of student need to find: ");
                    listOfTeam[i].listOfMember[j].display();
                    OK = false;
                }
        }
        if (OK) System.out.println("Not Found!!!!");
    }

    public void deleteStudent(){
        int id;
        boolean OK = true;
        System.out.print("Input ID of student need to delete: ");
        do {
            id = inputInteger();
            if (id < 1 || id > numberOfStudent) System.out.println("ERORR!! Please make a choice");
        } while (id <1 || id > numberOfStudent);
        for(int i = 1;i <= numberOfTeam && OK;i++) {
            for (int j = 1; j <= listOfTeam[i].numberOfMember && OK; j++) {
                if (listOfTeam[i].listOfMember[j].getID() == id) {
                    listOfTeam[i].listOfMember[j].display();
                    System.out.println("Do you want to delete? ");
                    System.out.println("1: Yes       2: No");
                    int option;
                    option = inputInteger();
                    if (option == 1) {
                        listOfTeam[i].delete(j);
                        this.numberOfStudent--;
                    }
                    OK = false;
                }
            }
        }
    }

    public void fixStudentInformation(){
        int id;
        boolean OK = true;
        System.out.print("Input ID of student need to fix: ");
        do {
            id = inputInteger();
            if (id < 1 || id > numberOfStudent) System.out.println("ERORR!! Please make a choice");
        } while (id <1 || id > numberOfStudent);
        for(int i = 1;i <= numberOfTeam && OK;i++){
            for(int j = 1;j <= listOfTeam[i].numberOfMember && OK;j++) {
                if (listOfTeam[i].listOfMember[j].getID() == id) {
                    listOfTeam[i].listOfMember[j].display();
                    System.out.println("what do you want to fix? ");
                    System.out.println("1: Name \n2: Sex \n3: Address\n4:Phone number");
                    System.out.println("5: Date of birth\n6: Major \n7: Number of late \n8: Team");
                    int option;
                    do {
                        option = inputInteger();
                        if (option < 1 || option > 8) System.out.println("ERORR!! Please make a choice");
                    } while (option < 1 || option > 8);
                    switch (option) {
                        case 1: {
                            listOfTeam[i].listOfMember[j].inputName();
                            break;
                        }
                        case 2: {
                            listOfTeam[i].listOfMember[j].inputSex();
                            break;
                        }
                        case 3: {
                            listOfTeam[i].listOfMember[j].inputAddress();
                            break;
                        }
                        case 4: {
                            listOfTeam[i].listOfMember[j].inputPhoneNumber();
                            break;
                        }
                        case 5: {
                            listOfTeam[i].listOfMember[j].inputDateOfBirth();
                            break;
                        }
                        case 6: {
                            listOfTeam[i].listOfMember[j].inputMajor();
                            break;
                        }
                        case 7: {
                            int numberOfLate = inputInteger();
                            listOfTeam[i].listOfMember[j].setNumberOfLate(numberOfLate);
                            break;
                        }
                        case 8: {
                            listOfTeam[i].listOfMember[j].inputTeam();
                            int team = listOfTeam[i].listOfMember[j].getTeam();
                            listOfTeam[team].addMember(listOfTeam[i].listOfMember[j]);
                            listOfTeam[i].delete(j);
                            break;
                        }
                    }
                    OK = false;
                }
            }
        }
    }

    public void addLateStudent(){
        int id;
        boolean OK = true;
        System.out.print("Input ID of student was late : ");
        do {
            id = inputInteger();
            if (id < 1 || id > numberOfStudent) System.out.println("ERORR!! Please make a choice");
        } while (id <1 || id > numberOfStudent);
        for(int i = 1;i <= numberOfTeam && OK;i++) {
            for (int j = 1; j <= listOfTeam[i].numberOfMember && OK; j++) {
                if (listOfTeam[i].listOfMember[j].getID() == id) {
                    listOfTeam[i].listOfMember[j].updateNumberOfLate();
                    OK = false;
                }
            }
        }
    }

    public void displayListOfStudent(){
        System.out.println("Number of student: " + this.numberOfStudent);
        System.out.println("List of student: ");
        for(int i = 1;i <= numberOfTeam;i++){
            for(int j = 1;j <= listOfTeam[i].numberOfMember;j++) {
                listOfTeam[i].listOfMember[j].display();
            }
        }
    }

    public void addTeacher(){
        teacher.input();
    }

    public void fixTeacherInformation(){
        System.out.println("what do you want to fix? ");
        System.out.println("1: Name \n2: Sex \n3: Address\n4:Phone number\n5: Date of birth\n6: Company");
        int option;
        do {
            option = inputInteger();
            if (option < 1 || option > 6) System.out.println("ERORR!! Please make a choice");
        } while (option < 1 || option > 6);
        switch (option) {
            case 1: {
                teacher.inputName();
                break;
            }
            case 2: {
                teacher.inputSex();
                break;
            }
            case 3: {
                teacher.inputAddress();
                break;
            }
            case 4: {
                teacher.inputPhoneNumber();
                break;
            }
            case 5: {
                teacher.inputDateOfBirth();
                break;
            }
            case 6: {
                teacher.inputCompany();
                break;
            }
        }
    }

    public void displayTeacherInformation(){
        System.out.println("Information of teacher: ");
        teacher.display();
    }

    public void displayClassInformation(){
        this.displayTeacherInformation();
        this.displayListOfStudent();
    }
}

