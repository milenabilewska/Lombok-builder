package com.example;

import java.time.ZonedDateTime;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {


Course course = Course.builder()
        .nazwa("Kurs programowania")
        .lokalizacja("Warszawa")
        .data(ZonedDateTime.now())
        .listaStudentow(Arrays.asList(
                new  Student("Anna","Nowak"),
                new  Student("Jan", "Kowalski")))
        .build();
        System.out.println(course);

    }
}