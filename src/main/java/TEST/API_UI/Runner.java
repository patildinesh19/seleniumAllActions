package TEST.API_UI;

import com.fasterxml.jackson.core.exc.StreamWriteException;
import com.fasterxml.jackson.databind.DatabindException;
import com.fasterxml.jackson.databind.ObjectMapper;

import pojo.Pojoforempdetails;
import java.io.*;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class Runner {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		createjosnfile();
		
	}
	
	public static void createjosnfile() throws IOException, IOException, IOException
	{
		Pojoforempdetails emp = new Pojoforempdetails();
		emp.setEmpid(1234);
		emp.setEmp_name("Dinesh");
		emp.setStatus(true);
		emp.setEmailid("dinesh.patil@gmail.com");
		ObjectMapper o = new ObjectMapper();
		o.writeValue(new File(System.getProperty("user.dir") + "\\src\\test\\java\\TestData\\Emp.json"), emp);
	}
	
	public static ArrayList<Object> readexcelfile(String sheetname) throws IOException
	{
		ArrayList<Object> app1 = new ArrayList<Object>();
		FileInputStream file = new FileInputStream(System.getProperty("user.dir") + "\\src\\test\\java\\TestData\\readexcelfile.csv");
		XSSFWorkbook workbook = new XSSFWorkbook(file);
		XSSFSheet sheet = workbook.getSheet(sheetname);
		Iterator<Row> roweterator = sheet.iterator();
		Row firstrow = roweterator.next();
		while(roweterator.hasNext())
		{
			Row row =  roweterator.next();
			Iterator<Cell> celleterator = row.cellIterator();
			while (celleterator.hasNext())
			{
				Cell cell = celleterator.next();
				app1.add(cell.getStringCellValue());
			}
			
		}		
		return app1;
		
		
	}

}
