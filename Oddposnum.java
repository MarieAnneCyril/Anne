/*4. Retrieve the odd-position digits from input integer array.
 Multiply them with their index and return their sum.*/


import java.util.*;
class Oddposnum
{
public static void main(String args[])
{
int j,n,sum=0;
Scanner sc = new Scanner(System.in);
System.out.println("Enter Size of array");
 n = sc.nextInt();
int a[]=new int[n];
System.out.println("Enter all values");
for(j=0;j<n;j++){
 a[j] = sc.nextInt();
}
System.out.println("Retrived odd position");
for(j=0;j<n;j++)
{	
if(j%2==0)
{
System.out.println(a[i]);
sum=sum+a[j]*j;
}
}
System.out.println("Sum ="+sum);			
	}
}	