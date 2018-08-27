import java.util.*;
import java.util.List;
class Unit2Chapter3Part3
    // Alex Knusel
    // 8/10/2018
    // Chapter2.3.3
    // bool,n,s,length,FirstDigit
{
    public static void main(String[] args)
    {
        int bool = 1;
        while (bool != 8)
        {
            System.out.println("Hint: 8000");
            System.out.println("What's the code?:  ");
            Scanner s = new Scanner(System.in);
            int n = s.nextInt();
            int FirstDigit = Integer.parseInt(Integer.toString(n).substring(0,1));
            int length = String.valueOf(n).length();
            if (FirstDigit == 8)
            {
                if (length == 4)
                {
                    bool = FirstDigit;
                }
            }
        }
    }
}
