package com.example.webservicecalldemo2.demo.client;

import com.example.webservicecalldemo2.demo.wssecurity.LoginRequest;
import com.example.webservicecalldemo2.demo.wssecurity.LoginResponse;
import com.example.webservicecalldemo2.demo.wssecurity.Security;
import com.example.webservicecalldemo2.demo.wssecurity.UserContext;
import com.example.webservicecalldemo2.demo.wssecurity.UsernameToken;
import java.nio.charset.StandardCharsets;
import java.util.Base64;
import javax.xml.bind.JAXBContext;
import javax.xml.bind.Marshaller;
import lombok.AllArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Component;
import org.springframework.ws.client.core.WebServiceTemplate;
import org.springframework.ws.soap.SoapHeader;
import org.springframework.ws.soap.SoapMessage;

@Slf4j
@AllArgsConstructor
@Component
public class LoginWebServiceClient {

  private final WebServiceTemplate loginWebServiceTemplate;

  public LoginResponse login(String username, String password) {
    UserContext userContext = new UserContext();
    userContext.setChannel("CHANNEL"); // TODO: 11/4/2021 Use environment variable
    userContext.setCountry("COUNTRY"); // TODO: 11/4/2021 Use environment variable
    userContext.setServiceId("SERVICE_ID"); // TODO: 11/4/2021 Use environment variable
    userContext.setToken("TOKEN"); // TODO: 11/4/2021 Use environment variable
    userContext.setUserId(username);

    LoginRequest loginRequest = new LoginRequest();
    loginRequest.setUserId(username);
    loginRequest.setPassword(Base64.getEncoder().encodeToString(password.getBytes(StandardCharsets.UTF_8)));
    loginRequest.setTypeOfAuth("TYPE_OF_AUTH"); // TODO: 11/4/2021 Use environment variable
    loginRequest.setTypeOfLogin("TYPE_OF_LOGIN"); // TODO: 11/4/2021 Use environment variable
    loginRequest.setMask("MASK"); // TODO: 11/4/2021 Use environment variable
    loginRequest.setRequest2FAToken("2FA_TOKEN"); // TODO: 11/4/2021 Use environment variable
    loginRequest.setUserContext(userContext);

    // TODO: 11/4/2021 Use environment variable for service URL
    return (LoginResponse) loginWebServiceTemplate
        .marshalSendAndReceive("https://localhost:8080/WSSecurityService", loginRequest,
            message -> {
              try {
                // get the header from the SOAP message
                SoapHeader soapHeader = ((SoapMessage) message).getSoapHeader();

                UsernameToken usernameToken = new UsernameToken();

                // TODO: 11/4/2021 Use environment variable
                usernameToken.setUsername("username");

                // TODO: 11/4/2021 Use environment variable
                usernameToken.setPassword("password");

                Security security = new Security();
                security.setUsernameToken(usernameToken);

                // create a marshaller
                JAXBContext context = JAXBContext.newInstance(Security.class);
                Marshaller marshaller = context.createMarshaller();

                // marshal the headers into the specified result
                marshaller.marshal(security, soapHeader.getResult());
              } catch (Exception e) {
                log.error("error during marshalling of the SOAP headers", e);
              }
            });
  }

}
