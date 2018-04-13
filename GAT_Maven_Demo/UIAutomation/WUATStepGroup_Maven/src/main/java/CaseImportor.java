

import com.gateside.autotesting.Gat.manager.WebUIStepsCaseImporter;
import com.gateside.autotesting.Gat.util.GlobalConfig;


public class CaseImportor {
	
	public static void main(String[] args) throws Exception
	{
	  WebUIStepsCaseImporter caseImporter=new  WebUIStepsCaseImporter(19,2);
	  caseImporter.doImport(GlobalConfig.getRootDir()+"DataFiles//Xmls");	
	}

	
}
