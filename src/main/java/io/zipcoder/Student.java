package io.zipcoder;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Student {
    public Double[] testScores;
    public String firstName;
    public String lastName;

    ArrayList<Double> examScores;

    public Double examScore;

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

    public void setExamScore(double examScore) {
        this.examScore = examScore;
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
        int size = testScores.length;
        String[] str = new String[size];
        for(int i=0; i < size; i++) {
            str[i] = testScores[i].toString();
            results = results + str[i] + "\n";
        } return results;
    }

    public void addExamScore (Double examScore){
        //turn array into arrayList
        List<Double> testScoresList = new ArrayList<>(Arrays.asList(testScores));
        //add the examScore to the end of the arrayList
        testScoresList.add(examScore);
        //turn this back into an array
        //examScores = testScoresList.toArray();

    }
}
