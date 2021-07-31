import java.util.ArrayList;
import java.util.Random;

public class PuzzleJava {
    public ArrayList<Integer> getTenRolls() {
        ArrayList<Integer> list = new ArrayList<Integer>();
        Random rand = new Random();
        int i = 0;
        while (i < 10) {
            list.add(rand.nextInt(20) + 1);
            i++;
        }
        return list;
    }
    public char getRandomLetter() {
        Random rand = new Random();
        ArrayList<Character> list = new ArrayList<Character>();
        for(int i = 97; i <= 122; i++) {
            list.add((char)i);
        }
        return list.get(rand.nextInt(26));
    }
    public String generatePassword() {
        int i = 0;
        String password = "";
        while (i < 8) {
            password += getRandomLetter();
            i++;
        }
        return password;
    }
    public ArrayList<String> getNewPasswordSet(int len) {
        ArrayList<String> list = new ArrayList<String>();

        for( int i = 0; i < len; i++) {
            list.add(generatePassword());
        }
        return list;
    }
    public void shuffleArray(int[] arr) {
        Random rand = new Random();
        int len = arr.length;

        for (int i = 0; i < len; i++) {
            int randIdx = rand.nextInt(len);
            while(randIdx == i) {
                randIdx = rand.nextInt(len);
            }
            int temp = arr[i];
            arr[i] = arr[randIdx];
            arr[randIdx] = temp;
        }
    }
}