import java.util.Scanner;
class pali
{
public static void main(String[] args)
{ 
int sum=0,rem,temp;
Scanner in= new Scanner(System.in);
System.out.println("enter the number to check palindrome");
int num=in.nextInt();
temp=num;
while(num>0)
{
 rem=num%10;
sum=(sum*10)+rem;
num=num/10;
}
if(temp==sum)
{
System.out.println("palindrom");
}
else
{
System.out.println("not palindrom");
}
}
}





