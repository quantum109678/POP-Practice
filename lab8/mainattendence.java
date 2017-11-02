import attendence_system.attendence;
import java.util.Scanner;
public class mainattendence
{
	public static void main(String[] args) {
		attendence p1= new attendence(10000,250);
		p1.entry();
		int a[]=p1.holidays();
		p1.Wage();
		System.out.println("holidays taken are:");

		for(int i=0;i<10;i++)
		{if(a[i]==0)
			break;
		 System.out.println("day " +a[i]);
		}
		p1.Hours();
		System.out.println("working hours " +p1.hours);
		System.out.println("wage= Rs" +p1.wage);

	}
}