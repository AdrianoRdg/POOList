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
        String n1 = "", n2 = "";

        for (int i = 0, j = palindromeString.length() - 1; i < 5; i++, j--) {
            n1 += palindromeString.charAt(i);
            n2 += palindromeString.charAt(j);
        }

        if (n1.equals(n2)) {
            System.out.println("The number is a palindrome");
        } else {
            System.out.println("The number is not a palindrome");
        }
    }
}
