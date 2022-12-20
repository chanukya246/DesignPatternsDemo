package com.java.dp;

import com.java.dp.creational.Builder;
import com.java.dp.creational.Singleton;
import com.java.dp.creational.Student;

public class Main {

    public static void main(String[] args) {
	// write your code here
        Singleton s1 = Singleton.getInstance();
        Singleton s2 = Singleton.getInstance();
        Singleton s3 = Singleton.getInstance();

        Builder builder = new Builder();
        builder.setAge(22);
        builder.setExpInYears(6);
        builder.setName("Iraa");
        builder.setOrganization("JPMC");
        Student st1 = new Student(builder);
    }
}
