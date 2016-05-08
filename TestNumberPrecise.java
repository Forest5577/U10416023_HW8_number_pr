//import API
import java.util.Scanner;

public class TestNumberPrecise{

  public static void main(String[] args){

    Scanner scanner = new Scanner(System.in);

    System.out.print("\nPlease Enter The First Number You Want To Calculate:");
    String number1 = scanner.next();
    System.out.print("\nPlease Enter The First Number You Want To Calculate:");
    String number2 = scanner.next();

    NumberPrecise numberPrecise = new NumberPrecise(number1,number2);

    System.out.print("\nPlease choose what function you want to use:\n(a)Add (b)Subtract (c)Multiply (d)Divide");
    Char function = input.next();

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
        System.out.print("\nHow many digit did you want to know after Decimal Point?");
        int decimalpoint = input.nextInt();
        if(decimalpoint<=0)
          numberPrecise.divideNumber();
        else{
          numberPrecise.setdecimalpoint(decimalpoint);
          numberPrecise.divideNumber();
        }
        break;
      case 'D':
        System.out.print("\nHow many digit did you want to know after Decimal Point?");
        int decimalpoint = input.nextInt();
        if(decimalpoint<=0)
          numberPrecise.divideNumber();
        else{
          numberPrecise.setdecimalpoint(decimalpoint);
          numberPrecise.divideNumber();
        }
        break;
      default:
        System.out.println("\nError input.");
    }
  }
}
