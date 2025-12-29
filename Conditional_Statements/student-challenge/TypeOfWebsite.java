// TASK : Display the type of website using switch case.

import java.util.Scanner;

public class TypeOfWebsite 
{
    public static void main(String [] args)
    {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter a website url/domain name : ");
        String url = sc.nextLine();

        String urlType = url.substring(url.lastIndexOf('.')+1);

        System.out.print("url type : ");

        switch(urlType)
        {
            case "com": System.out.println("Commercial");
                        break;
            case "org": System.out.println("Organisation");
                        break;
            case "net": System.out.println("Network");
                        break;
            case "gov": System.out.println("Government");
                        break;
            default : System.out.println(urlType);
        }

        sc.close();
    }    
}

/*
Output :
========
Case - 1 :
----------
Enter a website url/domain name : 
https://www.google.com
url type : Commercial 

Case - 2 :
----------
Enter a website url/domain name : 
https://www.narayana.in
url type : in

*/