import java.util.Scanner;
import java.util.Collections;
import java.util.ArrayList;
class Unit2Chapter3Part2
    // Alex Knusel
    // 8/10/2018
    // Chapter2.2
    // n,n1,n2,s,myList,greatest
{
    public static void main(String[] args)
    {
        System.out.println("What is the first number?: ");
        Scanner s = new Scanner(System.in);
        double n = s.nextDouble();
        System.out.println("What is the second number?: ");
        Scanner s1 = new Scanner(System.in);
        double n1 = s1.nextDouble();
        System.out.println("What is the third number?: ");
        Scanner s2 = new Scanner(System.in);
        double n2 = s2.nextDouble();
        ArrayList myList = new ArrayList();
        myList.add(n);
        myList.add(n1);
        myList.add(n2);
        Collections.sort(myList);
        System.out.println("The highest number is "+myList.get(2));
        double greatest = 0;
        if (n > n1)
        {
            if (n > n2)
            {
                greatest = n;
            }
            else
                greatest = n2;
        }
        else if (n1 > n)
        {
            if (n1 > n2)
            {
                greatest = n1;
            }
            else
            {
                greatest = n2;
            }
        }
        System.out.println("The highest number is: "+greatest);
     
    }
}

