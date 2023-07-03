import java.util.Scanner;

public class Lecture3_exercise {
    public static void main(String[] args) {
        int winning_number = (int) (Math.random() * 90) + 10;

        // 随机生成两位数的中奖号码
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a two-digit number: ");
        int lottery_pick_num = input.nextInt();
        input.close();
        // 让用户输入一个两位数
        int winning_number1 = winning_number / 10;
        int winning_number2 = winning_number % 10;
        int lottery_pick_num1 = lottery_pick_num / 10;
        int lottery_pick_num2 = lottery_pick_num % 10;

        System.out.println("Lottery number is: " + winning_number);

        if (lottery_pick_num == winning_number) {
            System.out.println("Exact match: you win $10,000");
        } else if ((lottery_pick_num1 == winning_number2 && lottery_pick_num2 == winning_number1) ||
                (lottery_pick_num1 == winning_number1 && lottery_pick_num2 == winning_number2)) {
            System.out.println("Match all digits: you win $3,000");
        } else if (lottery_pick_num1 == winning_number1 || lottery_pick_num1 == winning_number2 ||
                lottery_pick_num2 == winning_number1 || lottery_pick_num2 == winning_number2) {
            System.out.println("Match one digit: you win $1,000");
        } else {
            System.out.println("Sorry, no match");
        }
    }
}
