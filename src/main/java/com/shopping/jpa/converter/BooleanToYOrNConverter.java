package com.shopping.jpa.converter;

import javax.persistence.AttributeConverter;
import javax.persistence.Converter;

@Converter
public class BooleanToYOrNConverter implements AttributeConverter<Boolean, String> {
  @Override
  public String convertToDatabaseColumn(Boolean attribute) {
    return attribute ? "Y" : "N";
  }

  @Override
  public Boolean convertToEntityAttribute(String dbData) {
    return dbData.equals("Y");
  }
}
