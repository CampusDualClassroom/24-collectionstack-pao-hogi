package com.campusdual.classroom;

import java.util.Stack;

public class Exercise {
    public static Stack<String> createStack() {
        Stack<String> stack = new Stack<>();

        stack.push("Smith");
        stack.push("Montessori");
        stack.push("Peralta");
        stack.push("House");

        return stack;
    }

    public static void printAndEmptyStack(Stack<String> stack) {
        if (stack == null || stack.isEmpty()){
            System.out.println("La pila está vacía.");
            return;
        }

        System.out.println("Elemento en la cima de la pila (peek): " + stack.peek());
        System.out.println("==================");

        while (!stack.isEmpty()){
            System.out.println("Eliminando elemento: " + stack.pop());
        }
    }

    public static void main(String[] args) {
        Stack<String> myStack = createStack();
        System.out.println(myStack);
    }

}
