package stacks_using_arrays;
//import java.util.*;
public class stack 
{
    employee[] stack;
    int top;
    int capacity;
    //LinkedList<Character> l;
    
    stack(int capacity)
    {
        this.capacity = capacity;
        stack = new employee[capacity];       
    }
    
    public void push(employee emp)
    {
        //resize array if full
        if(top == capacity)
        {
            employee[] newarray = new employee[2 * capacity];
            System.arraycopy(stack, 0, newarray, 0,stack.length);
            stack = newarray;
        }
        
        stack[top++] = emp;
    }
    
    public employee pop()
    {
        if(isEmpty())
        {
            System.out.println("Stack underflow");
            return null;
        }            
        employee emp = stack[--top];
        System.out.println("Popped element: "+emp.toString());
        return emp;
    }
    
    public employee peek()
    {
        if(isEmpty())
            return null;
        else
            return stack[top-1];
    }
    
    public boolean isEmpty()
    {
        return top == 0;
    }
    
    public void printlist()
    {
        for(int i = top-1; i >= 0;i--)
        {
            System.out.println(stack[i].toString());
        }       
    }
    
    public static void main(String args[])
    {
        //LinkedList<Character> l = new LinkedList<>();
        stack s = new stack(3);
        employee emp1 = new employee("Jake",1);
        employee emp2 = new employee("Amy",2);
        employee emp3 = new employee("Terry",3);
        employee emp4 = new employee("Rosa",4);
        employee emp5 = new employee("Charles",5);
        
        s.push(emp1);
        s.push(emp2);
        s.push(emp3);
        s.printlist();
        
        s.push(emp4);   //resizing took place here
        s.printlist();  
        
        s.pop();
        s.printlist();
        
        System.out.println("Top element: "+s.peek());
    }
}
