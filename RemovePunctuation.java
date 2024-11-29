public class RemovePunctuation {
    public static String removePunctuation(String s) {
        return s.replaceAll("\\p{Punct}", "");
    }

    public static void main(String[] args) {
        System.out.println(removePunctuation("Lets try, Mike!"));
    }
}
