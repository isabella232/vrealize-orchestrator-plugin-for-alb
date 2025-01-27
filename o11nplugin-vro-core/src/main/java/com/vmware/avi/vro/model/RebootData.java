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
 * The RebootData is a POJO class extends AviRestResource that used for creating
 * RebootData.
 *
 * @version 1.0
 * @since 
 *
 */
@VsoObject(create = false, name = "RebootData")
@VsoFinder(name = Constants.FINDER_VRO_REBOOTDATA)
@JsonIgnoreProperties(ignoreUnknown = true)
@Service
public class RebootData extends AviRestResource {
    @JsonProperty("patch_version")
    @JsonInclude(Include.NON_NULL)
    private String patchVersion = null;

    @JsonProperty("reboot")
    @JsonInclude(Include.NON_NULL)
    private Boolean reboot = null;



  /**
   * This is the getter method this will return the attribute value.
   * Patch version for which reboot flag need to be computed.
   * Field introduced in 18.2.8, 20.1.1.
   * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @return patchVersion
   */
  @VsoMethod
  public String getPatchVersion() {
    return patchVersion;
  }

  /**
   * This is the setter method to the attribute.
   * Patch version for which reboot flag need to be computed.
   * Field introduced in 18.2.8, 20.1.1.
   * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @param patchVersion set the patchVersion.
   */
  @VsoMethod
  public void setPatchVersion(String  patchVersion) {
    this.patchVersion = patchVersion;
  }

  /**
   * This is the getter method this will return the attribute value.
   * This variable tells whether reboot has to be performed.
   * Field introduced in 18.2.8, 20.1.1.
   * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @return reboot
   */
  @VsoMethod
  public Boolean getReboot() {
    return reboot;
  }

  /**
   * This is the setter method to the attribute.
   * This variable tells whether reboot has to be performed.
   * Field introduced in 18.2.8, 20.1.1.
   * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @param reboot set the reboot.
   */
  @VsoMethod
  public void setReboot(Boolean  reboot) {
    this.reboot = reboot;
  }



@Override
public boolean equals(java.lang.Object o) {
  if (this == o) {
    return true;
  }
  if (o == null || getClass() != o.getClass()) {
    return false;
  }
  RebootData objRebootData = (RebootData) o;
  return   Objects.equals(this.patchVersion, objRebootData.patchVersion)&&
  Objects.equals(this.reboot, objRebootData.reboot);
}

@Override
public String toString() {
  StringBuilder sb = new StringBuilder();
  sb.append("class RebootData {\n");
      sb.append("    patchVersion: ").append(toIndentedString(patchVersion)).append("\n");
        sb.append("    reboot: ").append(toIndentedString(reboot)).append("\n");
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

