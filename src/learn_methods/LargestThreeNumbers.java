package learn_methods;

public class LargestThreeNumbers
{
    public static int getLargestNumber (int a, int b, int c)
    {
        if(a>b && b>c)
        {
            return a;
        }
        else if( b>a && b>c)
        {
            return b;
        }
        else
        {
            return c;
        }

    }

    public static void main(String[] args)
    {
        int x = 9;
        int y = 25;
        int z = 30;
        int greatestNumber = getLargestNumber(x,y,z);
        System.out.println("the largest among three numbers is " + greatestNumber);

    }
}
