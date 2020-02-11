//8.Write a program to find the sum of all odd numbers from 1 to N.
 Accept N. Display the sum.

import java.util.Scanner;
class accept8{
public static void main(String args[]){

int n, num=0;
System.out.println("enter the size");
Scanner sc=new Scanner(System.in);
n=sc.nextInt();
for(int i=1;i<=n;i++)
{
if(i%2==1){
num=num+i;
}
else{
System.out.println();
}
}
System.out.println(num);
} }