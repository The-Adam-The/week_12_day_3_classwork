import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class SeniorInstructorTest {

    private SeniorInstructor seniorInstructor ;

    @Before
    public void before() {
        seniorInstructor = new SeniorInstructor("Anna", "V55", "Java", "Main");
    }

    @Test
    public void hasName() {
        assertEquals("Anna", seniorInstructor.getName());
    }
}
