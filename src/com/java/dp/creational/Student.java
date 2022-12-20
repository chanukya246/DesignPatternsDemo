package com.java.dp.creational;

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
}
