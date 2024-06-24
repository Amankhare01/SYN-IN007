public class task1 {

    public static boolean isPrime(int number) {
        if (number <= 1) {
            return false;
        }
        if (number == 2) {
            return true;
        }
        if (number % 2 == 0) {
            return false;
        }

        for (int i = 3; i <= Math.sqrt(number); i += 2) {
            if (number % i == 0) {
                return false;
            }
        }

        return true;
    }

    public static void main(String[] args) {
        int[] testNumbers = {1, 2, 3, 4, 5, 16, 17, 18, 19, 20, 23};

        for (int number : testNumbers) {
            System.out.println("Is " + number + " prime? " + isPrime(number));
        }
        java.util.Scanner scanner = new java.util.Scanner(System.in);
        System.out.print("Enter a number to check if it is prime: ");
        int userInput = scanner.nextInt();
        System.out.println("Is " + userInput + " prime? " + isPrime(userInput));
    }
}
