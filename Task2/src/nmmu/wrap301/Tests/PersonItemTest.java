package nmmu.wrap301.Tests;

import nmmu.wrap301.Task.Item;
import nmmu.wrap301.Task.PersonItem;
import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by s2133 on 2017/04/24.
 */
public class PersonItemTest {
    @Test
    public void setName() throws Exception {
        PersonItem item1 = new PersonItem();
        item1.setName("John");
        assertEquals("Testing setName method", "John", item1.getName());

        PersonItem item2 = new PersonItem();
        item2.setName("James");
        assertEquals("Testing setName method", "James", item2.getName());

        PersonItem item3 = new PersonItem();
        item3.setName("Jack");
        assertEquals("Testing setName method", "Jack", item3.getName());
    }

    @Test
    public void getName() throws Exception {
        PersonItem item1 = new PersonItem();
        item1.setName("John");
        assertEquals("Testing getName method", "John", item1.getName());

        PersonItem item2 = new PersonItem();
        item2.setName("James");
        assertEquals("Testing getName method", "James", item2.getName());

        PersonItem item3 = new PersonItem();
        item3.setName("Jack");
        assertEquals("Testing getName method", "Jack", item3.getName());
    }

    @Test
    public void setValue() throws Exception {
        PersonItem item1 = new PersonItem();
        item1.setValue(86.5f);
        assertEquals("Testing setValue method", 86.5f, item1.getValue(), 0);

        PersonItem item2 = new PersonItem();
        item2.setValue(0f);
        assertEquals("Testing setValue method", 0f, item2.getValue(), 0);

        PersonItem item3 = new PersonItem();
        item3.setValue(25f);
        assertEquals("Testing setValue method", 25f, item3.getValue(), 0);
    }

}