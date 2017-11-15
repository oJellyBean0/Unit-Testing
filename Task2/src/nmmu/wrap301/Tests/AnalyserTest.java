package nmmu.wrap301.Tests;

import nmmu.wrap301.Task.Analyser;
import nmmu.wrap301.Task.Item;
import nmmu.wrap301.Task.PersonItem;
import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by s2133 on 2017/04/23.
 */
public class AnalyserTest {
    @Test
    public void add(){
        Analyser testAnalyser = new Analyser();

        PersonItem person1 = new PersonItem();
        person1.setName("John");
        person1.setValue(80);
        testAnalyser.add(person1);
        assertEquals("Testing adding of the first person",person1,testAnalyser.getValue(0));

        PersonItem person2 = new PersonItem();
        person1.setName("James");
        person1.setValue(90);
        testAnalyser.add(person2);
        assertEquals("Testing adding of the second person",person2, testAnalyser.getValue(1));

        PersonItem person3 = new PersonItem();
        person1.setName("Jacques");
        person1.setValue(95);
        testAnalyser.add(person3);
        assertEquals("Testing adding of the third person",person3, testAnalyser.getValue(2));

        PersonItem person4 = new PersonItem();
        person1.setName("Johan");
        person1.setValue(30);
        testAnalyser.add(person4);
        assertEquals("Testing adding of the forth person",person4, testAnalyser.getValue(3));



    }

    @Test
    public void getValue(){
        Analyser testAnalyser = new Analyser();

        PersonItem person1 = new PersonItem();
        person1.setName("John");
        person1.setValue(80);
        testAnalyser.add(person1);
        Item retrievedItem = testAnalyser.getValue(0);
        assertEquals("Testing retrieved item is the same as actual item (person1)",person1,retrievedItem);

        PersonItem person2 = new PersonItem();
        person1.setName("James");
        person1.setValue(90);
        testAnalyser.add(person2);
        Item retrievedItem2 = testAnalyser.getValue(1);
        assertEquals("Testing retrieved item is the same as actual item (person2)",person2, retrievedItem2);
    }

    @Test
    public void sort() {
        Analyser testAnalyser = new Analyser();

        PersonItem person1 = new PersonItem();
        person1.setName("John");
        person1.setValue(80);
        testAnalyser.add(person1);

        PersonItem person2 = new PersonItem();
        person2.setName("James");
        person2.setValue(90);
        testAnalyser.add(person2);

        PersonItem person3 = new PersonItem();
        person3.setName("Jacques");
        person3.setValue(95);
        testAnalyser.add(person3);

        PersonItem person4 = new PersonItem();
        person4.setName("Johan");
        person4.setValue(30);
        testAnalyser.add(person4);

        testAnalyser.sort();

        assertArrayEquals("Testing order or array after sorting", new Item[] {person4,person1,person2,person3},new Item[]{testAnalyser.getValue(0), testAnalyser.getValue(1), testAnalyser.getValue(2), testAnalyser.getValue(3)});
    }

    @Test
    public void size(){
        Analyser testAnalyser = new Analyser();

        assertEquals("Testing the size of the array", 0, testAnalyser.size());

        PersonItem person1 = new PersonItem();
        person1.setName("John");
        person1.setValue(80);
        testAnalyser.add(person1);

        assertEquals("Testing the size of the array", 1, testAnalyser.size());

        PersonItem person2 = new PersonItem();
        person2.setName("James");
        person2.setValue(90);
        testAnalyser.add(person2);

        assertEquals("Testing the size of the array", 2, testAnalyser.size());

        PersonItem person3 = new PersonItem();
        person3.setName("Jacques");
        person3.setValue(95);
        testAnalyser.add(person3);

        assertEquals("Testing the size of the array", 3, testAnalyser.size());

        PersonItem person4 = new PersonItem();
        person4.setName("Johan");
        person4.setValue(30);
        testAnalyser.add(person4);

        assertEquals("Testing the size of the array", 4, testAnalyser.size());
    }

    @Test
    public void average() {
        Analyser testAnalyser = new Analyser();

        PersonItem person1 = new PersonItem();
        person1.setName("John");
        person1.setValue(80);
        testAnalyser.add(person1);

        PersonItem person2 = new PersonItem();
        person2.setName("James");
        person2.setValue(90);
        testAnalyser.add(person2);

        PersonItem person3 = new PersonItem();
        person3.setName("Jacques");
        person3.setValue(95);
        testAnalyser.add(person3);

        PersonItem person4 = new PersonItem();
        person4.setName("Johan");
        person4.setValue(30);
        testAnalyser.add(person4);

        float avg = (person1.getValue()+person2.getValue()+person3.getValue()+person4.getValue())/4f;
        float actual = testAnalyser.average();

        assertEquals("Testing if the average is calculated correctly",avg,actual, 0f);
    }

    @Test
    public void min(){
        Analyser testAnalyser = new Analyser();

        PersonItem person1 = new PersonItem();
        person1.setName("John");
        person1.setValue(80);
        testAnalyser.add(person1);

        PersonItem person2 = new PersonItem();
        person2.setName("James");
        person2.setValue(90);
        testAnalyser.add(person2);

        PersonItem person3 = new PersonItem();
        person3.setName("Jacques");
        person3.setValue(95);
        testAnalyser.add(person3);

        PersonItem person4 = new PersonItem();
        person4.setName("Johan");
        person4.setValue(30);
        testAnalyser.add(person4);

        testAnalyser.sort();
        assertEquals("Testing min method", 30, testAnalyser.getValue(0).getValue(),0);
    }

    @Test
    public void max(){
        Analyser testAnalyser = new Analyser();

        PersonItem person1 = new PersonItem();
        person1.setName("John");
        person1.setValue(80);
        testAnalyser.add(person1);

        PersonItem person2 = new PersonItem();
        person2.setName("James");
        person2.setValue(90);
        testAnalyser.add(person2);

        PersonItem person3 = new PersonItem();
        person3.setName("Jacques");
        person3.setValue(95);
        testAnalyser.add(person3);

        PersonItem person4 = new PersonItem();
        person4.setName("Johan");
        person4.setValue(30);
        testAnalyser.add(person4);

        testAnalyser.sort();
        assertEquals("Testing max method", 95, testAnalyser.getValue(3).getValue(),0);
    }

    @Test
    public void percentile(){
        Analyser testAnalyser = new Analyser();

        PersonItem person1 = new PersonItem();
        person1.setName("John");
        person1.setValue(80);
        testAnalyser.add(person1);

        PersonItem person2 = new PersonItem();
        person2.setName("James");
        person2.setValue(90);
        testAnalyser.add(person2);

        PersonItem person3 = new PersonItem();
        person3.setName("Jacques");
        person3.setValue(95);
        testAnalyser.add(person3);

        PersonItem person4 = new PersonItem();
        person4.setName("Johan");
        person4.setValue(30);
        testAnalyser.add(person4);

        System.out.println(testAnalyser.percentile(10));
        System.out.println(testAnalyser.percentile(49));
        System.out.println(testAnalyser.percentile(73));
        System.out.println(testAnalyser.percentile(99));
        System.out.println(person1);
        System.out.println(person2);
        System.out.println(person3);
        System.out.println(person4);

        assertEquals("Testing percentile method", person4, testAnalyser.percentile(0));
        assertEquals("Testing percentile method", person4, testAnalyser.percentile(10));
        assertEquals("Testing percentile method", person4, testAnalyser.percentile(25));
        assertEquals("Testing percentile method", person1, testAnalyser.percentile(49));
        assertEquals("Testing percentile method", person2, testAnalyser.percentile(73));
        assertEquals("Testing percentile method", person3, testAnalyser.percentile(99));
        assertEquals("Testing percentile method", person3, testAnalyser.percentile(100));
    }

    @Test
    public void percentile1(){
        Analyser testAnalyser = new Analyser();

        PersonItem person1 = new PersonItem();
        person1.setName("John");
        person1.setValue(80);
        testAnalyser.add(person1);

        PersonItem person2 = new PersonItem();
        person2.setName("James");
        person2.setValue(90);
        testAnalyser.add(person2);

        PersonItem person3 = new PersonItem();
        person3.setName("Jacques");
        person3.setValue(95);
        testAnalyser.add(person3);

        PersonItem person4 = new PersonItem();
        person4.setName("Johan");
        person4.setValue(30);
        testAnalyser.add(person4);

        int arraySize = testAnalyser.percentile(0,24).size();
        Item[] items = new Item[arraySize];
        for (int ii=0;ii<arraySize;ii++){
            items[ii] = testAnalyser.percentile(0,24).getValue(ii);
        }
        assertArrayEquals("Testing percentile range method", new Item[] {person4}, items);

        arraySize = testAnalyser.percentile(10,50).size();
        items = new Item[arraySize];
        for (int ii=0;ii<arraySize;ii++){
            items[ii] = testAnalyser.percentile(10,50).getValue(ii);
        }
        assertArrayEquals("Testing percentile range method", new Item[] {person4,person1}, items);

        arraySize = testAnalyser.percentile(0,100).size();
        items = new Item[arraySize];
        for (int ii=0;ii<arraySize;ii++){
            items[ii] = testAnalyser.percentile(0,100).getValue(ii);
        }
        assertArrayEquals("Testing percentile range method", new Item[] {person4,person1, person2, person3}, items);

        arraySize = testAnalyser.percentile(15,74).size();
        items = new Item[arraySize];
        for (int ii=0;ii<arraySize;ii++){
            items[ii] = testAnalyser.percentile(15,74).getValue(ii);
        }
        assertArrayEquals("Testing percentile range method", new Item[] {person4,person1, person2}, items);


    }

}