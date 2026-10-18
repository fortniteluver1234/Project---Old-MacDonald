/*
Title: Cow Class
Author: Ethan Brill
Purpose: Implements the Animal interface to represent a cow with a type and sound.
Resources: Class notes and AP Computer Science A Course and Exam Description (Unit 3: Class Creation, Topic 3.3 - Anatomy of a Class and Topic 3.4 - Constructors)
*/
public class Cow implements Animal {
     private String oneType;
    private String oneSound;
    public Cow (String type, String sound) {
    oneType = type;
    oneSound = sound;
    }
    public String getType() {
        return oneType;
    }
    public String getSound() {
        return oneSound;
}
}
