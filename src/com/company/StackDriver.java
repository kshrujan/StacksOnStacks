package com.company;

public class StackDriver {

    public static void main(String[] args) {
        StackList mySL = new StackList(2);
        mySL.push(2);
        mySL.push(3);
        mySL.push(4);
        mySL.push(5);
//        mySL.popAtIndex(1);
//        mySL.pop();
        mySL.printStacks();
    }
}
