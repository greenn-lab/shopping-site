package com.shopping.jpa.member.model;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;

@Entity
@PrimaryKeyJoinColumn(name = "MID")
@Setter @Getter
public class AdminMember extends Member {

  @Column(name = "PA_IDX", columnDefinition = "char(5)")
  private String partCode;

}
