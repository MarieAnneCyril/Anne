/*3. Input a int array. Square the elements in even position and cube the
 elements in odd position and add them as result.*/

import java.util.*;
class Squarenew
{

 	public static void main(String args[])
	{
Scanner sc=new Scanner(System.in);
int j,sum=0,n;
System.out.println("Input the size of array");
 n=sc.nextInt();
int a[] =new int[n];
for(j=0;j<n;j++){
a[j]=sc.nextInt();
}
for(j=0;j<n;j++)
{
if((j+1)%2 == 0)
a[j]=a[j]*a[j];
else
a[j]=a[j]*a[j]*a[j];
}
System.out.println("Output");
for(j=0;j<n;j++)
{
sum=sum+a[j];
System.out.print(a[j] + " ");
}
System.out.println(" ");
System.out.println(sum);	
	}
}