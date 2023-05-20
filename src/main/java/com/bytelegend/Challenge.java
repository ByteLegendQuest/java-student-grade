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
        if (score < 0 || score > 100) {
            return "Invalid Score";
        }
        return switch (score / 10) {
            case 0, 1, 2, 3, 4, 5 -> "E";
            case 6 -> "D";
            case 7 -> "C";
            case 8 -> "B";
            case 9, 10 -> "A";
            default -> "Invalid Score";
        };
    }
}
