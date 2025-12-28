// TASK : Take a user name from the user and find the user name, domain name.

import java.util.Scanner;
public class Email 
{
    public static void main(String [] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your email id : ");
        String email = sc.nextLine();
        int userNameLastIndex = email.indexOf("@");
        System.out.println("User name : " + email.substring(0,userNameLastIndex));
        System.out.println("Domain name : " + email.substring(userNameLastIndex+1));
        int domainIndex = email.indexOf(".");
        
        String mainDomain = email.substring(userNameLastIndex+1,domainIndex);

        if(mainDomain.equals("gmail"))
            {
                System.out.println("The email is an gamil main domain");
            }
        else{
            System.out.println("The email is " + mainDomain);
        }
        
        //System.out.println("Type of email : " + email.substring(userNameLastIndex+1, domainIndex ));
        sc.close();
    }
}

/*
Output :
========
case - 1 :
----------
Enter your email id : 
sksameerbasha703@hotmail.com
User name : sksameerbasha703
Domain name : hotmail.com
The email is hotmail

case - 2 :
----------
Enter your email id : 
sksameerbasha703@gamil.com
User name : sksameerbasha703
Domain name : gamil.com
The email is gamil
*/