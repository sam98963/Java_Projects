package TextConverter;
import java.util.*;
public class TextConverter {
  private String inputText;
  private String convertedText;
  private int converterValue;
  private Scanner scanner;


  public TextConverter(){
    this.inputText = "";
    this.convertedText = "";
    this.converterValue = 0;
    this.scanner = new Scanner(System.in);
  }

  public void initialiseAppGetTextInput(){
    System.out.print("Welcome to Sam's Text Converter\n");
    System.out.print("Please enter your text\n");
    this.inputText = this.scanner.next();
    System.out.print("Here are the possible text-conversion formats:\n");
    System.out.print("1. camelCase\n");
    System.out.print("2. PascalCase\n");
    System.out.print("3. snake_case\n");
    System.out.print("4. MACRO_CASE\n");
    System.out.print("5. kebab-case\n");
    System.out.print("6. Train-Case\n");   
    System.out.print("Which would you like, please enter a number.\n");
    this.converterValue = this.scanner.nextInt();
  }


  public void validateConversionInput (){
    if(this.converterValue < 3){
      // Call joined function
    } if (this.converterValue > 2 && this.converterValue < 5){
      // Call "_" joined function
    } else {
      // Call "-" joined function
    }
  }
  public static void main(String[] args) {
    TextConverter converter = new TextConverter();
    converter.initialiseAppGetTextInput();
}
}

