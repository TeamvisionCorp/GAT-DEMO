package com.gateside.autotesting.generation.unittest;

import org.testng.annotations.Test;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import com.gateside.autotesting.Gat.executor.CaseExecutor;
import com.gateside.autotesting.Gat.executor.InterfaceSingleStepExecutor;
import com.gateside.autotesting.Gat.executor.InterfaceStepsExecutor;

public class BigEyesVideo_team {

	@BeforeTest
	public void beforeTestMethod(){
	}
	
	@BeforeMethod
	public void beforeMethod(){
	}
	
	
	@Test
	public void TestAndroidParametersLegal70() throws Exception{
		CaseExecutor executor = new InterfaceSingleStepExecutor("BigEyesVideo.team.TestAndroidParametersLegal70");
		executor.execute();
	}
	
	@Test
	public void TestTeamNoHistory() throws Exception{
		CaseExecutor executor = new InterfaceSingleStepExecutor("BigEyesVideo.team.TestTeamNoHistory");
		executor.execute();
	}
	
	@Test
	public void TestRequiredParametersLegal71() throws Exception{
		CaseExecutor executor = new InterfaceSingleStepExecutor("BigEyesVideo.team.TestRequiredParametersLegal71");
		executor.execute();
	}
	
	@Test
	public void TestRequiredParametersLegal61() throws Exception{
		CaseExecutor executor = new InterfaceSingleStepExecutor("BigEyesVideo.team.TestRequiredParametersLegal61");
		executor.execute();
	}
	
	@Test
	public void TestRequiredParametersTeamIdEmpty() throws Exception{
		CaseExecutor executor = new InterfaceSingleStepExecutor("BigEyesVideo.team.TestRequiredParametersTeamIdEmpty");
		executor.execute();
	}
	
	@Test
	public void TestRequiredParametersNull() throws Exception{
		CaseExecutor executor = new InterfaceSingleStepExecutor("BigEyesVideo.team.TestRequiredParametersNull");
		executor.execute();
	}
	
	@Test
	public void TestWindows() throws Exception{
		CaseExecutor executor = new InterfaceSingleStepExecutor("BigEyesVideo.team.TestWindows");
		executor.execute();
	}
	
	@Test
	public void TestParametersEmpty() throws Exception{
		CaseExecutor executor = new InterfaceSingleStepExecutor("BigEyesVideo.team.TestParametersEmpty");
		executor.execute();
	}
	
	
	@AfterMethod
	public void afterMethod(){
	}
	
	@AfterClass
	public void afterClassMethod(){
	}
}

