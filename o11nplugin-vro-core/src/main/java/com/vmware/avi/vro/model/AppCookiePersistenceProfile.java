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
 * The AppCookiePersistenceProfile is a POJO class extends AviRestResource that used for creating
 * AppCookiePersistenceProfile.
 *
 * @version 1.0
 * @since 
 *
 */
@VsoObject(create = false, name = "AppCookiePersistenceProfile")
@VsoFinder(name = Constants.FINDER_VRO_APPCOOKIEPERSISTENCEPROFILE)
@JsonIgnoreProperties(ignoreUnknown = true)
@Service
public class AppCookiePersistenceProfile extends AviRestResource {
    @JsonProperty("encryption_key")
    @JsonInclude(Include.NON_NULL)
    private String encryptionKey = null;

    @JsonProperty("prst_hdr_name")
    @JsonInclude(Include.NON_NULL)
    private String prstHdrName = null;

    @JsonProperty("timeout")
    @JsonInclude(Include.NON_NULL)
    private Integer timeout = 20;



  /**
   * This is the getter method this will return the attribute value.
   * Key to use for cookie encryption.
   * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @return encryptionKey
   */
  @VsoMethod
  public String getEncryptionKey() {
    return encryptionKey;
  }

  /**
   * This is the setter method to the attribute.
   * Key to use for cookie encryption.
   * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @param encryptionKey set the encryptionKey.
   */
  @VsoMethod
  public void setEncryptionKey(String  encryptionKey) {
    this.encryptionKey = encryptionKey;
  }

  /**
   * This is the getter method this will return the attribute value.
   * Header or cookie name for application cookie persistence.
   * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @return prstHdrName
   */
  @VsoMethod
  public String getPrstHdrName() {
    return prstHdrName;
  }

  /**
   * This is the setter method to the attribute.
   * Header or cookie name for application cookie persistence.
   * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @param prstHdrName set the prstHdrName.
   */
  @VsoMethod
  public void setPrstHdrName(String  prstHdrName) {
    this.prstHdrName = prstHdrName;
  }

  /**
   * This is the getter method this will return the attribute value.
   * The length of time after a client's connections have closed before expiring the client's persistence to a server.
   * Allowed values are 1-720.
   * Unit is min.
   * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as 20.
   * @return timeout
   */
  @VsoMethod
  public Integer getTimeout() {
    return timeout;
  }

  /**
   * This is the setter method to the attribute.
   * The length of time after a client's connections have closed before expiring the client's persistence to a server.
   * Allowed values are 1-720.
   * Unit is min.
   * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as 20.
   * @param timeout set the timeout.
   */
  @VsoMethod
  public void setTimeout(Integer  timeout) {
    this.timeout = timeout;
  }



@Override
public boolean equals(java.lang.Object o) {
  if (this == o) {
    return true;
  }
  if (o == null || getClass() != o.getClass()) {
    return false;
  }
  AppCookiePersistenceProfile objAppCookiePersistenceProfile = (AppCookiePersistenceProfile) o;
  return   Objects.equals(this.prstHdrName, objAppCookiePersistenceProfile.prstHdrName)&&
  Objects.equals(this.timeout, objAppCookiePersistenceProfile.timeout)&&
  Objects.equals(this.encryptionKey, objAppCookiePersistenceProfile.encryptionKey);
}

@Override
public String toString() {
  StringBuilder sb = new StringBuilder();
  sb.append("class AppCookiePersistenceProfile {\n");
      sb.append("    encryptionKey: ").append(toIndentedString(encryptionKey)).append("\n");
        sb.append("    prstHdrName: ").append(toIndentedString(prstHdrName)).append("\n");
        sb.append("    timeout: ").append(toIndentedString(timeout)).append("\n");
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

