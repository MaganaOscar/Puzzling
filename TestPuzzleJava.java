import java.util.ArrayList;
import java.util.Arrays;
import java.util.Random;

public class TestPuzzleJava {
    public static void main(String[] args) {
        PuzzleJava generator = new PuzzleJava();
        ArrayList<Integer> randomRolls = generator.getTenRolls();
        // System.out.println(randomRolls);
        System.out.println(generator.getRandomLetter());
        System.out.println(generator.generatePassword());
        System.out.println(generator.getNewPasswordSet(3));
        int[] shuffleArray = {3, 0, 12, 8, -2};
        generator.shuffleArray(shuffleArray);
        System.out.println(Arrays.toString(shuffleArray));
    }
}