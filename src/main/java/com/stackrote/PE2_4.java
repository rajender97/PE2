package com.stackrote;

import java.util.*;
public class PE2_4{
    public static void main(String[] args){

        Scanner scan = new Scanner(System.in);
        System.out.print("Enter any number: ");
        int number = scan.nextInt();
        System.out.println("entered number is :" +number);
        boolean b= isEven(number);
        if(b=true){
            System.out.println("enterd number" +number+"is even");
        }
        if(b=false)
        {
            System.out.println("Enterd number" +number+  "is odd");
        }
    }
    public static boolean isEven(int number){
        if(number%2==0){
            return true;
        }
        else {
            return false;
        }
    }
}
