// Create a public class 
public class Calculator {
  /*
  ** A Basic Calculator
  ** In this project, you will use classes, methods, and    objects to create a simple arithmetic calculator.
  */

  // create a calculator constructor
  public Calculator(){
  }

  // create a public method called add and return int and takes TW0 parameters
  public int add(int a, int b) {
    return a + b;
  }

  public int subtract(int a, int b) {
    return a - b;
  }

  public int multiply(int a, int b) {
    return a * b;
  }

  public int divide(int a, int b) {
    return a / b;
  }

  public int modulo(int a, int b) {
    return a % b;
  }

  // create a main method
  public static void main(String[] args) {
    // create a Calculator object c
    Calculator myCalculator = new Calculator();
    
    System.out.println(myCalculator.add(5, 7));
    System.out.println(myCalculator.subtract(45, 11));
    System.out.println(myCalculator.multiply(5,7));
    System.out.println(myCalculator.divide(5,7));
    System.out.println(myCalculator.modulo(5,7));
  }
}