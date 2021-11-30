package com.denhub.test;

import java.util.Stack;

public class Verification {

    public static String verif(String hello) {

        Stack<Character> stack = new Stack<>();

        if (hello.isEmpty() || hello == null) {
            throw new IllegalArgumentException();
        } else if (!hello.matches("[{([]][\\[])}]+")) {
            return "The line has letters or numbers!!!";
        } else if (hello.length() == 1) {
            return "Only 1";
        }

        for (int i = 0; i < hello.length(); i++) {
            char ch = hello.charAt(i);
            if (ch == '[') {
                stack.add(ch);
            }

            if (stack.isEmpty()) {
                return "first close";
            }

            if(ch == ']'){
                char pop = stack.pop();
                if (!(pop == '[' && ch == ']')) {
                    return "Not balanced: (" + (++i) + ")";
                }
            }

            if(!stack.isEmpty()){
                return "Not balanced";
            }


        }

        return "BALANCED";
    }

}
