import java.util.*;

class customException extends Exception{

    @Override
    public String getMessage() {
        return "String is not allowed";
    }

}

class genericFunctionClass{


    public <T> void genericFunction(T... args){
       int itemsToPrint = (args.length * 2)/3;
       try{
           for(T i : args){
               if(i instanceof String){
                    throw new customException();
               }
           }
           for(int i = 0; i <= itemsToPrint ; i ++){
               System.out.println(args[i]);
           }
       }catch(customException e){
           System.out.println(e.getMessage());
       }
    }
}

public class assignment_8 {

    public static void main(String[] args) {
        genericFunctionClass generic = new genericFunctionClass();
        
        generic.genericFunction(0,1,2,3,4,5,6,7,8,9);

    }
}