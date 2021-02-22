package Algorithms;

import java.util.Scanner;

public class RecursivePowerCalculator
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);

        int base, power;

        System.out.print("Enter Base value: ");
        base = sc.nextInt();
        System.out.print("Enter power value: ");
        power = sc.nextInt();

        System.out.println(base+" to the "+power+" is "+calculatePower(base, power));
    }

    private static int calculatePower(int base, int power)
    {
        if(power == 1)
            return base;

        return base * calculatePower(base, power-1);
    }
}
