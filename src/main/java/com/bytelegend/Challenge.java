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
     * `getStudentGrade(int score)` returns the grade of the student based on the given score. If
     * 0<=score<60, return `E`; If 60<=score<70, return `D`; If 70<=score<80, return `C`; If
     * 80<=score<90, return `B`; If 90<=score<100, return `A`; If the score is not in 0-100 range,
     * return `Invalid Score`.
     */
    public static String getStudentGrade(int score) {
        return null;
    }
}
