package com.shopping.jpa.member.model;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

@Entity
@Inheritance(strategy = InheritanceType.JOINED)
@Setter @Getter
public abstract class Member {

  @Id
  @GeneratedValue
  @Column(name = "MID", columnDefinition = "char(10)")
  private String id;

  @Column(name = "UID", length = 50, unique = true, nullable = false)
  private String username;

  @Column(name = "PWD", length = 100,nullable = false)
  private String password;

  @Column(name = "NAME", length = 20, nullable = false)
  private String name;

  @Column(name = "REG_DT", nullable = false)
  //@Temporal(TemporalType.TIMESTAMP)
  private LocalDateTime registerDate;

  @Column(name = "ADDR_USE_IDX", nullable = false, columnDefinition = "char(5)")
  private String addressUseIndex;

  @OneToMany(mappedBy = "member")
  private List<LoginHistory> loginHistories = new ArrayList<>();

}
