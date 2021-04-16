package com.company;

import java.util.Scanner;

public class ProstoeChislo {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Введите начальный диапазон: ");
        long num1 = in.nextLong();

        System.out.println("Введите конечный диапазон: ");
        long num2 = in.nextLong();

        for (long i = num1; i < num2 ; i++) {

            if (ProstoeChislo.isPrime(i)){
                System.out.print(i + ", ");
            }
        }
    }

    public static boolean isPrime(long number){
        for(int i=2; i<number;){
            if(number%i == 0){
                return false;//число отвечает за условия но не простое
            }
            return true; //простое число
        }
        return true;
    }
}


