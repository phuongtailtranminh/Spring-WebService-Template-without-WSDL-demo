package com.example.webservicecalldemo2.demo.wssecurity;

import javax.xml.bind.annotation.XmlRootElement;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@XmlRootElement(name = "userContext")
public class UserContext {
  private String channel;
  private String country;
  private String serviceId;
  private String sessionId;
  private String token;
  private String userId;
}
