public class Rough {


public static void oddEven (int num){

    if (num%2==0) {
        System.out.println(num+" is Even");
    } else {
        System.out.println(num+" is odd");
    }
}   


public static void primeNumber(int num){

 if (num == 1) {
    System.out.println("not prime Number");
    return;
 }

 for (int i = 2; i<=Math.sqrt(num); i++) {
     if (num%i==0) {
        System.out.println("not a prime number");
        return;
     }
 }

 System.out.println("is a prime Number");

}

public static void fibonacci(int num){

    int first = 0;
    int second = 1;

    for (int i = 0; i <=num; i++) {
        System.out.print(first + " ");
        int next = first + second;
        first = second;
        second = next;
    }
}

public static void swamNumber(int num1 ,int num2){

    num1 = num1 + num2;
    num2 = num1 - num2;
    num1 = num1 - num2;


    System.out.println(num1);
    System.out.println(num2);
}


public static void factorial (int a){
    int fact = 1;
    for (int i = 1; i <=a; i++) {
        fact *=i;
    }

    System.out.println(fact);
}


public static void printReverse(int num){
    int reverse = 0;

    while (num > 0) {
        int digit = num %10;
        reverse = reverse *10  + digit;
        num = num/10;
    }

    System.out.println(reverse);
}

public static void armstrong(int num){

    int digits = String.valueOf(num).length();
    int arm = 0;
    int original = num;

    while (num > 0) {
        int digit = num %10;
        arm += Math.pow(digit, digits);
        num = num/10;
    }

    if (original == arm) {
        System.out.println("Armstrong Number");
    } else {
        System.out.println("not an Armstrong NUmber");
    }
}


public static void numberOfDigits(int num){

    int n = String.valueOf(num).length();
    System.out.println(n);
}


public static void palindrome(int num){

    int original = num;
    int reverse = 0;

    while (num > 0) {
        int digit = num %10;
        reverse = reverse *10  + digit;
        num = num/10;
    }

    if (original == reverse) {
        System.out.println("palindrome");
    } else {
        System.out.println("not a palindrome");
    }
}

public static void sumOfDigits(int num){
    int n = 0;
    while (num > 0) {
        int digit = num %10;
        n += digit;
        num = num/10;
    }
    System.out.println(n);
}






public static void main(String[] args) {
    

    oddEven(8);
    oddEven(9);
    System.out.println();


    primeNumber(5);
    primeNumber(13);
    primeNumber(16);
    System.out.println();

    fibonacci(5);
    System.out.println();
    System.out.println();

    swamNumber(5, 8);
    System.out.println();

    factorial(5);
    System.out.println();

    printReverse(4572);
    System.out.println();

    armstrong(153);
    armstrong(134);
    System.out.println();

    numberOfDigits(425252);
    System.out.println();

    sumOfDigits(55636632);





}

}