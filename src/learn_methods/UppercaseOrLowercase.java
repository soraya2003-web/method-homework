package learn_methods;

public class UppercaseOrLowercase
{
    public static boolean isUpperOrLowercase(char x)
    {
        if(x>='A' && x<='Z')
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
        char c = 'G';
        boolean isUppercaseOrLowercase = isUpperOrLowercase(c);
        if(isUppercaseOrLowercase)
        {
            System.out.println(c + " is uppercase");
        }
        else
        {
            System.out.println(c + " is lowercase ");
        }

    }
}
