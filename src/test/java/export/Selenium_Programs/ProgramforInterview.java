package export.Selenium_Programs;

import java.util.Arrays;

public class ProgramforInterview 
{

	public static void main(String[] args) 
	{
		//reverse the string
		String abc="dinesh";
		char ch=0;
		String reverse="";
		for(int i=abc.length()-1;i>=0;i--)
		{
			ch=abc.charAt(i);
			reverse=reverse+ch;
		}
		System.out.println("reverse string="+reverse);
		//reverse the arrary
		int a[]={10,20,30,50,70};
		for(int i=a.length-1;i>=0;i--)
		{
			System.out.println("array in reverse order"+a[i]);
		}
		
		// sort the string
		String xyz="dinesh";
		char ch1[];
		ch1=xyz.toCharArray();
		Arrays.sort(ch1);
		System.out.println("String with sorted order"+new String(ch1));
		
		// sort the array with descending order
		int b[]={9,6,3,1,4,2};
		int temp=0;
		for(int i=0;i<b.length;i++)
		{
			for(int j=i+1;j<b.length;j++)
			{
				if(b[i]>b[j])
				{
					temp=b[i];
					b[i]=b[j];
					b[j]=temp;
				}
			}
		}
		for(int i=0;i<b.length;i++)
		{
			System.out.println(b[i]);
		}
		
		//sum of number from string
		String d="67894";
		char ch3=0;
		int sum=0;
		for(int i=0;i<d.length();i++)
		{
			ch3=d.charAt(i);
			sum=sum+Character.getNumericValue(ch3);
		}
		System.out.println("SUM="+sum);
		
		//find out the dupicate value in string 
		
		String c="dineshdinngk";
		char ch4[];
		ch4=c.toCharArray();
		
		for(int i=0;i<c.length();i++)
		{	int count =1;
			for(int j=i+1;j<c.length();j++)
			{
				if (ch4[i]==ch4[j])
				{
					System.out.println("chrachter is duplicate :"+ch4[i]);
					count ++;
					
				}
			}
			if(count>1)
			{
				System.out.println("duplicate character count is "+count);
			}
			
			
		}	
		
	}
	
}

