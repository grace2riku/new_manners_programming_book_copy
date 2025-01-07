// Listing 4.4 例外処理を行っていないプログラム例

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        var sc = new Scanner(System.in);
        var x = 0;
        do {
            System.out.print("Enter a positive integer: ");
            x = sc.nextInt();
            if (x <= 0) {
                System.out.println("Input positive integer!");
            }
        } while (x <= 0);

        System.out.println("You entered " + x);
        sc.close();
    }    
}
