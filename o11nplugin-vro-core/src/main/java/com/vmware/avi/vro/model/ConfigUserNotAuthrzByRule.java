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
 * The ConfigUserNotAuthrzByRule is a POJO class extends AviRestResource that used for creating
 * ConfigUserNotAuthrzByRule.
 *
 * @version 1.0
 * @since 
 *
 */
@VsoObject(create = false, name = "ConfigUserNotAuthrzByRule")
@VsoFinder(name = Constants.FINDER_VRO_CONFIGUSERNOTAUTHRZBYRULE)
@JsonIgnoreProperties(ignoreUnknown = true)
@Service
public class ConfigUserNotAuthrzByRule extends AviRestResource {
  @JsonProperty("policies")
  @JsonInclude(Include.NON_NULL)
  private String policies = "no policies";

  @JsonProperty("roles")
  @JsonInclude(Include.NON_NULL)
  private String roles = "no roles";

  @JsonProperty("tenants")
  @JsonInclude(Include.NON_NULL)
  private String tenants = "no tenants";

  @JsonProperty("user")
  @JsonInclude(Include.NON_NULL)
  private String user = null;



  /**
   * This is the getter method this will return the attribute value.
   * Comma separated list of policies assigned to the user.
   * Field introduced in 18.2.7, 20.1.1.
   * Default value when not specified in API or module is interpreted by Avi Controller as no policies.
   * @return policies
   */
  @VsoMethod
  public String getPolicies() {
    return policies;
  }

  /**
   * This is the setter method to the attribute.
   * Comma separated list of policies assigned to the user.
   * Field introduced in 18.2.7, 20.1.1.
   * Default value when not specified in API or module is interpreted by Avi Controller as no policies.
   * @param policies set the policies.
   */
  @VsoMethod
  public void setPolicies(String  policies) {
    this.policies = policies;
  }

  /**
   * This is the getter method this will return the attribute value.
   * Assigned roles.
   * Default value when not specified in API or module is interpreted by Avi Controller as no roles.
   * @return roles
   */
  @VsoMethod
  public String getRoles() {
    return roles;
  }

  /**
   * This is the setter method to the attribute.
   * Assigned roles.
   * Default value when not specified in API or module is interpreted by Avi Controller as no roles.
   * @param roles set the roles.
   */
  @VsoMethod
  public void setRoles(String  roles) {
    this.roles = roles;
  }

  /**
   * This is the getter method this will return the attribute value.
   * Assigned tenants.
   * Default value when not specified in API or module is interpreted by Avi Controller as no tenants.
   * @return tenants
   */
  @VsoMethod
  public String getTenants() {
    return tenants;
  }

  /**
   * This is the setter method to the attribute.
   * Assigned tenants.
   * Default value when not specified in API or module is interpreted by Avi Controller as no tenants.
   * @param tenants set the tenants.
   */
  @VsoMethod
  public void setTenants(String  tenants) {
    this.tenants = tenants;
  }

  /**
   * This is the getter method this will return the attribute value.
   * Request user.
   * @return user
   */
  @VsoMethod
  public String getUser() {
    return user;
  }

  /**
   * This is the setter method to the attribute.
   * Request user.
   * @param user set the user.
   */
  @VsoMethod
  public void setUser(String  user) {
    this.user = user;
  }



@Override
public boolean equals(java.lang.Object o) {
  if (this == o) {
    return true;
  }
  if (o == null || getClass() != o.getClass()) {
    return false;
  }
  ConfigUserNotAuthrzByRule objConfigUserNotAuthrzByRule = (ConfigUserNotAuthrzByRule) o;
  return   Objects.equals(this.policies, objConfigUserNotAuthrzByRule.policies)&&
  Objects.equals(this.tenants, objConfigUserNotAuthrzByRule.tenants)&&
  Objects.equals(this.user, objConfigUserNotAuthrzByRule.user)&&
  Objects.equals(this.roles, objConfigUserNotAuthrzByRule.roles);
}

@Override
public String toString() {
  StringBuilder sb = new StringBuilder();
  sb.append("class ConfigUserNotAuthrzByRule {\n");
      sb.append("    policies: ").append(toIndentedString(policies)).append("\n");
        sb.append("    roles: ").append(toIndentedString(roles)).append("\n");
        sb.append("    tenants: ").append(toIndentedString(tenants)).append("\n");
        sb.append("    user: ").append(toIndentedString(user)).append("\n");
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
