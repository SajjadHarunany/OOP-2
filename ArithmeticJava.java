package Arithmetic;
// Java program to demonstrates handling
// the exception using try-catch block
    import java.io.*;
    class ArithmeticJava {
        public static void main(String[] args)
        {
            int number1 = 300;
            int number2 = 0;
            try {

                int answer = number1/number2;
                System.out.println("Answer: " + answer);
            }
            catch (ArithmeticException e) {
                // Handling the exception
                System.out.println(
                    "Error: Division by zero is not allowed!");
            }
            finally {
                System.out.println(
                    "Program continues after handling the exception.");
            }
        }
}
