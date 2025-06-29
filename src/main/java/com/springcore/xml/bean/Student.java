package com.springcore.xml.bean;
import com.springcore.xml.di.setter.Customer;
import lombok.Getter;
import lombok.Setter;
import lombok.extern.log4j.Log4j2;
@Getter
@Setter
@Log4j2
public class Student {
    private int studentId;
    private String studentName;

    public void getStudentDetails() {
        log.info("Student id:{} and Student Name:{}", studentId, studentName);
    }
}


