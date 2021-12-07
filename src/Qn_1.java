//1.Write a Java program that prompts the user for an integer and
//then prints out all the prime numbers up to that Integer?

import java.util.Scanner;

class Qn_1 {
    public static void main(String[] args)
    {
        int a;
        int b;
        Scanner s=new Scanner(System.in);
        System.out.println("Enter a number: ");
        a=s.nextInt();
        for(int i=2;i<a;i++)
        {
            b=0;
            for(int j=2;j<i;j++)
            {
                if(i%j==0)
                    b=1;
            }
            if(b==0)
                System.out.println(i);
        }
    }
}

