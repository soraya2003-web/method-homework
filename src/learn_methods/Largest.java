package learn_methods;

public class Largest
{
    public static int getLargest(int a, int b)
    {
        if (a > b)
        {
            return a;
        }
        else
        {
            return b;
        }
    }

    public static void main(String[] args)
    {
        int x = 8;
        int y = 15;
        int greatestNumber = getLargest(x, y);
        System.out.println("the largest number is " + greatestNumber );
    }



}