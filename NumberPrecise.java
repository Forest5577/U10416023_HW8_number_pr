//import API
import java.math.*;

//Declare the class name
public class NumberPrecise{

  //Create the variable that can contain decimalpoint
  int decimalpoint = 0;

  //Declare the variable typed BigDecimal named number1 & number2
  BigDecimal number1;
  BigDecimal number2;

  //No argument constructor
  public NumberPrecise(){

  }

  //The constructor can be inherited from main class
  public NumberPrecise(String number1, String number2){
    setNumber1(number1);
    setNumber2(number2);
  }

  //Transform the number to BigDecimal
  public void setNumber1(String number){
    this.number1 = new BigDecimal(number);
  }

  public void setNumber2(String number){
    this.number2 = new BigDecimal(number);
  }

  //Get the decimalpoint from main class
  public void setdecimalpoint(int decimalpoint){
    this.decimalpoint = decimalpoint;
  }

  //Add two number together
  public void addNumber(){
    System.out.println(number1.add(number2));
  }

  //Subtract two number
  public void subtractNumber(){
    System.out.println(number1.subtract(number2));
  }

  //Multiply two number
  public void multiplyNumber(){
    System.out.println(number1.multiply(number2));
  }

  //Divide two number
  public void divideNumber(){
    System.out.println(number1.divide(number2,decimalpoint,BigDecimal.ROUND_HALF_UP));
  }
}
