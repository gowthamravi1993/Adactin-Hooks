package org.utils;

import java.io.File;
import java.util.ArrayList;

import net.masterthought.cucumber.Configuration;
import net.masterthought.cucumber.ReportBuilder;

public class ReportsUtils {
	public static  void generatejvmReport(String s) {
		File f= new File(System.getProperty("user.dir")+"\\src\\test\\resources\\Reports\\jvmReport");
		Configuration con = new Configuration(f, "Adactin web App Automation");
		con.addClassifications("platform name", "windows10");
		con.addClassifications("Build url", "http://adactinhotelapp.com/");
		con.addClassifications("Browser version", "chrome");
		con.addClassifications("Browser version", "116.0");
		con.addClassifications("Sprint", "23");
		
		ArrayList<String> List = new ArrayList<String>();
		List.add(s);
		
		ReportBuilder r = new ReportBuilder(List, con);
		
		r.generateReports();

	}
}
