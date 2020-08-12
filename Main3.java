import java.util.*;

class Secret{

    void Asia(String s){
        int len = s.length(); 
        String str=null;
        String fin=null;
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
        String fin=null;
		for(int i = 0; i < len; i++){  
	        char c= l.charAt(i); 
	        int ascii = (int) c;
	        fin=ascii+".";
	    }
    }
    void Dubai(String d){
        int length=d.length();
        String rev=null;
        for(int i=length-1;i>=0;i--){
            rev=rev+d.charAt(i);
            System.out.print(rev);    
        }
    }
}

public class Main3 extends Secret{
    public static void main(String args[]) {
    Main sec=new Main();
    String arr[]=new String[100];
    Scanner a=new Scanner(System.in);
    int T=a.nextInt();
    for(int i=0;i<T;i++){
        Scanner b=new Scanner(System.in);
        String L=b.nextLine();
        arr[i]=L;
    }
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