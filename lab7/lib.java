import java.util.Scanner;
class books
{int genre;
String name;
String author;
}
class arrange
{static int count;
 static Scanner i= new Scanner(System.in);
	static {
	System.out.println("====Welcome to XYZ Library====\n");

	}
	void entry(books s)
	{
	 System.out.println("Enter book name");
	 s.name=i.next();
	 System.out.println("enter genre");
	s.genre=i.nextInt();
	 System.out.println("Enter author name");
	 s.author=i.next();
	}
	static void fiction(books o[],int n)
	{ count=0;
		for(int k=0;k<n;k++)
		{if (o[k].genre==1)
			{System.out.println(o[k].name+"\t"+o[k].author);
			count++;}
		}
		System.out.println("total no. of books: "+count);
	}
	static void nonfiction(books o[],int n)
	{ count=0;
		for(int k=0;k<n;k++)
		{if (o[k].genre==2)
			{System.out.println(o[k].name+"\t"+o[k].author);
			count++;}
		}
		System.out.println("total no. of books: "+count);
	}
}
class lib
{
	public static void main(String[] args) {
		Scanner i = new Scanner(System.in);
	int choice,menu=1;
	int n=0;
	int select=0;
	books [] s=new books[20] ;
	for(int j=0;j<20;j++)
	{s[j]=new books();}
	arrange a=new arrange();
	while(menu==1){
	System.out.println("1.insert\n2.search");
	System.out.println("enter your choice");
	choice=i.nextInt();
	switch(choice)
	{
		case 1:System.out.println("genres\n1.fiction\n2.non-fiction\n enter appropriate choice while entering genre");
				System.out.println("enter no. of books");
				n=i.nextInt();
				for(int j=0;j<n;j++)
				a.entry(s[j]);
				System.out.println("to return back to main menu press 1 else 0");
				menu=i.nextInt();
				break;
		case 2: System.out.println("select genre\n1.fiction\n2.non-fiction");
				select=i.nextInt();
				System.out.println("book name\tauthor name");
				if (select==1)
				arrange.fiction(s,n);
				else if(select==2)
				arrange.nonfiction(s,n);
				else
				System.out.println("wrong choice");
				
				System.out.println("to return back to main menu press 1 else 0");
				menu=i.nextInt();
				break;
	}
   }
  }
 }
