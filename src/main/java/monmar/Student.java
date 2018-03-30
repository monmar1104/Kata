package monmar;

import java.util.List;

public class Student {

    private String name;
    private String surename;
    private int age;


    public Student(String name, String surename, int age) {
        this.name = name;
        this.surename = surename;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurename() {
        return surename;
    }

    public void setSurename(String surename) {
        this.surename = surename;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    static Double getAverageAge(List<Student> studentList) {
        return studentList.stream().mapToInt(s -> s.age).average().getAsDouble();
    }
}
