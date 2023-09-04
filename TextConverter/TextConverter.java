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
    this.inputText = this.scanner.nextLine();
    System.out.print("Here are the possible text-conversion formats:\n");
    System.out.print("1. camelCase\n 2. PascalCase\n 3. snake_case\n 4. MACRO_CASE\n 5. kebab-case\n 6. Train-Case\n");
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
      convertCamelCase();
    } if (this.converterValue > 2 && this.converterValue < 5){
      // Call "_" joined function
    } else {
      // Call "-" joined function
    }
  }

  public void convertCamelCase(){
    String[] textSplit = this.inputText.split(" ");

    StringBuilder camelCaseText = new StringBuilder(textSplit[0]);
    for(int i = 1; i<textSplit.length; i++){
      String currentWord = textSplit[i];
      String currentWordCapitalised = Character.toUpperCase(currentWord.charAt(0)) + currentWord.substring(1);
      camelCaseText.append(currentWordCapitalised);
    }
    this.convertedText = camelCaseText.toString();
    System.out.print(this.convertedText);
  }

  public static void main(String[] args) {
    TextConverter converter = new TextConverter();
    converter.initialiseAppGetTextInput();
    converter.validateConversionInput();
}
}

