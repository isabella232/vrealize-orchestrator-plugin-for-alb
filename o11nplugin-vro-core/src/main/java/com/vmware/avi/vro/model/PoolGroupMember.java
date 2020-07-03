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
 * The PoolGroupMember is a POJO class extends AviRestResource that used for creating
 * PoolGroupMember.
 *
 * @version 1.0
 * @since 
 *
 */
@VsoObject(create = false, name = "PoolGroupMember")
@VsoFinder(name = Constants.FINDER_VRO_POOLGROUPMEMBER)
@JsonIgnoreProperties(ignoreUnknown = true)
@Service
public class PoolGroupMember extends AviRestResource {
  @JsonProperty("deployment_state")
  @JsonInclude(Include.NON_NULL)
  private String deploymentState = null;

  @JsonProperty("pool_ref")
  @JsonInclude(Include.NON_NULL)
  private String poolRef = null;

  @JsonProperty("priority_label")
  @JsonInclude(Include.NON_NULL)
  private String priorityLabel = null;

  @JsonProperty("ratio")
  @JsonInclude(Include.NON_NULL)
  private Integer ratio = 1;



  /**
   * This is the getter method this will return the attribute value.
   * Pool deployment state used with the pg deployment policy.
   * Enum options - EVALUATION_IN_PROGRESS, IN_SERVICE, OUT_OF_SERVICE, EVALUATION_FAILED.
   * @return deploymentState
   */
  @VsoMethod
  public String getDeploymentState() {
    return deploymentState;
  }

  /**
   * This is the setter method to the attribute.
   * Pool deployment state used with the pg deployment policy.
   * Enum options - EVALUATION_IN_PROGRESS, IN_SERVICE, OUT_OF_SERVICE, EVALUATION_FAILED.
   * @param deploymentState set the deploymentState.
   */
  @VsoMethod
  public void setDeploymentState(String  deploymentState) {
    this.deploymentState = deploymentState;
  }

  /**
   * This is the getter method this will return the attribute value.
   * Uuid of the pool.
   * It is a reference to an object of type pool.
   * @return poolRef
   */
  @VsoMethod
  public String getPoolRef() {
    return poolRef;
  }

  /**
   * This is the setter method to the attribute.
   * Uuid of the pool.
   * It is a reference to an object of type pool.
   * @param poolRef set the poolRef.
   */
  @VsoMethod
  public void setPoolRef(String  poolRef) {
    this.poolRef = poolRef;
  }

  /**
   * This is the getter method this will return the attribute value.
   * All pools with same label are treated similarly in a pool group.
   * A pool with a higher priority is selected, as long as the pool is eligible or an explicit policy chooses a different pool.
   * @return priorityLabel
   */
  @VsoMethod
  public String getPriorityLabel() {
    return priorityLabel;
  }

  /**
   * This is the setter method to the attribute.
   * All pools with same label are treated similarly in a pool group.
   * A pool with a higher priority is selected, as long as the pool is eligible or an explicit policy chooses a different pool.
   * @param priorityLabel set the priorityLabel.
   */
  @VsoMethod
  public void setPriorityLabel(String  priorityLabel) {
    this.priorityLabel = priorityLabel;
  }

  /**
   * This is the getter method this will return the attribute value.
   * Ratio of selecting eligible pools in the pool group.
   * Allowed values are 1-1000.
   * Special values are 0 - 'do not select this pool for new connections'.
   * Default value when not specified in API or module is interpreted by Avi Controller as 1.
   * @return ratio
   */
  @VsoMethod
  public Integer getRatio() {
    return ratio;
  }

  /**
   * This is the setter method to the attribute.
   * Ratio of selecting eligible pools in the pool group.
   * Allowed values are 1-1000.
   * Special values are 0 - 'do not select this pool for new connections'.
   * Default value when not specified in API or module is interpreted by Avi Controller as 1.
   * @param ratio set the ratio.
   */
  @VsoMethod
  public void setRatio(Integer  ratio) {
    this.ratio = ratio;
  }



@Override
public boolean equals(java.lang.Object o) {
  if (this == o) {
    return true;
  }
  if (o == null || getClass() != o.getClass()) {
    return false;
  }
  PoolGroupMember objPoolGroupMember = (PoolGroupMember) o;
  return   Objects.equals(this.poolRef, objPoolGroupMember.poolRef)&&
  Objects.equals(this.deploymentState, objPoolGroupMember.deploymentState)&&
  Objects.equals(this.ratio, objPoolGroupMember.ratio)&&
  Objects.equals(this.priorityLabel, objPoolGroupMember.priorityLabel);
}

@Override
public String toString() {
  StringBuilder sb = new StringBuilder();
  sb.append("class PoolGroupMember {\n");
      sb.append("    deploymentState: ").append(toIndentedString(deploymentState)).append("\n");
        sb.append("    poolRef: ").append(toIndentedString(poolRef)).append("\n");
        sb.append("    priorityLabel: ").append(toIndentedString(priorityLabel)).append("\n");
        sb.append("    ratio: ").append(toIndentedString(ratio)).append("\n");
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
