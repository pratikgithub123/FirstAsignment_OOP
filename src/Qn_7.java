//7.Write a Java program that accepts two floating-point numbers and checks whether they are
// the same up to two decimal places.

import java.util.Scanner;
public class Qn_7 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter first number:");
        float first_num=sc.nextFloat();
        System.out.println("Enter second number");
        float second_num=sc.nextFloat();
        deci(first_num,second_num);
    }
    public static void deci (float first_num, float second_num) {
        if (Math.abs(first_num-second_num)<=0)
        {
            System.out.println("same Number");
        }
        else
        {
            System.out.println("Different number");
        }

    }
}