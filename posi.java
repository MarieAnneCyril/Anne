/*2. Write a java program that allows the user to enter 'n' numbers and 
finds the number of positive numbers entered and the sum of all positive 
numbers entered using a for loop.*/

import java.util.Scanner;
class posi{
public static void main(String args[]){
Scanner sc= new Scanner(System.in);
System.out.println("Enter n number");
int n=sc.nextInt();
int a[]=new int[10];
int sum=0,count=0;
for(int i=0;i<n;i++){
a[i]=sc.nextInt();
}
for(int i=0;i<n;i++){
if(a[i]>0){
count++;
sum=sum+a[i];
}}
System.out.println("Count of positi number:" +count);
System.out.println("Enter the sum value:" +sum);
}}
