package export.Interfaces;

public class statebankofindia extends clintrequiremnt
{
	//BankingFunction driver= new BankingFunction(); we can not create object of interface
	
	BankingFunction driver = new clintrequiremnt();
	clintrequiremnt driver1=new clintrequiremnt();
	
	
	public void dostabankfunction()
	{
		driver.addmonytoaccount();
		driver.cgeckbalance();
		driver.transfermoney();
		
		driver1.addmonytoaccount();
		driver1.cgeckbalance();
		driver1.transfermoney();
		driver1.widrawalmoney();
		driver1.printpassbook();
	}
	
	public void addFF()
	{
		System.out.println("ADD FF");
	}
}
