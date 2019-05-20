package com.shopping.jpa.member.model;

public enum LoginResult {
  SUCCESS("00000"),
  FAILURE("99999"),
  EXPIRED("99998"),
  DENIED("99997");

  private String value;

  LoginResult(String value) {
    this.value = value;
  }

  public String getValue() {
    return value;
  }
}
