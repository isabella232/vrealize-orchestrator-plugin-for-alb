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
 * The DnsTxtRdata is a POJO class extends AviRestResource that used for creating
 * DnsTxtRdata.
 *
 * @version 1.0
 * @since 
 *
 */
@VsoObject(create = false, name = "DnsTxtRdata")
@VsoFinder(name = Constants.FINDER_VRO_DNSTXTRDATA)
@JsonIgnoreProperties(ignoreUnknown = true)
@Service
public class DnsTxtRdata extends AviRestResource {
  @JsonProperty("text_str")
  @JsonInclude(Include.NON_NULL)
  private String textStr = null;



  /**
   * This is the getter method this will return the attribute value.
   * Text data associated with the fqdn.
   * Field introduced in 18.2.9, 20.1.1.
   * @return textStr
   */
  @VsoMethod
  public String getTextStr() {
    return textStr;
  }

  /**
   * This is the setter method to the attribute.
   * Text data associated with the fqdn.
   * Field introduced in 18.2.9, 20.1.1.
   * @param textStr set the textStr.
   */
  @VsoMethod
  public void setTextStr(String  textStr) {
    this.textStr = textStr;
  }



@Override
public boolean equals(java.lang.Object o) {
  if (this == o) {
    return true;
  }
  if (o == null || getClass() != o.getClass()) {
    return false;
  }
  DnsTxtRdata objDnsTxtRdata = (DnsTxtRdata) o;
  return   Objects.equals(this.textStr, objDnsTxtRdata.textStr);
}

@Override
public String toString() {
  StringBuilder sb = new StringBuilder();
  sb.append("class DnsTxtRdata {\n");
      sb.append("    textStr: ").append(toIndentedString(textStr)).append("\n");
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
