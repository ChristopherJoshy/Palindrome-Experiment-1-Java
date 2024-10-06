package exp1;

import java.util.Scanner;

public class StringPalindrome {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Enter string: ");
        String input = scanner.nextLine();
        String processedString = input.replaceAll("\\s+", "").toLowerCase();
        String reversedString = new StringBuilder(processedString).reverse().toString();
        
        System.out.println("Reverse: " + new StringBuilder(input).reverse().toString());
        
        if (processedString.equals(reversedString)) {
            System.out.println(input + " is Palindrome");
        } else {
            System.out.println(input + " is not Palindrome");
        }
    }
}
