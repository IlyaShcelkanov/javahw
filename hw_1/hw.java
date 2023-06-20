// 1) Вычислить n-ое треугольного число (сумма чисел от 1 до n), n! (произведение чисел от 1 до n)


// package hw_1;

// import java.util.Scanner;

// public class hw {
//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
//         int n = sc.nextInt();
//         int result_sum = 0;
//         int result_product  = 1;
//         for (int i = 0; i < n + 1; i++){
//             result_sum += i; 
//         }
//         System.out.println(result_sum);
//         for (int j = 1; j < n + 1; j++) {
//             result_product *= j;
//         }
//         System.out.print(result_product);
//     }
    
// }

// 2) Вывести все простые числа от 1 до 1000
// package hw_1;

// /**
//  * hw
//  */
// public class hw {

//     public static void main(String[] args) {
//         for (int i = 1; i <= 1000; i++) {
//             System.out.print(" ");
//             System.out.print(i);
//         }
//     }
// }



//3) Реализовать простой калькулятор (+-/*)

package hw_1;

import java.util.Scanner;

import javax.naming.spi.DirStateFactory.Result;

/**
 * hw
 */
public class hw {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Введите x: ");
        double x = sc.nextDouble();
        System.out.print("Введите логическую операцию (+-/*): ");
        char o = sc.next().charAt(0);
        System.out.print("Введите y: ");
        double y = sc.nextDouble();
        double result = 0;
        if (o == '+') {
            result = x + y;
        }
        if (o == '-') {
            result = x - y;
        }
        if (o == '*') {
            result = x * y;
        }
        if (o == '/') {
            if (y == 0) {
                System.out.println("на ноль делить нельзя");
            }
            if (x == 0) {
                System.out.println("ноль делить нельзя");
            } else {
                result = x / y;
            }
        }
        System.out.println("Результат: " + result);
    }
}


