// TASK : Make a menu driven program for arthimetic operations.

import java.util.Scanner;

public class MenuDrivenProgram 
{
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);

        System.out.println("Options : Add\tSub\tMul\tDiv\tRem");
        System.out.print("Enter two numbers : ");
        int num1 = sc.nextInt();
        int num2 = sc.nextInt();
        sc.nextLine(); // input buffer becomes empty since it consumes the new line.
        System.out.println("Enter option : ");
        String option = sc.nextLine();

        option = option.toLowerCase();

        switch(option)
        {
            case "add": System.out.println("Addition : "+ (num1 + num2));
                        break;
            case "sub": System.out.println("Subtraction : " + (num1 - num2));
                        break;
            case "mul": System.out.println("Multiplication : " + (num1 * num2));
                        break;
            case "div": System.out.println("Division : " + (num1 / num2));
                        break;
            case "rem": System.out.println("Reminder : " + (num1 % num2));
                        break;
            default : System.out.println("Invalid input. please enter from options and numbers as integers.");
        }

        sc.close();

    }
}

/*
Output : 
========
Case - 1 :
----------
Options : Add   Sub     Mul     Div     Rem
Enter two numbers : 17 1
Enter option : 
add
Addition : 18

Case - 2 :
----------
Options : Add   Sub     Mul     Div     Rem
Enter two numbers : 65 97
Enter option : 
REm
Reminder : 65

*/