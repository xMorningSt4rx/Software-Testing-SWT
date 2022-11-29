/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package datetimechecker;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 *
 * @author Le Nguyen Nhat Minh
 */
public class DateTimeTester {

    public static boolean check(String dtc) {
        DateFormat df = new SimpleDateFormat("dd/MM/yyyy");
        Date dct = null;
        df.setLenient(false);
        try {
            dct = df.parse(dtc);
            System.out.println(dct);
            return true;
        } catch (Exception e) {
            return false;
        }
    }

//    public static int dayInMonth(int month, int year) {
//        boolean leap = isLeapYear(year);
//        int day = 0;
//        if (year >= 1000 && year <= 3000) {
//            switch (month) {
//                case 1:
//                case 3:
//                case 5:
//                case 7:
//                case 8:
//                case 10:
//                case 12:
//                    day = 31;
//                    break;
//                case 2:
//                    if (leap) {
//                        day = 29;
//                    } else {
//                        day = 28;
//                    }
//                    break;
//                case 4:
//                case 6:
//                case 9:
//                case 11:
//                    day = 30;
//                    break;
//                default:
//                    System.out.println("Invalid input");
//                    break;
//            }
//        }
//        else{
//            System.out.println("Year must be in 1000 - 3000");
//        }
//
//        return day;
//    }
    public static String dayInMonth1(int month, int year) {
        boolean leap = isLeapYear(year);
        String day = null;
        if (year >= 1000 && year <= 3000) {
            switch (month) {
                case 1:
                case 3:
                case 5:
                case 7:
                case 8:
                case 10:
                case 12:
                    day = "31";
                    break;
                case 2:
                    if (leap) {
                        day = "29";
                    } else {
                        day = "28";
                    }
                    break;
                case 4:
                case 6:
                case 9:
                case 11:
                    day = "30";
                    break;
                default:
                    System.out.println("Invalid input");
                    break;
            }
        }
        else{
            System.out.println("Year must be in 1000 - 3000");
        }

        return day;
    }

    public static boolean isLeapYear(int year) {
        if (year % 4 == 0 || year % 100 == 0 || year % 400 == 0) {
            return true;
        } else {
            return false;
        }
    }
}
