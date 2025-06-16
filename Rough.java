import java.util.HashMap;
import java.util.Set;


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

public static void reverseString(String str){

    String nstr = " ";

    for (char c : str.toCharArray()) {
        nstr = c + nstr;
    }

    System.out.println(nstr);
}

public static void reverseEachWord(String str){

    
    String reverse = " ";

    for (String s : str.split(" ")) {
        String nstr = " ";
        for (char c : s.toCharArray()) {
          nstr = c + nstr;
        }
        reverse = reverse + nstr;
    }
    System.out.println(reverse);
    
}

public static void dupeChar(String str){

    HashMap<Character,Integer> dupeChar = new HashMap<>();

    for (char c : str.toCharArray()) {
        if (dupeChar.containsKey(c)) {
            dupeChar.put(c, dupeChar.get(c)+1);
        } else {
            dupeChar.put(c, 1);
        }
    }


    Set<Character> charInString = dupeChar.keySet();

    for (char c : charInString) {
        if (dupeChar.get(c)>1) {
            System.out.println(c + " : " + dupeChar.get(c));
        }
    }
}

public static void occuranceOfEachChar(String str){


    HashMap<String,Integer> dupeChar = new HashMap<>();

    for (String c : str.split(" ")) {
        if (dupeChar.containsKey(c)) {
            dupeChar.put(c, dupeChar.get(c)+1);
        } else {
            dupeChar.put(c, 1);
        }
    }


    Set<String> charInString = dupeChar.keySet();

    for (String s : charInString) {
        if (dupeChar.get(s)>1) {
            System.out.println(s + " : " + dupeChar.get(s));
        }
    }
}

public static void countWords(String str){
    String [] s = str.split(" ");
    int n = s.length;
    System.out.println(n);
}

public static void permutation(String str,String prefix){
    if (str.length() == 0) {
        System.out.println(prefix);
    }
    for (int i = 0; i <str.length(); i++) {
        
        String rem = str.substring(0,i) + str.substring(i+1);
        permutation(rem, prefix + str.charAt(i));
    }
}

public static void palindrome(String str){

    int first = 0;
    int last = str.length()-1;
    while (first < last) {
        if (str.charAt(last) != str.charAt(first)) {
            System.out.println("not a palindrome");
            return;
        }
        first++;
        last--;
    }
    System.out.println("palindrome");
}

public static void anograms(String str1,String str2){
    char[] check = new char[256];

    if (str1.length() != str2.length()) {
        System.out.println("not anograms");
        return;
    }

   for (int i = 0; i < str1.length(); i++) {
       check[str1.charAt(i)]++;
       check[str2.charAt(i)]--;
   }

   for (int i : check) {
       if (i != 0) {
        System.out.println("not anograms");
        return;
       }
   }

   System.out.println("anograms");
}

public static void vAndC(String str){

    int v = 0;
    int c = 0;

    for (char ch : str.toCharArray()) {
        if (ch == 'a'||ch == 'e'||ch == 'i'||ch == 'o'||ch == 'u') {
            v++;
        } else {
            c++;
        }
    }
    System.out.println("vowel : " + v);
    System.out.println("consonant : " + c);
}

public static void unique(String str){

    boolean[] unique = new boolean[256];

    for (char c : str.toCharArray()) {
        if (!unique[c]) {
            System.out.print(c + " ");
            unique[c]= true;
        }
    }
    
}

public static void evenIndex(String str){

    for (int i = 0; i < str.length(); i++) {
        if (i%2==0) {
            System.out.print(str.charAt(i));
        }
    }
}


public static void removeSpace(String str){
    StringBuilder result = new StringBuilder();

    for (char c : str.toCharArray()) {
        if (c != ' ') {
            result.append(c);
        }
    }
    System.out.println(result);
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
    System.out.println();

    reverseString("Ram Ram");
    reverseString("har har mahadev");
    System.out.println();

    reverseEachWord("har har mahadev");
    System.out.println();

    dupeChar("Har Har Mahadev Shambhu har har mahadev");
    System.out.println();

    occuranceOfEachChar("Har Har Mahadev Shambhu har har mahadev");
    System.out.println();

    countWords("Har Har Mahadev Shambhu har har mahadev");
    System.out.println();

    permutation("ABC", " ");
    System.out.println();

    palindrome("MALAYALAM");
    palindrome("FJAIJFIAJF");
    System.out.println();


    anograms("ram ram","sita sita");
    anograms("ram", "mar");
    System.out.println();

    vAndC("siyva var ram chandra ki jai pawan sut hanuman ki hai umapati mahadev ki jai");
    System.out.println();

    unique("siyva var ram chandra ki jai pawan sut hanuman ki hai umapati mahadev ki jai");
    System.out.println();
    System.out.println();

    evenIndex("siyva var ram chandra ki jai pawan sut hanuman ki hai umapati mahadev ki jai");
    System.out.println();
    System.out.println();

    removeSpace("siyva var ram chandra ki jai pawan sut hanuman ki hai umapati mahadev ki jai");
    System.out.println();







}

}