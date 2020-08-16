import java.util.*;

class Triangle{
    public float getArea(float a, float b, float c){
        float s = (a+b+c)/2f;
        double area = Math.sqrt((s*(s-a)*(s-b)*(s-c)));
        return (float)area;
    }
}
public class assignment_7 {

    public static void main(String[] args) {
        Triangle t = new Triangle();
        Scanner sc = new Scanner(System.in);
        float  a = sc.nextFloat();
        float b =  sc.nextFloat();
        float c = sc.nextFloat();
        System.out.println(t.getArea(a,b,c));
    }
}