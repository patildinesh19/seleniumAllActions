package export.List;

import java.util.HashSet;
import java.util.Iterator;

public class hasset
{
	
	public static void main(String arg[])
	{
		HashSet<String> ht= new HashSet<String>();
		ht.add("India");
		ht.add("Nepal");
		ht.add("Buthan");
		System.out.println(ht);
		
		ht.add("India"); // hashset will not allowed duplicate value
		System.out.println(ht);
		//out put is below 
		/*[Buthan, Nepal, India]
			[Buthan, Nepal, India] */
		
		//Iterate the hashset values for retriving the element from 
		Iterator it =ht.iterator();
		
		System.out.println("retrive element from Hashset:");
		while(it.hasNext())
		{
			String s= (String) it.next(); 
			/*string cascading required, because in any List or hashset item store as object and 
			 if we want to retrieve value of object than we need to cascading object with Object data type
			 than we can do operation on Object.
			 */
			System.out.println(s);
		}
	}
}
