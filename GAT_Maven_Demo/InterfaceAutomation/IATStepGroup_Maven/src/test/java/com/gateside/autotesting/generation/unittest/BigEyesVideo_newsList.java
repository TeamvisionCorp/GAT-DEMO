package com.gateside.autotesting.generation.unittest;

import org.testng.annotations.Test;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import com.gateside.autotesting.Gat.executor.CaseExecutor;
import com.gateside.autotesting.Gat.executor.InterfaceSingleStepExecutor;
import com.gateside.autotesting.Gat.executor.InterfaceStepsExecutor;

public class BigEyesVideo_newsList {

	@BeforeTest
	public void beforeTestMethod(){
	}
	
	@BeforeMethod
	public void beforeMethod(){
	}
	
	
	@Test
	public void TestAndroidParametersLegal70() throws Exception{
		CaseExecutor executor = new InterfaceSingleStepExecutor("BigEyesVideo.newsList.TestAndroidParametersLegal70");
		executor.execute();
	}
	
	@Test
	public void TestOptinalParametersLegal71() throws Exception{
		CaseExecutor executor = new InterfaceSingleStepExecutor("BigEyesVideo.newsList.TestOptinalParametersLegal71");
		executor.execute();
	}
	
	@Test
	public void TestOptinalParametersLegal61() throws Exception{
		CaseExecutor executor = new InterfaceSingleStepExecutor("BigEyesVideo.newsList.TestOptinalParametersLegal61");
		executor.execute();
	}
	
	@Test
	public void TestOptinalParametersLegalFirstLast() throws Exception{
		CaseExecutor executor = new InterfaceSingleStepExecutor("BigEyesVideo.newsList.TestOptinalParametersLegalFirstLast");
		executor.execute();
	}
	
	@Test
	public void TestOptinalParametersLegalFirstLastTwo() throws Exception{
		CaseExecutor executor = new InterfaceSingleStepExecutor("BigEyesVideo.newsList.TestOptinalParametersLegalFirstLastTwo");
		executor.execute();
	}
	
	@Test
	public void TestOptinalParametersOffsetNewsIdEmpty() throws Exception{
		CaseExecutor executor = new InterfaceSingleStepExecutor("BigEyesVideo.newsList.TestOptinalParametersOffsetNewsIdEmpty");
		executor.execute();
	}
	
	@Test
	public void TestOptinalParametersNull() throws Exception{
		CaseExecutor executor = new InterfaceSingleStepExecutor("BigEyesVideo.newsList.TestOptinalParametersNull");
		executor.execute();
	}
	
	@Test
	public void TestWindows() throws Exception{
		CaseExecutor executor = new InterfaceSingleStepExecutor("BigEyesVideo.newsList.TestWindows");
		executor.execute();
	}
	
	@Test
	public void TestParametersEmpty() throws Exception{
		CaseExecutor executor = new InterfaceSingleStepExecutor("BigEyesVideo.newsList.TestParametersEmpty");
		executor.execute();
	}
	
	
	@AfterMethod
	public void afterMethod(){
	}
	
	@AfterClass
	public void afterClassMethod(){
	}
}

