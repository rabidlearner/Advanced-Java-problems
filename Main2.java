import java.util.*;

public class Main2 {
    public static int getASCII(String s){
        int len = s.length(); 
		int count=0;
		for(int i = 0; i < len; i++){  
	        char c= s.charAt(i); 
	        int ascii = (int) c; 
	        count+=ascii;
	    }
        return count;
    }
    public static int X(int a,int b) {
    	return a+b;
    }
    public static String X(String a,String b) {
    	return a+b;
    }
    public static void main(String args[]) {
        Scanner input1=new Scanner(System.in);
        String a=input1.nextLine();
        Scanner input2=new Scanner(System.in);
        String b=input2.nextLine();
        Scanner input3=new Scanner(System.in);
        int n=input3.nextInt();
        if(n==1) {
        	int b1=getASCII(a);
            int b2=getASCII(b);
            System.out.println(X(b1,b2));
        }
        else if(n==2) {
        	System.out.println(X(a,b));
        }
        else if(n==3) {
        	int a1=getASCII(a);
        	int a2=getASCII(b);
        	System.out.println(X(a1,a2));
        }

    }
}