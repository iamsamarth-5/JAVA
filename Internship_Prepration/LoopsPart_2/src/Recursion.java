public class Recursion {
    public static void main(String[] args) {
       // printNumbersRecursive(5);
        int result=fibonacci(5);
        System.out.println("Result is " + result);


    }
    public static void printNumbersRecursive(int number) {
        //
        if (number == 0)
            return;
        //work or logic

        number = number - 1;
        System.out.println("Before recursive call number: " + number);
        //Recursive call
        printNumbersRecursive(number);
        //This code execute after the function
        System.out.println("After the recursive call number:" + number);
    }
    public static int fibonacci(int number)
    {
        if(number <=1)
            return number;
        return fibonacci(number-1) + fibonacci(number-2);
    }
}
