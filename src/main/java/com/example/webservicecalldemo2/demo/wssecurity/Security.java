package com.example.webservicecalldemo2.demo.wssecurity;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@XmlRootElement(name = "Security")
public class Security {
  private UsernameToken usernameToken;

  @XmlElement(name="UsernameToken")
  public UsernameToken getUsernameToken() {
    return usernameToken;
  }

  public void setUsernameToken(UsernameToken usernameToken) {
    this.usernameToken = usernameToken;
  }
}
