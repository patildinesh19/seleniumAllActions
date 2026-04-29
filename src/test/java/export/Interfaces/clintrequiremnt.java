package export.Interfaces;

public class clintrequiremnt implements BankingFunction {

	public static void main(String[] args) 
	{
		clintrequiremnt cl= new clintrequiremnt();
		
		/*implemented class method can access only all implemented method and 
		 * it own class methods*/
		cl.cgeckbalance();
		cl.widrawalmoney();
		cl.printpassbook();
		
		BankingFunction bk= new clintrequiremnt();
		bk.addmonytoaccount();
		bk.transfermoney();
		bk.cgeckbalance();
		/*bk.widrawalmoney(); bk is Object of class clintrequiremnt but reference
		 * variable for interface class so it will access method for interface class */
		
		
	}

	@Override
	public void transfermoney() {
		// TODO Auto-generated method stub
		System.out.println("transfer money sucessfully");
	}

	@Override
	public void addmonytoaccount() {
		// TODO Auto-generated method stub
		System.out.println(" add money sucessfully");
	}

	@Override
	public void cgeckbalance() {
		// TODO Auto-generated method stub
		System.out.println("check money sucessfully");
	}

	public void widrawalmoney()
	{
		System.out.println("widrwal money sucessfully");
	}
	public void printpassbook()
	{
		System.out.println("passbook printed");
	}
}
