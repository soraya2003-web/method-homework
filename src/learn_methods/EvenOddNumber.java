package learn_methods;

public class EvenOddNumber
{
    public static boolean isEvenOrOdd(int k)
    {
        if(k%2==0)
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
        int a = 15;
        boolean isEvenOdd = isEvenOrOdd(a);
        if(isEvenOdd)
        {
            System.out.println(a + " is even");
        }
        else
        {
           System.out.println(a + " is odd ");
        }

    }
}
