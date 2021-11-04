package com.example.webservicecalldemo2.demo.wssecurity;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@XmlRootElement(name = "UsernameToken")
@XmlAccessorType(XmlAccessType.PROPERTY)
public class UsernameToken {
  private String username;
  private String password;

  @XmlElement(name="Username")
  public String getUsername() {
    return username;
  }

  public void setUsername(String username) {
    this.username = username;
  }

  @XmlElement(name="Password")
  public String getPassword() {
    return password;
  }

  public void setPassword(String password) {
    this.password = password;
  }
}
