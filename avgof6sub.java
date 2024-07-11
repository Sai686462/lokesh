import java.util.*;
class avgof6sub
{
public static void main(String args[])
{
Scanner sc=new Scanner(System.in);
int  m1,m2,m3,m4,m5,m6,sum;
float avg;
System.out.println("enter the 6 subjects marks");
m1=sc.nextInt();
m2=sc.nextInt();
m3=sc.nextInt();
m4=sc.nextInt();
m5=sc.nextInt();
m6=sc.nextInt();
if(m1<35||m2<35||m3<35||m4<35||m5<35||m6<35)

System.out.println("fail");

else
{
sum=m1+m2+m3+m4+m5+m6;
avg=sum/6.0f;
if(avg>=35 && avg<50)
System.out.println("third division");
else if(avg>=50 && avg<70)
System.out.println("second division");
else if(avg>=70 && avg<90)
System.out.println("first division");
else
System.out.println("distinction");
}
}
}


 

