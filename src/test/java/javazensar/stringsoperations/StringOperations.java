package javazensar.stringsoperations;

public class StringOperations {

	public static void main(String[] args) {
		
		String s="Zensar"; 
		// object is created in SCp
		
		String s1= new String("Zensar"); 
		// object is not created in SCP and object is created in heap, because in SCP object is already present
		if(s==s1)
		{
			System.out.println("Zensar string is equal");
			
		}
		else
		{
			System.out.println("Zensar string is not equal");
		}
		
		String z1="Patil"; 
		// object is created in SCP
		String z2="Patil"; 
		// object is not created in SCP, so no object is created and z2 to is referring z1
		if(z1==z2)
		{
			System.out.println("Patil String is equal");
		}
		else
		{
			System.out.println("Patil String is not equal");
		}
		String s2=new String("Dinesh"); 
		// 2 object created one in SCP and another in heap
		String s3= new String("Dinesh"); 
		// only one object created in heap and not in SCP because in SCP it is already present
		if(s2==s3)
		{
			System.out.println("Dinesh String is equal");
		}
		else
		{
			System.out.println("Dinesh String is not equal");
		}
		
		
		z1.concat("Thakur");
		
		System.out.println(z1); // it will print only z1 value, so String is immutable
		
		z1=z1.concat("Mangesh");
		
		System.out.println(z1);
		
		// using StringBuffer and StringBufferreader we can make string as mutable
		String name1 = "Dinesh";
		StringBuffer name = new StringBuffer("Dinesh");
		// using connect method only we are printing the value not actualy changing the value
		System.out.println(name1.concat("Patil"));
		System.out.println(name1);
		//using StringzBuffer actually changing the value of String
		System.out.println(name.append("Patil"));
		System.out.println(name);
		
	
	}
	
	
	

}
