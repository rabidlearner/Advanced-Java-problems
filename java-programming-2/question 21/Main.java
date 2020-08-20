import java.util.*;

class Main { 
  
    static Node head; 
  
    static class Node { 
  
        int data; 
        Node next; 
  
        Node(int d) 
        { 
            data = d; 
            next = null; 
        } 
    } 

    Node reverse(Node node) 
    { 
        Node prev = null; 
        Node current = node; 
        Node next = null; 
        while (current != null) { 
            next = current.next; 
            current.next = prev; 
            prev = current; 
            current = next; 
        } 
        node = prev; 
        return node; 
    } 

    void printList(Node node) 
    { 
        while (node != null) { 
            System.out.print(node.data + " "); 
            node = node.next; 
        } 
    } 
  
    public static void main(String[] args) 
    { 
        Main list = new Main(); 
        list.head = new Node(1); 
        list.head.next = new Node(2); 
        list.head.next.next = new Node(3); 
  
        System.out.println("Given:"); 
        list.printList(head); 
        head = list.reverse(head); 
        System.out.println(""); 
        System.out.println("Reversed:"); 
        list.printList(head); 
    } 
} 
  