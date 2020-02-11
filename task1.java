/*Check the lucky customer*/

import java.util.Scanner;
 class task1 {
public static void main(String args[]){
Scanner sc=new Scanner(System.in);
int bill=sc.nextInt();
int date=sc.nextInt();
int m=bill%10;
int n=bill%100;
if(((date>0 && date <=31) && (bill%date==0)) || ((date>0 && date <=31) && (m==date)) || ((date>0 && date <=31) && (n==date))) 
{
System.out.println("Lucky customer");	
}
else {
System.out.println("Not a lucky customer");	
}}}
