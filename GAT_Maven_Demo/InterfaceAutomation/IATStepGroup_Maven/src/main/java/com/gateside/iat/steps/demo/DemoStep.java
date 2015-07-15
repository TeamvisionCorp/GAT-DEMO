package com.gateside.iat.steps.demo;

import java.util.HashMap;

import com.gateside.autotesting.Gat.dataobject.AssertStepMethodDesc;
import com.gateside.autotesting.Gat.dataobject.StepMethodDesc;
import com.gateside.autotesting.Gat.dataobject.stepparameter.InterfaceStepParameter;
import com.gateside.autotesting.Gat.uia.webautomation.WebBrowser;
import com.gateside.autotesting.Gat.uia.webautomation.WebPage;
import com.gateside.autotesting.Gat.util.GlobalConfig;
import com.gateside.autotesting.Gat.util.ParameterHelper;
import com.gateside.autotesting.Gat.util.StepValuePool;
import com.gateside.autotesting.Lib.common.SimpleLogger;
import com.gateside.autotesting.Lib.dbService.MysqlDBOperationService;
import com.gateside.autotesting.Lib.httpunitService.HttpUnitHelper;
import com.meterware.httpunit.WebConversation;
import com.meterware.httpunit.WebRequest;
import com.meterware.httpunit.WebResponse;

public class DemoStep 
{
	  
	 @StepMethodDesc(description="",owner="tiande.zhang")
	 public void Step1(String parameterID) throws Exception
	 {
		 InterfaceStepParameter parameter=(InterfaceStepParameter)ParameterHelper.getInterfaceStepParameter(parameterID);
		 WebConversation currentConversation=HttpUnitHelper.createConversation();
	     WebRequest currentRequest=HttpUnitHelper.createWebRequest(parameter.getValue("url"),parameter.getValue("httpmethod"));
	     HashMap<String, String> urlParameters=parameter.getURLParametersMap();
	     if(urlParameters.size()!=0)
	     {
	         HttpUnitHelper.setParameters(currentRequest,urlParameters);
	     }
	     WebResponse response=currentConversation.getResponse(currentRequest);
	     System.out.println(response.getText());
	     StepValuePool.createInstance().getValueDic().put("doubiToken",response.getText());
	 }
	 
	 @StepMethodDesc(description="",owner="tiande.zhang")
	 public void Step2(String parameterID) throws Exception
	 {
		System.out.println(parameterID+StepValuePool.createInstance().getValueDic().get("doubiToken").toString());
	 }
	 
	 @AssertStepMethodDesc(description="",owner="tiande.zhang")
	 public void Step3(String parameterID,String expectResut,String actualResult)
	 {
		 SimpleLogger.logInfo(this.getClass(),actualResult);
	 }
	 
	 @StepMethodDesc(description="",owner="tiande.zhang")
	 public void Login(WebBrowser browser,WebPage webPage,String parameterID) throws Exception
	 {
		InterfaceStepParameter parameter=(InterfaceStepParameter)ParameterHelper.getInterfaceStepParameter(parameterID);
		browser.navigateTo("http://fdsfsd",180);
		if(parameter.getValue("username")=="")
		{
		  webPage.getWebControll("NodeID").action("Input").exec(parameter.getValue("username"));
		}
		webPage.getWebControll("NodeID").action("Input").exec(parameter.getValue("password"));
		webPage.getWebControll("NodeID").action("Click").exec();
	 }
    
}
