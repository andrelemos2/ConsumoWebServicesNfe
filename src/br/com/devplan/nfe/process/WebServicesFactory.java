package br.com.devplan.nfe.process;

/**
 * Created by andreasl on 23/10/15.
 */
public class WebServicesFactory {
  public static WebServices getWebServices(WebServicesAbstractFactory factory){
    return factory.createWebServices();
  }
}
