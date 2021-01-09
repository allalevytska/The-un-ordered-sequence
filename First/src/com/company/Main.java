package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        boolean ascending = true;
        boolean descending = true;
        int num1 = sc.nextInt();
        while (sc.hasNext()) {
            int num2 = sc.nextInt();
            if (num2 == 0){
                break;
            } else if(num1 <= num2) {
                num1 = num2;
            }
        }
        System.out.print(ascending);
    }
}
