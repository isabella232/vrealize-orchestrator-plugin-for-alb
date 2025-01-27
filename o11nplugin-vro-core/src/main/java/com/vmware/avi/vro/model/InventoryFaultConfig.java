package com.vmware.avi.vro.model;

import java.util.*;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonInclude.Include;
import com.vmware.avi.vro.model.ControllerFaults;
import com.vmware.avi.vro.model.ServiceengineFaults;
import com.vmware.avi.vro.model.VirtualserviceFaults;
import com.vmware.o11n.plugin.sdk.annotation.VsoFinder;
import com.vmware.o11n.plugin.sdk.annotation.VsoMethod;
import com.vmware.o11n.plugin.sdk.annotation.VsoObject;
import com.vmware.avi.vro.Constants;
import org.springframework.stereotype.Service;

/**
 * The InventoryFaultConfig is a POJO class extends AviRestResource that used for creating
 * InventoryFaultConfig.
 *
 * @version 1.0
 * @since 
 *
 */
@VsoObject(create = false, name = "InventoryFaultConfig")
@VsoFinder(name = Constants.FINDER_VRO_INVENTORYFAULTCONFIG, idAccessor = "getObjectID()")
@JsonIgnoreProperties(ignoreUnknown = true)
@Service
public class InventoryFaultConfig extends AviRestResource {
    @JsonProperty("controller_faults")
    @JsonInclude(Include.NON_NULL)
    private ControllerFaults controllerFaults = null;

    @JsonProperty("name")
    @JsonInclude(Include.NON_NULL)
    private String name = null;

    @JsonProperty("serviceengine_faults")
    @JsonInclude(Include.NON_NULL)
    private ServiceengineFaults serviceengineFaults = null;

    @JsonProperty("tenant_ref")
    @JsonInclude(Include.NON_NULL)
    private String tenantRef = null;

    @JsonProperty("url")
    @JsonInclude(Include.NON_NULL)
    private String url = "url";

    @JsonProperty("uuid")
    @JsonInclude(Include.NON_NULL)
    private String uuid = null;

    @JsonProperty("virtualservice_faults")
    @JsonInclude(Include.NON_NULL)
    private VirtualserviceFaults virtualserviceFaults = null;



  /**
   * This is the getter method this will return the attribute value.
   * Configure controller faults.
   * Field introduced in 20.1.6.
   * Allowed in enterprise edition with any value, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @return controllerFaults
   */
  @VsoMethod
  public ControllerFaults getControllerFaults() {
    return controllerFaults;
  }

  /**
   * This is the setter method to the attribute.
   * Configure controller faults.
   * Field introduced in 20.1.6.
   * Allowed in enterprise edition with any value, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @param controllerFaults set the controllerFaults.
   */
  @VsoMethod
  public void setControllerFaults(ControllerFaults controllerFaults) {
    this.controllerFaults = controllerFaults;
  }

  /**
   * This is the getter method this will return the attribute value.
   * Name.
   * Field introduced in 20.1.6.
   * Allowed in enterprise edition with any value, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @return name
   */
  @VsoMethod
  public String getName() {
    return name;
  }

  /**
   * This is the setter method to the attribute.
   * Name.
   * Field introduced in 20.1.6.
   * Allowed in enterprise edition with any value, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @param name set the name.
   */
  @VsoMethod
  public void setName(String  name) {
    this.name = name;
  }

  /**
   * This is the getter method this will return the attribute value.
   * Configure serviceengine faults.
   * Field introduced in 20.1.6.
   * Allowed in enterprise edition with any value, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @return serviceengineFaults
   */
  @VsoMethod
  public ServiceengineFaults getServiceengineFaults() {
    return serviceengineFaults;
  }

  /**
   * This is the setter method to the attribute.
   * Configure serviceengine faults.
   * Field introduced in 20.1.6.
   * Allowed in enterprise edition with any value, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @param serviceengineFaults set the serviceengineFaults.
   */
  @VsoMethod
  public void setServiceengineFaults(ServiceengineFaults serviceengineFaults) {
    this.serviceengineFaults = serviceengineFaults;
  }

  /**
   * This is the getter method this will return the attribute value.
   * Tenant.
   * It is a reference to an object of type tenant.
   * Field introduced in 20.1.6.
   * Allowed in enterprise edition with any value, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @return tenantRef
   */
  @VsoMethod
  public String getTenantRef() {
    return tenantRef;
  }

  /**
   * This is the setter method to the attribute.
   * Tenant.
   * It is a reference to an object of type tenant.
   * Field introduced in 20.1.6.
   * Allowed in enterprise edition with any value, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
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
   * Uuid auto generated.
   * Field introduced in 20.1.6.
   * Allowed in enterprise edition with any value, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @return uuid
   */
  @VsoMethod
  public String getUuid() {
    return uuid;
  }

  /**
   * This is the setter method to the attribute.
   * Uuid auto generated.
   * Field introduced in 20.1.6.
   * Allowed in enterprise edition with any value, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @param uuid set the uuid.
   */
  @VsoMethod
  public void setUuid(String  uuid) {
    this.uuid = uuid;
  }

  /**
   * This is the getter method this will return the attribute value.
   * Configure virtualservice faults.
   * Field introduced in 20.1.6.
   * Allowed in enterprise edition with any value, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @return virtualserviceFaults
   */
  @VsoMethod
  public VirtualserviceFaults getVirtualserviceFaults() {
    return virtualserviceFaults;
  }

  /**
   * This is the setter method to the attribute.
   * Configure virtualservice faults.
   * Field introduced in 20.1.6.
   * Allowed in enterprise edition with any value, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @param virtualserviceFaults set the virtualserviceFaults.
   */
  @VsoMethod
  public void setVirtualserviceFaults(VirtualserviceFaults virtualserviceFaults) {
    this.virtualserviceFaults = virtualserviceFaults;
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
  InventoryFaultConfig objInventoryFaultConfig = (InventoryFaultConfig) o;
  return   Objects.equals(this.uuid, objInventoryFaultConfig.uuid)&&
  Objects.equals(this.name, objInventoryFaultConfig.name)&&
  Objects.equals(this.tenantRef, objInventoryFaultConfig.tenantRef)&&
  Objects.equals(this.virtualserviceFaults, objInventoryFaultConfig.virtualserviceFaults)&&
  Objects.equals(this.controllerFaults, objInventoryFaultConfig.controllerFaults)&&
  Objects.equals(this.serviceengineFaults, objInventoryFaultConfig.serviceengineFaults);
}

@Override
public String toString() {
  StringBuilder sb = new StringBuilder();
  sb.append("class InventoryFaultConfig {\n");
      sb.append("    controllerFaults: ").append(toIndentedString(controllerFaults)).append("\n");
        sb.append("    name: ").append(toIndentedString(name)).append("\n");
        sb.append("    serviceengineFaults: ").append(toIndentedString(serviceengineFaults)).append("\n");
        sb.append("    tenantRef: ").append(toIndentedString(tenantRef)).append("\n");
            sb.append("    uuid: ").append(toIndentedString(uuid)).append("\n");
        sb.append("    virtualserviceFaults: ").append(toIndentedString(virtualserviceFaults)).append("\n");
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

