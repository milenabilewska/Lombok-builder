package com.example;

import lombok.Builder;
import lombok.ToString;

import java.time.ZonedDateTime;
import java.util.List;


@Builder
@ToString
public class Course {
private String nazwa;
private ZonedDateTime data;
private String lokalizacja;
private List<Student> listaStudentow;


}
