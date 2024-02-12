import java.util.Scanner;

public class DATA_TYPE_AND_VARIABLE_UNDERSTANDING {
        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);

            System.out.print("Enter the number of test cases: ");
            int numTestCases = scanner.nextInt();

            for (int t = 0; t < numTestCases; t++) {
                long input = scanner.nextLong();

                System.out.println(input + " can be fitted in:");
                if (input >= Byte.MIN_VALUE && input <= Byte.MAX_VALUE) {
                    System.out.println("* byte");
                }
                if (input >= Short.MIN_VALUE && input <= Short.MAX_VALUE) {
                    System.out.println("* short");
                }
                if (input >= Integer.MIN_VALUE && input <= Integer.MAX_VALUE) {
                    System.out.println("* int");
                }
                if (input >= Long.MIN_VALUE && input <= Long.MAX_VALUE) {
                    System.out.println("* long");
                }
                if (input < Byte.MIN_VALUE || input > Long.MAX_VALUE) {
                    System.out.println(input + " can't be fitted anywhere.");
                }
            }

            scanner.close();
        }
}

