/*
Title: Chick Class
Author: Ethan Brill
Purpose: Implements the Animal interface for a chick with two constructors and a random sound generator.
Resources: Class notes and AP Computer Science A Course and Exam Description (Unit 1: Using Objects and Methods, Topic 1.11 - Math Class and Unit 3: Class Creation, Topic 3.4 - Constructors)
*/

public class Chick implements Animal {
     private String oneType;
    private String oneSound;
     private String twoSound;
    public Chick (String type, String sound) {
    oneType = type;
    oneSound = sound;
    twoSound = sound;
    }
    public Chick(String type, String sound1, String sound2) {
       oneType = type;
    oneSound = sound1;
    twoSound = sound2;
    }
    public String getType() {
        return oneType;
    }
    public String getSound() {
       if (Math.random() < 0.5) {
            return oneSound;
        } else {
            return twoSound;
        }
    }
}


