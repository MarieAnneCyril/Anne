/*1. Write a program to print the following series
2 5 11 17 23 31 41 47 59  ...*/


import java.util.Scanner;
class primeno
{
public static void main(String args[])
{
int count=0,f=0;
System.out.println("the alternate series is..");
System.out.println("2");
for(int i=5;i<100;i++)
{
for(int j=2;j<i;j++)
{
if(i%j==0)
{
f=0;
break;
}
else{
f=1;
}}
if(f==1)
{
count++;
if(count%2!=0){
System.out.println(i);}
}}}}