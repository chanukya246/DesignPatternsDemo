package com.java.dp.creational.builder;

public class Student {

    private String name;
    private int age;
    private int expInYears;
    private String organization;

    public Student (Builder helper) {
        this.age = helper.getAge();
        this.expInYears = helper.getExpInYears();
        this.name = helper.getName();
        this.organization = helper.getOrganization();
    }

    public static Student getStudentObj(String name, int age, int expInYears, String organization) {
        Builder b = new Builder(name, age, expInYears, organization);
        Student s = new Student(b);
        return s;
    }


}
