// Listing 4.7 ArrayListを用いたプログラム例
import java.util.List;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        List<String> namelist = new ArrayList<>(
            Arrays.asList("Alice", "Bob", "Caroline", "David", "Eve"));
        Scanner scanner = new Scanner(System.in);
        System.out.print("Search: ");
        String serchName = scanner.nextLine();

        boolean found = false;
        for (String name : namelist) {
            if (name.equalsIgnoreCase(serchName)) {
                System.out.println("Found " + serchName);
                found = true;
                break;
            }
        }
        if (!found) {
            System.out.println("Not found " + serchName);
        }
        scanner.close();
    }
}
