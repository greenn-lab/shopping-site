package com.shopping.jpa.member.model;

import com.shopping.jpa.converter.BooleanToYOrNConverter;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.time.LocalDateTime;

@Entity
@Setter @Getter
public class Address {

  @Id
  @Column(name = "ADDR_ID"/*, columnDefinition = "char(20)"*/)
  private Long id;

  @Column(name = "NAME", length = 20, nullable = false)
  private String name;

  @Column(name = "ZIPCD", length = 10, nullable = false)
  private String zipCode;

  @Column(name = "ADDR", length = 50, nullable = false)
  private String address;

  @Column(name = "ADDR_DTL", length = 50, nullable = false)
  private String detail;

  @Column(name = "IS_MAS", nullable = false, columnDefinition = "char(1)")
  @Convert(converter = BooleanToYOrNConverter.class)
  private boolean isMaster;

  @Column(name = "LST_USE_DT")
  //@Temporal(TemporalType.TIMESTAMP)
  private LocalDateTime lastUsedDateTime;

  @Column(name = "REG_DT")
  //@Temporal(TemporalType.TIMESTAMP)
  private LocalDateTime registerDateTime;

  @Column(name = "UPT_DT")
  //@Temporal(TemporalType.TIMESTAMP)
  private LocalDateTime updateDateTime;

  @ManyToOne
  @JoinColumn(name = "id")
  private Member member;

}
