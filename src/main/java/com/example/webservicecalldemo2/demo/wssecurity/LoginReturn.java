package com.example.webservicecalldemo2.demo.wssecurity;

import javax.xml.bind.annotation.XmlRootElement;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@XmlRootElement(name = "loginReturn")
public class LoginReturn {
  private LoginVO loginVO;
  private Response response;
}
