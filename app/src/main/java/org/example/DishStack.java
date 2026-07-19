package org.example;

public class DishStack {
    private static final int DEFAULT_CAPACITY = 10;

    private Dish[] stack;
    private int top;

    public DishStack() {
        stack = new Dish[DEFAULT_CAPACITY];
        top = -1;
    }

    public DishStack(int capacity) {
        stack = new Dish[capacity];
        top = -1;
    }

    public void push(Dish dish) {
        if (top == stack.length - 1) {
            System.out.println("Stack is full. Cannot push another dish.");
            return;
        }

        stack[++top] = dish;
    }

    public Dish pop() {
        if (isEmpty()) {
            System.out.println("Stack is empty.");
            return null;
        }

        Dish dish = stack[top];
        stack[top] = null;
        top--;

        return dish;
    }

    public Dish peek() {
        if (isEmpty()) {
            System.out.println("Stack is empty.");
            return null;
        }

        return stack[top];
    }

    public int size() {
        return top + 1;
    }

    public boolean isEmpty() {
        return top == -1;
    }

    public void clear() {
        for (int i = 0; i <= top; i++) {
            stack[i] = null;
        }
        top = -1;
    }
}
