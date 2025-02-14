
public class SumSquares {
    public static int sumSquaresUpTo(int n) {
        int sum = 0;
        for (int i = 1; i <= n; i++) {
            sum += i * i;
        }
        return sum;
    }

    public static void main(String[] args) {
        System.out.println(sumSquaresUpTo(3)); // 14
    }
}
