package palindrome;

public class TestPalindrome {
    public static void main(String[] args) {
        Palindrome palindrome = new Palindrome(12321);
        palindrome.checkPalindrome();

        palindrome.setPalindrome(123);

        palindrome.setPalindrome(12345);
        palindrome.checkPalindrome();
    }
}
