package com.company;

/*Evie Iles
Fall 2021
The Code should request the distance from the center of a pentagon to the vertex from the enduser.
Code will then calculate Side length in order to calculate the pentagon's area,
then return it to the user via console.
 */


//Import Dependencies needed for program
import java.lang.Math;
import java.text.DecimalFormat;
import java.util.InputMismatchException;
import java.util.Scanner;

class Main {
    //Tells the program how to format the double when printing.
    private static final DecimalFormat df = new DecimalFormat("0.00");

    public static void main(String[] args) {
        //Try and Catch will correct the user if an invalid type is entered.
        try {
            pentagonArea();
        }
        //Catch handles the exception
        catch(InputMismatchException e){
            System.out.println("Please enter a valid decimal number and try again.");
        }
    }

    private static void pentagonArea() {
        //Creates new scanner class to read user input.
        Scanner input = new Scanner(System.in);
        System.out.println("Please enter the distance from the center of the pentagon to the vertex: \n");

        double side = input.nextDouble();
        //Calculates the side length given the distance from the center to vertex.
        double sideLength = ((2 * side) * Math.sin(Math.PI / 5));
        //Calculates Area
        double area = (5 * Math.pow(sideLength, 2) / (4 * Math.tan(Math.PI / 5)));
        //Returns area value.
        System.out.println("The area of the pentagon is " + df.format(area));
    }
}