package factorial;

public class TestFactorial {
    public static void main(String[] args) {
        Factorial factorial = new Factorial(3);

        factorial.calculateFactorial();
        factorial.setFactorial(5);
        factorial.calculateFactorial();
    }
}
