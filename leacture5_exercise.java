import java.util.Scanner;

public class leacture5_exercise {
    public static void main(String[] args) {
        // Display prime numbers
        System.out.println("First 50 prime numbers:");
        displayPrimeNumbers();

        // Find greatest common divisor
        System.out.println("\nFind the greatest common divisor of two numbers:");
        findGCD();

        // Calculate tuition
        calculateTuition();

        // Check palindrome
        checkPalindrome();
    }

    public static void displayPrimeNumbers() {
        int numberOfPrimes = 0;
        int number = 2;
        while (numberOfPrimes < 50) {
            if (isPrime(number)) {
                System.out.print(number + " ");
                numberOfPrimes++;
                if (numberOfPrimes % 10 == 0) {
                    System.out.println();
                }
            }
            number++;
        }
    }

    public static boolean isPrime(int number) {
        for (int divisor = 2; divisor <= Math.sqrt(number); divisor++) {
            if (number % divisor == 0) {
                return false;
            }
        }
        return true;
    }

    public static void findGCD() {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter first integer: ");
        int num1 = input.nextInt();

        System.out.print("Enter second integer: ");
        int num2 = input.nextInt();

        int gcd = gcd(num1, num2);

        System.out.println("The greatest common divisor for " + num1 + " and " + num2 + " is " + gcd);
    }

    public static int gcd(int num1, int num2) {
        if(num2 == 0){
            return num1;
        } else {
            return gcd(num2, num1 % num2);
        }
    }


    public static void calculateTuition() {
        double tuition = 10000; // initial tuition
        double rate = 0.07; // increase rate per year
        int year = 0; // count of years

        // Loop until tuition gets doubled
        while (tuition < 20000) {
            tuition += tuition * rate; // increase the tuition by the rate
            year++; // increment the year
        }
        
        // After the loop, tuition will be more than or equal to 20000
        // and year will be the number of years it took to double
        System.out.printf("Tuition will be doubled in %d years\n", year);
        System.out.printf("Tuition will be $%.2f in %d years\n", tuition, year);
    }

    public static void checkPalindrome() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("\nEnter a string:");
        String inputString = scanner.nextLine();
        String lowerCaseString = inputString.toLowerCase();
        if (isPalindrome(lowerCaseString)) {
            System.out.println(inputString + " is a palindrome.");
        } else {
            System.out.println(inputString + " is not a palindrome.");
        }
    }

    public static boolean isPalindrome(String s) {
        int i = 0;
        int j = s.length() - 1;
        while (i < j) {
            if (s.charAt(i) != s.charAt(j)) {
                return false;
            }
            i++;
            j--;
        }
        return true;
    }
}
