package stack_palindrome;
import java.util.*;

public class stack 
{
    LinkedList<Character> stack = new LinkedList<>();
    
    public void palindrome(String str)
    {
        str = str.toLowerCase();
        char[] arr = str.toCharArray();
        String check ="";
        String check1="";
        for(int i = 0; i<arr.length; i++)
        {
            if(arr[i] >= 'a' && arr[i] <='z' || arr[i] >= '0' && arr[i] <='9')
            {
                check += arr[i];
                stack.push(arr[i]);
            }
        }
        
        
        //System.out.println("check: "+check);
        ListIterator itr = stack.listIterator();
        while(itr.hasNext())
        {
            check1 += stack.pop();
        }
        //System.out.println("check1: "+check1);
        
        if(check.equals(check1))
            System.out.println("The String is a palindrome");
        else
            System.out.println("The String is not a palindrome");
    }
    
    public static void main(String args[])
    {
        stack s= new stack();
        s.palindrome("I did , did I");
        s.palindrome("Don't");
        s.palindrome("don't nod");
    }
}
