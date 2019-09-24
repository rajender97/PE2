package com.stackrote;

import java.util.Scanner;
public class PE2_2 {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter any number: ");
        int n = scan.nextInt();
        System.out.println("entered number is :" +n);
        double i= Math.log(n)/ Math.log(4);

        int j= (int) (Math.log(n)/Math.log(4));
        if(i==j)
        {
            System.out.println("entered number is power of 4");
        }
        else
        {
            System.out.println("entered number is not power of 4");
        }
    }

}
