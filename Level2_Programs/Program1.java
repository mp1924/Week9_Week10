import java.util.Scanner;

class StringLengthManual {

    public static int findLength(String text) {
        int count = 0;

        try {
            while (true) {
                text.charAt(count);
                count++;
            }
        } catch (Exception e) {
            return count;
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter text: ");
        String text = sc.next();

        int manual = findLength(text);
        int builtin = text.length();

        System.out.println("Manual length: " + manual);
        System.out.println("Built-in length: " + builtin);
    }
}
