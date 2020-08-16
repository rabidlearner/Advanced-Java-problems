import java.util.*;

class Base{
    int height, width;
    public Base(){
        this.height = 0;
        this.width = 0;
    }
    public void display(){
        System.out.println(width +" "+height);
    }

}
public class assignment_2 extends Base{

    Scanner sc;
    public assignment_2(){
        sc = new Scanner(System.in);
    }


    public void read_input(){
        height = sc.nextInt();
        width = sc.nextInt();
    }
    public void display(){
        System.out.println(height*width);
    }

    public static void main(String[] args) {
        assignment_2 rectangle = new assignment_2();
        rectangle.read_input();
        System.out.println(rectangle.height + " "+ rectangle.width);
        rectangle.display();
    }
}