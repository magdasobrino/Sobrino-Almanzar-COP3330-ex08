/*
 *  UCF COP3330 Fall 2021 Assignment 1 Solution
 *  Copyright 2021 Magdalena Sobrino-Almanzar
 */
package exercise;

import java.util.Scanner;

public class Exercise08 {
    public static void main(String[] args){

            int people = 0, pizzas = 0, slicesPerPizza = 0;
            int totalSlices, slicesPerPerson, leftovers;
            Scanner scnr = new Scanner(System.in);

            System.out.println("How many people?");
            people = scnr.nextInt();
            System.out.println("How many pizzas do you have?");
            pizzas = scnr.nextInt();
            System.out.println("How many slices per pizza?");
            slicesPerPizza = scnr.nextInt();

            totalSlices = pizzas * slicesPerPizza;
            slicesPerPerson = totalSlices / people;
            leftovers = totalSlices % people;

            System.out.println(people + " people with " + pizzas + " pizzas (" + totalSlices + " slices)");
            System.out.println("Each person gets " + slicesPerPerson + " pieces of pizza.");
            System.out.println("There are " + leftovers +" leftover pieces.");

            scnr.close();
            System.exit(0);
        }//end of main
    }//end of program

