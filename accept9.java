//9. Write a program to find the reverse of a number. Store the reverse value in a different variable. 
Display the reverse.
import java.util.Scanner;
class accept9{
public static void main(String args[])
{
int rev=0;
Scanner sc=new Scanner(System.in);
System.out.println("Enter the number");

int n=sc.nextInt();
while(n!=0){
int num=n%10;
 rev=rev*10+num;
n=n/10;

}
System.out.println(rev);

}}