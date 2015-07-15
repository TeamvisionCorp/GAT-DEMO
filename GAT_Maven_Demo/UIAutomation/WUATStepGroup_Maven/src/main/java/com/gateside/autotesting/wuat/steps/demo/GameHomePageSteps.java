package com.gateside.autotesting.wuat.steps.demo;

import javax.swing.border.Border;

import com.gateside.autotesting.Gat.dataobject.WUATStepMethodDesc;
import com.gateside.autotesting.Gat.dataobject.stepparameter.WebUIStepParameter;
import com.gateside.autotesting.Gat.uia.webautomation.WebBrowser;
import com.gateside.autotesting.Gat.uia.webautomation.WebPage;
import com.gateside.autotesting.Gat.util.ParameterHelper;


public class GameHomePageSteps 
{
	
	@WUATStepMethodDesc
	public void login(WebBrowser browser,WebPage webPage,String parameterID) throws Exception
	{
		WebUIStepParameter parameter=(WebUIStepParameter)ParameterHelper.getWebUIStepParameter(parameterID);
		browser.navigateTo("http://www.baidu.com",180);
		
		webPage.getWebControll("Test01").action("inputText").exec(parameter.getValue("searchkeyword"));
		
		webPage.getWebControll("Test02").action("click").exec();
		if(parameter.parameters.contains("click"))
		{
		  webPage.getWebControll("Test02").action("click").exec();
		}
	}
	

}
