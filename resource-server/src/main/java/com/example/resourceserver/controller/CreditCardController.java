package com.example.resourceserver.controller;

import com.example.resourceserver.dto.CreditCard;
import java.util.Arrays;
import java.util.List;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/credit-cards")
public class CreditCardController {

  @GetMapping
  public List<CreditCard> getCreditCards() {
    return Arrays.asList(
        new CreditCard(1L, "Visa", "1234-1234-1234-1234"),
        new CreditCard(2L, "Mastercard", "5678-5678-5678-5678"),
        new CreditCard(3L, "American Express", "9012-9012-9012-9012")
    );
  }

}
