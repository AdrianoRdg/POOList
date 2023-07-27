package palindrome;

public class Palindrome {
    int palindrome;

    public Palindrome(int palindrome) {
        setPalindrome(palindrome);
    }

    public int getPalindrome() {
        return palindrome;
    }

    public void setPalindrome(int palindrome) {
        String palindromeString = Integer.toString(palindrome);

        if (palindromeString.length() != 5) {
            System.out.println("The number must have have 5 digits");
        } else {
            this.palindrome = palindrome;
        }
    }

    public void checkPalindrome() {
        String palindromeString = Integer.toString(palindrome);
        String inversePalindromeString = "";

        int j = palindromeString.length() - 1;

        while(j >= 0) {
            inversePalindromeString += palindromeString.charAt(j);
            j--;
        }

        if (palindromeString.equals(inversePalindromeString)) {
            System.out.println("The number is a palindrome");
        } else {
            System.out.println("The number is not a palindrome");
        }
    }
}
