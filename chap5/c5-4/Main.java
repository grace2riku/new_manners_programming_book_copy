// Listing 5.4 Javaによるforループを用いたMap処理
import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        var namelist = List.of("Alice", "Bob", "Caroline", "David", "Eve");
        var lenlist = new ArrayList<Integer>();
        for (String s : namelist) {
            lenlist.add(s.length());
        }
        System.out.println(lenlist);
    }    
}
