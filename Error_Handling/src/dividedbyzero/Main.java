package dividedbyzero;

public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        try {
            System.out.println(3 / 0);
        } catch (ArithmeticException e) { // 指定要捕获的异常为ArithmeticException
            System.out.printf("Caught arithmetic exception = %s\n", e.getMessage());
        }
    }

}