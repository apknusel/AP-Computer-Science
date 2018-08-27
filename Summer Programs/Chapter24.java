import java.util.Scanner;
class Chapter24
    // Alex Knusel
    // 8/10/2018
    // Chapter2.2
    // s,temp
{
    public static void main(String[] arg)
    {
        System.out.println("What is the temperature?: ");
        Scanner s = new Scanner(System.in);
        double temp = s.nextDouble();
        System.out.println("temperature is " + temp);
    }
}