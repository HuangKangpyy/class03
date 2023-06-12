package com.kk;
import java.util.Scanner;
public class study11 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int num =  scanner.nextInt();
        for (int year = 2000; year <= num; year++) {
            if (year % 100 != 0) {
                if (year % 4 == 0) {
                    System.out.println(year + "leapyear");
                }
            } else {
                if (year % 400 == 0) {
                    System.out.println(year +"leapyear");
                }
            }
        }
    }
}