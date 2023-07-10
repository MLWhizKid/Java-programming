import java.util.Scanner;

public class lecture4_exercise {
    public static void main(String[] args) {
        System.out.println("Exercise_4.1");
        Scanner input = new Scanner(System.in);

        System.out.print("Enter a decimal value (0 to 15): ");
        int number = input.nextInt();

        String hexNumber;
        if (number >= 0 && number <= 15) {
            hexNumber = Integer.toHexString(number).toUpperCase();
            System.out.println("The hex value is " + hexNumber);
        } else {
            hexNumber = number + " is an invalid input";
            System.out.println(hexNumber);
        }

        System.out.println("----------------------------------------------Exercise_4.2");
        System.out.print("Enter the length from the center of the pentagon to the vertex: ");
        double r = input.nextDouble();input.nextLine();
        double s = 2 * r * Math.sin(Math.PI / 5);
        double numerator = 5 * (s * s);
        double denominator = 4 * Math.tan(Math.PI / 5);
        double area = numerator / denominator;
        System.out.printf("The area of the pentagon is: %.4f\n", area);

        System.out.println("----------------------------------------------Exercise_4.3");
        System.out.print("Enter a letter: ");
        String userInput = input.nextLine().toLowerCase();

        if (userInput.length() != 1 || !Character.isLetter(userInput.charAt(0))) {
            System.out.println("Invalid input.");
        } else {
            char letter = userInput.charAt(0);
            letter = Character.toLowerCase(letter);
            boolean isVowel = (letter == 'a' || letter == 'e' || letter == 'i' || letter == 'o' || letter == 'u');
            
            if (isVowel) {
                System.out.println("The letter " + letter + " is a vowel.");
            } else {
                System.out.println("The letter " + letter + " is a consonant.");
            }
        }

        System.out.println("----------------------------------------------Exercise_4.4-1");
        
        System.out.print("Enter the first city: ");
        String city1 = input.nextLine();

        System.out.print("Enter the second city: ");
        String city2 = input.nextLine();

        System.out.print("Enter the third city: ");
        String city3 = input.nextLine();

        if (city1.compareTo(city2) > 0) {
            String temp = city1;
            city1 = city2;
            city2 = temp;
        }

        if (city2.compareTo(city3) > 0) {
            String temp = city2;
            city2 = city3;
            city3 = temp;
        }

        if (city1.compareTo(city2) > 0) {
            String temp = city1;
            city1 = city2;
            city2 = temp;
        }

        System.out.println("The cities in ascending order are: " + city1 + ", " + city2 + ", " + city3);
        
        System.out.println("----------------------------------------------Exercise_4.4-2");
        
        System.out.print("Enter two characters (major and status): ");
        String S = input.nextLine();

        boolean validInput = true;

        if (userInput.length() != 2 || !Character.isLetter(userInput.charAt(0)) || !Character.isDigit(userInput.charAt(1))) {
            System.out.println("Invalid input");
            validInput = false;
        }

        if (validInput) {
            char majorCode = userInput.charAt(0);
            majorCode = Character.toUpperCase(majorCode);
            char statusChar = userInput.charAt(1);

            String major = "";
            String status = "";

            if (majorCode == 'M') {
                major = "Mathematics";
            } else if (majorCode == 'C') {
                major = "Computer Science";
            } else if (majorCode == 'I') {
                major = "Information Technology";
            } else {
                System.out.println("Invalid input");
                validInput = false;
            }

            if (statusChar == '1') {
                status = "Freshman";
            } else if (statusChar == '2') {
                status = "Sophomore";
            } else if (statusChar == '3') {
                status = "Junior";
            } else if (statusChar == '4') {
                status = "Senior";
            } else {
                System.out.println("Invalid input");
                validInput = false;
            }

            if (validInput) {
                System.out.println("Major: " + major);
                System.out.println("Status: " + status);
            }
        }
    }

    
    }

