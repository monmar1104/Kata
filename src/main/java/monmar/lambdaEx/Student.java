package monmar.lambdaEx;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class Student {


    private static Logger logger = LoggerFactory.getLogger(Student.class);
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

    public static Integer getStudentSumAge(List<Student> studentList) {
        return studentList.stream().mapToInt(s ->s.getAge()).reduce(Integer::sum).orElse(0);
    }

    public static Integer getDoubleAgeSum(List<Student> students){
//        return students.stream().mapToInt(s -> s.age).reduce((a,b) -> a * b).orElse(0);
        return students.stream().mapToInt(s -> s.age).sum();
    }


    public static void main(String[] args) {
        List<Student> studentList = new ArrayList<>();
        studentList.add(new Student("Marcin", "Pastwa", 41, Student.Gender.MAN));
        studentList.add(new Student("Monika", "Pastwa", 39, Student.Gender.WOMAN));
        studentList.add(new Student("Marta", "Pastwa", 16, Student.Gender.WOMAN));
        System.out.println(getDoubleAgeSum(studentList));

        int intArrays = Arrays.asList(29,30,21,18).parallelStream().reduce(2, (s1, s2) -> s1 * s2, (p, q) -> p + q);
        int sumAge = studentList.stream().mapToInt(s -> s.age).reduce(100, Integer::sum);
        System.out.println("Suma wieku: "+sumAge);
    }
}
