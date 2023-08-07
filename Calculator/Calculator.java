package Java_Projects.Calculator;
import java.util.*;  

public class Calculator {
  public static void main(String[] args){
    Scanner scanner = new Scanner(System.in);
    System.out.print("Enter first number- ");  
    int firstInputValue = scanner.nextInt(); 
    System.out.print("Enter second number- "); 
    int secondInputValue = scanner.nextInt();
    System.out.print("Enter an operator: +, -, * or / ");
    String operatorString = scanner.next();
    char operator = operatorString.charAt(0);
    double result = 0;
    if (operator == '+')
    {
      result = (double)firstInputValue + secondInputValue;
    }
    else if (operator == '-')
    {
      result = (double)firstInputValue - secondInputValue;
    }
    else if (operator == '*')
    {
      result = (double)firstInputValue * secondInputValue;
    }
    else if (operator == '/')
    {
      result = (double)firstInputValue / secondInputValue;;
    }
    else
    {
        System.out.print("You entered an invalid operator, only + - / * are supported");
    }

    System.out.print("Result:" + result);
  }
}
