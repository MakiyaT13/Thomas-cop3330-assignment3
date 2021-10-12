package ex42;

/*
 *  UCF COP3330 Fall 2021 Assignment 3 Solution
 *  Copyright 2021 Makiya Thomas
 */

import java.io.IOException;
import java.nio.file.Paths;
import java.util.Scanner;
import java.lang.IllegalStateException;
import java.util.NoSuchElementException;

class Main {
    public static void main(String[] args) {
        try(Scanner input = new Scanner(Paths.get("exercise42_input.txt"))) {
            System.out.print("Last\tFirst\tSalary\n--------------------------\n");

            while (input.hasNext()) {

                System.out.printf("%s\t %s\t %d\n", input.next(), input.next(), input.nextInt());
            }
        }
        catch (IOException | NoSuchElementException |
                IllegalStateException e) {
            e.printStackTrace();
        }
    }
}