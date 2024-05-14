public class Fibonacci {
    public static void main(String[] args) {
        int limit = 10; // Specify the limit for Fibonacci numbers
        generateFibonacci(limit);
    }
    
    // Function to generate Fibonacci numbers up to the specified limit
    public static void generateFibonacci(int limit) {
        int num1 = 0, num2 = 1;
        
        System.out.println("Fibonacci numbers up to " + limit + ":");
        
        while (num1 <= limit) {
            System.out.print(num1 + " ");
            int sum = num1 + num2;
            num1 = num2;
            num2 = sum;
        }
    }
}

