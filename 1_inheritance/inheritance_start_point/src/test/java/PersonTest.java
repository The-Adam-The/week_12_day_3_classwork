import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class PersonTest {

    Person person;

    @Before
    public void before(){
        person = new Person("John", "V55");
    }

    @Test
    public void hasName() {
        assertEquals("John", person.getName());
    }

    @Test
    public void hasCohort() {
        assertEquals("V55", person.getCohort());
    }

    @Test
    public void canChangeName() {
        person.setName("Jarrod");
        assertEquals("Jarrod", person.getName());
    }

    @Test
    public void canChangeCohort() {
        person.setCohort("V56");
        assertEquals("V56", person.getCohort());
    }

    @Test
    public void canTalk() {
        assertEquals("I love Java", person.talk("Java"));
    }
}
