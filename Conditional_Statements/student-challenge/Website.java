// TASK : Find type of website and protocol used.

import java.util.Scanner;

public class Website 
{
    public static void main(String [] args)
    {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter a website url : ");
        String url = sc.nextLine();

        int protocolIndex = url.indexOf(":");
        String protocol = url.substring(0,protocolIndex);

        System.out.print("protcol used : ");

        if(protocol.equals("http"))
        {
            System.out.println("Hyper Text Transfer Protocol");
        }
        else if(protocol.equals("https"))
        {
            System.out.println("Hyper Text Transfer Protocol Secure");
        }
        else if(protocol.equals("smtp"))
        {
            System.out.println("Simple Mail Transfer Protocol");
        }
        else if(protocol.equals("ftp"))
        {
            System.out.println("File Transfer Protocol");
        }
        else{
            System.out.println(protocol);
        }

        int urlTypeIndex = url.lastIndexOf('.');
        String urlType = url.substring(urlTypeIndex+1);

        System.out.print("URL type : ");

        if(urlType.equals("com"))
        {
            System.out.println("Commercial");
        }
        else if(urlType.equals("gov"))
        {
            System.out.println("Government");
        }
        else if(urlType.equals("org"))
        {
            System.out.println("Organization");
        }
        else if(urlType.equals("net"))
        {
            System.out.println("Network");
        }
        else
        {
            System.out.println(urlType);
        }

        sc.close();
    }
}

/*
Output :
========
Case - 1 :
----------
Enter a website url : 
https://sameerbasha.com
protcol used : Hyper Text Transfer Protocol Secure
URL type : Commercial

Case - 2 :
----------
Enter a website url : 
tcp://narayana.in
protcol used : tcp
URL type : in

*/