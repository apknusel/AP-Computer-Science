class Chapter23
    // Alex Knusel
    // 8/10/2018
    // Chapter2.2
    // a,b,c,quotient,remainder,power
{
    public static void main()
    {
        int a = 10;
        int b = 20;
        int c = 30;
        int quotient = a/b;
        int remainder = a%b;
        double power = Math.pow(a,b);
        System.out.print("quotient: "+quotient+"\nremainder: "+remainder);
        System.out.print("\npower: "+power);
    }
}