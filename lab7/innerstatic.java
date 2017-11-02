import java.util.Scanner;
class outer
{int a;
int b;
outer(int x,int y)
{a=x;
b=y;
}
int mul()
{
	return(a*b);
}
class inner
{int add()
	{
		return(a+b);
	}

}
static class staticclass
{int sub(int a, int b)
	{
		return (a-b);
	}

}
inner ob=new inner();

}
class innerstatic
{public static void main(String[] args) {
	Scanner i=new Scanner(System.in);
	System.out.println("enter two numbers");
	int x=i.nextInt();
	int y=i.nextInt();
	outer o =new outer(x,y);
	System.out.println("Mul(a,b)="+o.mul());
	outer.inner in= o.new inner();
	System.out.println("add(a,b)="+in.add());
	outer.staticclass s =new outer.staticclass();
	System.out.println("sub(a,b)="+s.sub(x,y));
}

}