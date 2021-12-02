package com.denhub.test;

import java.util.Stack;

public class Verification {

    public static String verif(String hello) {

        Stack<Character> stack = new Stack<>();

        if (hello.isEmpty() || hello == null) {
            throw new IllegalArgumentException();
        } else if (!hello.matches("[{([]][\\[])}]+")) {
            return "The line has letters or numbers!!!";
        } else if (hello.length() == 1 || hello.charAt(0) == ']') {
            return "Only 1 or the first brecket is close!";
        }

        for (int i = 0; i < hello.length(); i++) {
            char ch = hello.charAt(i);
            if (ch == '[') {
                stack.add(ch);
            }

            try{
                if(ch == ']'){
                    char pop = stack.pop();
                    if (!(pop == '[' && ch == ']')) {
                        return "Not balanced: (" + (++i) + ")";
                    }
                }
            }catch (Exception e) {
                System.out.println("Not balanced: (" + (++i) + ")");
            }

        }

        if(!stack.isEmpty()){
            return "Firts brecket is not balanced!";
        }
        return "BALANCED";
    }






}
