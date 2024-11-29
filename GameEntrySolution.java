
class GameEntry {
    int score; // Field to store the score

    public GameEntry(int score) {
        this.score = score; // Constructor to initialize the score
    }
}

public class GameEntrySolution {
    public static void main(String[] args) {
        GameEntry[] A = new GameEntry[5];
        for (int i = 0; i < A.length; i++) {
            A[i] = new GameEntry(i * 100); // Initialize scores as 0, 100, 200, ...
        }
        GameEntry[] B = A.clone();
        A[4].score = 550;
        System.out.println("B[4].score: " + B[4].score); // Output will be 550
    }
}
