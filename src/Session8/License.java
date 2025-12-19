package Session8;

import java.util.Scanner;

public class License {
    public static void main(String[] args)
    {
        // int a = 18;
        Scanner user=new Scanner(System.in);
        System.out.println("Enter the Age");
        int license = user.nextInt();
        if (license>=18)
        {
           System.out.println("Eligible for Session8.License");
        }
        else
        {
            System.out.println("Not Eligible");
        }
    }
}
