package com.company;

import java.util.Scanner;

public class VtoroeMaxChislo {
    public static void main(String[] args) {
        int max=0;
        int secondMax = 0;
        int num[] = {3,2,8,9,1,5,4,3,7,8,5,9,9};

        for(int i=0; i<num.length; i++){
            if (num[i]>max)
            {
                secondMax=max;
                max=num[i];
            }
        }

        System.out.println("Max number is : "+max);
        System.out.println("Second Max number is : "+secondMax);
    }
}
