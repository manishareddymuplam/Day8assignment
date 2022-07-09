package com.bridgelabz.day8;

public class Employee {
	private static final int WAGE_PER_HOUR = 20;
    private static final int IS_FULL_TIME = 1;
    private static final int IS_PART_TIME = 2;
    private static final int HALF_DAY_HOUR = 5;
    private static final int FULL_DAY_HOUR = 10;
    private static final int TOTAL_WORKING_HOURS = 100;
    private static final int TOTAL_WORKING_DAYS = 20;
    public static void main1(String[] args) {
        System.out.println("Welcome to Employee wage Computation Problem");
    //UC7 Method to Compute wage
    public static void wageCompute() {
        int dayCount = 1;
        int workingHours = 0;
        int totalWage = 0;
        //UC6 calculating both condition of total wage and total hours
        while (dayCount <= TOTAL_WORKING_DAYS && workingHours <= TOTAL_WORKING_HOURS){
        while (dayCount <= TOTAL_WORKING_DAYS && workingHours <= TOTAL_WORKING_HOURS) {
            int dailyWage = 0;
            int empStatus = (int) (Math.random() * 10) % 3;
            switch (empStatus) {
                case IS_FULL_TIME:
                    System.out.println("Employee worked FULL TIME");
                    workingHours = workingHours + FULL_DAY_HOUR;
                    dailyWage = WAGE_PER_HOUR * FULL_DAY_HOUR;
                    break;
                case IS_PART_TIME:
                    System.out.println("Employee worked PART_TIME");
                    workingHours = workingHours + HALF_DAY_HOUR;
                    dailyWage = WAGE_PER_HOUR * HALF_DAY_HOUR;
                    break;
                default:
                    System.out.println("Employee is Absent");
            }
            totalWage = totalWage + dailyWage;
            System.out.println("Daily Wage for day : " + dayCount + " is " + dailyWage);
            dayCount++;
        }
    }
    }

    public static void main(String[] args) {
        System.out.println("Welcome to Employee wage Computation Problem");
        wageCompute();
    }
}