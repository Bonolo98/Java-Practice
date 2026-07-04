package String_Concat;

import java.util.Scanner;

public class StringConcat {

    static String firstName;
    static String lastName;

    public static void main(String a[]) {

        Scanner scan = new Scanner(System.in);

        System.out.println("What is your FIRST NAME?");
        firstName = scan.next();

        System.out.println("What is your LAST NAME?");
        lastName = scan.next();

        System.out.println("This is your name:");
        System.out.println(firstName.concat(lastName));

        scan.close();

    }

}
