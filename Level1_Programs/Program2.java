import java.util.Scanner;

class SubstringCharAt {

    public static String createSubstring(String text, int start, int end) {
        String result = "";

        for (int i = start; i < end; i++) {
            result += text.charAt(i);
        }
        return result;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter text: ");
        String text = sc.next();

        System.out.print("Enter start index: ");
        int start = sc.nextInt();

        System.out.print("Enter end index: ");
        int end = sc.nextInt();

        String manual = createSubstring(text, start, end);
        String builtin = text.substring(start, end);

        System.out.println("Manual: " + manual);
        System.out.println("Built-in: " + builtin);
    }
}
