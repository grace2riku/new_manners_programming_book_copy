// Listing 4.8 HashSetを用いたプログラム例
import java.util.Set;
import java.util.HashSet;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        Set<String> nameset = new HashSet<>(
            List.of("Alice", "Bob", "Caroline", "David", "Eve"));
        System.out.println(nameset.contains("Alice"));
    }
}
