import java.util.*;

class Secret{

    void Asia(String s){
        int len = s.length(); 
        String str="";
        String fin="";
		for(int i = 0; i < len; i++){  
	        char c= s.charAt(i); 
	        int ascii = (int) c; 
	        ascii+=2;
	        str=Character.toString((char)ascii);
	        fin = fin+str;
	    }
	    System.out.println(fin);
    }
    void United_States(String l){
        int len = l.length(); 
        String fin="";
		for(int i = 0; i < len; i++){  
	        char c= l.charAt(i); 
	        int ascii = (int) c;
	        fin=ascii+"." + fin;
	    }
	    StringBuffer sb= new StringBuffer(fin);
        sb.deleteCharAt(sb.length()-1);
        System.out.println(sb);
    }
    void Dubai(String d){
        { 
        StringBuilder input1 = new StringBuilder(); 
        input1.append(d); 
        input1 = input1.reverse(); 
        System.out.println(input1); 
        }
    }
}

public class Main3 extends Secret{
    public static void main(String args[]) {
    Main sec=new Main();
    String arr[]=new String[100];
    Scanner a=new Scanner(System.in);
    int T=a.nextInt();
    int temp=T;
    for(int i=0;i<T;i++){
        Scanner b=new Scanner(System.in);
        String L=b.nextLine();
        arr[i]=L;
    }
    T=temp;
    for(int i=0;i<T;i++){
        for(int j=0;j<arr.length;j++){
            Scanner d=new Scanner(System.in);
            int M=d.nextInt();
            if(M==0){
                sec.Asia(arr[j]);
            }
            else if(M==1){
                sec.United_States(arr[j]);
            }
            else if(M==2){
                sec.Dubai(arr[j]);
            }
            else{
                System.out.println("Invalid Locale");
            }
        }    
    }
}
} 