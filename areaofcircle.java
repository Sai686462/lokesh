//write a java program which reads radius as input and find the area and circumference of a circle
import java.util.*;
class areaofcircle
{
public static void main(String args[])
{
Scanner sc=new Scanner(System.in);
 float radius ,area,circumference;
System.out.println("enter the radius");
radius=sc.nextFloat();
area =3.142f*radius*radius;
circumference =2*3.142f*radius;
 System.out.println("area of circle="+area);
System.out.println("circumference of circle="+circumference);
}
}

