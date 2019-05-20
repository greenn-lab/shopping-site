package com.shopping.jpa.member.model;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.time.LocalDateTime;

@Entity
@Table(name = "LOGIN_HIS")
@Setter @Getter
public class LoginHistory {

  @Id
  @GeneratedValue
  private Integer seq;

  @Column(nullable = false, columnDefinition = "char(5)")
  @Enumerated(value = EnumType.STRING)
  private LoginResult result;

  @Column(name = "REG_IP", nullable = false, length = 30)
  private String ip;

  @Column(name = "REG_DT")
  //@Temporal(TemporalType.TIMESTAMP)
  private LocalDateTime registerDateTime;

  @ManyToOne
  @JoinColumn(name = "id")
  private Member member;


  @Converter(autoApply = true)
  public static class LoginResultConverter implements AttributeConverter<LoginResult, String> {
    @Override
    public String convertToDatabaseColumn(LoginResult attribute) {
      return attribute.getValue();
    }

    @Override
    public LoginResult convertToEntityAttribute(String dbData) {
      return LoginResult.valueOf(dbData);
    }
  }
}
