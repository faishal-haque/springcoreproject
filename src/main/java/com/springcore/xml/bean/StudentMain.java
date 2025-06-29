package com.springcore.xml.bean;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import com.springcore.xml.bean.Student;

public class StudentMain {
    public static void main(String[] args) {
        try (ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext2.xml")) {
            Student student = context.getBean("student", Student.class);
            student.setStudentId(101);
            student.setStudentName("John Doe");

            System.out.println("Student ID: " + student.getStudentId() + ", Student Name: " + student.getStudentName());
        }
    }
}
