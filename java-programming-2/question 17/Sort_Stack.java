import java.util.*; 
  
class Sort_Stack 
{ 
    public static Stack<Integer> Sort_Stack(Stack<Integer> input) 
    { 
        Stack<Integer> temp = new Stack<Integer>(); 
        while(!input.isEmpty()) 
        { 
            int tmp = input.pop(); 
            while(!temp.isEmpty() && temp.peek()> tmp) 
            { 
            input.push(temp.pop()); 
            } 
            temp.push(tmp); 
        } 
        return temp; 
    } 
      
    public static void main(String args[]) 
    { 
        Stack<Integer> input = new Stack<Integer>(); 
        input.add(1); 
        input.add(2); 
        input.add(3);  
   
        Stack<Integer> temp=Sort_Stack(input); 
        System.out.println("Sorted numbers are as follows:"); 
      
        while (!temp.empty()) 
        { 
            System.out.print(temp.pop()+" "); 
        }  
    } 
} 