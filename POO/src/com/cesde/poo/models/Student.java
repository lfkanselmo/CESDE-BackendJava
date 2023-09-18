package com.cesde.poo.models;

public class Student extends User{
    private String course;

    public String getCourse() {
        return course;
    }

    public void setCourse(String course) {
        this.course = course;
    }

    @Override
    public String toString() {
        return "Student [" +
                "id = " + getId() + '\n' +
                "Name = " + getName() + '\n' +
                "Email = " + getEmail() + '\n' +
                "PhoneNumber = " + getPhoneNumber() + '\n' +
                "Address = " + getAddress() + '\n' +
                "course= " + getCourse() + '\n' +
                ']';
    }
}
