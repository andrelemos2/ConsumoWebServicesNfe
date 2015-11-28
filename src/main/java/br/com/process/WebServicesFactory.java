package br.com.process;

public class WebServicesFactory {
	
	public WebServices getWebServices(String wsType){
		if("ASSYNCHRONOUS".equals(wsType))
			return new Assynchronous();
		else
			return new Synchronous();
	}

	
	
}
