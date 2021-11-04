package com.example.webservicecalldemo2.demo.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.oxm.jaxb.Jaxb2Marshaller;
import org.springframework.ws.client.core.WebServiceTemplate;

@Configuration
public class LoginWebServiceConfig {

  @Bean(name = "loginWebServiceTemplate")
  public WebServiceTemplate loginWebServiceTemplate() {
    WebServiceTemplate webServiceTemplate = new WebServiceTemplate();
    Jaxb2Marshaller jaxb2Marshaller = new Jaxb2Marshaller();
    jaxb2Marshaller.setContextPath("com.example.webservicecalldemo2.demo.wssecurity");

    webServiceTemplate.setMarshaller(jaxb2Marshaller);
    webServiceTemplate.setUnmarshaller(jaxb2Marshaller);
    return webServiceTemplate;
  }

}
