package dataStructure.programs.stackQueues;

import dataStructure.basics.stacks.CustomStack;

public class QueueUsingTwoStacks {

    private CustomStack stack1;

    private CustomStack stack2;

    public QueueUsingTwoStacks(int size) {
        stack1 = new CustomStack(size);
        stack2 = new CustomStack(size);
    }

    public void queue(int val) {
        if (stack1.isEmpty()) {
            stack1.push(val);
        }
        while (!stack1.isEmpty()) {
            stack2.push(stack1.pop());
        }
        stack1.push(val);

        while (!stack2.isEmpty()) {
            stack1.push(stack2.pop());
        }
    }

    public int dequeue() {
        return stack1.pop();
    }

    public void display(){
        stack1.display();
    }

    public static void main(String[] args) {
        QueueUsingTwoStacks queueUsingTwoStacks = new QueueUsingTwoStacks(5);
        queueUsingTwoStacks.queue(1);
        queueUsingTwoStacks.queue(2);
        queueUsingTwoStacks.queue(3);
        queueUsingTwoStacks.queue(4);
        queueUsingTwoStacks.queue(5);
        queueUsingTwoStacks.display();
    }
}
