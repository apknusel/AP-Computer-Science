import java.util.*;
class Unit2Chapter3Part4
    // Alex Knusel
    // 8/10/2018
    // Chapter2.3.4
    // s,s2,s3,first_name,last_name,place_of_work,fnameLength,lnameLength
{
    public static void main(String[] args)
    {
        System.out.println("Enter your first name ");
        Scanner s = new Scanner(System.in);
        String first_name;
        first_name = s.next();
        System.out.println("Enter your last name ");
        Scanner s2 = new Scanner(System.in);
        String last_name;
        last_name = s.next();
        System.out.println("Enter your place of work ");
        Scanner s3 = new Scanner(System.in);
        String place_of_work;
        place_of_work = s.next();
        int fnameLength = first_name.length();
        int lnameLength = last_name.length();
        if (fnameLength + lnameLength > 14)
        {
            System.out.println(first_name);
            System.out.println(last_name);
            System.out.println(place_of_work);
        }
        else
        {
            System.out.println(first_name+" "+last_name);
            System.out.println(place_of_work);
        }
    }
}