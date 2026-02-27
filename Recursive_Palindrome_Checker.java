import java.util.Scanner;

public class UseCase11PalindromeCheckerApp {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a string: ");
        String input = scanner.nextLine();

        // Create service object
        Object_Oriented_Palindrome_Service service =
                new Object_Oriented_Palindrome_Service();

        boolean result = service.checkPalindrome(input);

        if (result) {
            System.out.println("Palindrome: YES");
        } else {
            System.out.println("Palindrome: NO");
        }

        scanner.close();
    }
}

class Object_Oriented_Palindrome_Service {

    public boolean checkPalindrome(String input) {

        int start = 0;
        int end = input.length() - 1;

        while (start < end) {
            if (input.charAt(start) != input.charAt(end)) {
                return false;
            }
            start++;
            end--;
        }

        return true;
    }
}
