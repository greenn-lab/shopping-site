package com.shopping.jpa.converter;

import javax.persistence.AttributeConverter;
import javax.persistence.Converter;
import java.util.Optional;

@Converter
public class BooleanToYOrNConverter implements AttributeConverter<Boolean, String> {
  @Override
  public String convertToDatabaseColumn(Boolean attribute) {
    Boolean attributeValue = Optional.ofNullable(attribute).orElse(false);
    return attributeValue ? "Y" : "N";
  }

  @Override
  public Boolean convertToEntityAttribute(String dbData) {
    String stringValue = Optional.ofNullable(dbData).orElse("N");
    return stringValue.equals("Y");
  }
}
