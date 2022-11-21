package io.zipcoder;

import org.w3c.dom.ls.LSOutput;

import java.io.PrintStream;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Student {
    public Double[] testScores;
    public String firstName;
    public String lastName;

    ArrayList<Double> examScores;

    public double examScore;

    public int numberOfExamsTaken;

    public Student(String firstName, String lastName, Double[] testScores) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.testScores = testScores;
    }

    public Student (String firstName, String lastName, ArrayList<Double> examScores){
        this.firstName = firstName;
        this.lastName = lastName;
        this.examScores = examScores;
    }
    public double getExamScore() {
        return examScore;
    }

    public void setExamScore(int examNumber, double newScore) {
       examScores.indexOf(examNumber);
       examScores.set(examNumber - 1, newScore);
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public int getNumberOfExamsTaken() {
        return numberOfExamsTaken;
    }

    public String getExamScores() {
//        String str = "";
//        for (Double score : testScores) {
//            str = String.format("%,.1f", score);
//            return str;
//        }return str;
//        String strArray = Arrays.toString(testScores);
//        StringBuffer sb = new StringBuffer();
//        for (int i = 0; i < strArray.length(); i++){
//            sb.append(strArray[i]);
//        }
       String results = "";
        int size = examScores.size();
        String[] str = new String[size];
        for(int i=0; i < size; i++) {
            str[i] = examScores.get(i).toString();
            results = results + str[i] + "\n";
        } return results;
    }

    public void addExamScore (double examScore){
        //using arraylist, add the exam score to the array list
        examScores.add(examScore);
    }

    public double getAverageExamScore(){
        double divisor = examScores.size();
        double dividend = 0;
        for(Double score : examScores){
            dividend = dividend + score;
        }
        return dividend / divisor;
    }

    @Override
    public String toString() {
        double T= getAverageExamScore();
       return "Student Name: " + this.firstName + " " + this.lastName+  "\nAverage Score: " + String.format("%,.2f", T) + "\nExam Scores:\n" + getExamScores();

//        getAverageExamScore();
//        getExamScores();
//        return super.toString();
    }
}
