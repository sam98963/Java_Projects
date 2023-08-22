package NumberGuesser;
import java.util.*;

public class NumberGuesser {
  
  private String username;
  private int guess;
  private int answer;
  private int attempts;
  private boolean outOfGuesses;
  private Random random;
  private Scanner scanner;

  public NumberGuesser(){
    this.username = "";
    this.guess = 0;
    this.random = new Random();
    this.answer = 0;
    this.attempts = 0;
    this.outOfGuesses = false;
    this.scanner = new Scanner(System.in);
  }

  public void getUsernameInput(){
    System.out.print("Hello player, what is your name?\n\n");  
    this.username = this.scanner.next();
    System.out.print("\nHello, " + this.username + ". \n\nLets play a game.\n\n");
  }

  public void generateRandomNumber(){
    // random number between 0-9
    int randomNumber = random.nextInt(10);
    // we want guesses between 1-10
    this.answer = randomNumber + 1;
  }

  public void getUserGuess(){
    System.out.print("Guess a number between 1 and 10!\n\n");
    this.guess = this.scanner.nextInt();
    this.attempts++;
  }
}