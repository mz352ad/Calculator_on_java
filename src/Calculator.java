// один зi способiв вказати коментар

/**
 * один зi способiв вказати коментар
 * */
//
// class - template for object
/**
 * Code convention:
 * 1. з великоi лiтери пишуться: назви класiв
 * 2. з маленькоi лiтери пишуться: назви змiнних, методiв(функцii)
 * 3. snack_case, camelCase. In JavaScript possible to use kebab-case
 * camelCase for variable and methods, ClassNames
 * example: myName, checkIsWork()
 * snack_case for constants
 * example: PEOPLE_GENDER, COUNTRY_NAME
 * */

/**
 * Primitive types:
 * 1. boolean: true, false
 * 2. int: 100
 * 3. double: 100.50
 * 4. float: 100.50
 * 5. short: 100
 * 6. long: 100
 * 7. char: 'A', '1', '$'
 * 8. byte: '123'
 * */

//TODO: найпопулярнiшi ==> int, boolean, double

/**
 * Other types:
 * 1. String "Test123!@#$ !@#"
 * 2. Object {"key": 123}, {"key": true}, {"key": "Hillel"}
 * 3. Array [{}], ['Test', 'Hillel', 'Java'],  [1, true, 'Test', {"key": 123}]
 * ...
 * */

// Программа складаэться з 1)властивостей об'экта та 2)його дiй
// Властивостi та дii базового калькулятора
// Властивостi та дii iнженерного калькулятора

/**
 * Властивостi об'эктiв описуються через змiннi.
 * type variableName = variableValue;
 * */

/**
 * Дii - методи
 * 1. Basic exmple
 * void methodeName(a, b){
 *     a + b
 * }
 * */

/**
 * +, *, /, -
 * ==, !=
 *
 * */

// public - модифiкатор доступа. Protected, Private ...
// static - виконання методiв або змiнних в контекстi одного конкретного класу
public class Calculator {

    static void calc(double a, double b){
        double result = a + b;
        System.out.println(result);
    }

    static double anotherCalc(double a, double b){
        System.out.println(a + b);
        return a + b;
    }

    //TODO: умовнi конструкцii

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
            System.out.println("Ups, incorrect operation type");
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
