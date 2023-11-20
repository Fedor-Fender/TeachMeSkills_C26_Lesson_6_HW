package com.techmeskills.homework_6.basik.task.students;

public class GroupStudent {
    public static void main(String[] args) {

        Student students = new Student("Ivan", "Ivanov", "ST1234", "C-26");


        String[][] matrix = new String[][]{{"name:Ivan", "surname:Ivanov", "ivan.idPasport:ST1234", "nameGroupe:C-26"},
                                           {"name:Pavel", "surname:Petrov", "ivan.idPasport:ST1234", "nameGroupe:C-26"},
                                           {"name:Sergey", "surname:Sidorov", "ivan.idPasport:ST1234", "nameGroupe:C-26"}};

        students.outputStudent(matrix);
    }
}
