package com.Maven.springBootMavenApp.service;

import java.time.LocalTime;
import org.springframework.stereotype.Service;

@Service
public class service implements IGreetingService {

        @Override
        public String generateGreeting() {
            LocalTime time= LocalTime.now();
            int hour = time.getHour();
            if (hour<12) {
                return "Good morning";
            } else if (hour<16) {
                return "Good Afternoon";
            } else if (hour<20) {
                return "Good Evening";
            } else {
                return "Good night";
            }
        }
    }


