package com.example.webservicecalldemo2.demo.wssecurity;

import javax.xml.bind.annotation.XmlRootElement;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@XmlRootElement(name = "loginResponse", namespace = "http://impl.endpoint.security.ws.nfs.scb.com")
public class LoginResponse {

  private LoginReturn loginReturn;
}
