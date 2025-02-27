package Arrays.ArrayTask;

import java.util.Arrays;

public class StackWithArray {

    int [] stack= new int[3];
    int index=-1;

    void push(int num)
    {
        if(index==stack.length-1)
        {
            System.out.println("Stack is full");
        }
        else
        {
            stack[++index] = num;
        }
    }

    int peak()
    {
        int num= stack[index];
        return num;
    }
    void pop()
    {
        int topElement=0;
        if(index<0)
        {
            System.out.println("Stack is Empty");
        }
        else
        {
            topElement = stack[index--];
            this.stack = Arrays.copyOf(stack, stack.length - 1);
            System.out.println(topElement);
        }
    }


    public static void main(String []args)
    {
        StackWithArray sa= new StackWithArray();
        sa.push(1);
        sa.push(2);
        sa.push(3);
        sa.push(4);
        sa.pop();
        sa.pop();
        sa.pop();
        sa.pop();
        sa.pop();
    }
}
