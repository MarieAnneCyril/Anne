/*How to move with offer*/
import java.util.Scanner;
class test{
public static void main(String args[]){
 Scanner sc=new Scanner(System.in);
int pro1=sc.nextInt();
int pro2=sc.nextInt();
int pro3=sc.nextInt();
int pp=0;
if(pro1<pro2){
if(pro1<pro3){
pp=pro1;
}
}
else if(pro2<pro3){
pp=pro2;
}
else{
pp=pro3;
}
System.out.println("least product value" +pp);
int ad=pro1+pro2+pro3;
double off1=ad-(ad*0.2);
int off2=ad-pp;
System.out.println("total amount with 20% discount" +off1);
System.out.println("total amount with least product" +off2);
if(off1>off2){
System.out.println("Go for offer 1");
}
else{
System.out.println("Go for offer 2");
}
}}
