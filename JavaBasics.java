import java.util.*;

public class JavaBasics{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        // System.out.println("Enter your number");
        // // Boolean  boolean1=sc.nextBoolean();//only takes input as true or false 
        // //  System.out.println(boolean1);
        // long var1=sc.nextLong();
        // System.out.println(var1);

        // float r=sc.nextInt();
        
        // float area=3.14f*r*r; 
        // //cannot convert from float to double so write 3.14f
        // System.out.println(area);

        // float num2=sc.nextInt();
        // System.out.println(num2);

/* 
int a=24;
float b=a;
System.out.println(b); //type conversion
*/


/*

// This is type casting 
        float ab=25.12f;
        //  int bc=ab;  //this will give an error 
        //for typecasting
        int bc= (int) ab;
        System.out.println(bc);
 */

 /*
  
 * Type Promotion  Rule:1
(1) char a='a';
    char b='b';
    System.out.println((int) a);
    System.out.println((int) b);
    System.out.println(a);

(2)
    char a='a';
    char b='b';
    char c=a-b;

    possible lossy conversion from int to char
    char c=a-b;
    Although none of them is in integer

(3) 
    short a=25;
    byte b=25;
    char c='c';
    byte bt=a+b+c;

(4)
    short a=25;
    byte b=25;
    char c='c';
    byte bt=a+b+c;
    possible lossy conversion from int to byte although none of the a,b,c is in int
    byte bt=a+b+c;
    
    we can typecast above asnwer but it will not make any sense
short a=25;
    byte b=25;
    char c='c';
    byte bt=(byte) (a+b+c);

* Type Promotion  Rule:2
  sabse bada data jis type ka 
  us mein type promotion will be done

here biggest data is of double so all convert to double
(1) 
int a=10;
float b=20.25f;
long c=25;
double d=30;
double ans=a+b+c+d;
System.out.println(ans);

(2)
int a=10;
float b=20.25f;
long c=25;
double d=30;
int ans=a+b+c+d;
System.out.println(ans);

possible lossy conversion from double to int
int ans=a+b+c+d;   all gets converted to double so ans should be declare as double by type conversion

(3)

byte b=2;
b=b*2; -->Both this statment are wrong
byte a=b*2; -->Both this statment are wrong

as b*2 is expression in byte there will be type promotion of this expression in int
and we are trying to store this int in byte so it throws an error 

(4)

byte b=2;

byte a=(byte) b*2; -->This is the correct statement give answer as 10 





*/







}
}