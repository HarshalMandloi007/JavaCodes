package com.oops;

import org.junit.Test;

import static org.junit.Assert.*;

public class Student1Test {
    @Test
    public void should_set_name_and_rollno() {
        Student1 student1 = new Student1();
        student1.setName("Abhay");
        student1.setRoll_no(102);

        assertTrue(student1.getName() == "Abhay");
        assertTrue(student1.getRoll_no() == 102);
    }


}