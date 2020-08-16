import java.util.*;

public class assignment_2 {
    interface add{
        public int add(int a,int b);
    }
    interface difference {
        public int difference(int a,int b);
    }
    interface product{
        public int product(int a,int b);
    }
    interface safeDivision{
        public float safeDivision(float a, float b);
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        add ad = (int a,int b)-> a+b;
        difference di = (int a,int b) -> a-b;
        product pr = (int a,int b)->a*b;
        safeDivision div = (float a, float b)->{
            try{
                if(b == 0){
                    throw new ArithmeticException();

                }
               return a/b;
            }catch (ArithmeticException a){
                System.out.println("Denominator should not be zero");
                a.printStackTrace();
            }
            return 0;
        };

        System.out.println(div.safeDivision(6.0,2.0));
        System.out.println(ad.add(6,2));
        System.out.println(di.difference(6,2));
        System.out.println(pr.product(6,2));
    }
}