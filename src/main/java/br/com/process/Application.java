package br.com.process;

public class Application {

	public static void main(String[] args) {
		WebServicesFactory wsFactory = new WebServicesFactory();

		WebServices assynchronous = wsFactory.getWebServices("ASSYNCHRONOUS");

		assynchronous.enviando();

	}

}
