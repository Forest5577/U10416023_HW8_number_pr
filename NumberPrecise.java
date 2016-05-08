//import API
import java.math.*;

public class NumberPrecise{
  int decimalpoint = 0;
  
  BigDecimal number1;
  BigDecimal number2;

  public NumberPrecise(){

  }

  public NumberPrecise(String number1, String number2){
    setNumber1(number1);
    setNumber2(number2);
  }

  public void setNumber1(String number){
    this.number1 = new BigDecimal(number);
  }

  public void setNumber2(String number){
    this.number2 = new BigDecimal(number);
  }

  public void setdecimalpoint(int decimalpoint){
    this.decimalpoint = decimalpoint;
  }

  public void addNumber(){
    System.out.println(number1.add(number2));
  }

  public void subtractNumber(){
    System.out.println(number1.subtract(number2));
  }

  public void multiplyNumber(){
    System.out.println(number1.multiply(number2));
  }

  public void divideNumber(){
    System.out.println(number1.divide(number2,decimalpoint,BigDecimal.ROUND_HALF_UP));
  }
}
