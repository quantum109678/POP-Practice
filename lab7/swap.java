import java.util.Scanner;
class inter
{ int temp;
	void Swap(int a,int b)
	{
		
		temp=a;
		a=b;
		b=temp;
		System.out.println("a="+a+"\tb="+b);

	}
void Swap(swap o)
{temp=o.b;
	o.b=o.a;
	o.a=temp;
}

}
class swap
{
	int a,b;
	public static void main(String[] args) {
		swap o=new swap();
		int x,y;
		inter p=new inter();
		Scanner i=new Scanner(System.in);
		System.out.println("enter two numbers,a and b");
		x=i.nextInt();
		y=i.nextInt();
		o.a=x;
		o.b=y;
		System.out.println("swap by call by value");
		p.Swap(x,y);
		p.Swap(o);
		System.out.println("swap by call by reference\n a="+o.a+"\tb="+o.b);

	}
}