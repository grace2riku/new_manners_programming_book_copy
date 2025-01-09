// 4.6.2.1 イテレータパターン
// Listing 4.7 ArrayListを用いたプログラム例をイテレータパターンを使って書き換えている
import java.util.List;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;
import java.util.Iterator;  // add


public class Main {
    public static void main(String[] args) {
        List<String> namelist = new ArrayList<>(
            Arrays.asList("Alice", "Bob", "Caroline", "David", "Eve"));
        Scanner scanner = new Scanner(System.in);
        System.out.print("Search: ");
        String serchName = scanner.nextLine();

        boolean found = false;

        // 4.6.2.1 イテレータパターンを使った例
        Iterator<String> it = namelist.iterator();
        while (it.hasNext()) {
            if (it.next().equals(serchName)) {
                System.out.println("Found " + serchName);
                found = true;
                break;
            }
        }

        // Listing 4.7 ArrayListを用いたプログラム例
//        for (String name : namelist) {
//            if (name.equalsIgnoreCase(serchName)) {
//                System.out.println("Found " + serchName);
//                found = true;
//                break;
//            }
//        }

        if (!found) {
            System.out.println("Not found " + serchName);
        }
        scanner.close();
    }
}
