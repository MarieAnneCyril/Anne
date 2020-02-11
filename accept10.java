//10.  Write a program to find the factorial of 
a non-negative number.


import java.util.Scanner;
class accept10{
public static void main(String args[])
{
int fact=1,n;
Scanner sc=new Scanner(System.in);
n=sc.nextInt();
for(int i=1;i<=n;i++)
{
fact=fact*i;

}
System.out.println(fact);

}}