import org.junit.Before;
import org.junit.Test;

import java.util.Optional;

import static org.junit.Assert.assertEquals;

public class StudentTest {

    private Student student;

    @Before
    public void setUp() {
        student = new Student(1, "John");
    }

    @Test
    public void testGetId() {
        assertEquals(1, student.getId());
    }

    @Test
    public void testGetName() {
        assertEquals("John", student.getName());
    }

    @Test
    public void testAddGrade() {
        student.addGrade(100);
        assertEquals(100, student.getGrades().get(0).intValue());
    }


    @Test
    public void testGetGradeAverage() {
        student.addGrade(100);
        student.addGrade(100);
        student.addGrade(100);
        assertEquals(100, student.getGradeAverage(), 0.01);
    }
}
