package com.stackrote;

import java.util.*;
public class PE2_5 {
    public static void main(String[] args){
        int i;
        int sum=0;
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter number of students: ");
        int n = scan.nextInt();

        int array[]=new int[n];
        for(i=0;i<n;i++){

            Scanner scanner = new Scanner(System.in);
            System.out.println("Enter the marks of  " +(i+1)+"  student");
            array[i] = scanner.nextInt();
        }

        for(i=0;i<n;i++){
            System.out.print(array[i]+"  "); // original array
        }
        Arrays.sort(array);
        System.out.println(" ");//next line
        for(i=0;i<n;i++){
            System.out.print(array[i]+"  ");//sorted array
        }
        System.out.println(" "); //next line

        System.out.println("The minimum is :"+array[0] );
        System.out.println("The Maximum is :"+array[n-1]);

        for(i=0;i<n;i++){
            sum=sum+array[i];
        }
        double Average=(double)sum/n;

        System.out.println("The Average is :" +Average);

    }
}