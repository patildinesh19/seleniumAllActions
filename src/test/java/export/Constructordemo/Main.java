package export.Constructordemo;

import java.util.ArrayList;
import java.util.Iterator;

public class Main 
{	
	public static void main(String str [])
	{
		ArrayList<Account>st=new ArrayList<Account>();//Arraylist for Account object
		
		Account ac=new Account("789067","Mangesh Patil","mangesh.patil@gmail.com","chinchwad",100.00,50.70,"AZXPP3259Q","AXIX Bank");
		//above will call constructor
		String accountname=ac.enteraccountname();
		String accountnumber=ac.enteraccountnumber();
		
		System.out.println("accountname"+accountname);
		System.out.println("accountnumber"+accountnumber);
		
		
		double wd=ac.widrelmoney();
		System.out.println(wd);
		double dop=ac.enterdeposite();
		System.out.println(dop);
		st.add(ac);
	Account bc=	new Account("789067","ganesh Patil","ganesh.patil@gmail.com","pipari",900.00,900.70,"ACV67890","State Bank");
		
		
		//instanceof operator is used to check object is belongs to class or not
		
		boolean x=ac instanceof  Account;
		System.out.println(x);
		st.add(bc);
	Account cc=	new Account("909090","Priyanka Ptil","priyanka@gmail.com","kalamboli",300,800,"afds435435");
	
		
		st.add(cc);
		System.out.println(st.size());
	
		for(int i=0;i<st.size();i++)
		{
			Account obj=st.get(i);
			System.out.println(obj.enteraccountname());
			System.out.println(obj.enteraccountnumber());
			System.out.println(obj.getpancard());
		}
		
	}
}
