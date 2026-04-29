package export.List;

import java.util.Iterator;
import java.util.Stack;

public class stackScenariuos {

	public static void main(String[] args)
	{
		Stack<String> st= new Stack<String>();
		//add element in stack
		st.push("India");
		st.push("America");
		st.push("Canada");
		st.push("Rusia");
		st.push("India");
		System.out.println(st);
		//remove top element from stack
		st.pop();
		System.out.println(st);
		String data=st.get(2);
		System.out.println("Second data from link="+data);
		//Retrieve element from stack
		Iterator it = st.iterator();
		
		while(it.hasNext())
		{
			String country_name=(String) it.next();
			System.out.println("country_name="+country_name);
		}
		

	}

}
