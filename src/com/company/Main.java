package com.company;
import java.util.*;
public class Main {

    public static void main(String[] args) {
        String message, input;
        System.out.println("Enter String");
        Scanner kbReader = new Scanner(System.in);
        message = kbReader.nextLine();

        message = message.toLowerCase();
        String EncryptMessage[] = new String [message.length()];
        /*
        Im confused here and wondering
        if my loop even makes sense
         */


        for (int x =0;x<EncryptMessage.length;x++)
        {
         EncryptMessage[x] = EncryptMessage[x]+3;
         System.out.println("Your encrypted string is "+EncryptMessage);

         /* I know I'm doing something
         wrong since im getting random text */

         System.out.println("Your encryption key is");// The key is supposed to be n letters over. Ex) a+1=b
         System.out.println("Would you like to decrypt string?");
            input = kbReader.nextLine();
            input = input.toLowerCase();
         if(input.equals("yes"))
         {
             System.out.println("Your unencrypted string is "+message);
             break;

         }
         else
         {
             break;
         }

        }

    }
}
