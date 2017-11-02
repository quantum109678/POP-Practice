package attendence_system;
import java.util.*;
interface management
{
	void Hours();
	void Wage();
	int [] holidays();
}
public class attendence implements management
{  public int wage;
	public int hours=0;
	int salary,overtime;
	int attendarray[]=new int[10];
	Scanner io=new Scanner(System.in);
	public attendence(int sal,int over)
	{
		salary=sal;
		overtime=over;
	}
	public void Hours()
	{ for(int i=0;i<10;i++)
			hours=hours+attendarray[i];
	}
	public void Wage()
	{if(hours>=70 && hours<=80)
		wage=salary;
	else if(hours>170)
		wage=salary+overtime*(hours-80);
	else 
		wage=salary-overtime*(70-hours)/8;
	}
	public int [] holidays()
	{int holi[]=new int[10];
		for(int i=0,j=0;i<10;i++)
		{if (attendarray[i]==0)
			{holi[j]=i+1;
				j++;}
		}
		return (holi);
	}
	public void entry()
	{ System.out.println("enter no. of hours of working in 10 days in a row ");
		for(int i=0;i<10;i++)
		{ attendarray[i]=io.nextInt();
		}
	}


}
