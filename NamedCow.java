/*
Title: NamedCow Class
Author: Ethan Brill
Purpose: Extends Cow to add a personal name field and a getName() method.
Resources: Class notes and AP Computer Science A Course and Exam Description (Unit 1: Using Objects and Methods, Topic 1.12 - Objects: Instances of Classes and Unit 3: Class Creation, Topic 3.4 - Constructors)
*/

public class NamedCow extends Cow {
    private String cowName;
    public NamedCow(String type, String name, String sound) {
        super(type, sound);
        cowName = name;
    }
    public String getName() {
        return cowName;
    }
}