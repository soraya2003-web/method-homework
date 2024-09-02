package learn_methods;

public class PositiveNegativeNumbers
{
    public static boolean isPositive(int number)
    {
        if(number >= 0)
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
        int score = -5;
        boolean result = isPositive(score);
        if(result == true)
        {
            System.out.println("number is positive");
        }
        else
        {
            System.out.println("number is negative");
        }

    }
}
