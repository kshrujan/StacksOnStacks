package com.company;

public class StackList {
    Stack[] stacks;
    int max;

    public StackList(int max) {
        stacks = new Stack[1];
        stacks[0] = new Stack(1);
        this.max = 2;
    }

    public void push(int data) {
        //this method should determine whether or not the max for a stack has been hit
        //if so, create a new stack and push the new stacknode onto that stack
        //else just add to the current stack
        Stack lastStack = this.stacks[this.stacks.length-1];
        int length = lastStack.length;

        if((length + 1) > this.max) {
            System.out.println("Overflow.... Creating new stack");
//            System.out.println("Before: " + this.stacks.length);
            addNewStack();
//            System.out.println("After: " + this.stacks.length);
            //now push the new node to the last stack in stacks
            Stack newStack = new Stack(data);
            this.stacks[this.stacks.length-1] = newStack;
        } else {
            this.stacks[this.stacks.length-1].push(data);
        }
    }

    public int pop() {
        //pop the value off the last stack in the array
        int valueToReturn = this.stacks[this.stacks.length-1].pop();

        //now we must check to see if the current stack isempty
        if(this.stacks[this.stacks.length-1].isEmpty()) {
            //remove from the stacks array
            System.out.println("Stack is empty. Removing stack....");
            removeStack();
        }

        System.out.println("Popping off: " + valueToReturn);
        return valueToReturn;
    }

    public int popAtIndex(int i) {
        int val=-1;
        if(!this.stacks[i].isEmpty()) {
            //not empty
            val = this.stacks[i].pop();
        }

        System.out.println("Popping: " + val +" from Stack: " + i);
        return val;
    }

    public void removeStack() {
        Stack[] newStackList = new Stack[this.stacks.length-1];
        for(int i=0; i<this.stacks.length-1; i++) {
            newStackList[i] = this.stacks[i];
        }
        this.stacks = newStackList;
    }


    public void addNewStack() {
        //create a new stack and add to the list
        Stack[] newStackList = new Stack[this.stacks.length+1];

        for(int i=0; i<stacks.length; i++) {
            newStackList[i] = this.stacks[i];
        }

        this.stacks = newStackList;
    }

    public void printStacks() {
        //1) loop through stacks and print the data within each
        for(int i=0; i<stacks.length; i++) {
            System.out.println("Stack: " + i);
            stacks[i].printStack();
        }
    }



    public static void main(String[] args) {}
}
