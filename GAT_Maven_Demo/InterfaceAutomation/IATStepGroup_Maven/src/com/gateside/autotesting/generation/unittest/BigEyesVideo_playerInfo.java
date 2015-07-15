package com.gateside.autotesting.generation.unittest;

import org.testng.annotations.Test;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import com.gateside.autotesting.Gat.executor.CaseExecutor;
import com.gateside.autotesting.Gat.executor.InterfaceSingleStepExecutor;
import com.gateside.autotesting.Gat.executor.InterfaceStepsExecutor;

public class BigEyesVideo_playerInfo {

	@BeforeTest
	public void beforeTestMethod(){
	}
	
	@BeforeMethod
	public void beforeMethod(){
	}
	
	
	@Test
	public void TestAndroidParametersLegal70() throws Exception{
		CaseExecutor executor = new InterfaceSingleStepExecutor("BigEyesVideo.playerInfo.TestAndroidParametersLegal70");
		executor.execute();
	}
	
	@Test
	public void TestRequiredParametersLegal71() throws Exception{
		CaseExecutor executor = new InterfaceSingleStepExecutor("BigEyesVideo.playerInfo.TestRequiredParametersLegal71");
		executor.execute();
	}
	
	@Test
	public void TestRequiredParametersLegal61() throws Exception{
		CaseExecutor executor = new InterfaceSingleStepExecutor("BigEyesVideo.playerInfo.TestRequiredParametersLegal61");
		executor.execute();
	}
	
	@Test
	public void TestRequiredParametersTeamIdEmpty() throws Exception{
		CaseExecutor executor = new InterfaceSingleStepExecutor("BigEyesVideo.playerInfo.TestRequiredParametersTeamIdEmpty");
		executor.execute();
	}
	
	@Test
	public void TestRequiredParametersNull() throws Exception{
		CaseExecutor executor = new InterfaceSingleStepExecutor("BigEyesVideo.playerInfo.TestRequiredParametersNull");
		executor.execute();
	}
	
	@Test
	public void TestWindows() throws Exception{
		CaseExecutor executor = new InterfaceSingleStepExecutor("BigEyesVideo.playerInfo.TestWindows");
		executor.execute();
	}
	
	@Test
	public void TestParametersEmpty() throws Exception{
		CaseExecutor executor = new InterfaceSingleStepExecutor("BigEyesVideo.playerInfo.TestParametersEmpty");
		executor.execute();
	}
	
	@Test
	public void TestRequiredParametersLegalId3() throws Exception{
		CaseExecutor executor = new InterfaceSingleStepExecutor("BigEyesVideo.playerInfo.TestRequiredParametersLegalId3");
		executor.execute();
	}
	
	@Test
	public void TestRequiredParametersLegalId6() throws Exception{
		CaseExecutor executor = new InterfaceSingleStepExecutor("BigEyesVideo.playerInfo.TestRequiredParametersLegalId6");
		executor.execute();
	}
	
	@Test
	public void TestRequiredParametersLegalId5() throws Exception{
		CaseExecutor executor = new InterfaceSingleStepExecutor("BigEyesVideo.playerInfo.TestRequiredParametersLegalId5");
		executor.execute();
	}
	
	@Test
	public void TestRequiredParametersLegalId7() throws Exception{
		CaseExecutor executor = new InterfaceSingleStepExecutor("BigEyesVideo.playerInfo.TestRequiredParametersLegalId7");
		executor.execute();
	}
	
	
	@AfterMethod
	public void afterMethod(){
	}
	
	@AfterClass
	public void afterClassMethod(){
	}
}

