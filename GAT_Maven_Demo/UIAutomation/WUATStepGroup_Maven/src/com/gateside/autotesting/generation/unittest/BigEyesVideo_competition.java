package com.gateside.autotesting.generation.unittest;

import org.testng.annotations.Test;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import com.gateside.autotesting.Gat.executor.CaseExecutor;
import com.gateside.autotesting.Gat.executor.InterfaceSingleStepExecutor;
import com.gateside.autotesting.Gat.executor.InterfaceStepsExecutor;

public class BigEyesVideo_competition {

	@BeforeTest
	public void beforeTestMethod(){
	}
	
	@BeforeMethod
	public void beforeMethod(){
	}
	
	
	@Test
	public void TestAndroidParametersLegal70() throws Exception{
		CaseExecutor executor = new InterfaceSingleStepExecutor("BigEyesVideo.competition.TestAndroidParametersLegal70");
		executor.execute();
	}
	
	@Test
	public void TestRequiredParametersLegal71() throws Exception{
		CaseExecutor executor = new InterfaceSingleStepExecutor("BigEyesVideo.competition.TestRequiredParametersLegal71");
		executor.execute();
	}
	
	@Test
	public void TestRequiredParametersLegal61() throws Exception{
		CaseExecutor executor = new InterfaceSingleStepExecutor("BigEyesVideo.competition.TestRequiredParametersLegal61");
		executor.execute();
	}
	
	@Test
	public void TestOptinalParametersOffsetEmpty() throws Exception{
		CaseExecutor executor = new InterfaceSingleStepExecutor("BigEyesVideo.competition.TestOptinalParametersOffsetEmpty");
		executor.execute();
	}
	
	@Test
	public void TestRequiredParametersMatchIdEmpty() throws Exception{
		CaseExecutor executor = new InterfaceSingleStepExecutor("BigEyesVideo.competition.TestRequiredParametersMatchIdEmpty");
		executor.execute();
	}
	
	@Test
	public void TestRequiredParametersNull() throws Exception{
		CaseExecutor executor = new InterfaceSingleStepExecutor("BigEyesVideo.competition.TestRequiredParametersNull");
		executor.execute();
	}
	
	@Test
	public void TestWindows() throws Exception{
		CaseExecutor executor = new InterfaceSingleStepExecutor("BigEyesVideo.competition.TestWindows");
		executor.execute();
	}
	
	@Test
	public void TestParametersEmpty() throws Exception{
		CaseExecutor executor = new InterfaceSingleStepExecutor("BigEyesVideo.competition.TestParametersEmpty");
		executor.execute();
	}
	
	
	@AfterMethod
	public void afterMethod(){
	}
	
	@AfterClass
	public void afterClassMethod(){
	}
}

