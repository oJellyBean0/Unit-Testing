# Unit-Testing

For this assignment, you are required to write an application that will be tested thoroughly. The
application itself is simple, but will allow you to practise the concepts covered in last week’s work. See figure
1 for the diagram tha needs to be coded.

The main classes in the application are _Analyser_ and _Item_. Item simply contains a float value that is
used by the Analyser to calculate different things. The Analyser can contain a number of items and
can perform different operations:

```
 A new item may be added to the items that will be analysed;
 A specific item may be retrieved using its index;
 The items may be sorted in ascending order of value – implement a recursive sorting
algorithm;
 The number of items may be returned;
 The average value of the items can be calculated and returned;
 The items with the minimum and maximum values can be calculated and returned;
 The 1st item at a specific percentile^1 can be returned;
 The items in a specific percentile range can be returned.
```
A specific type of Item, called _PersonItem_ , attaches additional information, namely a person’s name.
The value for a Person Item is interpreted as a grade obtained for a specific activity, such as
“Programming 101” and has a range of acceptable values from 0...100.

In order to apply last week’s topics, you need to ensure that the application is perfectly written and
you must be able to _prove_ this! To prove it, make use of _unit testing and  white box testing_ to show that your code is correct. Use JUnit to create a suite of tests
to test each class and their integration with the others properly.

Include proper documentation in your code, specifically pre- and post-conditions.

Create unit tests, test individual classes and methods incrementally, and run _regression tests_ as you
develop the application to check whether everything is working correctly.
