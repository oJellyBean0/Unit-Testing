package nmmu.wrap301.Tests;

import nmmu.wrap301.Task.Item;
import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by s2133 on 2017/04/24.
 */
public class ItemTest {
    @Test
    public void setValue() throws Exception {
        Item item1 = new Item();
        item1.setValue(86.5f);
        assertEquals("Testing setValue method", 86.5f, item1.getValue(), 0);

        Item item2 = new Item();
        item2.setValue(0f);
        assertEquals("Testing setValue method", 0f, item2.getValue(), 0);

        Item item3 = new Item();
        item3.setValue(25f);
        assertEquals("Testing setValue method", 25f, item3.getValue(), 0);
    }

    @Test
    public void getValue() throws Exception {
        Item item1 = new Item();
        item1.setValue(86.5f);
        assertEquals("Testing getValue method", 86.5f, item1.getValue(), 0);

        Item item2 = new Item();
        item2.setValue(0f);
        assertEquals("Testing getValue method", 0f, item2.getValue(), 0);

        Item item3 = new Item();
        item3.setValue(25f);
        assertEquals("Testing getValue method", 25f, item3.getValue(), 0);
    }


}