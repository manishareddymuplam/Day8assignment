package com.bridgelabz.day8;

public class Employee {
	public static void main(String[] args) {
        System.out.println("Welcome to Employee wage Computation Problem");
        int empStatus = (int) (Math.random() * 10) % 2;
        if(empStatus==1) {
            System.out.println("Employee present");
        }
        else{
            System.out.println("Employee Absent");
        }
    }
}
