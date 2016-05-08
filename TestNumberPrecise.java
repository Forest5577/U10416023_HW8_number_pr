//import API
import java.util.Scanner;

public class TestNumberPrecise{

  public static void main(String[] args){

    Scanner scanner = new Scanner(System.in);

    System.out.print("Please Enter The First Number You Want To Calculate:");
    String number1 = scanner.next();
    System.out.print("Please Enter The First Number You Want To Calculate:");
    String number2 = scanner.next();

    NumberPrecise numberPrecise = new NumberPrecise(number1,number2);

    System.out.print("Please choose the function below you want to use.\n(a)Add (b)Subtract (c)Multiply (d)Divide\n");
    char function = (scanner.next()).charAt(0);

    int decimalpoint;

    switch(function){
      case 'a':
        numberPrecise.addNumber();
        break;
      case 'A':
        numberPrecise.addNumber();
        break;
      case 'b':
        numberPrecise.subtractNumber();
        break;
      case 'B':
        numberPrecise.subtractNumber();
        break;
      case 'c':
        numberPrecise.multiplyNumber();
        break;
      case 'C':
        numberPrecise.multiplyNumber();
        break;
      case 'd':
        System.out.print("How many digit did you want to know after Decimal Point?");
        decimalpoint = scanner.nextInt();
        if(decimalpoint<=0)
          numberPrecise.divideNumber();
        else{
          numberPrecise.setdecimalpoint(decimalpoint);
          numberPrecise.divideNumber();
        }
        break;
      case 'D':
        System.out.print("How many digit did you want to know after Decimal Point?");
        decimalpoint = scanner.nextInt();
        if(decimalpoint<=0)
          numberPrecise.divideNumber();
        else{
          numberPrecise.setdecimalpoint(decimalpoint);
          numberPrecise.divideNumber();
        }
        break;
      default:
        System.out.println("Error input.");
    }
  }
}
