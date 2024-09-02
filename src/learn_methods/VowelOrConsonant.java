package learn_methods;

public class VowelOrConsonant
{
    public static boolean isVowelOrConsonant (char e)
    {
        if(e == 'a' || e == 'e' || e =='i' || e == 'o' || e =='u' || e == 'y' || e == 'w')
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
        char x = 'd';
        boolean isVowelOrConsonant = isVowelOrConsonant(x);
        if(isVowelOrConsonant)
        {
            System.out.println(x + " is a vowel ");
        }
        else
        {
            System.out.println(x + " is a consonant ");
        }

    }
}
