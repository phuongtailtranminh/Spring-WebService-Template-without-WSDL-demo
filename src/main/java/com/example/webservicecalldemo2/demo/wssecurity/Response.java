package com.example.webservicecalldemo2.demo.wssecurity;

import java.time.OffsetDateTime;
import javax.xml.bind.annotation.XmlRootElement;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@XmlRootElement(name = "response")
public class Response {
  private OffsetDateTime currentTimestamp;
  private String status;
}
