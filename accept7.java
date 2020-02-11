//7. Write a program to accept an alphabet and display 
whether its a vowel or consonant
import java.util.Scanner;
class accept7{
public static void main(String args[])
{
Scanner sc=new Scanner(System.in);
char ch;

System.out.println("ENTER THE ALPHABET");
ch=sc.next().charAt(0);
if(ch=='a'||ch=='e'||ch=='i'||ch=='o'||ch=='u'||ch=='A'||ch=='E'||ch=='I'||ch=='O'||ch=='U'){
System.out.println("IT IS A VOWEL");
}
else
{
System.out.println("IT IS A CONSONANT");
}


}}
