package com.bytelegend;

public class Challenge {
    public static void main(String[] args) {
        System.out.println(getStudentGrade(-1));
        System.out.println(getStudentGrade(0));
        System.out.println(getStudentGrade(60));
        System.out.println(getStudentGrade(75));
        System.out.println(getStudentGrade(100));
    }

    /**
     * `getStudentGrade(int score)` returns the grade of the student based on the given score.
     *
     * <p>If 0<=score<60, return `E`;
     *
     * <p>If 60<=score<70, return `D`;
     *
     * <p>If 70<=score<80, return `C`;
     *
     * <p>If 80<=score<90, return `B`;
     *
     * <p>If 90<=score<=100, return `A`;
     *
     * <p>If the score is not in 0-100 range, return `Invalid Score`.
     */
    public static String getStudentGrade(int score) {
        String grade = "Invalid Score";
        if (score >= 0 && score < 60) {
            grade = "E";
        } else if (score >= 60 && score < 70) {
            grade = "D";
        } else if (score >= 70 && score < 80) {
            grade = "C";
        } else if (score >= 80 && score < 90) {
            grade = "B";
        } else if (score >= 90 && score <= 100) {
            grade = "A";
        }
        return grade;
    }
}
