import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
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

public static void leapYearCheck(int n){
    if ((n%4==0 && n%100 !=0) || n%400 == 0 ) {
        System.out.println(n + " is leap Year");
    } else {
        System.out.println(n + " is not a leap year");
    }
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


public static void eachLetterTwice(String str){

    StringBuilder result = new StringBuilder();

    for (char c : str.toCharArray()) {
            result.append(c).append(c);
    }
    System.out.println(result);
}


public static void swap2String(String str1, String str2){

    str1 = str1 + str2;
    str2 = str1.substring(0,str1.length()-str2.length());
    str1 = str1.substring(str2.length());

    System.out.println(str1);
    System.out.println(str2);
}

public static void count(String str){
    
    StringBuilder result = new StringBuilder();
    

    int count = 1;
    for (int i = 0; i < str.length(); i++) {
        if (i+1 < str.length() && str.charAt(i) == str.charAt(i+1)) {
            count++;
        } else {
            result.append(str.charAt(i)).append(count);
            count = 1;
        }
    }
    System.out.println( result);
}


public static void upperLowerCase(String str){

    StringBuilder upper = new StringBuilder();
    StringBuilder lower = new StringBuilder();


    
    for (char c : str.toCharArray()) {
        if (Character.isLowerCase(c)) {
            lower.append(c);
        } else {
            upper.append(c);
        }
    }
    System.out.println(lower);
    System.out.println(upper);
}


public static void digitAlpha(String str){
     StringBuilder digit = new StringBuilder();
    StringBuilder alpha = new StringBuilder();


    
    for (char c : str.toCharArray()) {
        if (Character.isAlphabetic(c)) {
            alpha.append(c);
        } else {
            digit.append(c);
        }
    }
    System.out.println(alpha);
    System.out.println(digit);
}


public static void numAlphaInSame(String str){

     StringBuilder digit = new StringBuilder();
    StringBuilder alpha = new StringBuilder();


    
    for (char c : str.toCharArray()) {
        if (Character.isAlphabetic(c)) {
            alpha.append(c);
        } else {
            digit.append(c);
        }
    }
    System.out.println(digit.append(alpha).toString());
}


public static void format (String str){

    long n = Long.parseLong(str);
    String format = String.format("%011d",n );
    System.out.println(format);
}

public static void longestWitoutRepeatingChar(String str){

    HashSet<Character> set = new HashSet<>();
    
    int maxLength = 0;
    int start1 = 0;
    int end1 = 0;

    while (end1<str.length()) {
        if (!set.contains(str.charAt(end1))) {
            set.add(str.charAt(end1));
            maxLength = Math.max(maxLength, end1 - start1 +1);
            end1++;
        } else {
            set.remove(str.charAt(start1));
            start1++;
        }

    }
    System.out.println(maxLength);
}

public static void commonElementsArray(int []arr1 , int [] arr2){

    HashSet<Integer> set1 = new HashSet<>();
    HashSet<Integer> commonSet = new HashSet<>();


    for (int i : arr1) {
        set1.add(i);
    }

    for (int i : arr2) {
        if (set1.contains(i)) {
            commonSet.add(i);
        }
    }
    System.out.println(commonSet);
}

public static void firstAndLastElementArrayList(ArrayList<String>list){

    System.out.println(list.get(0));
    System.out.println(list.get(list.size()-1));
}


public static void printArr(int[]arr){

    for (int i  : arr) {
      System.out.print(i + " ");  
    }
    System.out.println();
}


public static void bubbleSort(int[] arr){

    for (int i = 0; i < arr.length-1; i++) {
        for (int j = 0; j < arr.length-1-i; j++) {
            if (arr[j]>arr[j+1]) {
                int temp = arr[j+1];
                arr[j+1] = arr[j];
                arr[j] = temp;
            }
        }
    }
    printArr(arr);
}

public static void selectionSort(int [] arr){

    for (int i = 0; i < arr.length-1; i++) {
        int minIndex = i;
        for (int j = i+1; j < arr.length; j++) {
            if (arr[j]<arr[minIndex]) {
                minIndex = j;
            }
        }
        int temp = arr[i];
        arr[i] = arr[minIndex];
        arr[minIndex] = temp;
    }
    printArr(arr);
}

public static void insertionSort(int [] arr){

    for (int i = 1; i < arr.length; i++) {
        int current = arr[i];
        int j = i-1;
        while (current<arr[j]) {
            arr[j+1] = arr[j];
            j--;
        }
        arr[j+1] = current;
    }
    printArr(arr);
}


public static void removeDuplicatesFromAnArray(int [] arr){

    HashSet<Integer> set = new HashSet<>();

    for (int i : arr) {
        set.add(i);
    }
    int [] result = new int [set.size()];
    int i = 0;
    for (int num : set) {
        result[i++] = num;
    }   
    printArr(result);
    
}

public static void removeDuplicatesArrayList(ArrayList<Integer> list){

    HashSet<Integer> set = new HashSet<>(list);
    System.out.println(set);     
}

public static void findTheMissingNumber(int[]arr){
    int n = arr.length +1;
    int totalSum =n*(n+1)/2;
    int sum = 0;

    for (int i  : arr) {
        sum += i;
    }

    System.out.println(totalSum - sum);
}

public static void largestAndSmallestArray(int []arr){

    int first = arr[0];
    int last = arr[0];

    for (int i = 0; i < arr.length ;i++){

        if (first > arr[i]) {
            first = arr[i];
        }

        if (last < arr[i]) {
            last = arr[i];
        }
    }

    System.out.println("first : " + first);
    System.out.println("last : " + last);
}

public static void searchElementInArray(int[]arr, int target){
    int count = 0;
    for (int i : arr) {
        count++;
        if (target == i) {
            System.out.println(count);
            return;
        }
    }
    System.out.println("Element Not Found");
}

public static void sumOnlyIntegers(String [] arr){
    int a = 0;
    for (String i : arr) {
        
        try {
             a += Integer.parseInt(i);
        } catch (NumberFormatException e) {
        }
    }

    System.out.println(a);
}

public static void findMinAndMax(int [] arr){

    if (arr.length == 0) {
        throw new IllegalArgumentException("array must not be empty");
    }

    int min = arr[0];
    int max = arr[0];

    for (int i = 0; i < arr.length; i++) {
        if (arr[i]> max) {
            max = arr[i];
        }
        if (arr[i]<min) {
            min = arr[i];
        }
    }
    System.out.println("min : " + min);
    System.out.println("max : " + max);

}

public static void countOddAndEven(int [] arr){
    int even = 0;
    int odd = 0;

    for (int i  : arr) {
        if (i % 2 == 0) {
            even++;
        } else {
            odd++;
        }
    }
    System.out.println("even : " +  even);
    System.out.println("odd : " +  odd);
}

public static void findNonRepeatingElements(int [] arr){

    HashMap<Integer, Integer> countMap = new HashMap<>();
    
    for (int i : arr) {
            countMap.put(i, countMap.getOrDefault(i, 0)+1);
        
    }

    for (Map.Entry<Integer, Integer> en : countMap.entrySet()) {
        if (en.getValue()==1) {
            System.out.print(en.getKey() + " ");
        }
        
    }
}

    

public static void reverseAnArray(int [] arr){

    printArr(arr);
    
    int first = 0;
    int last = arr.length-1;

    while (first < last ) {
        int temp = arr[first];
        arr[first] = arr[last];
        arr[last] = temp;

        first++;
        last--;
    }
    printArr(arr);
}


public static void solidRectangle(int n, int m){

    for (int i = 1; i <=n; i++) {
        for (int j = 1; j <=m; j++) {
            System.out.print("x ");
        }
        System.out.println();
    }
}

public static void hollowRectangle(int n, int m){

    for (int i = 1; i <=n; i++) {
        for (int j = 1; j <=m; j++) {
            if (i == 1 || i == n ||j == 1 ||j == m) {
                System.out.print("X ");
            } else {
                System.out.print("  ");
            }
        }
        System.out.println();
    }
}

public static void halfPyramid(int n){

    for (int i = 1; i <=n; i++) {
        for (int j = 1; j <=i; j++) {
            System.out.print("x ");
        }
        System.out.println();
    }
}

public static void invertedHalfPyramid(int n){

    for (int i = 1; i <=n; i++) {
        for (int j = 1; j <=n-i+1; j++) {
            System.out.print("x ");
        }
        System.out.println();
    }
}

public static void invertedHalfPyramid1(int n){

    for (int i = n; i >=1; i--) {
        for (int j = 1; j <=i; j++) {
            System.out.print("x ");
        }
        System.out.println();
    }
}

public static void invertedHalfPyramid180(int n){

    for (int i = 1; i <=n; i++) {
        for (int j = 1; j <=n-i+1; j++) {
            System.out.print("  ");
        }

        for (int j = 1; j <=i; j++) {
            System.out.print("x ");
        }
        System.out.println();
    }
}

public static void halfPyramidWithNumbers(int n){

    for (int i = 1; i <=n; i++) {
        for (int j = 1; j <=i; j++) {
            System.out.print( j +" ");
        }
        System.out.println();
    }
}

public static void invertedHalfPyramidWithNumbers(int n){

    for (int i = 1; i <=n; i++) {
        for (int j = 1; j <=n -i +1; j++) {
            System.out.print( j +" ");
        }
        System.out.println();
    }
}

public static void floydsTraingle(int n){
    int c = 1;
    for (int i = 1; i <=n; i++) {
        for (int j = 1; j <=i; j++) {
            System.out.print(c++  + " ");
        }
        System.out.println();
    }
}

public static void zeroOneTraingle(int n){
    
    for (int i = 1; i <=n; i++) {
        for (int j = 1; j <=i; j++) {
            if ((i + j )%2 ==0) {
                System.out.print("0 ");
            } else {
                System.out.print("1 ");
            }
        }
        System.out.println();
    }
}

public static void butterfly(int n){
    
    for (int i = 1; i <=n; i++) {
        for (int j = 1; j <=i; j++) {
            System.out.print("x ");
        }

        for (int j = 1; j <=(n-i)*2; j++) {
            System.out.print("  ");
        }

        for (int j = 1; j <=i; j++) {
            System.out.print("x ");
        }
        System.out.println();
    }

    for (int i = n; i >=1; i--) {
        for (int j = 1; j <=i; j++) {
            System.out.print("x ");
        }

        for (int j = 1; j <=(n-i)*2; j++) {
            System.out.print("  ");
        }

        for (int j = 1; j <=i; j++) {
            System.out.print("x ");
        }
        System.out.println();
    }
}


public static void rohmbus(int n){

    for (int i = 1; i <=n; i++) {
        for (int j = 1; j <=n-i+1; j++) {
            System.out.print("  ");
        }

        for (int j = 1; j <=n; j++) {
            System.out.print("x ");
        }
        System.out.println();
    }

}

public static void numberPyramid(int n){

    for (int i = 1; i <=n; i++) {
        for (int j = 1; j <=n-i+1; j++) {
            System.out.print("  ");
        }

        for (int j = 1; j <=i; j++) {
            System.out.print(i + "   ");
        }
        System.out.println();
    }
}

public static void palindromicPattern(int n){

     for (int i = 1; i <=n; i++) {
        for (int j = 1; j <=n-i+1; j++) {
            System.out.print("  ");
        }

        for (int j = i; j >=1; j--) {
            System.out.print(j + " ");
        }

        for (int j = 2; j <=i; j++) {
            System.out.print(j + " ");
        }
        System.out.println();
    }
}

public static void diamondPattern(int n){

    for (int i = 1; i <=n; i++) {
        for (int j = 1; j <=n-i+1; j++) {
            System.out.print("  ");
        }

        for (int j = 1; j <=(i*2)-1; j++) {
            System.out.print("x ");
        }
        System.out.println();
    }

    for (int i = n; i >=1; i--) {
        for (int j = 1; j <=n-i+1; j++) {
            System.out.print("  ");
        }

        for (int j = 1; j <=(i*2)-1; j++) {
            System.out.print("x ");
        }
        System.out.println();
    }
}


public static void printNUmberInReverseRecurstion(int n ){
    if (n == 0) {
        return;
    }

    System.out.println(n);
    printNUmberInReverseRecurstion(n-1);
}


public static void printNUmberInOrderRecurstion(int n ){
    if (n == 0) {
        return;
    }

    printNUmberInOrderRecurstion(n-1);
    System.out.println(n);
}

public static int sumOfNaturalNumbersRecurion(int n){
    if (n == 0) {
        return 0;
    }
    return n + sumOfNaturalNumbersRecurion(n-1);
}

public static int recursiveFactorial(int n ){

    if (n == 0) {
        return 1;
    }

    return n * recursiveFactorial(n-1);
}


public static void recursiveFibonacci(int a , int b , int n){
    if (n==0) {
        return;
    }
    System.out.println(a);
    recursiveFibonacci(b,a + b, n-1);  
}

public static int recurisvePower(int a , int b){
    if (b == 0) {
        return 1;
    }

    return a * recurisvePower(a, b-1);
}

public static int recurisvePowerLog(int a , int b){
    if (b==0) {
        return 1;
    }

    if (b%2==0) {
        return recurisvePowerLog(a, b/2) * recurisvePowerLog(a, b/2);
    } else {
        return recurisvePower(a, b/2) * recurisvePower(a, b/2) *a ;
    }
}

public static void towerOfHanoi(int n ,String src , String helper , String desti){
    if (n==1) {
        System.out.println("transfer disc " + n +  " from " + src + " to " +  desti);
        return;
    }

    towerOfHanoi(n-1, src, desti, helper);
    System.out.println("transfer disc " + n +  " from " + src + " to " +  desti);

    towerOfHanoi(n-1, helper, src, desti);
}


public static void recursiveWayToReverseString(String str, int idx , String nstr){
    if (idx == str.length()) {
        System.out.println(nstr);
        return;
    }
    nstr = str.charAt(idx) + nstr;
    recursiveWayToReverseString(str, idx+1, nstr);
    
}

static int start = -1;
static int  end =-1;

public static void recursvieWayToFindFirstAndLastOccurance(String str, int idx , char c){

    
    if (str.length() == idx) {
        System.out.println("first idx : " + start);
        System.out.println("last idx : " + end);
        return;
    }
    if (str.charAt(idx) == c) {
        if (start == -1) {
            start = idx;

        } else {
            end = idx;
        
        }
    }
    recursvieWayToFindFirstAndLastOccurance(str, idx+1, c);
}

public static void recursiveWayToFindIftheArrayIsStrictlyIncreasing(int[] arr, int idx){
    if (arr.length-1 == idx ) {
        System.out.println("sorted");
        return;
    }


    if (arr[idx] >= arr[idx+1]) {
        System.out.println("not sorted");
        return;
    }
    recursiveWayToFindIftheArrayIsStrictlyIncreasing(arr, idx+1);
}


public static void recurisveWayToMoveAllXToTheEnd(String str, int idx, int count, String nstr){
    if (idx == str.length()) {
        for (int i = 0; i <count; i++) {
            nstr += 'x'; 
        }
        System.out.println(nstr);
        return;
    }



    if (str.charAt(idx)== 'x') {
        count++;
    } else {
        nstr += str.charAt(idx);
    }

    recurisveWayToMoveAllXToTheEnd(str, idx+1, count, nstr);
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

    eachLetterTwice("siyva var ram chandra ki jai pawan sut hanuman ki hai umapati mahadev ki jai");
    System.out.println();

    swap2String("ram", "sita");
    System.out.println();

    count("haaar haaaaar maaaaaahhhhaaa deeeevvv");
    System.out.println();

    upperLowerCase("hAR haR MahaDEV shAMBHU harHAR mAHDEV");
    System.out.println();

    digitAlpha("har55 har52662626 m24456565655a6h7dev44 s4h466mbhu");
    System.out.println();

    numAlphaInSame("har55 har52662626 m24456565655a6h7dev44 s4h466mbhu");
    System.out.println();


    format("0121200");
    format("45");
    System.out.println();

    longestWitoutRepeatingChar("siyva var ram chandra ki jai pawan sut hanuman ki hai umapati mahadev ki jai");
    System.out.println();


    int[] arr1 = {1, 2, 3, 4, 5};
    int[] arr2 = {4, 5, 6, 7, 8};
    commonElementsArray(arr1, arr2);
    System.out.println();

    ArrayList<String> arrayList = new ArrayList<>();
    arrayList.add("Apple");
    arrayList.add("Banana");
    arrayList.add("Cherry");
    arrayList.add("Date");
    arrayList.add("Elderberry");

    firstAndLastElementArrayList(arrayList);
    System.out.println();

    int[] arr3 = {5,2,5,7,8,4,7,2,72,7,9,1,6};
    bubbleSort(arr3);
    System.out.println();

    selectionSort(arr3);
    System.out.println();

    insertionSort(arr3);
    System.out.println();

    removeDuplicatesFromAnArray(arr3);
    System.out.println();


    
 ArrayList<Integer> arrayList1 = new ArrayList<>();
        arrayList1.add(5);
        arrayList1.add(2);
        arrayList1.add(9);
        arrayList1.add(1);
        arrayList1.add(6);
        arrayList1.add(2);
        arrayList1.add(5);

        removeDuplicatesArrayList(arrayList1);
        System.out.println();

        int[] arr4= {1, 2, 4, 5, 6}; 
        findTheMissingNumber(arr4);
        System.out.println();

        largestAndSmallestArray(arr4);
        largestAndSmallestArray(arr3);
        System.out.println();



        searchElementInArray(arr3,72);
        System.out.println();


        String[] arr5 = {"5", "2", "9", "a", "1", "6", "#", "3"};
        sumOnlyIntegers(arr5);
        System.out.println();

        findMinAndMax(arr4);
        findMinAndMax(arr3);
        System.out.println();

        countOddAndEven(arr3);
        System.out.println();

        int[] arr6 = {4,5,6,3,6,7,2,1,78,15,71,71,61};
        

        findNonRepeatingElements(arr6);
        System.out.println();
        System.out.println();

        int n = 5;
        int m = 6;

        solidRectangle(n, m);
        System.out.println();

        hollowRectangle(n, m);
        System.out.println();

        halfPyramid(n);
        System.out.println();

        invertedHalfPyramid(n);
        System.out.println();

        invertedHalfPyramid1(n);
        System.out.println();

        invertedHalfPyramid180(n);
        System.out.println();

        halfPyramidWithNumbers(n);
        System.out.println();

        invertedHalfPyramidWithNumbers(n);
        System.out.println();

        floydsTraingle(n);
        System.out.println();

        zeroOneTraingle(n);
        System.out.println();

        butterfly(n);
        System.out.println();

        rohmbus(n);
        System.out.println();

        numberPyramid(n);
        System.out.println();

        palindromicPattern(n);
        System.out.println();

        diamondPattern(n);
        System.out.println();

        reverseAnArray(arr6);
        System.out.println();


        reverseAnArray(arr4);
        System.out.println();

        leapYearCheck(2020);
        leapYearCheck(2014);
        leapYearCheck(2025);
        System.out.println();

        printNUmberInReverseRecurstion(n);
        System.out.println();

        printNUmberInOrderRecurstion(n);
        System.out.println();

        System.out.println(sumOfNaturalNumbersRecurion(n));
        System.out.println();


        System.out.println(recursiveFactorial(n));  
        System.out.println();

        recursiveFibonacci(0, 1, 10);
        System.out.println();


        System.out.println(recurisvePower(n, 2));
        System.out.println(recurisvePower(n, 3));
        System.out.println();

        System.out.println(recurisvePowerLog(n, 2));
        System.out.println(recurisvePowerLog(n, 3));
        System.out.println();

        towerOfHanoi(5, "s", "h", "d");
        System.out.println();

        recursiveWayToReverseString("ramSitaRam", 0, " ");
        System.out.println();

        recursvieWayToFindFirstAndLastOccurance("ramsitaramsitaram", 0, 'r');
        System.out.println();

        int [] arr7 = {1,2,3,4,6,8,9};
        recursiveWayToFindIftheArrayIsStrictlyIncreasing(arr6, 0);
        recursiveWayToFindIftheArrayIsStrictlyIncreasing(arr4, 0);
        recursiveWayToFindIftheArrayIsStrictlyIncreasing(arr7, 0);
        System.out.println();


        recurisveWayToMoveAllXToTheEnd("ramsitxaxxrxamsxxitaxxramxsxxxixxtxxxxaram", 0,0, " ");


        
    }
}