import java.util.Scanner;

class NumberFormatDemo {

    public static void convertToNumber(String text) {
        try {
            int num = Integer.parseInt(text);
            System.out.println("Number: " + num);
        } catch (NumberFormatException e) {
            System.out.println("Invalid number format!");
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number: ");
        String input = sc.next();

        convertToNumber(input);
    }
}
