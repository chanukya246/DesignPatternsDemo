package com.java.dp.creational;

public class Builder {

    private String name;
    private int age;
    private int expInYears;
    private String organization;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getExpInYears() {
        return expInYears;
    }

    public void setExpInYears(int expInYears) {
        this.expInYears = expInYears;
    }

    public String getOrganization() {
        return organization;
    }

    public void setOrganization(String organization) {
        this.organization = organization;
    }
}
