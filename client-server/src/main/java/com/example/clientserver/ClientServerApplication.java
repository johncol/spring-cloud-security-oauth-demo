package com.example.clientserver;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.security.oauth2.client.OAuth2RestTemplate;
import org.springframework.security.oauth2.client.token.grant.password.ResourceOwnerPasswordResourceDetails;
import org.springframework.security.oauth2.common.AuthenticationScheme;

@SpringBootApplication
public class ClientServerApplication {

  public static void main(String[] args) {
    SpringApplication.run(ClientServerApplication.class, args);
  }

  @Bean
  public CommandLineRunner commandLineRunner() {
    return args -> {
      ResourceOwnerPasswordResourceDetails resourceOwnerDetails = new ResourceOwnerPasswordResourceDetails();
			resourceOwnerDetails.setAccessTokenUri("http://localhost:9000/service/oauth/token");
			resourceOwnerDetails.setClientId("oauth2-poc");
			resourceOwnerDetails.setClientSecret("secret");
			resourceOwnerDetails.setGrantType("password");
			resourceOwnerDetails.setUsername("john");
			resourceOwnerDetails.setPassword("john");
			resourceOwnerDetails.setClientAuthenticationScheme(AuthenticationScheme.header);

      OAuth2RestTemplate template = new OAuth2RestTemplate(resourceOwnerDetails);
      String response = template.getForObject("http://localhost:8000/resource/credit-cards", String.class);
      System.out.println(" --------------- HTTP response:");
      System.out.println(response);
    };
  }
}
