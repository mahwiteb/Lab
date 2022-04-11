package com.company;

import java.util.Scanner;

public class Person {


    Scanner sr = new Scanner(System.in);
    String surnameMahwite55478 , firstMahwite55478, streetMahwite55478 , cityMahwite55478;
    int zipCodeMahwite55478;

    void Initialize(){
        System.out.println("Please enter your Name: ");
        firstMahwite55478 = sr.nextLine();
        System.out.println("Please enter your Surname: ");
        surnameMahwite55478 = sr.nextLine();
        System.out.println("Please enter your Street name: ");
        streetMahwite55478 = sr.nextLine();
        System.out.println("Please enter your City: ");
        cityMahwite55478 = sr.nextLine();
        System.out.println("Please enter your Zip Code: ");
        zipCodeMahwite55478 = sr.nextInt();
    }

    void printData(){
        System.out.println("Name: "+ firstMahwite55478);
        System.out.println("Surname: "+ surnameMahwite55478);
        System.out.println("Street Name: "+ streetMahwite55478);
        System.out.println("City: "+ cityMahwite55478);
        System.out.println("Zip Code: "+ zipCodeMahwite55478);
    }

}


class Staff extends com.company.Person {
    String education , Position;
    void Initialize1(){
        Initialize();
        System.out.println("Enter your Education: ");
        education = sr.nextLine();
        System.out.println("Enter your Position");
        Position = sr.nextLine();
    }

    void Print1(){
        printData();
        System.out.println("Education: " + education);
        System.out.println("Position: "+ Position);
    }

}
