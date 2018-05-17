package monmar.lambdaEx;

import monmar.lambdaEx.Student;
import org.hamcrest.Matcher;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.core.Is.is;

public class LambdaTest {
    @Test
    public void checkStudentsAverageAge() {
        List<Student> studentList = new ArrayList<>();
        studentList.add(new Student("Marcin", "Pastwa", 41, Student.Gender.MAN));
        studentList.add(new Student("Monika", "Pastwa", 39, Student.Gender.WOMAN));
        studentList.add(new Student("Marta", "Pastwa", 16, Student.Gender.WOMAN));

        assertThat(Student.getAverageAge(studentList), is(32.0));

    }

    @Test
    public void checkStudentWomanAverageAge() {
        List<Student> studentList = new ArrayList<>();
        studentList.add(new Student("Marcin", "Pastwa", 41, Student.Gender.MAN));
        studentList.add(new Student("Monika", "Pastwa", 39, Student.Gender.WOMAN));
        studentList.add(new Student("Marta", "Pastwa", 16, Student.Gender.WOMAN));
        assertThat(Student.getAverageAgeByGender(studentList, Student.Gender.WOMAN), is(27.5));

    }

    @Test
    public void checkStudentSumAge() {
        List<Student> studentList = new ArrayList<>();
        studentList.add(new Student("Marcin", "Pastwa", 41, Student.Gender.MAN));
        studentList.add(new Student("Monika", "Pastwa", 39, Student.Gender.WOMAN));
        studentList.add(new Student("Marta", "Pastwa", 16, Student.Gender.WOMAN));

        assertThat(Student.getStudentSumAge(studentList), is(96));
    }

}
