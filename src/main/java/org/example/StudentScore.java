package org.example;

public class StudentScore {
    private String studentName;
    private int score;

    public StudentScore(String studentName, int score) {
        this.studentName = studentName;
        this.score = score;
    }

    public String getStudentName() {
        return studentName;
    }

    public int getScore() {
        return score;
    }
}
