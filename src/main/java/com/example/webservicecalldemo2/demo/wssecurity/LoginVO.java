package com.example.webservicecalldemo2.demo.wssecurity;

import javax.xml.bind.annotation.XmlRootElement;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@XmlRootElement(name = "loginVO", namespace="http://impl.endpoint.security.ws.nfs.scb.com")
public class LoginVO {
  private String customerEBID;
  private CustomerVO customerVO;
  private String is2FAAuthenticated;
  private String is2FARequired;
  private String passphraseConfirmation;
  private String securityCode;
  private String sessionID;
}
