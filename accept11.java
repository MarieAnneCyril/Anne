//11. Write a program to generate the following series:

                        1, -2, 3, -4, 5, -6, … N

import java.util.Scanner;
class accept11{
public static void main(String args[]){
Scanner sc=new Scanner(System.in);
System.out.println("Enter");
int n=sc.nextInt();
for(int i=0;i<n;i++){
if(i%2==0){
System.out.println(-i);}
else
{
System.out.println(i);
}}


}}