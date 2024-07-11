import java.util.*;
class classcredentials
{
public static void main(String args[])
{
Scanner sc=new Scanner(System.in);
string username="satya@tech.com",uname;
int password=1234,pwd;
System.out.println("enter the username");
uname=sc.next();
System.out.println("enter the password");
pwd=sc.nextInt();
if(username.equals(uname))
{
if(password==pwd)
{
System.out.println("valid credentials login is successful");
}
else
{
System.out.println("invalid password please try again");
}
}
else
{
System.out.println("invalid username please try again");
}
}
}




