package com.stta.TestSuiteBase;

import java.io.IOException;

import org.apache.log4j.Logger;

import com.stta.utility.Read_XLS;

public class SuiteBase {	
	public static Read_XLS TestSuiteListExcel=null;
	public static Read_XLS TestCaseListExcelOne=null;
	public static Read_XLS TestCaseListExcelTwo=null;
	public static Read_XLS TestCaseListExcelThree=null;
	public static Logger Add_Log = null;
	
	public void init() throws IOException{
		//To Initialize logger service.
		Add_Log = Logger.getLogger("rootLogger");				
				
		//Please change file's path strings bellow If you have stored them at location other than bellow.
		//Initializing Test Suite List(TestSuiteList.xls) File Path Using Constructor Of Read_XLS Utility Class.
		TestSuiteListExcel = new Read_XLS(System.getProperty("user.dir")+"\\src\\com\\stta\\ExcelFiles\\TestSuiteList.xls");
		//Initializing Test Suite One(SuiteOne.xls) File Path Using Constructor Of Read_XLS Utility Class.
		TestCaseListExcelOne = new Read_XLS(System.getProperty("user.dir")+"\\src\\com\\stta\\ExcelFiles\\SuiteOne.xls");
		//Initializing Test Suite Two(SuiteTwo.xls) File Path Using Constructor Of Read_XLS Utility Class.
		TestCaseListExcelTwo = new Read_XLS(System.getProperty("user.dir")+"\\src\\com\\stta\\ExcelFiles\\SuiteTwo.xls");
		//Bellow given syntax will Insert log In applog.log file.
		TestCaseListExcelThree = new Read_XLS(System.getProperty("user.dir")+"\\src\\com\\stta\\ExcelFiles\\SuiteThree.xls");
		
		Add_Log.info("All Excel Files Initialised successfully.");		
	}	
}
