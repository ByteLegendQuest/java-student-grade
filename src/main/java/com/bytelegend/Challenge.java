package com.bytelegend;

public class Challenge {
    public static void main(String[] args) {
        System.out.println(getStudentGrade(-1));
        System.out.println(getStudentGrade(0));
        System.out.println(getStudentGrade(60));
        System.out.println(getStudentGrade(75));
        System.out.println(getStudentGrade(100));
    }

    public static String getStudentGrade(int score) {
        if score > 100 return "Invalid Score";
        if score >= 90 return "A";
        if score >= 80 return "B";
        if score >= 70 return "C";
        if score >= 60 return "D";
        if score >= 0 return "E";
        return "Invalid Score";
    }
}
