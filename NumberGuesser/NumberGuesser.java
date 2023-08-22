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
}