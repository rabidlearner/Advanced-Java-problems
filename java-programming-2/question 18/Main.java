import java.util.*;
   
public class Main { 
   
    static Queue<Integer> queue; 
    
    static void Print() 
    { 
        while (!queue.isEmpty())  
        { 
            System.out.print(queue.peek() + " "); 
            queue.remove(); 
        } 
    } 
   

static Queue<Integer> reverseQueue(Queue<Integer> q) 
{ 
    if (q.isEmpty()){
        return q; 
    }
    int data = q.peek(); 
    q.remove(); 
    q = reverseQueue(q); 
    q.add(data); 
    return q; 
} 
   
public static void main(String args[]) 
{ 
    queue = new LinkedList<Integer>(); 
    queue.add(3); 
    queue.add(1); 
    queue.add(2); 
    queue = reverseQueue(queue); 
    Print(); 
} 
} 