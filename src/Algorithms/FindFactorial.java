package Algorithms;

import java.util.Scanner;

public class FindFactorial
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int number;

        System.out.print("Enter a positive number: ");
        while(true)
        {
            number = sc.nextInt();
            if(number >= 0 )
                break;
            else
                System.err.println("Invalid Number");
        }

        System.out.println("Factorial of "+number+" is "+claculateFacotial(number));

    }

    private static int claculateFacotial(int number)
    {
        if(number ==1 || number == 0)
            return 1;
        else
            return number * claculateFacotial(number-1);
    }
}
