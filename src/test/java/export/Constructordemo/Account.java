package export.Constructordemo;

public class Account 
{
	//below are the instance variables
	private String accountnumber="12345";
	private String accountname;
	private String emailaddress;
	private double deposit =200.00;
	private double withrwmoney=400.00;
	private String address;
	private int depositinInt;
	private int withdrwalmoneyinInt;
	private String PANCARD;
	final String BankNAme="ICICIBANK";
	
	/*for this call accountname and accountnumber = parameter paass through
		constructor
		and other values should be value passing through this class
		also below constructor metohd clled as Instance method and mutator method of instance method */
	
	
	public Account(String accountnumber, String accountname,
			String emailaddress, String address, double deposit,
			double withrwmoney, String PANCARD, String BankName)
	{
		
		this.accountname=accountname; 
		this.accountnumber=accountnumber;
		this.PANCARD=PANCARD;
		//this.BankNAme=BankName; we can not use this keyword if we declared final variable value in instance variable
		System.out.println("Account number"+accountnumber);
		System.out.println("Account Name"+accountname);
		System.out.println("emailaddress"+emailaddress);
		System.out.println("address"+address);
		
		System.out.println("Account deposit"+deposit);
		System.out.println("Account withrwmoney"+withrwmoney);
		System.out.println("PANCARD="+PANCARD);
		System.out.println("BANK NAME:"+BankNAme);
	}
	
	public Account(String accountnumber, String accountname,
			String emailaddress, String address, int depositinInt,
			int withdrwalmoneyinInt, String PANCARD)
	{
		
		this.accountname=accountname;  //this statement store in pass value through method in this class instance variable
		this.accountnumber=accountnumber;
		this.PANCARD=PANCARD;
		System.out.println("Account number"+accountnumber);
		System.out.println("Account Name"+accountname);
		System.out.println("emailaddress"+emailaddress);
		System.out.println("address"+address);
		
		System.out.println("Account deposit"+depositinInt);
		System.out.println("Account withrwmoney"+withdrwalmoneyinInt);
		System.out.println("PANCARD="+PANCARD);
		
	}
	
	public String enteraccountname() // this is an Accessor method of Instance method type
	{
		
		return accountname;
	}
	public String enteraccountnumber()// this is an Accessor method of Instance method type
	{
		
		return accountnumber;
		
	}
	public double enterdeposite()
	{
		return deposit;
	}
	public double widrelmoney()
	{
		return withrwmoney;
	}
	public String getpancard()
	{
		return PANCARD;
	}
}
