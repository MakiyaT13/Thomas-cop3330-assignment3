package ex41;/*
 *  UCF COP3330 Fall 2021 Assignment 3 Solution
 *  Copyright 2021 Makiya Thomas
 */
import java.io.IOException;
import java.nio.file.DirectoryStream;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Scanner;
import java.io.IOException;
import java.lang.IllegalStateException;
import java.util.NoSuchElementException;

class Main {
  public static void main(String[] args) {
     try(Scanner input = new Scanner(Paths.get("exercise41_input.txt"))) {
       int count= 0;
       while (input.hasNext()) { 

    System.out.printf("%s %s\n",input.next(), input.next());
    count++;
    }
       System.out.printf("There are a total of %d names", count);
  }
      catch (IOException | NoSuchElementException |
          IllegalStateException e) {
       e.printStackTrace();
    }
  }
}