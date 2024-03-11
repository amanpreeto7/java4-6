import java.util.Scanner;
// import java.util.*;

public class UserInput {

    public static void main(String args[]) {
        Scanner obj = new Scanner(System.in);
        int a, b = 20;
        float f;
        char c;
        System.out.println("Enter the value of a");
        a = obj.nextInt();
        System.out.println("Entered valud if a is " + a);
        if (a < b) {

        }

        System.out.println("Enter float value");
        f = obj.nextFloat();

        c = obj.next().charAt(0);
        System.out.println("value of c " + c);

    }
}

// String concat +
// String interpolation $
