package export.List;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.stream.*;
public class arraylistdemo
{
	public static void main (String arg[])
	{
		System.out.println("------------------ArrayList-------------------");
		ArrayList<String> a= new ArrayList<String>();
		String v="dinesh";		
		a.add("Dinesh");
		a.add("Rajdeep");
		a.add("Rahul");
		a.add("Dinesh"); // we can add duplicate values in arrayList
		System.out.println(a);
		a.add(0, "Anirudha");
		System.out.println(a);
		System.out.println(a.contains("Dinesh")); // it will check Dinesh is present or not in arraylist
		a.remove(1);
		System.out.println(a);
		//Retrieving data from specific location from stack
		String data= a.get(2);
		System.out.println("Second data from aaray list="+data);
		//Retrieve each element from arraylist
		
		Iterator itt=a.iterator();
		while(itt.hasNext())
		{
			String person_name=(String) itt.next();
			System.out.println("Item inaaray list="+person_name);
		}
		
		long c=a.stream().filter(s->s.startsWith("D")).count();
		System.out.println("count of word start with D is "+c);
		//from list only print the first 2 name
		
		a.stream().filter(s->s.length()>5).forEach(s->System.out.println("print string how has more then 5 character"+s));
		
		//print only upper case word which are having character "R"
		
		a.stream().filter(s->s.contains("R")).map(s->s.toUpperCase()).forEach(s->System.out.println
				("Print all word in caps how is having character R"+s));
		
		//print all the word from list in upper case
		a.stream().map(s->s.toUpperCase()).forEach(s->System.out.println(s));
		
		//print all word in upper case and in sorted order
		a.stream().map(s->s.toUpperCase()).sorted().forEach(s->System.out.println("list in sorrted order"+s));
		
		// hashset
		System.out.println("------------HashSet------------");
		HashSet<String> b= new HashSet<String> ();
		b.add("JAVA");
		b.add("Paython");
		b.add("C++");
		b.add("JAVA");
		System.out.println(b);
		System.out.println(b.contains("JAVA"));
		System.out.println(b.contains("C"));
		
		//Iterator is an Interface and we can used for traveling the item of hashset

		Iterator<String> it= b.iterator();
		while(it.hasNext())
		{
			System.out.println(it.next());
		}
		
	//HashMAP in hasmap we can store item at define Index which is not possibel in set or hashset	
		System.out.println("---------hashMap----------");
		HashMap<Integer,String>hm=new HashMap<Integer,String>();
		hm.put(0, "Pune");
		hm.put(1, "Mumbai");
		hm.put(2, "Nashik");
		hm.put(3, "Nagpur");
		hm.put(4, "kolhapur");
		hm.put(5, "Nashik"); //we can add duplicate values
		System.out.println(hm);
		
		
		//difference between hashmap and hashtable
		/*both are same 
		 * 1 . hashmap is non syncronized means mutiple program can access hasmap
		 *     where hashtable is syncronized means at time only one program can access hashttble 
		 * 2.  under hashmap we can store "Null" value or or null key "" 
		 *     where under hash table we can not store null value or null key 
		 * 3.  we can iterate values in hashmap using Iterator interface
		 *     we can not Iterator values under hashtable  */
		
		
		
		//concaniniate two collection class a and b
		
		Stream.concat(a.stream(),b.stream()).forEach(s->System.out.println(s));
		System.out.println("-----------------------");
		// then sort the concatenated stream
		Stream.concat(a.stream(),b.stream()).sorted().forEach(s->System.out.println(s));
		
		//from concatenated stream will check any value is present or not in that stream
		boolean flag= Stream.concat(a.stream(), b.stream()).anyMatch(s->s.equalsIgnoreCase("Paython"));
		System.out.println("match flage= :"+flag);
		
		/*stream collection , if we have list , will convert that list into stream and on that stream will perform 		
		any operation and will find out new stream and if you want to pass that stream to new class or another method
		then again we need to convert that stream to List or any collection class for that we will use stream collection*/
		
		/*from below syntax will concatenating both list and then
		Perform upper case operation and converting upper case stream as list to new class or method*/
		
		List<String>ls=Stream.concat(a.stream(), b.stream()).sorted().map(s->s.toUpperCase())
						.collect(Collectors.toList());
		
		Iterator<String> it1= ls.iterator();
		while(it1.hasNext())
		{
			System.out.println("print all values from list ="+it1.next());
		}
		
		// print only first 3 vlaues from ablove list
		System.out.println("----only print 1st 3 vlaue from new list-------");
		ls.stream().limit(3).forEach(s->System.out.println(s));
	}
}
