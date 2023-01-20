package com.java.dp.creational.builder;

public class Builder {

    private String name;
    private int age;
    private int expInYears;
    private String organization;

    public Builder(String name, int age, int expInYears, String organization) {
        this.name = name;
        this.organization = organization;
    }

    /**
     *
     * @return
     * @throws Exception
     */
    public Student build() throws Exception {
        if (age < 18)
            throw new Exception("Age isn't valid");
        if (expInYears < 5)
            throw new Exception("Not enough Exp.");
        Student s = new Student(this);
        return s;
    }

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
