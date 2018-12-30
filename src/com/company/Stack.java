package com.company;

public class Stack {
    StackNode top;
    int length;


    public Stack(int data) {
        this.top = new StackNode(data);
        this.length = 1;
    }

    public void printStack() {
        StackNode n = this.top;
        boolean stillMore = true;

        while(stillMore) {
            System.out.println(n.data);
            if(n.next != null) {
                n = n.next;
            } else {
                stillMore = false;
            }
        }
    }

    public void push(int data) {
        StackNode newNode = new StackNode(data);

        //insert at the top of the stack
        newNode.next = this.top;
//        System.out.println("Current top: " + this.top.data);
        this.top = newNode;
        this.length++;
    }

    public int pop() {
        int valueToReturn = -1;

        if(!this.isEmpty()) {
            valueToReturn = this.top.data;

            //1) set the top.next to null
            System.out.println("Returning value: " + this.top.data);
            this.top = this.top.next;
            this.length--;
        } else {
            System.out.println("Stack is empty");
        }

        return valueToReturn;
    }

    public int peek() {
        //1) get the data for the node at the top of the stack
        int valToReturn = this.top.data;

        //2) return the data
        System.out.println("Top value: " + valToReturn);

        //3 return
        return this.top.data;
    }

    public boolean isEmpty() {
//        System.out.println(this.top == null);
        return this.top == null;
    }

    public static void main(String[] args) {}
}
