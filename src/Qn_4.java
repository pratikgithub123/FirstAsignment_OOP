//4.Write a Java program that reads a line of integers and then displays
// each integer and the sum of all integers.


import java.util.*;

class Qn_4 {
    public static void main(String args[]) {
        int n;
        int sum = 0;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number with space:");
        String s = sc.nextLine();
        StringTokenizer st = new StringTokenizer(s, " ");
        while (st.hasMoreTokens()) {
            String temp = st.nextToken();
            n = Integer.parseInt(temp);
            System.out.println(n);
            sum = sum + n;
        }
        System.out.println("the sum of the integers is: " + sum);
        sc.close();
    }
}