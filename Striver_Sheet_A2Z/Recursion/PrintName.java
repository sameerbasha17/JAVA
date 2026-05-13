// Task : Print name "N" times
import java.util.Scanner;

public class PrintName 
{
    public static void main(String [] args)
    {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter N value : ");
        byte n = sc.nextByte();

        printName((byte)1, n);

        sc.close();
    }    

    static void printName(byte i, byte n)
    {
        if(i > n)
        {
            return;
        }
        System.out.println("Sameer");
        printName((byte)(i + 1), (byte)n);

    }
}

/*
Output : 
========
Enter N value : 
5
Sameer
Sameer
Sameer
Sameer
Sameer

*/