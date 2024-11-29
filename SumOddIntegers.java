
public class SumOddIntegers {
    public static int sumOddUpTo(int n) {
        int sum = 0;
        for (int i = 1; i <= n; i += 2) {
            sum += i;
        }
        return sum;
    }

    public static void main(String[] args) {
        System.out.println(sumOddUpTo(5)); // 9
    }
}
