import java.util.Scanner;

public class HelloWorld {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int rangeStart = 1;
        int rangeEnd = 8;
        int guessTotal = 5;

        while (true) {
            // generate random nums
            int mod = rangeEnd - rangeStart;
            if (rangeStart<0 || rangeEnd <0) {
                System.out.println("Error: must start/end with pos int");
            }
            if (mod <= 1){
                System.out.println("Wrong range: (" + rangeStart +", "+rangeEnd+")");
            }
            int bigRandom = (int) (Math.random()*rangeEnd*100);
            int numberToGuess = (bigRandom%mod) + rangeStart;
            if (numberToGuess <= rangeStart) {
                numberToGuess = rangeStart + 1;
            } else if (numberToGuess > rangeEnd){
                numberToGuess = rangeEnd -1;
            }


        }
    }
}
