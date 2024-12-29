package com.company;
import java.util.Scanner;

public class Main{
    public static void main(String[]args) {
        Scanner num = new Scanner(System.in);
        int first, second, result;

        first = num.nextInt();

        second = num.nextInt();
        result = first + second;
        System.out.println(result);


    }
}