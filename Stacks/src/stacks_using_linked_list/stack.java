package stacks_using_linked_list;
import java.util.*;

public class stack 
{
    LinkedList<employee> stack = new LinkedList<>();
    int top;
    
    public void push(employee emp)
    {
        stack.push(emp);
    }
    
    public employee pop()
    {
        if(stack.isEmpty())
            return null;
        else
            return stack.pop();
    }
    
    public employee peek()
    {
        return stack.peek();
    }
    
    public void printlist()
    {
        ListIterator itr = stack.listIterator();
        System.out.println("The stack is: ");
        while(itr.hasNext())
        {
            System.out.println(itr.next().toString());
        }
    }
    
    public static void main(String args[])
    {
        stack s = new stack();
        employee emp1 = new employee("Jake",1);
        employee emp2 = new employee("Amy",2);
        employee emp3 = new employee("Terry",3);
        employee emp4 = new employee("Rosa",4);
        employee emp5 = new employee("Charles",5);
        
        s.push(emp1);
        s.push(emp2);
        s.push(emp3);
        s.printlist();
        
        System.out.println("Popped element: "+s.pop());
        System.out.println("Top element: "+s.peek());    
    }
}
