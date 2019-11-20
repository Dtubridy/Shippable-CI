package nuigalway.app;

import static org.junit.Assert.assertEquals;

import org.joda.time.LocalDate;
import org.junit.Test;

import java.util.ArrayList;


public class StudentsTest{

    Students jack =  new Students("Jack", new LocalDate(1992, 05, 25), 27,  15104955, new ArrayList(1));

        @Test
        public void getStudentName(){
            String expectedAName = "Jack";
            String name = jack.getName();
            assertEquals(expectedAName, name);
        }

    @Test
    public void getStudentID(){
        int expectedID = 15104955;
        int id = jack.getID();
        assertEquals(expectedID, id);
    }

    @Test
    public void getStudentAge(){
        int expectedAge = 27;
        int age = jack.getAge();
        assertEquals(expectedAge, age);
    }

    @Test
    public void getStudentDOB(){
        LocalDate expectedDOB = new LocalDate(1992, 05, 25);
        LocalDate dob = jack.getDOB();
        assertEquals(expectedDOB, dob);;
    }
}
