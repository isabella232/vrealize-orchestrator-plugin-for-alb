package com.vmware.avi.vro.model;

import java.util.*;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonInclude.Include;
import com.vmware.avi.vro.model.IpAddrPrefix;
import com.vmware.avi.vro.model.IpAddrPrefix;
import com.vmware.o11n.plugin.sdk.annotation.VsoFinder;
import com.vmware.o11n.plugin.sdk.annotation.VsoMethod;
import com.vmware.o11n.plugin.sdk.annotation.VsoObject;
import com.vmware.avi.vro.Constants;
import org.springframework.stereotype.Service;

/**
 * The IPNetworkSubnet is a POJO class extends AviRestResource that used for creating
 * IPNetworkSubnet.
 *
 * @version 1.0
 * @since 
 *
 */
@VsoObject(create = false, name = "IPNetworkSubnet")
@VsoFinder(name = Constants.FINDER_VRO_IPNETWORKSUBNET)
@JsonIgnoreProperties(ignoreUnknown = true)
@Service
public class IPNetworkSubnet extends AviRestResource {
  @JsonProperty("network_ref")
  @JsonInclude(Include.NON_NULL)
  private String networkRef = null;

  @JsonProperty("subnet")
  @JsonInclude(Include.NON_NULL)
  private IpAddrPrefix subnet = null;

  @JsonProperty("subnet6")
  @JsonInclude(Include.NON_NULL)
  private IpAddrPrefix subnet6 = null;

  @JsonProperty("subnet6_uuid")
  @JsonInclude(Include.NON_NULL)
  private String subnet6Uuid = null;

  @JsonProperty("subnet_uuid")
  @JsonInclude(Include.NON_NULL)
  private String subnetUuid = null;



  /**
   * This is the getter method this will return the attribute value.
   * Network for virtualservice ip allocation with vantage as the ipam provider.
   * Network should be created before this is configured.
   * It is a reference to an object of type network.
   * @return networkRef
   */
  @VsoMethod
  public String getNetworkRef() {
    return networkRef;
  }

  /**
   * This is the setter method to the attribute.
   * Network for virtualservice ip allocation with vantage as the ipam provider.
   * Network should be created before this is configured.
   * It is a reference to an object of type network.
   * @param networkRef set the networkRef.
   */
  @VsoMethod
  public void setNetworkRef(String  networkRef) {
    this.networkRef = networkRef;
  }

  /**
   * This is the getter method this will return the attribute value.
   * Subnet for virtualservice ip allocation with vantage or infoblox as the ipam provider.
   * Only one of subnet or subnet_uuid configuration is allowed.
   * @return subnet
   */
  @VsoMethod
  public IpAddrPrefix getSubnet() {
    return subnet;
  }

  /**
   * This is the setter method to the attribute.
   * Subnet for virtualservice ip allocation with vantage or infoblox as the ipam provider.
   * Only one of subnet or subnet_uuid configuration is allowed.
   * @param subnet set the subnet.
   */
  @VsoMethod
  public void setSubnet(IpAddrPrefix subnet) {
    this.subnet = subnet;
  }

  /**
   * This is the getter method this will return the attribute value.
   * Subnet for virtualservice ipv6 allocation with vantage or infoblox as the ipam provider.
   * Only one of subnet or subnet_uuid configuration is allowed.
   * Field introduced in 18.1.1.
   * @return subnet6
   */
  @VsoMethod
  public IpAddrPrefix getSubnet6() {
    return subnet6;
  }

  /**
   * This is the setter method to the attribute.
   * Subnet for virtualservice ipv6 allocation with vantage or infoblox as the ipam provider.
   * Only one of subnet or subnet_uuid configuration is allowed.
   * Field introduced in 18.1.1.
   * @param subnet6 set the subnet6.
   */
  @VsoMethod
  public void setSubnet6(IpAddrPrefix subnet6) {
    this.subnet6 = subnet6;
  }

  /**
   * This is the getter method this will return the attribute value.
   * Subnet uuid or name or prefix for virtualservice ipv6 allocation with aws or openstack as the ipam provider.
   * Only one of subnet or subnet_uuid configuration is allowed.
   * Field introduced in 18.1.1.
   * @return subnet6Uuid
   */
  @VsoMethod
  public String getSubnet6Uuid() {
    return subnet6Uuid;
  }

  /**
   * This is the setter method to the attribute.
   * Subnet uuid or name or prefix for virtualservice ipv6 allocation with aws or openstack as the ipam provider.
   * Only one of subnet or subnet_uuid configuration is allowed.
   * Field introduced in 18.1.1.
   * @param subnet6Uuid set the subnet6Uuid.
   */
  @VsoMethod
  public void setSubnet6Uuid(String  subnet6Uuid) {
    this.subnet6Uuid = subnet6Uuid;
  }

  /**
   * This is the getter method this will return the attribute value.
   * Subnet uuid or name or prefix for virtualservice ip allocation with aws or openstack as the ipam provider.
   * Only one of subnet or subnet_uuid configuration is allowed.
   * @return subnetUuid
   */
  @VsoMethod
  public String getSubnetUuid() {
    return subnetUuid;
  }

  /**
   * This is the setter method to the attribute.
   * Subnet uuid or name or prefix for virtualservice ip allocation with aws or openstack as the ipam provider.
   * Only one of subnet or subnet_uuid configuration is allowed.
   * @param subnetUuid set the subnetUuid.
   */
  @VsoMethod
  public void setSubnetUuid(String  subnetUuid) {
    this.subnetUuid = subnetUuid;
  }



@Override
public boolean equals(java.lang.Object o) {
  if (this == o) {
    return true;
  }
  if (o == null || getClass() != o.getClass()) {
    return false;
  }
  IPNetworkSubnet objIPNetworkSubnet = (IPNetworkSubnet) o;
  return   Objects.equals(this.subnetUuid, objIPNetworkSubnet.subnetUuid)&&
  Objects.equals(this.subnet, objIPNetworkSubnet.subnet)&&
  Objects.equals(this.subnet6, objIPNetworkSubnet.subnet6)&&
  Objects.equals(this.subnet6Uuid, objIPNetworkSubnet.subnet6Uuid)&&
  Objects.equals(this.networkRef, objIPNetworkSubnet.networkRef);
}

@Override
public String toString() {
  StringBuilder sb = new StringBuilder();
  sb.append("class IPNetworkSubnet {\n");
      sb.append("    networkRef: ").append(toIndentedString(networkRef)).append("\n");
        sb.append("    subnet: ").append(toIndentedString(subnet)).append("\n");
        sb.append("    subnet6: ").append(toIndentedString(subnet6)).append("\n");
        sb.append("    subnet6Uuid: ").append(toIndentedString(subnet6Uuid)).append("\n");
        sb.append("    subnetUuid: ").append(toIndentedString(subnetUuid)).append("\n");
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
