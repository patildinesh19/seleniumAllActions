package utils;

public class Helper {
	
	public String replacexpathvalue(String xpath, String value)
	{
		return xpath.replace("$VALUE$", value);
	}

}
