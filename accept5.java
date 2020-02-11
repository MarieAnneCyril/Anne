//4.      Write a program to accept three numbers and find the largest and 
second largest values of three numbers


import java.util.Scanner;
class accept5{
public static void main(String args[])
{
Scanner sc=new Scanner(System.in);
int num=sc.nextInt();
int numArr[]=new int[num];
System.out.println("Enter the numbers");
for(int i=0;i<num;i++)
{
numArr[i]=sc.nextInt();
}
int firstNum=0, secondNum=0;
for(int i=0;i<numArr.length;i++){
if(firstNum < numArr[i]){
    secondNum = firstNum;
    firstNum = numArr[i];
   }
else if(secondNum < numArr[i]){
    secondNum = numArr[i];
   } 
  }
  System.out.println("Top two numbers : First -  " 
     + firstNum + " Second " + secondNum);







}}
