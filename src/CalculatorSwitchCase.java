public class CalculatorSwitchCase {
    static void calc(double a, double b){
        double result = a + b;
        System.out.println(result);
    }

    static double anotherCalc(double a, double b){
        System.out.println(a + b);
        return a + b;
    }

    static void calc(double numA, double numB, char operation) {
        double result = 0;
        switch (operation) {
            case '+':
                result = numA + numB;
                break;
            case '-':
                result = numA - numB;
                break;
            case '*':
                result = numA * numB;
                break;
            case '/':
                result = numA / numB;
                break;
            default:
                System.out.println("Oops, incorrect operation type");
                return;  
        }
        System.out.println("Result: " + result);
    }

    public static void main(String[] args) {
        calc(50, 10, '+');
        calc(120, 10, '-');
        calc(320, 10, '*');
        calc(2320, 10, '/');
        calc(20, 10, '$');
    }
}
