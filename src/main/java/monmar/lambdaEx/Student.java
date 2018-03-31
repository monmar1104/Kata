package monmar.lambdaEx;

import java.util.List;

public class Student {

    private String name;
    private String surename;
    private int age;
    private Gender gender;

    public enum Gender{
        MAN, WOMAN;
    }

    public Student(String name, String surename, int age, Gender gender) {
        this.name = name;
        this.surename = surename;
        this.age = age;
        this.gender=gender;
    }

    public Gender getGender() {
        return gender;
    }

    public void setGender(Gender gender) {
        this.gender = gender;
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

    public static Double getAverageAgeByGender(List<Student> studentList, Gender gender) {
        return studentList.stream().filter(s ->s.getGender()==gender).mapToInt(s ->s.age).average().getAsDouble();
    }
}
