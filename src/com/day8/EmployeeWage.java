package com.day8;

import java.util.Random;

public class EmployeeWage {
    static final int WAGE_PER_HOUR = 20;
    static final int FULL_DAY_HOURS = 8;
    static final int PART_TIME_HOURS = 4;
    static final int WORKING_DAYS_PER_MONTH = 20;
    static final int MAX_WORKING_HOURS = 100;

    int totalWage = 0;
    int totalWorkingHours = 0;
    int totalWorkingDays = 0;

    public void empWage() {
        while ((totalWorkingHours < MAX_WORKING_HOURS) && (totalWorkingDays < WORKING_DAYS_PER_MONTH)) {
            int attendance = new Random().nextInt(2);
            int dailyWage = 0;

            switch (attendance) {
                case 0:
                    dailyWage += (PART_TIME_HOURS * WAGE_PER_HOUR);
                    break;

                case 1:
                    dailyWage += (FULL_DAY_HOURS * WAGE_PER_HOUR);
                    break;
            }
            totalWage += dailyWage;
            totalWorkingHours += (attendance == 1) ? FULL_DAY_HOURS : PART_TIME_HOURS;
            totalWorkingDays++;

        }
    }

    public static void main(String[] args) {
        EmployeeWage emp = new EmployeeWage();
        System.out.println("Welcome to Employee Wage Computation Program on Master Branch");
        emp.empWage();
        System.out.println("Your total wage is: " + emp.totalWage);
        System.out.println("Your total hours are: " + emp.totalWorkingHours);
        System.out.println("Your total working days are: " + emp.totalWorkingDays);

    }
}
