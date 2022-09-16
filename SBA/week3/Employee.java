package sba2.ust;

import java.io.FileOutputStream;
import java.io.FileReader;

import org.apache.poi.hssf.usermodel.HSSFRow;
import org.apache.poi.hssf.usermodel.HSSFSheet;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;

public class Employee {
	public static void main(String args[]) {
		JSONParser p=new JSONParser();
		HSSFWorkbook w=new HSSFWorkbook();
		HSSFSheet s=w.createSheet("sheet1");
		
		HSSFRow r=s.createRow(0);
		r.createCell(0).setCellValue("ID");
		r.createCell(1).setCellValue("Name");
		r.createCell(2).setCellValue("Email");
		r.createCell(3).setCellValue("Password");
		r.createCell(4).setCellValue("About");
		r.createCell(5).setCellValue("Token");
		r.createCell(6).setCellValue("Country");
		r.createCell(7).setCellValue("Location");
		r.createCell(8).setCellValue("lng");
		r.createCell(9).setCellValue("lat");
		r.createCell(10).setCellValue("DOB");
		r.createCell(11).setCellValue("Gender");
		
	//	FileOutputStream f=new FileOutputStream("C:\\Users\\ustjavafsdb205\\Downloads\\Employee.xlsx");
		
		try {
			FileOutputStream f=new FileOutputStream("C:\\Users\\ustjavafsdb205\\Downloads\\Employee_Data.xlsx");
			JSONArray a=(JSONArray) p.parse(new FileReader("C:\\Users\\ustjavafsdb205\\Downloads\\EmployeeData.json"));
			for(int j=1;j<=(a.size()+1);j++){
				for(int i=0;i<a.size();i++) {
					JSONObject obj=(JSONObject)a.get(i);
					long id=(long) obj.get("id");
					
					 String name=(String)obj.get("name");
					 name=name.toUpperCase();
					 String email=(String)obj.get("email");
					 String password=(String)obj.get("password");
					 String about=(String)obj.get("about");
					 String token=(String)obj.get("token");
					 String country=(String)obj.get("country");
					 String location=(String)obj.get("location");
					 long lng=(long)obj.get("lng");
					 long lat=(long)obj.get("lat");
					 String dob=(String)obj.get("dob");
					 long gender=(long)obj.get("gender");
					 
					 HSSFRow r1=s.createRow(i+1);
					 r1.createCell(0).setCellValue(id);
						r1.createCell(1).setCellValue(name);
						r1.createCell(2).setCellValue(email);
						r1.createCell(3).setCellValue(password);
						r1.createCell(4).setCellValue(about);
						r1.createCell(5).setCellValue(token);
						r1.createCell(6).setCellValue(country);
						r1.createCell(7).setCellValue(location);
						r1.createCell(8).setCellValue(lng);
						r1.createCell(9).setCellValue(lat);
						r1.createCell(10).setCellValue(dob);
						r1.createCell(11).setCellValue(gender);
					 
					 
				}
				w.write(f);
			}
			System.out.println("Data is written Successfully");
				
			}
		catch(Exception e) {
			e.printStackTrace();
		
		}
		
	}

}
