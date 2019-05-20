package com.shopping.jpa.member.model;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Entity
@PrimaryKeyJoinColumn(name = "MID")
@Getter @Setter
public class CommonMember extends Member {

  @Column(name = "GRD_IDX", columnDefinition = "char(5)")
  private String gradeCode;

  @OneToMany(mappedBy = "member")
  @OrderBy("priority")
  private List<Address> addresses = new ArrayList<>();

}
