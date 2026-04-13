import java.util.Scanner;

class UpperCaseConversion {

    public static String toUpperManual(String text) {
        String result = "";

        for (int i = 0; i < text.length(); i++) {
            char ch = text.charAt(i);

            if (ch >= 'a' && ch <= 'z') {
                ch = (char)(ch - 32);
            }
            result += ch;
        }
        return result;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter text: ");
        String text = sc.nextLine();

        String manual = toUpperManual(text);
        String builtin = text.toUpperCase();

        System.out.println("Manual: " + manual);
        System.out.println("Built-in: " + builtin);
    }
}
