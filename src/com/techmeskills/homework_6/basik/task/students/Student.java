package com.techmeskills.homework_6.basik.task.students;

import java.util.Arrays;

public class Student {
    String firstname;
    String surname;
    String idPasport;
    String nameGroup;

    // to create constructor
    public Student(String name,String surname,String idPasport,String nameGroup) {
        this.firstname = firstname;
        this.surname = surname;
        this.idPasport = idPasport;
        this.nameGroup = nameGroup;
    }

    public void outputStudent(String[][]matrix) {
        for (String[] name:matrix) {
        }
        System.out.println(Arrays.deepToString(matrix));

    }
}

