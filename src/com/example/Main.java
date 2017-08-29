package com.example;

import com.common.Month;
import java.util.Scanner;
import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {
	// write your code here
        Scanner input = new Scanner(System.in);

        System.out.println("Please choose a month...");
        String theMonth = input.nextLine().toUpperCase();
        Month month = Month.valueOf(theMonth);
        ArrayList<String> selectedMonth = new ArrayList<>();



        switch (month) {
            case JANUARY:  selectedMonth.add("January");
            case FEBRUARY:  selectedMonth.add("February");
            case MARCH:  selectedMonth.add("March");
            case APRIL:  selectedMonth.add("April");
            case MAY:  selectedMonth.add("May");
            case JUNE:  selectedMonth.add("June");
            case JULY:  selectedMonth.add("July");
            case AUGUST:  selectedMonth.add("August");
            case SEPTEMBER:  selectedMonth.add("September");
            case OCTOBER: selectedMonth.add("October");
            case NOVEMBER: selectedMonth.add("November");
            case DECEMBER: selectedMonth.add("December");
                break;
            default: break;
        }

        if (selectedMonth.isEmpty()) {
            System.out.println("Invalid input");
        } else {
            for (String monthName : selectedMonth) {
                System.out.println(monthName);
            }
        }


    }
}
