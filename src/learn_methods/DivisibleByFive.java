package learn_methods;

public class DivisibleByFive
{
   public static boolean isDivisibleByFive(int a)
   {
       if(a%5 ==0)
       {
           return true;
       }
       else
       {
           return false;
       }
   }

    public static void main(String[] args)
    {
       int x = 13;
       boolean isDivisible = isDivisibleByFive(x);
       System.out.println("the number " + x + " is divisible by 5 ? " + isDivisible);


    }
}
