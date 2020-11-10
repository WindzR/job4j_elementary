package ru.job4j.pojo;

import java.util.Date;

public class College {
    public static void main(String[] args) {
        Student student = new Student();
        student.setFNM("Ludvig Aristarhovich Borodach");
        student.setGroup("Viniculture");
        student.setDateOfReciept(new Date());
        System.out.println("Student " + student.getFNM() + " studying in: " + student.getGroup());
    }
}
