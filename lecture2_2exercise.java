import java.util.Scanner;

public class lecture2_2exercise {
    public static void main(String[] args) {

        try (Scanner input = new Scanner(System.in)) {
            // 输入半径的值
            // Enter the value of radius
            System.out.print("Enter the radius and length of a cylinder: ");
            double radius = input.nextDouble();
            // System.out.println("Enter the height of the cylinder: ");
            double height = input.nextDouble();
            // 计算面积
            // Calculated area
            final double PI = 3.1415926;
            double area = PI * radius * radius;
            double volume = PI * radius * radius * height;
            // 输出半径为radius的面积
            // Output the area of radius 'radius'34
            System.out.printf("The area of radius %.5f is : %.4f%n", radius, area);
            System.out.printf("The volume is : %.1f%n", volume);

            System.out.println("-----------------------------------\nEXERCISE 2.2");

            System.out.print("Enter the subtotal and gratuity rate: ");
            double subtotal = input.nextDouble();
            double gratuityrate = input.nextDouble();

            double gratuity = (gratuityrate / 100) * subtotal;
            double total = subtotal + gratuity;
            System.out.println("The gratuity is $ " + gratuity + " and total is $ " + total);

            System.out.println("-----------------------------------\nEXERCISE 2.3");

            System.out.print("Enter weight in pounds: ");
            double weight_pounds = input.nextDouble();
            System.out.print("Enter height in inches: ");
            double height_inches = input.nextDouble();
            // System.out.println("Enter the height of the cylinder: ");
            double weight_kg = weight_pounds * 0.45359237;
            double height_meters = height_inches * 0.0254;
            double bmi = weight_kg / (height_meters * height_meters);
            System.out.printf("BMI is %.4f%n", bmi);

            System.out.println("-----------------------------------\nEXERCISE 2.4");

            System.out.print("Enter the driving distance: ");
            double driving_distance = input.nextDouble();
            System.out.print("Enter miles per gallon: ");
            double miles_per_gallon = input.nextDouble();
            System.out.print("Enter price per gallon:");
            double price_per_gallon = input.nextDouble();

            double cost = (driving_distance / miles_per_gallon) * price_per_gallon;
            System.out.printf("The cost of driving is $%.2f%n", cost);

            System.out.println("-----------------------------------\nEXERCISE 2.5");
            System.out.print("Enter the Length of the side: ");
            double length_side = input.nextDouble();
            double area1 = (3 * Math.sqrt(3) / 2) * (length_side * length_side);
            System.out.printf(" The area of the hexagon is %.4f%n", area1);

            System.out.println("-----------------------------------\nEXERCISE 2.6");

            double month_deposit; // 先声明变量
            System.out.print("Enter the monthly saving amount: $");
            month_deposit = input.nextDouble(); // 接收用户输入的值
            
            // 输出用户输入的值

            double annual_IR = 0.05; // 年利率
            double monthly_IR = annual_IR / 12.0; // 月利率
            System.out.print("You want to check the value of your account in a few months :");
            int Months = input.nextInt(); // 连续计算的月数

            double value = 0.0; // 初始账户价值为0
            System.out.println("After the first month, the value in the account becomes");
            value = (value + month_deposit) * (1 + monthly_IR);
            System.out.printf("(%.2f + %.3f) * (1 + %.5f) = %.3f%n", month_deposit, value, monthly_IR, value);

            System.out.println("After the second month, the value in the account becomes");
            value = (value + month_deposit) * (1 + monthly_IR);
            System.out.printf("(%.2f + %.3f) * (1 + %.5f) = %.3f%n", month_deposit, value, monthly_IR, value);

            System.out.println("After the third month, the value in the account becomes");
            value = (value + month_deposit) * (1 + monthly_IR);
            System.out.printf("(%.2f + %.3f) * (1 + %.5f) = %.3f%n", month_deposit, value, monthly_IR, value);

            for (int i = 4; i <= Months; i++) {
                value = (value + month_deposit) * (1 + monthly_IR);
                System.out.printf("After the %dth month, the value in the account becomes%n", i);
                System.out.printf("(%.2f + %.3f) * (1 + %.5f) = %.3f%n", month_deposit, value, monthly_IR, value);
            }

        }

    }
}
