package Java_Projects.GuessingGame;
import java.util.*;

public class GuessingGame{
  private String answer;
  private String guess;
  private int attempts;
  private int attemptLimit;
  private boolean outOfGuesses;
  private Scanner scanner;

  public GuessingGame(){
    this.answer = "giraffe";
    this.guess = "";
    this.attempts = 0;
    this.attemptLimit = 3;
    this.outOfGuesses = false;
    this.scanner = new Scanner(System.in);
    }

  public void getGuessInput(){
    
    System.out.print("Enter your guess: ");  
    this.guess = this.scanner.next();
    this.attempts++;
  }

  public void validateResult(){
    if (this.outOfGuesses)
    {
        System.out.print("You Lose! ");
    }
    else
    {
        System.out.print("You Win!");
    }
  }


  public void game() {
   while(!this.guess.toLowerCase().equals(this.answer) && !this.outOfGuesses){
        if(this.attempts<this.attemptLimit){
          if(this.attempts > 0){
            System.out.print("Wrong guess, try again.\n");
          }
          getGuessInput();
        } else {
          this.outOfGuesses = true;
        }
      } validateResult(); 
}

public static void main(String[] args) {
  GuessingGame guessingGame = new GuessingGame();
  guessingGame.game();
}
}