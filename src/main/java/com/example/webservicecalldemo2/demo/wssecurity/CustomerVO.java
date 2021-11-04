package com.example.webservicecalldemo2.demo.wssecurity;

import javax.xml.bind.annotation.XmlRootElement;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@XmlRootElement(name = "customerVO")
public class CustomerVO {
  private String customerID;
  private String customerName;
  private String isQRIntroShow;
  private String isSecurityImageLoginEnabled;
  private String isSME;
  private String mobileNumber;
  private String pilotModuleList;
  private String residentStatus;
  private String segmentCode;
  private String twoFAType;
}
