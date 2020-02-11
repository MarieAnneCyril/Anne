//3. Write a program to accept a number and display whether the number is
 odd or even using the ternary operator.
import java.util.Scanner;
class accept4{
public static void main(String args[])
{
Scanner sc=new Scanner(System.in);
System.out.println("Enter the one number");
int a=sc.nextInt();
String s1="even";
String s2="odd";

String temp=(a%2==0)?s1:s2;

System.out.println("The number is" +" " + temp);
}
}