//5.Write a Java program to display the following star pattern
// d.Inverted Pyramid Star Pattern

public class Qn_5d {
    public static void main(String[] args) {
        String ast="*";
        for(int i=5;i>0 ;i--)
        {
            for(int j=0;j<5-i;j++)

            {
                System.out.print(" ");
            }
            for(int j=0;j<(i*2)-1;j++)

            {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}