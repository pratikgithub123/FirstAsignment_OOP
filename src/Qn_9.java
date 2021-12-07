//9.Write a Java program to takes the user for a distance (in meters) and the time was taken
// (as three numbers: hours, minutes, seconds), and display the speed, in meters per second,
// kilometers per hour and miles per hour (hint: 1 mile = 1609 meters)
// .ExampleInput distance in meters: 2500
// Input hour: 5
// Input minutes: 56
// Input seconds: 23
// Expected Output:Your speed in meters/second is 0.11691531
// Your speed in km/h is 0.42089513
// Your speed in miles/h is 0.26158804

import java.util.Scanner;
public class Qn_9 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        float timeSeconds;
        float mps,kph, mph;
        System.out.print("Enter distance in meters: ");
        float distance = sc.nextFloat();
        System.out.print("Enter hour: ");
        float hr = sc.nextFloat();
        System.out.print("Enter minutes: ");
        float min = sc.nextFloat();
        System.out.print("Enter seconds: ");
        float sec = sc.nextFloat();
        timeSeconds = (hr*3600) + (min*60) + sec;
        mps = distance / timeSeconds;
        kph = ( distance/1000.0f ) / ( timeSeconds/3600.0f );
        mph = kph / 1.609f;
        System.out.println("Speed in meters/second is "+mps);
        System.out.println("Speed in km/h is "+kph);
        System.out.println("Speed in miles/h is "+mph);
    }
}