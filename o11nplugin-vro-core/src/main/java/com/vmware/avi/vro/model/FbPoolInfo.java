package com.vmware.avi.vro.model;

import java.util.*;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonInclude.Include;
import com.vmware.avi.vro.model.OperationalStatus;
import com.vmware.o11n.plugin.sdk.annotation.VsoFinder;
import com.vmware.o11n.plugin.sdk.annotation.VsoMethod;
import com.vmware.o11n.plugin.sdk.annotation.VsoObject;
import com.vmware.avi.vro.Constants;
import org.springframework.stereotype.Service;

/**
 * The FbPoolInfo is a POJO class extends AviRestResource that used for creating
 * FbPoolInfo.
 *
 * @version 1.0
 * @since 
 *
 */
@VsoObject(create = false, name = "FbPoolInfo")
@VsoFinder(name = Constants.FINDER_VRO_FBPOOLINFO)
@JsonIgnoreProperties(ignoreUnknown = true)
@Service
public class FbPoolInfo extends AviRestResource {
    @JsonProperty("oper_status")
    @JsonInclude(Include.NON_NULL)
    private OperationalStatus operStatus = null;



  /**
   * This is the getter method this will return the attribute value.
   * Fb snapshot data.
   * Field introduced in 21.1.3.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @return operStatus
   */
  @VsoMethod
  public OperationalStatus getOperStatus() {
    return operStatus;
  }

  /**
   * This is the setter method to the attribute.
   * Fb snapshot data.
   * Field introduced in 21.1.3.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @param operStatus set the operStatus.
   */
  @VsoMethod
  public void setOperStatus(OperationalStatus operStatus) {
    this.operStatus = operStatus;
  }



@Override
public boolean equals(java.lang.Object o) {
  if (this == o) {
    return true;
  }
  if (o == null || getClass() != o.getClass()) {
    return false;
  }
  FbPoolInfo objFbPoolInfo = (FbPoolInfo) o;
  return   Objects.equals(this.operStatus, objFbPoolInfo.operStatus);
}

@Override
public String toString() {
  StringBuilder sb = new StringBuilder();
  sb.append("class FbPoolInfo {\n");
      sb.append("    operStatus: ").append(toIndentedString(operStatus)).append("\n");
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
