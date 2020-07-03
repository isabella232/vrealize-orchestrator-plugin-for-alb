package com.vmware.avi.vro.model;

import java.util.*;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonInclude.Include;
import com.vmware.avi.vro.model.BfdProfile;
import com.vmware.avi.vro.model.BgpProfile;
import com.vmware.avi.vro.model.DebugVrfContext;
import com.vmware.avi.vro.model.InternalGatewayMonitor;
import com.vmware.o11n.plugin.sdk.annotation.VsoFinder;
import com.vmware.o11n.plugin.sdk.annotation.VsoMethod;
import com.vmware.o11n.plugin.sdk.annotation.VsoObject;
import com.vmware.avi.vro.Constants;
import org.springframework.stereotype.Service;

/**
 * The VrfContext is a POJO class extends AviRestResource that used for creating
 * VrfContext.
 *
 * @version 1.0
 * @since 
 *
 */
@VsoObject(create = false, name = "VrfContext")
@VsoFinder(name = Constants.FINDER_VRO_VRFCONTEXT, idAccessor = "getObjectID()")
@JsonIgnoreProperties(ignoreUnknown = true)
@Service
public class VrfContext extends AviRestResource {
  @JsonProperty("bfd_profile")
  @JsonInclude(Include.NON_NULL)
  private BfdProfile bfdProfile = null;

  @JsonProperty("bgp_profile")
  @JsonInclude(Include.NON_NULL)
  private BgpProfile bgpProfile = null;

  @JsonProperty("cloud_ref")
  @JsonInclude(Include.NON_NULL)
  private String cloudRef = null;

  @JsonProperty("debugvrfcontext")
  @JsonInclude(Include.NON_NULL)
  private DebugVrfContext debugvrfcontext = null;

  @JsonProperty("description")
  @JsonInclude(Include.NON_NULL)
  private String description = null;

  @JsonProperty("gateway_mon")
  @JsonInclude(Include.NON_NULL)
  private List<GatewayMonitor> gatewayMon = null;

  @JsonProperty("internal_gateway_monitor")
  @JsonInclude(Include.NON_NULL)
  private InternalGatewayMonitor internalGatewayMonitor = null;

  @JsonProperty("labels")
  @JsonInclude(Include.NON_NULL)
  private List<KeyValue> labels = null;

  @JsonProperty("lldp_enable")
  @JsonInclude(Include.NON_NULL)
  private Boolean lldpEnable = true;

  @JsonProperty("name")
  @JsonInclude(Include.NON_NULL)
  private String name = null;

  @JsonProperty("static_routes")
  @JsonInclude(Include.NON_NULL)
  private List<StaticRoute> staticRoutes = null;

  @JsonProperty("system_default")
  @JsonInclude(Include.NON_NULL)
  private Boolean systemDefault = false;

  @JsonProperty("tenant_ref")
  @JsonInclude(Include.NON_NULL)
  private String tenantRef = null;

  @JsonProperty("url")
  @JsonInclude(Include.NON_NULL)
  private String url = "url";

  @JsonProperty("uuid")
  @JsonInclude(Include.NON_NULL)
  private String uuid = null;



  /**
   * This is the getter method this will return the attribute value.
   * Bfd configuration profile.
   * Field introduced in 20.1.1.
   * @return bfdProfile
   */
  @VsoMethod
  public BfdProfile getBfdProfile() {
    return bfdProfile;
  }

  /**
   * This is the setter method to the attribute.
   * Bfd configuration profile.
   * Field introduced in 20.1.1.
   * @param bfdProfile set the bfdProfile.
   */
  @VsoMethod
  public void setBfdProfile(BfdProfile bfdProfile) {
    this.bfdProfile = bfdProfile;
  }

  /**
   * This is the getter method this will return the attribute value.
   * Bgp local and peer info.
   * @return bgpProfile
   */
  @VsoMethod
  public BgpProfile getBgpProfile() {
    return bgpProfile;
  }

  /**
   * This is the setter method to the attribute.
   * Bgp local and peer info.
   * @param bgpProfile set the bgpProfile.
   */
  @VsoMethod
  public void setBgpProfile(BgpProfile bgpProfile) {
    this.bgpProfile = bgpProfile;
  }

  /**
   * This is the getter method this will return the attribute value.
   * It is a reference to an object of type cloud.
   * @return cloudRef
   */
  @VsoMethod
  public String getCloudRef() {
    return cloudRef;
  }

  /**
   * This is the setter method to the attribute.
   * It is a reference to an object of type cloud.
   * @param cloudRef set the cloudRef.
   */
  @VsoMethod
  public void setCloudRef(String  cloudRef) {
    this.cloudRef = cloudRef;
  }

  /**
   * This is the getter method this will return the attribute value.
   * Configure debug flags for vrf.
   * Field introduced in 17.1.1.
   * @return debugvrfcontext
   */
  @VsoMethod
  public DebugVrfContext getDebugvrfcontext() {
    return debugvrfcontext;
  }

  /**
   * This is the setter method to the attribute.
   * Configure debug flags for vrf.
   * Field introduced in 17.1.1.
   * @param debugvrfcontext set the debugvrfcontext.
   */
  @VsoMethod
  public void setDebugvrfcontext(DebugVrfContext debugvrfcontext) {
    this.debugvrfcontext = debugvrfcontext;
  }

  /**
   * This is the getter method this will return the attribute value.
   * User defined description for the object.
   * @return description
   */
  @VsoMethod
  public String getDescription() {
    return description;
  }

  /**
   * This is the setter method to the attribute.
   * User defined description for the object.
   * @param description set the description.
   */
  @VsoMethod
  public void setDescription(String  description) {
    this.description = description;
  }

  /**
   * This is the getter method this will return the attribute value.
   * Configure ping based heartbeat check for gateway in service engines of vrf.
   * @return gatewayMon
   */
  @VsoMethod
  public List<GatewayMonitor> getGatewayMon() {
    return gatewayMon;
  }

  /**
   * This is the setter method. this will set the gatewayMon
   * Configure ping based heartbeat check for gateway in service engines of vrf.
   * @return gatewayMon
   */
  @VsoMethod
  public void setGatewayMon(List<GatewayMonitor>  gatewayMon) {
    this.gatewayMon = gatewayMon;
  }

  /**
   * This is the setter method this will set the gatewayMon
   * Configure ping based heartbeat check for gateway in service engines of vrf.
   * @return gatewayMon
   */
  @VsoMethod
  public VrfContext addGatewayMonItem(GatewayMonitor gatewayMonItem) {
    if (this.gatewayMon == null) {
      this.gatewayMon = new ArrayList<GatewayMonitor>();
    }
    this.gatewayMon.add(gatewayMonItem);
    return this;
  }


  /**
   * This is the getter method this will return the attribute value.
   * Configure ping based heartbeat check for all default gateways in service engines of vrf.
   * Field introduced in 17.1.1.
   * @return internalGatewayMonitor
   */
  @VsoMethod
  public InternalGatewayMonitor getInternalGatewayMonitor() {
    return internalGatewayMonitor;
  }

  /**
   * This is the setter method to the attribute.
   * Configure ping based heartbeat check for all default gateways in service engines of vrf.
   * Field introduced in 17.1.1.
   * @param internalGatewayMonitor set the internalGatewayMonitor.
   */
  @VsoMethod
  public void setInternalGatewayMonitor(InternalGatewayMonitor internalGatewayMonitor) {
    this.internalGatewayMonitor = internalGatewayMonitor;
  }

  /**
   * This is the getter method this will return the attribute value.
   * Key/value labels which can be used for object access policy permission scoping.
   * Field introduced in 18.2.7, 20.1.1.
   * @return labels
   */
  @VsoMethod
  public List<KeyValue> getLabels() {
    return labels;
  }

  /**
   * This is the setter method. this will set the labels
   * Key/value labels which can be used for object access policy permission scoping.
   * Field introduced in 18.2.7, 20.1.1.
   * @return labels
   */
  @VsoMethod
  public void setLabels(List<KeyValue>  labels) {
    this.labels = labels;
  }

  /**
   * This is the setter method this will set the labels
   * Key/value labels which can be used for object access policy permission scoping.
   * Field introduced in 18.2.7, 20.1.1.
   * @return labels
   */
  @VsoMethod
  public VrfContext addLabelsItem(KeyValue labelsItem) {
    if (this.labels == null) {
      this.labels = new ArrayList<KeyValue>();
    }
    this.labels.add(labelsItem);
    return this;
  }


  /**
   * This is the getter method this will return the attribute value.
   * Enable lldp.
   * Field introduced in 20.1.1.
   * Default value when not specified in API or module is interpreted by Avi Controller as true.
   * @return lldpEnable
   */
  @VsoMethod
  public Boolean getLldpEnable() {
    return lldpEnable;
  }

  /**
   * This is the setter method to the attribute.
   * Enable lldp.
   * Field introduced in 20.1.1.
   * Default value when not specified in API or module is interpreted by Avi Controller as true.
   * @param lldpEnable set the lldpEnable.
   */
  @VsoMethod
  public void setLldpEnable(Boolean  lldpEnable) {
    this.lldpEnable = lldpEnable;
  }

  /**
   * This is the getter method this will return the attribute value.
   * Name of the object.
   * @return name
   */
  @VsoMethod
  public String getName() {
    return name;
  }

  /**
   * This is the setter method to the attribute.
   * Name of the object.
   * @param name set the name.
   */
  @VsoMethod
  public void setName(String  name) {
    this.name = name;
  }

  /**
   * This is the getter method this will return the attribute value.
   * Placeholder for description of property static_routes of obj type vrfcontext field type str  type array.
   * @return staticRoutes
   */
  @VsoMethod
  public List<StaticRoute> getStaticRoutes() {
    return staticRoutes;
  }

  /**
   * This is the setter method. this will set the staticRoutes
   * Placeholder for description of property static_routes of obj type vrfcontext field type str  type array.
   * @return staticRoutes
   */
  @VsoMethod
  public void setStaticRoutes(List<StaticRoute>  staticRoutes) {
    this.staticRoutes = staticRoutes;
  }

  /**
   * This is the setter method this will set the staticRoutes
   * Placeholder for description of property static_routes of obj type vrfcontext field type str  type array.
   * @return staticRoutes
   */
  @VsoMethod
  public VrfContext addStaticRoutesItem(StaticRoute staticRoutesItem) {
    if (this.staticRoutes == null) {
      this.staticRoutes = new ArrayList<StaticRoute>();
    }
    this.staticRoutes.add(staticRoutesItem);
    return this;
  }


  /**
   * This is the getter method this will return the attribute value.
   * Placeholder for description of property system_default of obj type vrfcontext field type str  type boolean.
   * Default value when not specified in API or module is interpreted by Avi Controller as false.
   * @return systemDefault
   */
  @VsoMethod
  public Boolean getSystemDefault() {
    return systemDefault;
  }

  /**
   * This is the setter method to the attribute.
   * Placeholder for description of property system_default of obj type vrfcontext field type str  type boolean.
   * Default value when not specified in API or module is interpreted by Avi Controller as false.
   * @param systemDefault set the systemDefault.
   */
  @VsoMethod
  public void setSystemDefault(Boolean  systemDefault) {
    this.systemDefault = systemDefault;
  }

  /**
   * This is the getter method this will return the attribute value.
   * It is a reference to an object of type tenant.
   * @return tenantRef
   */
  @VsoMethod
  public String getTenantRef() {
    return tenantRef;
  }

  /**
   * This is the setter method to the attribute.
   * It is a reference to an object of type tenant.
   * @param tenantRef set the tenantRef.
   */
  @VsoMethod
  public void setTenantRef(String  tenantRef) {
    this.tenantRef = tenantRef;
  }
/**
   * This is the getter method this will return the attribute value.
   * Avi controller URL of the object.
   * @return url
   */
  @VsoMethod
  public String getUrl() {
    return url;
  }

  /**
   * This is the setter method. this will set the url
   * Avi controller URL of the object.
   * @return url
   */
  @VsoMethod
  public void setUrl(String  url) {
    this.url = url;
  }

  /**
   * This is the getter method this will return the attribute value.
   * Unique object identifier of the object.
   * @return uuid
   */
  @VsoMethod
  public String getUuid() {
    return uuid;
  }

  /**
   * This is the setter method to the attribute.
   * Unique object identifier of the object.
   * @param uuid set the uuid.
   */
  @VsoMethod
  public void setUuid(String  uuid) {
    this.uuid = uuid;
  }


  public String getObjectID() {
    return name + "(" + uuid  + ")";
  }

@Override
public boolean equals(java.lang.Object o) {
  if (this == o) {
    return true;
  }
  if (o == null || getClass() != o.getClass()) {
    return false;
  }
  VrfContext objVrfContext = (VrfContext) o;
  return   Objects.equals(this.cloudRef, objVrfContext.cloudRef)&&
  Objects.equals(this.bfdProfile, objVrfContext.bfdProfile)&&
  Objects.equals(this.uuid, objVrfContext.uuid)&&
  Objects.equals(this.staticRoutes, objVrfContext.staticRoutes)&&
  Objects.equals(this.description, objVrfContext.description)&&
  Objects.equals(this.labels, objVrfContext.labels)&&
  Objects.equals(this.lldpEnable, objVrfContext.lldpEnable)&&
  Objects.equals(this.tenantRef, objVrfContext.tenantRef)&&
  Objects.equals(this.systemDefault, objVrfContext.systemDefault)&&
  Objects.equals(this.gatewayMon, objVrfContext.gatewayMon)&&
  Objects.equals(this.internalGatewayMonitor, objVrfContext.internalGatewayMonitor)&&
  Objects.equals(this.debugvrfcontext, objVrfContext.debugvrfcontext)&&
  Objects.equals(this.bgpProfile, objVrfContext.bgpProfile)&&
  Objects.equals(this.name, objVrfContext.name);
}

@Override
public String toString() {
  StringBuilder sb = new StringBuilder();
  sb.append("class VrfContext {\n");
      sb.append("    bfdProfile: ").append(toIndentedString(bfdProfile)).append("\n");
        sb.append("    bgpProfile: ").append(toIndentedString(bgpProfile)).append("\n");
        sb.append("    cloudRef: ").append(toIndentedString(cloudRef)).append("\n");
        sb.append("    debugvrfcontext: ").append(toIndentedString(debugvrfcontext)).append("\n");
        sb.append("    description: ").append(toIndentedString(description)).append("\n");
        sb.append("    gatewayMon: ").append(toIndentedString(gatewayMon)).append("\n");
        sb.append("    internalGatewayMonitor: ").append(toIndentedString(internalGatewayMonitor)).append("\n");
        sb.append("    labels: ").append(toIndentedString(labels)).append("\n");
        sb.append("    lldpEnable: ").append(toIndentedString(lldpEnable)).append("\n");
        sb.append("    name: ").append(toIndentedString(name)).append("\n");
        sb.append("    staticRoutes: ").append(toIndentedString(staticRoutes)).append("\n");
        sb.append("    systemDefault: ").append(toIndentedString(systemDefault)).append("\n");
        sb.append("    tenantRef: ").append(toIndentedString(tenantRef)).append("\n");
            sb.append("    uuid: ").append(toIndentedString(uuid)).append("\n");
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
