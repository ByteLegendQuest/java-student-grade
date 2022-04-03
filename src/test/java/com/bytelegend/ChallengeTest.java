package com.bytelegend;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.stream.IntStream;

public class ChallengeTest {
    @Test
    public void test() {
        Assertions.assertEquals(
                60,
                IntStream.range(0, 100)
                        .mapToObj(Challenge::getStudentGrade)
                        .filter("E"::equals)
                        .count());
        Assertions.assertEquals(
                10,
                IntStream.range(0, 100)
                        .mapToObj(Challenge::getStudentGrade)
                        .filter("D"::equals)
                        .count());
        Assertions.assertEquals(
                10,
                IntStream.range(0, 100)
                        .mapToObj(Challenge::getStudentGrade)
                        .filter("C"::equals)
                        .count());
        Assertions.assertEquals(
                10,
                IntStream.range(0, 100)
                        .mapToObj(Challenge::getStudentGrade)
                        .filter("B"::equals)
                        .count());
        Assertions.assertEquals(
                10,
                IntStream.range(0, 100)
                        .mapToObj(Challenge::getStudentGrade)
                        .filter("A"::equals)
                        .count());
        Assertions.assertEquals("Invalid Score", Challenge.getStudentGrade(-1));

        Assertions.assertEquals("E", Challenge.getStudentGrade(0));
        Assertions.assertEquals("E", Challenge.getStudentGrade(59));
        Assertions.assertEquals("D", Challenge.getStudentGrade(60));
        Assertions.assertEquals("D", Challenge.getStudentGrade(69));
        Assertions.assertEquals("C", Challenge.getStudentGrade(70));
        Assertions.assertEquals("C", Challenge.getStudentGrade(79));
        Assertions.assertEquals("B", Challenge.getStudentGrade(80));
        Assertions.assertEquals("B", Challenge.getStudentGrade(89));
        Assertions.assertEquals("A", Challenge.getStudentGrade(90));
        Assertions.assertEquals("A", Challenge.getStudentGrade(99));
        Assertions.assertEquals("A", Challenge.getStudentGrade(100));
        Assertions.assertEquals("Invalid Score", Challenge.getStudentGrade(101));
    }
}
