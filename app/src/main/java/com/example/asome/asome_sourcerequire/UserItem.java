package com.example.asome.asome_sourcerequire;

public class UserItem {
    String name;
    String department;
    String email;
    int resID;

    public UserItem(int resID,String name, String department, String email){
        this.name = name;
        this.resID = resID;
        this.department = department;
        this.email= email;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getResID() {
        return resID;
    }

    public void setResID(int resID) {
        this.resID=resID;
    }

    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
}
