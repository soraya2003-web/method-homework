package learn_methods;

public class MultipleNumber
{
    public static boolean isMultipleByFive (int x)
    {
        if(x%5==0)
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
        int s = 12;
        boolean isMultiple = isMultipleByFive(s);
        if(isMultiple)
        {
            System.out.println( s + " is multiple by 5");
        }
        else
        {
            System.out.println(s + " is not multiple by 5");
        }

    }
}
