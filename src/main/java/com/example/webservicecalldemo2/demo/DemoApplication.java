package com.example.webservicecalldemo2.demo;

import com.example.webservicecalldemo2.demo.client.LoginWebServiceClient;
import lombok.AllArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@AllArgsConstructor
@Slf4j
@SpringBootApplication
public class DemoApplication {

  private LoginWebServiceClient loginWebServiceClient;

  public static void main(String[] args) {
    SpringApplication.run(DemoApplication.class, args);
  }

  @Bean
  CommandLineRunner run() {
    return args -> loginWebServiceClient.login("username", "password");
  }

}
