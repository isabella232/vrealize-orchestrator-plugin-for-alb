package com.vmware.avi.vro.model;

import java.util.*;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonInclude.Include;
import com.vmware.o11n.plugin.sdk.annotation.VsoFinder;
import com.vmware.o11n.plugin.sdk.annotation.VsoMethod;
import com.vmware.o11n.plugin.sdk.annotation.VsoObject;
import com.vmware.avi.vro.Constants;
import org.springframework.stereotype.Service;

/**
 * The SamlAttribute is a POJO class extends AviRestResource that used for creating
 * SamlAttribute.
 *
 * @version 1.0
 * @since 
 *
 */
@VsoObject(create = false, name = "SamlAttribute")
@VsoFinder(name = Constants.FINDER_VRO_SAMLATTRIBUTE)
@JsonIgnoreProperties(ignoreUnknown = true)
@Service
public class SamlAttribute extends AviRestResource {
  @JsonProperty("attr_name")
  @JsonInclude(Include.NON_NULL)
  private String attrName = null;

  @JsonProperty("attr_values")
  @JsonInclude(Include.NON_NULL)
  private List<String> attrValues = null;



  /**
   * This is the getter method this will return the attribute value.
   * Saml attribute name.
   * Field introduced in 20.1.1.
   * @return attrName
   */
  @VsoMethod
  public String getAttrName() {
    return attrName;
  }

  /**
   * This is the setter method to the attribute.
   * Saml attribute name.
   * Field introduced in 20.1.1.
   * @param attrName set the attrName.
   */
  @VsoMethod
  public void setAttrName(String  attrName) {
    this.attrName = attrName;
  }

  /**
   * This is the getter method this will return the attribute value.
   * Saml attribute values.
   * Field introduced in 20.1.1.
   * @return attrValues
   */
  @VsoMethod
  public List<String> getAttrValues() {
    return attrValues;
  }

  /**
   * This is the setter method. this will set the attrValues
   * Saml attribute values.
   * Field introduced in 20.1.1.
   * @return attrValues
   */
  @VsoMethod
  public void setAttrValues(List<String>  attrValues) {
    this.attrValues = attrValues;
  }

  /**
   * This is the setter method this will set the attrValues
   * Saml attribute values.
   * Field introduced in 20.1.1.
   * @return attrValues
   */
  @VsoMethod
  public SamlAttribute addAttrValuesItem(String attrValuesItem) {
    if (this.attrValues == null) {
      this.attrValues = new ArrayList<String>();
    }
    this.attrValues.add(attrValuesItem);
    return this;
  }




@Override
public boolean equals(java.lang.Object o) {
  if (this == o) {
    return true;
  }
  if (o == null || getClass() != o.getClass()) {
    return false;
  }
  SamlAttribute objSamlAttribute = (SamlAttribute) o;
  return   Objects.equals(this.attrName, objSamlAttribute.attrName)&&
  Objects.equals(this.attrValues, objSamlAttribute.attrValues);
}

@Override
public String toString() {
  StringBuilder sb = new StringBuilder();
  sb.append("class SamlAttribute {\n");
      sb.append("    attrName: ").append(toIndentedString(attrName)).append("\n");
        sb.append("    attrValues: ").append(toIndentedString(attrValues)).append("\n");
      sb.append("}");
  return sb.toString();
}

/**
* Convert the given object to string with each line indented by 4 spaces
* (except the first line).
*/
private String toIndentedString(java.lang.Object o) {
  if (o == null) {
    return "null";
  }
  return o.toString().replace("\n", "\n    ");
}
}
