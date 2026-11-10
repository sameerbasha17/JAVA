package JAVA.ExceptionHandling;

class StackOverFlow extends Exception
{
    @Override 
    public String toString()
    {
        return "Stack is overflow. Top is maxed.";
    }
}

class StackUnderFlow extends Exception
{
    @Override 
    public String toString()
    {
        return "Stack is underflow. There are no elements to be deleted";
    }
}

class Stack
{
    int top = -1;
    int size;
    int[] arr;

    public Stack(int x)
    {
        size = x;
        arr = new int[size];
    }

    public boolean push(int x) throws StackOverFlow
    {
        top ++;
        if(top == size)
        {
            throw new StackOverFlow();
        }
        arr[top] = x;
        return true;
    }

    public int pop() throws StackUnderFlow
    {
        top--;
        if(top == -1)
        {
            throw new StackUnderFlow();
        }
        return arr[top];
    }
}

public class StackMain 
{
    public static void main(String[] as) 
    {
        Stack s = new Stack(5);
        try
        {
            s.push(9);
            s.pop();
            s.pop();        // Stack is underflow. There are no elements to be deleted
            s.push(7);
            s.push(1);
            s.push(3);
            s.push(33);
            s.push(9);
            s.push(1);
            s.pop();
        }
        catch(StackOverFlow e)
        {
            System.out.println(e);
        }
        catch(StackUnderFlow e)
        {
            System.out.println(e);
        }

    }
}
