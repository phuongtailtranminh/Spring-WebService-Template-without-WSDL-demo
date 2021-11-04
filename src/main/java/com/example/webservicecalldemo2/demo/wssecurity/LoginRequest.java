package com.example.webservicecalldemo2.demo.wssecurity;

import javax.xml.bind.annotation.XmlRootElement;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@XmlRootElement(name = "login", namespace="http://impl.endpoint.security.ws.nfs.scb.com")
public class LoginRequest {
  private UserContext userContext;
  private String userId;
  private String password;
  private String typeOfAuth;
  private String typeOfLogin;
  private String securityNonce;
  private String mask;
  private String request2FAToken;

}
