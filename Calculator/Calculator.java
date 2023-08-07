package Java_Projects.Calculator;
import java.util.*;  

public class Calculator {
  public static void main(String[] args){
    Scanner scanner = new Scanner(System.in);
    System.out.print("Enter first number- ");  
    int firstInputValue = scanner.nextInt(); 
    System.out.print("Enter second number- "); 
    int secondInputValue = scanner.nextInt();
    int result = firstInputValue + secondInputValue;
    System.out.print("Result:" + result);
  }
}
