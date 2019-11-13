package nuigalway.app;

import static org.junit.Assert.assertEquals;

import org.joda.time.LocalDate;
import org.junit.Test;

import java.util.ArrayList;

/**
 * Unit test for simple App.
 */
public class StudentsTest{


        @Test
        public void getStudentInfo(){
            Students jack =  new Students("Jack", new LocalDate(1992, 05, 25), 27,  15104955, new ArrayList(1));

            String expectedAName = "Jack";
            LocalDate expectedDOB = new LocalDate(1992, 05, 25);
            int expectedAge = 27;
            int expectedID = 15104955;


            String name = jack.getName();
            LocalDate dob = new LocalDate(1992, 05, 25);
            int age = jack.getAge();
            int id = jack.getID();

            assertEquals(expectedAName, name);
            assertEquals(expectedDOB, dob);
            assertEquals(expectedAge, age);
            assertEquals(expectedID, id);
        }
}
