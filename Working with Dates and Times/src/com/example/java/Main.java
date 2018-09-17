package com.example.java;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        LocalDate today = LocalDate.now();

        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("M/d/yyyy");

        System.out.println("Enter the current month: (Enter as a number: January = 1)");
        int currentMonth = scanner.nextInt();
        System.out.println("Enter the current day: ");
        int currentDay = scanner.nextInt();
        int currentYear = today.getYear();
        int thisMonth = today.getMonthValue();
        System.out.println("Today's date is: " + currentMonth + "/" + currentDay + "/" + currentYear);

        int moonMonth = 9;
        int moonDay = 24;
        int moonYear = 2018;
        LocalDate fullMoon = LocalDate.of(moonYear, moonMonth, moonDay);

        if (fullMoon.isBefore(today)) {
            fullMoon = fullMoon.plusYears(1);
        }

        String nextFullMoon = fullMoon.format(formatter);

        if (moonMonth == currentMonth && moonDay == currentDay ){
            System.out.println("Full moon tonight!");
        }
        else {
            System.out.println("The next full moon is: " + nextFullMoon);
        }
    }
}
