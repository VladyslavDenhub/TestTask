package com.denhub.test;

import java.util.Scanner;


/**
 * @author Denhub
 * @since 17
 */

public class Program {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a line: " + "\n");
        String hello = scanner.nextLine();

        System.out.println(Verification.verif(hello));

        scanner.close();


    }
}
