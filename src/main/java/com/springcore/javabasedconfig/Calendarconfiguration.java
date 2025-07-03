package com.springcore.javabasedconfig;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.util.Calendar;
import java.util.Date;

@Configuration
public class Calendarconfiguration {
    @Bean("Calendar")
    public Calendar getCalender(){return Calendar.getInstance();
    }
}
