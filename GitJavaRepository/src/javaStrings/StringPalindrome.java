package javaStrings;

//Java code for checking string palindrome 

public class StringPalindrome 
{
 //function to check whether string is Palindrome or not
 public static boolean isPalindrome(String str) {
     // Checking for null
     if (str == null) {
         throw new IllegalArgumentException("String is null.");
     }

     // length of the string
     // if there is one character string - returing true
     int len = str.length();
     if (len <= 1) {
         return true;
     }

     // Converting the string into uppercase 
     // to make the comparisons case insensitive 
     String strU = str.toUpperCase();

     // result variable
     // default initializing it with true
     boolean result = true;

     for (int i = 0; i < len / 2; i++) {
         if (strU.charAt(i) != strU.charAt(len - 1 - i)) {
             result = false;
             // break the loop if the condition is true
             break;
         }
     }
     return result;
 }

 //main code  
 public static void main(String[] args) {
     String str1 = "Hello world!";
     if (isPalindrome(str1)) {
         System.out.println(str1 + " is a palindrome string ");
     } else {
         System.out.println(str1 + " is not a palindrome string ");
     }

     String str2 = "ABCxCBA";
     if (isPalindrome(str2)) {
         System.out.println(str2 + " is a palindrome string ");
     } else {
         System.out.println(str2 + " is not a palindrome string ");
     }

     String str3 = "noon";
     if (isPalindrome(str3)) {
         System.out.println(str3 + " is a palindrome string ");
     } else {
         System.out.println(str3 + " is not a palindrome string ");
     }

     String str4 = "nooN";
     if (isPalindrome(str4)) {
         System.out.println(str4 + " is a palindrome string ");
     } else {
         System.out.println(str4 + " is not a palindrome string ");
     }
 }
}

