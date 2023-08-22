package Calculator;
import java.util.*;  

public class Calculator {
  private int firstInputValue;
  private int secondInputValue;
  private char operator;
  private double result;


      // Constructor function that initialises the objects state and sets initial values of variables for this instance.
    public Calculator(){
    this.firstInputValue = 0;
    this.secondInputValue = 0;
    this.operator = ' ';
    this.result = 0.0;
    }

    // Method that prompts user input, reads values and stores to instance variables.

    public void getInputValues(){
      Scanner scanner = new Scanner(System.in);
      System.out.print("Enter first number- ");  
      this.firstInputValue = scanner.nextInt(); 
      System.out.print("Enter second number- "); 
      this.secondInputValue = scanner.nextInt();
      System.out.print("Enter an operator: +, -, * or / ");
      this.operator = scanner.next().charAt(0);
      scanner.close();
    }

     // Method that compares operator in switch case - performs relevant calculation and updates result variable.

    public void calculate() {
      switch (this.operator) {
          case '+':
              this.result = (double) this.firstInputValue + this.secondInputValue;
              break;
          case '-':
              this.result = (double) this.firstInputValue - this.secondInputValue;
              break;
          case '*':
              this.result = (double) this.firstInputValue * this.secondInputValue;
              break;
          case '/':
              this.result = (double) this.firstInputValue / this.secondInputValue;
              break;
          default:
              System.out.println("You entered an invalid operator. Only +, -, *, and / are supported.");
              break;
      }
  }

   // Method that prints result to terminal

  public void displayResult() {
    System.out.println("Result: " + this.result);
  }

   // Main method calls a new instance of the Calculator class, it then calls each method in order using the user input prompted in getInputValues to Calculate and print the result.
  public static void main(String[] args) {
    Calculator calculator = new Calculator();
    calculator.getInputValues();
    calculator.calculate();
    calculator.displayResult();
  }
}
