package com.springcore.javabasedconfig;
import lombok.extern.log4j.Log4j2;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import java.util.Calendar;
import java.util.Date;

@Log4j2
public class CalendarMain {
    public static void main(String[] args) {
        ApplicationContext context = new AnnotationConfigApplicationContext("com.springcore.javabasedconfig");

        Calendar calendar = context.getBean("Calendar", Calendar.class);
        log.info(calendar.hashCode());

        log.info("Current Date: " + calendar.getTime());





    }
}
