package factorial;

public class Factorial {
    private int factorial;

    public Factorial(int factorial) {
        setFactorial(factorial);
    }

    public int getFactorial() {
        return factorial;
    }

    public void setFactorial(int factorial) {
        if (factorial > 0) {
            this.factorial = factorial;
        } else {
            System.out.println("Type a positive number!");
        }
    }

    public void calculateFactorial() {
        int calculatedFactorial = 0;

        for (int i = 0; i < factorial; i++) {
            if (i == 0) {
                calculatedFactorial = factorial;
            } else {
                calculatedFactorial = calculatedFactorial * (factorial - i);
            }
        }

        System.out.println(calculatedFactorial);
    }
}
