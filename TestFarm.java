/*
Title: TestFarm Driver
Author: Ethan Brill
Purpose: Tests individual animal object creation and method calls.
Resources: Class notes and AP Computer Science A Course and Exam Description (Unit 1: Using Objects and Methods, Topic 1.13 - Object Creation and Storage)
*/
public class TestFarm {
    public static void main(String[] args) {
        Chick h = new Chick("chick", "cheep", "cluck");
        for (int i = 0; i < 5; i++) {
            System.out.println(h.getType() + " goes " + h.getSound());
        }
    }
}
