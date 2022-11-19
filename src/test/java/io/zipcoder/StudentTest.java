package io.zipcoder;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class StudentTest {
    String firstName = "Troy";
    String lastName = "Butler";
    Double[] testScores = {100.0, 98.6, 104.2};
    Student troy = new Student(firstName, lastName, testScores);
    @Test
    public void testGetExamScores() {
        //Given: the student
        String firstName = "Troy";
        String lastName = "Butler";
        Double[] testScores = {100.0, 98.6, 104.2};
        Student troy = new Student(firstName, lastName, testScores);
        //when: you call this method
        String expected = "100.0\n98.6\n104.2\n";
        String actual = troy.getExamScores();
        //then we get the results
        assertEquals(expected, actual);
    }

    @Test
    public void addExamScoreTest(){
        //given: a student and an exam score
        Double examScore = 100.0;
        //when: this method is called
        //troy.addExamScore(examScore);
        System.out.println(troy.getExamScores());
        //then the method adds an exam score tot the back of the array
        //Assert.assertTrue(testScores.contains(100.0));
    }
}