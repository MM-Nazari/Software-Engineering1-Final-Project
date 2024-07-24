package com.company;

import java.util.logging.Logger;

import static org.junit.jupiter.api.Assertions.*;

class InstructorTest {

    @org.junit.jupiter.api.Test
    void initiateExam() {
    }

    @org.junit.jupiter.api.Test
    void loginTest01() {
        Instructor instructor = new Instructor();
        assertTrue(instructor.login("password","username"));
    }

    @org.junit.jupiter.api.Test
    void loginTest02() {
        Instructor instructor = new Instructor();
        assertTrue(instructor.login("word","username"));
    }

    @org.junit.jupiter.api.Test
    void loginTest03() {
        Instructor instructor = new Instructor();
        assertTrue(instructor.login("password","name"));
    }

    @org.junit.jupiter.api.Test
    void loginTest04() {
        Instructor instructor = new Instructor();
        assertTrue(instructor.login("word","name"));
    }

    @org.junit.jupiter.api.Test
    void saveExamFile() {
    }
}