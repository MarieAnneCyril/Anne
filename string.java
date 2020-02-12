/*...1. Write a program which creates a String “Welcome to Java World” and perform 
the following 

i.	Returns the character at 5th position and display it.
ii.	Compare the above String with “Welcome” lexicographically ignoring
 case differences and display the result.
iii. Concatenates “- Let us learn” to the above string and display it.
iv.  Returns the position of the first occurrence of character ‘a’ and
 display it.
v.  Replaces all the occurrences of ‘a’ character with the new ‘e’ and display it.
vi. Returns string between 4th position and 10th position and display it.
vii. Returns the lowercase of the string and display it...*/



import java.util.Scanner;
class string{
public static void main(String args[]){
String s1="Welcome to java world";
String s2="Welcome";
String s3="- Let us learn";
String s4=s2.concat(s3);
int index=s1.indexOf("a");
char ch=s1.charAt(5);
String replaceString=s1.replace('a','e'); 
String s1lower=s1.toLowerCase(); 
System.out.println(ch);
System.out.println(s1.compareToIgnoreCase(s2));
System.out.println(s4);
System.out.println("index of substring" +index); 
System.out.println(replaceString);
System.out.println(s1.substring(4,10));  
  System.out.println(s1lower);   
}
}