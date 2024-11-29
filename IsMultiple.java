
public class IsMultiple {
    public static boolean isMultiple(long n, long m) {
        return m != 0 && n % m == 0;
    }

    public static void main(String[] args) {
        System.out.println(isMultiple(10, 5)); // true
        System.out.println(isMultiple(10, 3)); // false
    }
}
