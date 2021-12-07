//8.Write a Java program to compute body massindex
// (BMI).Note: The formula is BMI = kg/m2 where kg is a person's weight in kilograms
// and m2 is their height in metres squared.

import java.util.Scanner;
public class Qn_8 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println(" Enter weight in kg: ");
        float weight = sc.nextFloat();
        System.out.println(" Enter height in metre: ");
        float height = sc.nextFloat();
        float ans=order(weight, height);
        System.out.println("BMI ; " + ans);
    }
    public static float order(float weight, float height) {
        return weight/(height*height);
    }
}