package io.zipcoder;

import java.util.ArrayList;
import java.util.Arrays;

public class Classroom {


    Student[] objStudents;
    int maxNumberOfStudents;

    public Classroom(int maxNumberOfStudents){
        this.maxNumberOfStudents = maxNumberOfStudents;
    }
    public Classroom(Student[] objStudents){
        this.objStudents = objStudents;
    }
    public Classroom (){
        Student[] objStudents = new Student[30];
        this.objStudents = objStudents;
    }
    public Student[] getStudents() {
        return objStudents;
    }

    public Double getAverageExamScores(){
        int numOfStudents = objStudents.length;
        Double currentTotal = 0.0;
        for(Student student : objStudents){
            currentTotal = currentTotal + student.getAverageExamScore();
        } return currentTotal /numOfStudents;
    }

    public void addStudent(Student student){
        for(int i = 0; i < objStudents.length; i++){
            if (objStudents[i] != student){
                objStudents[i] = student;
            }
        }
    }

//    public void removeStudent(String firstName, String lastName){
//        Student[] removedStudent = new Student[100];
//        for (int i = 0; i < students.length; i++){
//            for (int j = 0; j < removedStudent.length; j++) {
//                if () {
//                    removedStudent[j] = students[i];
//                }
//            }
//        }
//    }

    public ArrayList<Student> getStudentsByScore(){
        ArrayList<Student> studentsInOrderByScore = new ArrayList<>();
        for(int i = 0; i < objStudents.length; i++){
            double score = objStudents[i].getAverageExamScore();
            if (objStudents[i + 1] == null){break;}
            else if (score > objStudents[i+1].getAverageExamScore()){
                studentsInOrderByScore.add(objStudents[i]);
            }
        } return studentsInOrderByScore;
    }
}
