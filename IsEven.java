
public class IsEven {
    public static boolean isEven(int i) {
        return (i & 1) == 0;
    }

    public static void main(String[] args) {
        System.out.println(isEven(4)); // true
        System.out.println(isEven(7)); // false
    }
}
