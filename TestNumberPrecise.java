//import API
import java.util.Scanner;

//Declare the class Name
public class TestNumberPrecise{

  //Make the computer to recognize the main class
  public static void main(String[] args){

    //Create a scanner named scanner
    Scanner scanner = new Scanner(System.in);

    //Aske the first and second number the user want to calculate
    System.out.print("Please Enter The First Number You Want To Calculate:");
    String number1 = scanner.next();
    System.out.print("Please Enter The First Number You Want To Calculate:");
    String number2 = scanner.next();

    //New the object "numberPrecise" with constructor number1 and number2
    NumberPrecise numberPrecise = new NumberPrecise(number1,number2);

    //Ask which function does the user want to use
    System.out.print("Please choose the function below you want to use.\n(a)Add (b)Subtract (c)Multiply (d)Divide\n");
    char function = (scanner.next()).charAt(0);

    //Declare decimalpoint to make it useable later
    int decimalpoint;

    //Make the program to distinguish the function type
    switch(function){
      //Funcion A add Funcion
      case 'a':
        numberPrecise.addNumber();
        break;
      case 'A':
        numberPrecise.addNumber();
        break;

      //Function B subtract Function
      case 'b':
        numberPrecise.subtractNumber();
        break;
      case 'B':
        numberPrecise.subtractNumber();
        break;

      //Function C multiply Function
      case 'c':
        numberPrecise.multiplyNumber();
        break;
      case 'C':
        numberPrecise.multiplyNumber();
        break;

      //Function D divide Function
      case 'd':
        //Ask how much digit did user want to print after Decimal Point
        System.out.print("How many digit did you want to know after Decimal Point?");
        //Scan how much did the user input
        decimalpoint = scanner.nextInt();

        //If the user input 0 or less than 0 just divide them
        if(decimalpoint<=0)
          numberPrecise.divideNumber();

        //If the user input more than 0, the condition must be created in other program
        else{
          //set decimal point before using
          numberPrecise.setdecimalpoint(decimalpoint);
          //divide two number
          numberPrecise.divideNumber();
        }
        break;
      case 'D':
        //Same as above
        System.out.print("How many digit did you want to know after Decimal Point?");
        decimalpoint = scanner.nextInt();
        if(decimalpoint<=0)
          numberPrecise.divideNumber();
        else{
          numberPrecise.setdecimalpoint(decimalpoint);
          numberPrecise.divideNumber();
        }
        break;

      //None of the right function code did user input
      default:
        System.out.println("Error input.");
    }
  }
}
