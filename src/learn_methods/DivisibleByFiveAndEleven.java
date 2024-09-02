package learn_methods;

public class DivisibleByFiveAndEleven
{
    public static  boolean  isDivisibleByFiveAndEleven(int d)
    {
        if(d%5==0 && d%11 ==0)
        {
            return true;
        }
        else
        {
            return false;
        }
    }

    public static void main(String[] args) {
        int s = 55;
        boolean isDivisible = isDivisibleByFiveAndEleven(s);
        if(isDivisible)
        {
            System.out.println(s + " is divisible by 5 and 11");
        }
        else
        {
            System.out.println(s+ " is not divisible by 5 and 11");
        }
    }
}
