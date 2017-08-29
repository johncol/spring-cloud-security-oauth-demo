package com.example.resourceserver.dto;

import java.io.Serializable;

public class CreditCard implements Serializable {

  private Long id;
  private String provider;
  private String number;

  public CreditCard() {
  }

  public CreditCard(Long id, String provider, String number) {
    this.id = id;
    this.provider = provider;
    this.number = number;
  }

  public Long getId() {
    return id;
  }

  public void setId(Long id) {
    this.id = id;
  }

  public String getProvider() {
    return provider;
  }

  public void setProvider(String provider) {
    this.provider = provider;
  }

  public String getNumber() {
    return number;
  }

  public void setNumber(String number) {
    this.number = number;
  }

  @Override
  public String toString() {
    final StringBuffer sb = new StringBuffer("CreditCard{");
    sb.append("id=").append(id);
    sb.append(", provider='").append(provider).append('\'');
    sb.append(", number='").append(number).append('\'');
    sb.append('}');
    return sb.toString();
  }
}
