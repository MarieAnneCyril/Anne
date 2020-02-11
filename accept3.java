//2. Write a program to accept three numbers and find the 
largest of three numbers using ternary operator.

import java.util.Scanner;
class accept3{
public static void main(String args[])
{
Scanner sc=new Scanner(System.in);
System.out.println("Enter the three numbers");
int a=sc.nextInt();
int b=sc.nextInt();
int c=sc.nextInt();
int temp=(a>b)?a:b;
int result=(c>temp)?c:temp;
System.out.println("The grestest number is"+result);

}
}
