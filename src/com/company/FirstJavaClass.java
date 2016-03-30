package com.company;

import java.util.Scanner;

public class FirstJavaClass {

  public static void main(String[] args) throws Exception {
    System.out.println("This is being run from within the class");
    Main.doSomething();
    System.out.println("Well that one right there is being run from here!");
    Main.draw(args);
    System.out.println("I'm done drawing now.");

    Scanner lineScanner = new Scanner(System.in);
    String userInput = lineScanner.nextLine();
    System.out.println("The user said: " + userInput);
  }
}