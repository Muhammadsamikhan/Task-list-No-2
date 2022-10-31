import java.util.*;
public class Task8
{
	public static void main(String[] args) {
		int x,y,sum,sub,mul;
		float div;
		Scanner n1=new Scanner(System.in);
		Scanner n2=new Scanner(System.in);
		System.out.println("Enter any two number");
		x=n1.nextInt();
		y=n2.nextInt();
		sum = x+y;
		sub=x-y;
		mul=x*y;
		div=x/y;
		System.out.println(sum);
		System.out.println(sub);
		System.out.println(mul);
		System.out.println(div);
	}
}
