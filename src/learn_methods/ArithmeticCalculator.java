package learn_methods;

public class ArithmeticCalculator
{
    public static void calculate( int x, int y, char operator)
    {
        int result;
        switch (operator)
        {
            case '*':
                result = x*y;
                System.out.println( " the result of multiplication is " + result);
                break;
            case '+' :
                result = x+y;
                System.out.println(" the result of addition is " + result );
                break;
            case '-':
                result = x-y;
                System.out.println(" the result of minus is " + result);
                break;
            case '/':
                result = (x/y);
                System.out.println( " the result of division is " + result);
                break;
            default:
                System.out.println( "invalid operator");
        }

    }
    public static void main(String[] args)
    {
        int a = 12;
        int b = 5;
        char operator = '+';
        calculate(a, b, operator);


    }
}
