package com.stackrote;

import java.io.*;
import java.util.*;
class Member{
    String name;
    int age;
    double salary;
}
class MemberVariable{
    public static void main(String args[]){
        Member member = new Member();
        member.name = "Harry Potter";
        member.age = 30;
        member.salary = 2500.3;
        System.out.println(member.name);
        System.out.println(member.age);
        System.out.println(member.salary);
    }
}
