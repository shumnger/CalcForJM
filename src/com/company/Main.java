package com.company;
import java.util.Scanner;

    public class Main{


        private static Scanner read;

        public static void main (String[] args){

            read = new Scanner(System.in);

            String[] roman = {"X", "IX", "VIII", "VII", "VI", "V", "IV", "III", "II", "I"};

            String a;
            String b;
            String operator;
            int numA;
            int numB;
            int result;
            String resultRoman;

            System.out.print("input: \n");

            a = read.next();
            operator = read.next();
            b = read.next();



        try {
            boolean flag = false;
            for (int i = 0; i < roman.length; i++) {
                if (roman[i].equals(a) || roman[i].equals(b)) {
                    flag = true;
                }
            }
            if (flag) {
                numA = romanToNumber(a);
                numB = romanToNumber(b);
                if (numA > 0 & numA < 11 & numB > 0 & numB < 11) {

                    result = Calculator.calculate(numA, numB, operator);
                    resultRoman = RomanDigit.convert(result);
                    System.out.println(resultRoman);
                    }
                else{System.out.printf("Error! Enter correct numbers 1-10 or I-X");}
            } else {

                numA = Integer.parseInt(a);
                numB = Integer.parseInt(b);

                if (numA > 0 & numA < 11 & numB > 0 & numB < 11) {

                    result = Calculator.calculate(numA, numB, operator);
                    System.out.println(result);
                }
                else{System.out.printf("Error! Enter correct numbers 1-10 or I-X");}
            }

              }catch (NumberFormatException e){
                    System.out.printf("Error! Enter correct numbers"); }

        }

        private static int romanToNumber(String roman) {
            if (roman.equals("I")) {
                return 1;
            } else if (roman.equals("II")) {
                return 2;
            } else if (roman.equals("III")) {
                return 3;
            } else if (roman.equals("IV")) {
                return 4;
            } else if (roman.equals("V")) {
                return 5;
            } else if (roman.equals("VI")) {
                return 6;
            } else if (roman.equals("VII")) {
                return 7;
            } else if (roman.equals("VIII")) {
                return 8;
            } else if (roman.equals("IX")) {
                return 9;
            } else if (roman.equals("X")) {
                return 10;
            } else {
                return -1;
            }
        }
    }