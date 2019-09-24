package com.stackrote;

import java.util.*;
public class PE2_6{
    public static void main(String[] args)
    {
        Scanner scan=new Scanner(System.in);
        int n=scan.nextInt();
        int fact1=factorial1(n);
        if(fact1<0)
        {
            Long fact2=factorial2(n);
            System.out.println(fact2);
        }
        else
            System.out.println(fact1);
    }
    public static int factorial1(int n){
        if(n==1||n==0)
            return 1;
        int product=1;
        int i=n;
        while(i>1)
        {
            product*=i;
            i--;
            if(product<0)
            {
                break;
            }
        }
        return product;
    }
    public static long factorial2(int n){
        if(n==1||n==0)
            return 1;
        long product=1;
        long i=n;
        while(i>1)
        {
            product*=i;
            i--;
        }
        return product;
    }
}
