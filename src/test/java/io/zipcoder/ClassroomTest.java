package io.zipcoder;

import org.junit.Test;

import java.util.ArrayList;
import java.util.Arrays;

import static org.junit.Assert.*;

public class ClassroomTest {
    // : Given
    ArrayList<Double> s1Scores = new ArrayList<>(Arrays.asList(100.0, 78.3, 94.2));
    ArrayList<Double> s2Scores = new ArrayList<>(Arrays.asList(70.0, 88.3, 104.2));
    ArrayList<Double> s3Scores = new ArrayList<>(Arrays.asList(50.0, 76.9, 91.0));

    Student s1 = new Student("student", "one", s1Scores);
    Student s2 = new Student("student", "two", s2Scores);
    Student s3 = new Student("student", "three", s3Scores);

    Student[] students = {s1,s2};
    Classroom classroom = new Classroom(students);

    @Test
    public void getAverageExamScoresTest(){
        //given: an array of students
        //when: you mind your business...
        double expected = 89.16;
        double actual =  classroom.getAverageExamScores();
        //then: you get the average of all their test scores
        assertEquals(expected, actual, 0.01);
    }

    @Test
    public void addStudentTest(){
        //given: a student and an array of students or not students
        //when: you call this method lmao
        classroom.addStudent(s3);
        ArrayList<Student> actual = new ArrayList<>(Arrays.asList(students));
        //then: it will add the student to the array
        assertTrue(actual.contains(s3));
    }

//    @Test
//    public void removeStudent(){
//        //given: an array of students and names of the student to remove
//        //when: idk
//        classroom.removeStudent("student", "two");
//        ArrayList<Student> actual = new ArrayList<>(Arrays.asList(students));
//        //then: you should be able to remove a student
//        assertFalse(actual.contains(s2));
//    }
    @Test
    public void getStudentsByScoreTest(){
        System.out.println(classroom.getStudentsByScore());
    }
}
