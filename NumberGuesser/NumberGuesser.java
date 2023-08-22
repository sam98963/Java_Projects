package NumberGuesser;
import java.util.*;

public class NumberGuesser {
  
  public static final String ANSI_PURPLE = "\u001B[35m";
  public static final String ANSI_RED = "\u001B[31m";
  public static final String ANSI_GREEN = "\u001B[32m";
  public static final String ANSI_CYAN = "\u001B[36m";
  public static final String ANSI_YELLOW = "\u001B[33m";
  public static final String ANSI_RESET = "\u001B[0m";
  public static final String ANSI_RED_BOLD = "\033[1;31m";
  public static final String ANSI_GREEN_BOLD = "\033[1;32m";

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
    System.out.print(ANSI_PURPLE + "Hello player, what is your name?\n\n" + ANSI_RESET);  
    this.username = this.scanner.next();
    System.out.print(ANSI_CYAN + "\nHello, " + ANSI_YELLOW + this.username +   "." + ANSI_CYAN + "\n\nLets play a game.\n\n" + ANSI_RESET);
  }

  public void generateRandomNumber(){
    // random number between 0-9
    int randomNumber = random.nextInt(10);
    // we want guesses between 1-10
    this.answer = randomNumber + 1;
  }

  public void validateNumberOfGuesses(){
    if(this.attempts > 2)
    this.outOfGuesses = true;
  }

  public void getUserGuess(){
    System.out.print(ANSI_PURPLE + "Guess a number between 1 and 10!\n\n" + ANSI_RESET);
    this.guess = this.scanner.nextInt();
    this.attempts++;
    validateNumberOfGuesses();
  }

  public void validateGameResult(){
    if (this.outOfGuesses)
      {
          System.out.print(ANSI_RED_BOLD + "\nYou Lose!");
      }
    else
      {
          System.out.print(ANSI_GREEN_BOLD + "\n\nYou Win!");
      }
  }

  public void getUserGuessWhileIncorrectAndWithinLimit(){
    while(!this.outOfGuesses && this.guess!=this.answer){
      if(this.attempts > 0){
        System.out.print(ANSI_RED + "\nWrong guess, try again.\n\n" + ANSI_RESET);
      }
      getUserGuess();
    }
  }

  public void game(){
    getUsernameInput();
    generateRandomNumber();
    getUserGuessWhileIncorrectAndWithinLimit();
    validateGameResult();
  }

  public static void main(String[] args) {
    NumberGuesser numberGuesser = new NumberGuesser();
    numberGuesser.game();
  }
}