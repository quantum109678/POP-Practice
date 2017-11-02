import java.util.Scanner;
 class Bank
{ int bal=10000;	
  abstract void withdraw();
  abstract void deposit();
}
class A extends Bank
{Scanner in=new Scanner(System.in); 
 void withdraw()
	{System.out.println("current balance:Rs"+bal);
		System.out.println("enter amount to withdraw");
	 int w=in.nextInt();
	 if (bal-w >500)
	 {bal=bal-w;
	 	System.out.println("Transaction successful\nremaining balance:Rs"+bal);

	 }
	 else
	 {
	 	System.out.println("low  balance,transaction unsuccessful");
	 }

	}
	void deposit()
	{System.out.println("enter amount to deposit");
	 int d=in.nextInt();
	 bal=bal+d;
	 System.out.println("New balance is Rs"+bal);
	}

}
class bank
{public static void main(String[] args) {
	Scanner in=new Scanner(System.in); 
	Bank b=new A();
	System.out.println("==bank ABXC====");
	System.out.println("1.Deposit\n2.withdraw\n choose appropriately");
	int choice=in.nextInt();
	if (choice==1)
		b.deposit();
	else if(choice==2)
		b.withdraw();
	else
		System.out.println("wrong choice");
}

}