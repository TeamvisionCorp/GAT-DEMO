package com.gateside.autotesting.generation.unittest;

import org.testng.annotations.Test;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import com.gateside.autotesting.Gat.executor.CaseExecutor;
import com.gateside.autotesting.Gat.executor.InterfaceSingleStepExecutor;
import com.gateside.autotesting.Gat.executor.InterfaceStepsExecutor;

public class Video_videoList {

	@BeforeTest
	public void beforeTestMethod(){
	}
	
	@BeforeMethod
	public void beforeMethod(){
	}
	
	
	@Test
	public void TestAndroidParametersLegal() throws Exception{
		CaseExecutor executor = new InterfaceSingleStepExecutor("Video.videoList.TestAndroidParametersLegal");
		executor.execute();
	}
	
	@Test
	public void TestOptionalParametersLegalFirstId() throws Exception{
		CaseExecutor executor = new InterfaceSingleStepExecutor("Video.videoList.TestOptionalParametersLegalFirstId");
		executor.execute();
	}
	
	@Test
	public void TestOptionalParametersOffsetMidId() throws Exception{
		CaseExecutor executor = new InterfaceSingleStepExecutor("Video.videoList.TestOptionalParametersOffsetMidId");
		executor.execute();
	}
	
	@Test
	public void TestOptionalParametersVideoIdAndTypeSpecial() throws Exception{
		CaseExecutor executor = new InterfaceSingleStepExecutor("Video.videoList.TestOptionalParametersVideoIdAndTypeSpecial");
		executor.execute();
	}
	
	@Test
	public void TestOptionalParametersOnlyTypeWithNoId() throws Exception{
		CaseExecutor executor = new InterfaceSingleStepExecutor("Video.videoList.TestOptionalParametersOnlyTypeWithNoId");
		executor.execute();
	}
	
	@Test
	public void TestRequiredParametersNull() throws Exception{
		CaseExecutor executor = new InterfaceSingleStepExecutor("Video.videoList.TestRequiredParametersNull");
		executor.execute();
	}
	
	@Test
	public void TestOptionalParametersOffsetLastId() throws Exception{
		CaseExecutor executor = new InterfaceSingleStepExecutor("Video.videoList.TestOptionalParametersOffsetLastId");
		executor.execute();
	}
	
	@Test
	public void TestOptionalParametersVideoIdAndOffsetFirstId() throws Exception{
		CaseExecutor executor = new InterfaceSingleStepExecutor("Video.videoList.TestOptionalParametersVideoIdAndOffsetFirstId");
		executor.execute();
	}
	
	@Test
	public void TestAppVersion09() throws Exception{
		CaseExecutor executor = new InterfaceSingleStepExecutor("Video.videoList.TestAppVersion09");
		executor.execute();
	}
	
	@Test
	public void TestIosOsVersion50() throws Exception{
		CaseExecutor executor = new InterfaceSingleStepExecutor("Video.videoList.TestIosOsVersion50");
		executor.execute();
	}
	
	@Test
	public void TestOptionalParametersOffsetType() throws Exception{
		CaseExecutor executor = new InterfaceSingleStepExecutor("Video.videoList.TestOptionalParametersOffsetType");
		executor.execute();
	}
	
	@Test
	public void TestWindows() throws Exception{
		CaseExecutor executor = new InterfaceSingleStepExecutor("Video.videoList.TestWindows");
		executor.execute();
	}
	
	@Test
	public void TestParametersEmpty() throws Exception{
		CaseExecutor executor = new InterfaceSingleStepExecutor("Video.videoList.TestParametersEmpty");
		executor.execute();
	}
	
	
	@AfterMethod
	public void afterMethod(){
	}
	
	@AfterClass
	public void afterClassMethod(){
	}
}

