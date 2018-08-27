import java.util.List;
import java.util.Collections;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;
class Unit2Chapter3
    // Alex Knusel
    // 8/10/2018
    // Chapter2.2
    // first_name,myList,s
{
    public static void main(String[] args)
    {
        System.out.println("Enter your name ");
        Scanner s = new Scanner(System.in);
        String first_name;
        first_name = s.next();
        ArrayList myList = new ArrayList();
        myList.add("alex");
        myList.add(first_name);
        Collections.sort(myList);
        System.out.println("First Name: "+myList.get(0));
        System.out.println("Second Name: "+myList.get(1));
    }
}