package com.gateside.autotesting.generation.unittest;

import org.testng.annotations.Test;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import com.gateside.autotesting.Gat.executor.CaseExecutor;
import com.gateside.autotesting.Gat.executor.InterfaceSingleStepExecutor;
import com.gateside.autotesting.Gat.executor.InterfaceStepsExecutor;

public class BigEyesVideo3_SendComment {

	@BeforeTest
	public void beforeTestMethod(){
	}
	
	@BeforeMethod
	public void beforeMethod(){
	}
	
	
	@Test
	public void TestAndroidParametersLegal() throws Exception{
		CaseExecutor executor = new InterfaceSingleStepExecutor("BigEyesVideo3.SendComment.TestAndroidParametersLegal");
		executor.execute();
	}
	
	@Test
	public void TestOsVersion71() throws Exception{
		CaseExecutor executor = new InterfaceSingleStepExecutor("BigEyesVideo3.SendComment.TestOsVersion71");
		executor.execute();
	}
	
	@Test
	public void TestForbidenComments1() throws Exception{
		CaseExecutor executor = new InterfaceSingleStepExecutor("BigEyesVideo3.SendComment.TestForbidenComments1");
		executor.execute();
	}
	
	@Test
	public void TestForbidenComments2() throws Exception{
		CaseExecutor executor = new InterfaceSingleStepExecutor("BigEyesVideo3.SendComment.TestForbidenComments2");
		executor.execute();
	}
	
	@Test
	public void TestForbidenComments3() throws Exception{
		CaseExecutor executor = new InterfaceSingleStepExecutor("BigEyesVideo3.SendComment.TestForbidenComments3");
		executor.execute();
	}
	
	@Test
	public void TestForbidenComments4() throws Exception{
		CaseExecutor executor = new InterfaceSingleStepExecutor("BigEyesVideo3.SendComment.TestForbidenComments4");
		executor.execute();
	}
	
	@Test
	public void TestOsVersion60() throws Exception{
		CaseExecutor executor = new InterfaceSingleStepExecutor("BigEyesVideo3.SendComment.TestOsVersion60");
		executor.execute();
	}
	
	@Test
	public void TestOsVersion61() throws Exception{
		CaseExecutor executor = new InterfaceSingleStepExecutor("BigEyesVideo3.SendComment.TestOsVersion61");
		executor.execute();
	}
	
	@Test
	public void TestOsVersion101() throws Exception{
		CaseExecutor executor = new InterfaceSingleStepExecutor("BigEyesVideo3.SendComment.TestOsVersion101");
		executor.execute();
	}
	
	@Test
	public void TestWindows() throws Exception{
		CaseExecutor executor = new InterfaceSingleStepExecutor("BigEyesVideo3.SendComment.TestWindows");
		executor.execute();
	}
	
	@Test
	public void TestRequiredParametersNull() throws Exception{
		CaseExecutor executor = new InterfaceSingleStepExecutor("BigEyesVideo3.SendComment.TestRequiredParametersNull");
		executor.execute();
	}
	
	@Test
	public void TestRequiredParametersEmpty() throws Exception{
		CaseExecutor executor = new InterfaceSingleStepExecutor("BigEyesVideo3.SendComment.TestRequiredParametersEmpty");
		executor.execute();
	}
	
	
	@AfterMethod
	public void afterMethod(){
	}
	
	@AfterClass
	public void afterClassMethod(){
	}
}

