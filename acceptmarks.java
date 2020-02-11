5. Write a program to accept a student’s name and three marks. Display the total and average. Display result as
 First class, Second class, Pass class and Fails.

import java.util.Scanner;
class acceptmarks{
public static void main(String args[]){
String name;
int s1,s2,s3,tot,avg;
Scanner sc=new Scanner(System.in);
System.out.println("enter the name");
name=sc.nextLine();
System.out.println("enter the marks");
s1=sc.nextInt();
s2=sc.nextInt();
s3=sc.nextInt();
tot=s1+s2+s3;
System.out.println("the total marks is"+tot);

avg=tot/3;
System.out.println("the avg is"+avg);
if(avg>85){
System.out.println("first class");
}
else if(avg>50){
System.out.println("second class");
}
else{
System.out.println("pass");
}


}}
