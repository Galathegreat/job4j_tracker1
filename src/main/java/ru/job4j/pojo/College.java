package ru.job4j.pojo;
import java.util.Date;

public class College {
    public static void main(String[] args) {
        Student student = new Student();
        student.setName("Maria Ivanova");
        student.setGroup("BC2");
        student.setAdmission(new Date());
        System.out.println(student.getName() + "study is in " + student.getGroup() + "group." + " Admission date is - " + student.getAdmission());
    }
}
