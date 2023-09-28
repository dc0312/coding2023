package dataStructure.basics.stacks;

import dataStructure.basics.arrays.CustomArray;

public class CustomStack {

    private int[] arr;

    private int nElems;

    public CustomStack(int size) {
        arr = new int[size];
        nElems = -1;
    }

    public boolean isEmpty() {
        return nElems == -1;
    }

    public boolean isFull() {
        return nElems == arr.length-1;
    }

    public void push(int val) {
        if(!isFull() ) {
            arr[++nElems] = val;
        }
    }

    public int pop(){
        int temp =-1;
        if(!isEmpty()){
             temp = arr[nElems--];
        }else {
            System.out.println("Stack is empty");
        }
        return temp;
    }

    public void peek(){
        if(!isEmpty()){
            System.out.println("Item peek : "+arr[nElems-1]);
        }else {
            System.out.println("Stack is empty");
        }
    }

    public void display(){
        for(int i = nElems; i >= 0;i--){
            System.out.print(arr[i]+",");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        CustomStack stack = new CustomStack(5);
        stack.pop();
        stack.push(1);
        stack.push(2);
        stack.push(3);
        stack.push(4);
        stack.display();
        stack.peek();
        System.out.println("Item popped : "+stack.pop());
        System.out.println("Item popped : "+stack.pop());
        System.out.println("Item popped : "+stack.pop());
        System.out.println("Item popped : "+stack.pop());
        System.out.println("Item popped : "+stack.pop());
        System.out.println("Item popped : "+stack.pop());
    }
}
