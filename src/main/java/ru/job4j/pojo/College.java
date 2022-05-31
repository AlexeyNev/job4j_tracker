package ru.job4j.pojo;

public class College {
    public static void main(String[] args) {
        Student student = new Student();
        student.setOwner("Alexev Alexey Alexeevich");
        student.setGroup(2);
        student.setDate("22.01.1999");

        System.out.println("ФИО Студента: "
                + student.getOwner()
                + " Номер группы: "
                + student.getGroup()
                + " Дата поступления: "
                + student.getDate());
    }
}
