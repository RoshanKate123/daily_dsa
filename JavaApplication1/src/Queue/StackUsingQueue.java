/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Queue;

import java.util.Deque;
import java.util.LinkedList;

/**
 *
 * @author Roshan Ramdas Kate
 */
class Stack{
    Deque<Integer> myDeque = new LinkedList<>();
    
   void push(int item)
   {
       myDeque.addLast(item);
   }
    int pop()
    {
        int val = myDeque.getLast();
        myDeque.removeLast();
        return val;
    }
    int size()
    {
        return myDeque.size();
    }
    boolean isEmpty()
    {
        return myDeque.isEmpty();
    }
    
    int top()
    {
        if(isEmpty())
        {
            return -1;
        }
        else
        {
            return myDeque.getLast();
        }
    }
    
}
public class StackUsingQueue {
   public static void main(String args[])
   {
       Stack st = new Stack();
       st.push(1);
       st.push(2);
       st.push(3);
       System.out.println("Current size is "+st.size());
       System.out.println(st.top());
       st.pop();
       st.pop();
       System.out.println("Current size is "+st.size());
       System.out.println(st.top());
   }
}
