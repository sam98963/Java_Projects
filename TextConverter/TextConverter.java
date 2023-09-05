package TextConverter;
import java.util.*;
public class TextConverter {
  private String inputText;
  private String convertedText;
  private int converterValue;
  private Scanner scanner;
  private StringBuilder stringBuilder;


  public TextConverter(){
    this.inputText = "";
    this.convertedText = "";
    this.converterValue = 0;
    this.scanner = new Scanner(System.in);
    this.stringBuilder = new StringBuilder("");
  }

  public void initialiseAppGetTextInput(){
    System.out.print("Welcome to Sam's Text Converter\n");
    System.out.print("Please enter your text\n");
    this.inputText = this.scanner.nextLine();
    System.out.print("Here are the possible text-conversion formats:\n");
    System.out.print("1. camelCase\n");
    System.out.print("2. PascalCase\n");
    System.out.print("3. snake_case\n");
    System.out.print("4. MACRO_CASE\n");
    System.out.print("5. kebab-case\n");
    System.out.print("6. Train-Case\n");   
    System.out.print("7. mEme cASe\n");   
    System.out.print("Which would you like, please enter a number.\n");
    this.converterValue = this.scanner.nextInt();
  }


  public void validateConversionInput (){
      switch(this.converterValue){
        case 1: this.convertedText = convertCamelCase();
        break;
        
        case 2: this.convertedText = convertPascalCase();
        break;

        case 3: this.convertedText = convertSnakeCase();
        break;

        case 4: this.convertedText = convertSnakeCase().toUpperCase();
        break;

        case 5: this.convertedText = convertKebabCase();
        break;

        case 6: this.convertedText = convertTrainCase();
        break;

        case 7: this.convertedText = convertMemeCase();
        break;
      }
      System.out.print(this.convertedText);
  }

  public String convertCamelCase(){
    String[] textSplit = this.inputText.split(" ");

    this.stringBuilder.append(textSplit[0]);
    for(int i = 1; i<textSplit.length; i++){
      String currentWord = textSplit[i];
      String currentWordCapitalised = Character.toUpperCase(currentWord.charAt(0)) + currentWord.substring(1);
      this.stringBuilder.append(currentWordCapitalised);
    }
    return this.stringBuilder.toString();
  }

  public String convertPascalCase(){
    String[] textSplit = this.inputText.split(" ");

    for(int i = 0; i<textSplit.length; i++){
      String currentWord = textSplit[i];
      String currentWordCapitalised = Character.toUpperCase(currentWord.charAt(0)) + currentWord.substring(1);
      this.stringBuilder.append(currentWordCapitalised);
    }
    return this.stringBuilder.toString();
  }

  public String convertSnakeCase(){
    String[] textSplit = this.inputText.split(" ");

    for(int i = 0; i<textSplit.length; i++){
      String currentWord = textSplit[i];
      String currentWordCapitalised = Character.toLowerCase(currentWord.charAt(0)) + currentWord.substring(1);
      if(i < textSplit.length - 1){
        currentWordCapitalised += "_";
      }
      this.stringBuilder.append(currentWordCapitalised);
    }
    return this.stringBuilder.toString();
  }

  public String convertKebabCase(){
    String[] textSplit = this.inputText.split(" ");
    for(int i = 0; i<textSplit.length; i++){
      String currentWord = textSplit[i];
      String currentWordCapitalised = Character.toLowerCase(currentWord.charAt(0)) + currentWord.substring(1);
      if(i < textSplit.length - 1){
        currentWordCapitalised += "-";
      }
      this.stringBuilder.append(currentWordCapitalised);
    }
    return this.stringBuilder.toString();
  }

  public String convertTrainCase(){
    String[] textSplit = this.inputText.split(" ");
    for(int i = 0; i<textSplit.length; i++){
      String currentWord = textSplit[i];
      String currentWordCapitalised = Character.toUpperCase(currentWord.charAt(0)) + currentWord.substring(1);
      if(i < textSplit.length - 1){
        currentWordCapitalised += "-";
      }
      this.stringBuilder.append(currentWordCapitalised);
    }
    return this.stringBuilder.toString();
  }

  public String convertMemeCase(){
    
    String[] textSplit = this.inputText.split(" ");
    
    for(int i = 0; i<textSplit.length; i++){
      
      String[] wordSplit = textSplit[i].split("");
      StringBuilder memeCaseWord = new StringBuilder();

      for(int j = 0; j<wordSplit.length; j++){
        
        int chance = (Math.random() <= 0.3) ? 1 : 2;
        boolean upperTrue = j%chance != 0;
        char character = wordSplit[j].charAt(0);

          if (upperTrue) {
            memeCaseWord.append(Character.toUpperCase(character));
        } else {
            memeCaseWord.append(Character.toLowerCase(character));
        }
      }

      this.stringBuilder.append(memeCaseWord.toString());

        if (i < textSplit.length - 1) {
          this.stringBuilder.append(" "); // Add a space between words
      }
    }
    return this.stringBuilder.toString();
  }

  public static void main(String[] args) {
    TextConverter converter = new TextConverter();
    converter.initialiseAppGetTextInput();
    converter.validateConversionInput();
}
}

