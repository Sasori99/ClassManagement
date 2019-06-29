package com.k001.studentManagement;

class Team {
    protected int numberOfMember;
    protected Student[] listOfMember = new Student[100];
    Team(){
        this.numberOfMember = 0;
    }
    public void addMember(Student student){
        this.numberOfMember++;
        this.listOfMember[numberOfMember] = student;
    }
    public void delete(int id){
        for(int i = id;i < this.numberOfMember;i++)
            this.listOfMember[i] = this.listOfMember[i + 1];
        this.numberOfMember--;
    }
}
