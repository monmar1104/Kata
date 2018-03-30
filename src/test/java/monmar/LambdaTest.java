package monmar;

import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.core.Is.is;

public class LambdaTest {
    @Test
    public void checkStudentsAverageAge(){
        List<Student> studentList = new ArrayList<>();
        studentList.add(new Student("Marcin", "Pastwa", 41));
        studentList.add(new Student("Monika", "Pastwa", 39));
        studentList.add(new Student("Marta", "Pastwa", 16));

        assertThat(Student.getAverageAge(studentList), is(32.0));

        //assertThat(Student.getAverageAge(studentList),is(32.0));

    }

}
