package learn_methods;

public class AlphabetCharacter
{
    public static boolean isAlphabet( char c)
    {
        if(c>='a' && c<='z')
        {
            return true;
        }
        else
        {
            return false;
        }
    }

    public static void main(String[] args) {
        char d = 's';
        boolean isAlphabet = isAlphabet(d);
        if(isAlphabet)
        {
            System.out.println(d + " is an alphabet ");
        }
        else
        {
            System.out.println( d + " is not an alphabet ");
        }
    }
}
