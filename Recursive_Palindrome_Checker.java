import java.util.Scanner;

    public class Recursive_Palindrome_Checker {
        public static void main(String[] args) {

            Scanner scanner = new Scanner(System.in);

            System.out.print("Enter a string: ");
            String input = scanner.nextLine();

            // Normalize string (remove spaces, convert to lowercase)
            String processed = input.replaceAll("\\s+", "").toLowerCase();

            boolean result = check(processed, 0, processed.length() - 1);

            if (result) {
                System.out.println("The given string is a Palindrome.");
            } else {
                System.out.println("The given string is NOT a Palindrome.");
            }

            scanner.close();
        }
        private static boolean check(String s, int start, int end) {

            // Base condition
            if (start >= end) {
                return true;
            }

            // Mismatch condition
            if (s.charAt(start) != s.charAt(end)) {
                return false;
            }

            // Recursive call
            return check(s, start + 1, end - 1);
        }
    }

