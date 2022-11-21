package io.zipcoder;

import org.junit.Test;

import java.util.ArrayList;
import java.util.Arrays;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

public class StudentTest {
    String firstName = "Troy";
    String lastName = "Butler";
    Double[] testScores = {100.0, 98.6, 104.2};
    Student troy = new Student(firstName, lastName, testScores);
    String firstName1 = "Charnae";
    String lastName1 = "Warrick";
    ArrayList<Double> scores = new ArrayList<>(Arrays.asList(103.0, 96.5, 92.9));
    Student charnae = new Student(firstName1, lastName1, scores);
    @Test
    public void testGetExamScores() {
        //Given: the student
        String firstName = "Troy";
        String lastName = "Butler";
        Double[] testScores = {100.0, 98.6, 104.2};
        Student troy = new Student(firstName, lastName, testScores);
        //when: you call this method
        String expected = "103.0\n96.5\n92.9\n";
        String actual = charnae.getExamScores();
        //then we get the results
        assertEquals(expected, actual);
    }

    @Test
    public void addExamScoreTest(){
        //given: a student and an exam score
        double examScore = 105.0;
        //when: this method is called
        charnae.addExamScore(examScore);
        assertTrue(scores.contains(105.0));

    }
    @Test
    public void setExamScore(){
        //given the examNumber and the newScore
        int examNumber = 2;
        double newScore = 102.5;
        //when you call this stupid method
        charnae.setExamScore(examNumber, newScore);
        //then you see if the value at the given index changed.
        assertTrue(scores.contains(102.5));
    }
    @Test
    public void getAverageExamScore(){
        //given: an arraylist from a student
        //when: you call the method on their scores
        double actual = charnae.getAverageExamScore();
        double expected = 97.46;
        //then: it returns the average of the elements in the arraylist
        assertEquals(expected, actual, 0.1);
    }
    @Test
    public void toStringTest(){
        //given: a student thing

        //when: you call this method
        String expected = "Student Name: Charnae Warrick\nAverage Score: 97.47\nExam Scores:\n103.0\n96.5\n92.9\n";
        String actual = charnae.toString();
        //then: you should print their whole government information... allegedly
        assertEquals(expected, actual);
    }
}