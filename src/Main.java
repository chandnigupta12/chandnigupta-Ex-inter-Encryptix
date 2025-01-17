import java.util.Random;
import java.util.random.RandomGenerator;
import java.util.Scanner;

class Game {
    public int number;
    public int inputNumber;
    public int noOfGuesses = 0;

    public int getNoOfGuesses() {
        return noOfGuesses;
    }

    public void setNoOfGuesses(int noOfGuesses) {
        this.noOfGuesses = noOfGuesses;
    }

    Game() {
        Random ran = new Random();
        this.number = ran.nextInt(100);
    }

    void takeUserInput() {
        System.out.println("Gess the Number");
        Scanner sc = new Scanner(System.in);
        inputNumber = sc.nextInt();
    }

    boolean isCorrectNumber() {
        noOfGuesses++;
        if (inputNumber == number) {
            System.out.format("Yes you guessed it right, it was %d\nYou guessed it in %d attempts", number, noOfGuesses);
            return true;
        } else if (inputNumber > number) {
            System.out.println("Too High.......");
        } else if (inputNumber < number) {
            System.out.println("Too Low.......");
        }
        return false;

    }


}
public class Main{
    public static void main(String[] args){
        Game g = new Game();
        boolean b=false;
        while (!b){
            g.takeUserInput();
            b= g.isCorrectNumber();
        }
    }
}




