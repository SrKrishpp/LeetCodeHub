import java.util.Scanner;
public class rectangle
{
	public static void main(String[] args)
	{
	Scanner in=new Scanner(System.in);
	System.out.println("enter width and length of rectangle");
	double width=in.nextDouble();
	double length=in.nextDouble();
	System.out.println("area is "+(length*width));
	System.out.println("perimeter is "+ (2*(length+width)));
	}
}