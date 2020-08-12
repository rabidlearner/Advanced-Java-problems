import java.util.*;

class SavingAmount{
    int saving;
    SavingAmount(int saving)
    {
        this.saving=saving;
    }
    void setter(int a)
    {
        saving = a;
    }
    void getter()
    {
        System.out.println(saving);
    }
    void increment()
    {
        saving += 1000;
    }
    void decrement()
    {
        saving -= 100;
    }
    void checkSavings()
    {
        if(saving>=1000)
        {
            System.out.println("Congratulations! You have saved a good amount");
        }
        else if(saving<1000 && saving>=0 )
        {
            System.out.println("Insufficient Saving!");
        }
        else
        {
            System.out.println("You are in debt");
        }
    }
    void Total()
    {
        System.out.println("Your current savings are Rs "+saving);
    }
}

public class Main{
    public static void main(String []args){
        Scanner input=new Scanner(System.in);
        int a=input.nextInt();
        SavingAmount save= new SavingAmount(a);
        save.decrement();
        save.increment();
        save.checkSavings();
        save.Total();
     }
}