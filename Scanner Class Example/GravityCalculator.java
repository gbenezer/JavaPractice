/**
 * A demonstration of the Scanner class for reading user input.
 *
 * The idea for creating a calculator for calculating the time
 * it takes for an object to fall a certain height comes from
 * Assignment 1 of MIT OpenCourseWare course 6.092, Introduction
 * to Java, developed by Evan Jones, Adam Marcus, and Eugene Wu.
 *
 */

// Import statements
import java.util.Scanner;

public class GravityCalculator {

    public static void main(String[] args) {

        // Variable declarations (and initialization)
        final double GRAVITY = -9.81;
        final String object;
        final double seconds, initialPosition, initialVelocity, position;

        // Scanner initialization
        Scanner keyboard = new Scanner(System.in);

        // Querying the user
        System.out.print("What is the object being dropped? ");
        object = keyboard.nextLine();

        System.out.print("How long is the object falling, in seconds? ");
        seconds = keyboard.nextDouble();

        System.out.print("What is the object's initial vertical position, in meters? ");
        initialPosition = keyboard.nextDouble();

        System.out.print("What is the object's initial vertical velocity, " +
                "in meters per second? ");
        initialVelocity = keyboard.nextDouble();

        // Calculating the new position after specified seconds of falling
        position = ((GRAVITY/2) * Math.pow(seconds, 2.0)) + (initialVelocity * seconds) + initialPosition;

        // Printing the result to the output
        System.out.println("The " + object + " fell from an initial position of " +
                initialPosition + " meters above ground, initially traveling at " +
                initialVelocity + " meters per second, to a position of " +
                position + " meters above ground.");

    }

}