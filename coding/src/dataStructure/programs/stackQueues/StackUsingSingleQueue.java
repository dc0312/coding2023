package dataStructure.programs.stackQueues;

import dataStructure.basics.queues.CustomQueue;
import dataStructure.basics.stacks.CustomStack;

public class StackUsingSingleQueue {

    private CustomQueue customQueue;

    public StackUsingSingleQueue(int s) {
        customQueue = new CustomQueue(s);
    }

    public void push(int val) {
        int size = customQueue.size();
        customQueue.queue(val);
        while (size > 0){
            customQueue.queue(customQueue.deQueue());
            size--;
        }
    }

    public int pop() {
        return customQueue.deQueue();
    }

    public void display() {
        customQueue.display();
    }

    public static void main(String[] args) {
        StackUsingSingleQueue stack = new StackUsingSingleQueue(4);
        stack.push(1);
        stack.push(2);
        stack.push(3);
        stack.display();
        System.out.println("Pop element : "+stack.pop());
        stack.push(3);
        stack.push(4);
        stack.display();
    }
}
