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
 * The InventoryConfig is a POJO class extends AviRestResource that used for creating
 * InventoryConfig.
 *
 * @version 1.0
 * @since 
 *
 */
@VsoObject(create = false, name = "InventoryConfig")
@VsoFinder(name = Constants.FINDER_VRO_INVENTORYCONFIG)
@JsonIgnoreProperties(ignoreUnknown = true)
@Service
public class InventoryConfig extends AviRestResource {
    @JsonProperty("enable")
    @JsonInclude(Include.NON_NULL)
    private Boolean enable = null;



  /**
   * This is the getter method this will return the attribute value.
   * Allow inventory stats to be regularly sent to pulse cloud services.
   * Field introduced in 22.1.3.
   * Allowed in enterprise edition with any value, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @return enable
   */
  @VsoMethod
  public Boolean getEnable() {
    return enable;
  }

  /**
   * This is the setter method to the attribute.
   * Allow inventory stats to be regularly sent to pulse cloud services.
   * Field introduced in 22.1.3.
   * Allowed in enterprise edition with any value, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @param enable set the enable.
   */
  @VsoMethod
  public void setEnable(Boolean  enable) {
    this.enable = enable;
  }



@Override
public boolean equals(java.lang.Object o) {
  if (this == o) {
    return true;
  }
  if (o == null || getClass() != o.getClass()) {
    return false;
  }
  InventoryConfig objInventoryConfig = (InventoryConfig) o;
  return   Objects.equals(this.enable, objInventoryConfig.enable);
}

@Override
public String toString() {
  StringBuilder sb = new StringBuilder();
  sb.append("class InventoryConfig {\n");
      sb.append("    enable: ").append(toIndentedString(enable)).append("\n");
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

