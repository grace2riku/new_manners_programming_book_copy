// 4.3.4.5 ラムダ式
@FunctionalInterface
interface Calculator {
    double calc(double a, double b);
}

public class Main {
    public static void main(String[] args) {
        // 加算
        Calculator add = (a, b) -> a + b;
        System.out.println("10 + 5 = " + add.calc(10, 5));

        // 減算
        Calculator subtract = (a, b) -> a - b;
        System.out.println("10 - 5 = " + subtract.calc(10, 5));

        // 乗算
        Calculator multiply = (a, b) -> a * b;
        System.out.println("10 * 5 = " + multiply.calc(10, 5));

        // 除算
        Calculator divide = (a, b) -> {
            if (b == 0)
                throw new ArithmeticException("Division by zero");
            return a / b;
        };
        System.out.println("10 / 5 = " + divide.calc(10, 5));
    } 
}
