public class Calculator {

    static void calc(double a, double b){
        double result = a + b;
        System.out.println(result);
    }

    static double anotherCalc(double a, double b){
        System.out.println(a + b);
        return a + b;
    }

    static void calc(double numA, double numB, char operation){
        double result = 0;
        if(operation == '+'){
            result = numA + numB;
        }  else if(operation == '-'){
            result = numA - numB;
        } else if(operation == '*'){
            result = numA * numB;
        } else if(operation == '/'){
            result = numA / numB;
        } else {
            System.out.println("Oops, incorrect operation type");
        }
        System.out.println("Result: " + result);
    }

    public static void main(String[] args) {
        calc(20, 10, '+');
        calc(20, 10, '-');
        calc(20, 10, '*');
        calc(20, 10, '/');
        calc(20, 10, '$');
    }
}
