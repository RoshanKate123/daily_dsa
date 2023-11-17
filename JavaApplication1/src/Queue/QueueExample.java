/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Queue;

import java.util.LinkedList;
import java.util.Queue;

/**
 *
 * @author Roshan Ramdas Kate
 */
public class QueueExample {
public static void main (String args[])
{
    Queue<String> que = new LinkedList<>();
    que.add("apple");
    que.add("banana");
    que.add("grapes");
    
    System.out.println("Queue is "+ que );
    String  front = que.remove();
    System.out.println(front);
    
    System.out.println("Queue after removal "+ que);
    que.add("Dates");
    System.out.println(que);
}
}
