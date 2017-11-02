import java.util.Scanner;
abstract class Factory
{abstract void salary();
abstract void bonusSalary();

} 
class employee extends Factory
{ String name,djoin,jdescript;
	 int basic;
	int Salary;
	float performance;
	employee()
	{basic=10000;

	}
	int bonus;
	
	void salary()
	{
		Salary=basic+basic/2-(basic)/20;
	}
	void bonusSalary()
	{
	 Salary=Salary + bonus;

	}

}
class teamleader extends employee
{String teamname;
	
void salary()
	{
		Salary=basic+basic/2-(basic)/10;
	}
	void bonusSalary()
	{
	 Salary=Salary+3*bonus/2;
	}
}
class manager extends teamleader
{ String feedback;
	
	void salary()
	{
		Salary=basic+2*basic/3-(basic)/20;
	}
	void bonusSalary()
	{
	 Salary=Salary+2* bonus;
	}

}
class executive extends teamleader
{ int meetings;
	void salary()
	{
		Salary=basic*2-(basic)/10;
	}
	void bonusSalary()
	{
	 Salary=Salary +3* bonus;
	}

}
class inheritance
{public static void main(String[] args) {
	Scanner i=new Scanner(System.in);
	executive ex=new executive();
	employee emp=new employee();
	manager man=new manager();
	teamleader t=new teamleader();
	int k;
	employee temp;
	
	for(k=1;k<=4;k++)
	{System.out.println("=======================");
		if (k==1)
	
		{temp=emp;
			System.out.println("enter detail of employee");}
	 else if (k==2)
	 {
	 	temp=t;
	 	System.out.println("enter details of team leader");
	 }
	 else if(k==3)
	 {
	 	temp=man;
	 	System.out.println("enter details of manager");
	 }
     else
     { temp=ex;
     	System.out.println("enter details of executive");

     }
     System.out.println("enter name");
     temp.name=i.next();
     System.out.println("enter date of joining");
     temp.djoin=i.next();
     System.out.println("enter job description");
     temp.jdescript=i.next();
     System.out.println("perforamce rating 1-5");
     temp.performance=i.nextFloat();
     System.out.println("enter basic pay");
     temp.basic=i.nextInt();
     System.out.println("enter bonus");
	temp.bonus=i.nextInt();
	if(k==2)
		{System.out.println("team name");
		t.teamname=i.next();}
	if(k==3)
		{System.out.println("feedback");
		man.feedback=i.next();}	
	}
	

	for(k=1;k<=4;k++)
	{System.out.println("=======================");
		if (k==1)
		{temp=emp;
			System.out.println(" detail of employee");
		    }
	 else if (k==2)
	 {
	 	temp=t;
	 	System.out.println("details of team leader");
	 }
	 else if(k==3)
	 {
	 	temp=man;
	 	System.out.println("details of manager");
	 }
     else
     { temp=ex;
     	System.out.println("details of executive");

     }
     System.out.println("=======================");
     System.out.print(" name:"+temp.name);
     System.out.print("\ndate of joining:"+temp.djoin);
     System.out.println("\n job description:"+temp.jdescript);
     System.out.println("perforamce rating 1-5:"+temp.performance);
     temp.salary();
	System.out.println("salary before bonus:Rs"+temp.Salary);
	temp.bonusSalary();
	System.out.println("salary after bonus:Rs"+temp.Salary);

	if(k==2)
		{System.out.println("team name:"+t.teamname);}
	if(k==3)
		{System.out.println("feedback:"+man.feedback);}
	
  	}

  }
}
