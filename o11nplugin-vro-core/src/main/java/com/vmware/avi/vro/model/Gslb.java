package com.vmware.avi.vro.model;

import java.util.*;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonInclude.Include;
import com.vmware.avi.vro.model.GslbClientIpAddrGroup;
import com.vmware.avi.vro.model.ReplicationPolicy;
import com.vmware.o11n.plugin.sdk.annotation.VsoFinder;
import com.vmware.o11n.plugin.sdk.annotation.VsoMethod;
import com.vmware.o11n.plugin.sdk.annotation.VsoObject;
import com.vmware.avi.vro.Constants;
import org.springframework.stereotype.Service;

/**
 * The Gslb is a POJO class extends AviRestResource that used for creating
 * Gslb.
 *
 * @version 1.0
 * @since 
 *
 */
@VsoObject(create = false, name = "Gslb")
@VsoFinder(name = Constants.FINDER_VRO_GSLB, idAccessor = "getObjectID()")
@JsonIgnoreProperties(ignoreUnknown = true)
@Service
public class Gslb extends AviRestResource {
  @JsonProperty("async_interval")
  @JsonInclude(Include.NON_NULL)
  private Integer asyncInterval = 0;

  @JsonProperty("clear_on_max_retries")
  @JsonInclude(Include.NON_NULL)
  private Integer clearOnMaxRetries = 20;

  @JsonProperty("client_ip_addr_group")
  @JsonInclude(Include.NON_NULL)
  private GslbClientIpAddrGroup clientIpAddrGroup = null;

  @JsonProperty("description")
  @JsonInclude(Include.NON_NULL)
  private String description = null;

  @JsonProperty("dns_configs")
  @JsonInclude(Include.NON_NULL)
  private List<DNSConfig> dnsConfigs = null;

  @JsonProperty("error_resync_interval")
  @JsonInclude(Include.NON_NULL)
  private Integer errorResyncInterval = 300;

  @JsonProperty("is_federated")
  @JsonInclude(Include.NON_NULL)
  private Boolean isFederated = true;

  @JsonProperty("leader_cluster_uuid")
  @JsonInclude(Include.NON_NULL)
  private String leaderClusterUuid = null;

  @JsonProperty("maintenance_mode")
  @JsonInclude(Include.NON_NULL)
  private Boolean maintenanceMode = false;

  @JsonProperty("name")
  @JsonInclude(Include.NON_NULL)
  private String name = null;

  @JsonProperty("replication_policy")
  @JsonInclude(Include.NON_NULL)
  private ReplicationPolicy replicationPolicy = null;

  @JsonProperty("send_interval")
  @JsonInclude(Include.NON_NULL)
  private Integer sendInterval = 15;

  @JsonProperty("send_interval_prior_to_maintenance_mode")
  @JsonInclude(Include.NON_NULL)
  private Integer sendIntervalPriorToMaintenanceMode = null;

  @JsonProperty("sites")
  @JsonInclude(Include.NON_NULL)
  private List<GslbSite> sites = null;

  @JsonProperty("tenant_ref")
  @JsonInclude(Include.NON_NULL)
  private String tenantRef = null;

  @JsonProperty("third_party_sites")
  @JsonInclude(Include.NON_NULL)
  private List<GslbThirdPartySite> thirdPartySites = null;

  @JsonProperty("url")
  @JsonInclude(Include.NON_NULL)
  private String url = "url";

  @JsonProperty("uuid")
  @JsonInclude(Include.NON_NULL)
  private String uuid = null;

  @JsonProperty("view_id")
  @JsonInclude(Include.NON_NULL)
  private Integer viewId = 0;



  /**
   * This is the getter method this will return the attribute value.
   * Frequency with which messages are propagated to vs mgr.
   * Value of 0 disables async behavior and rpc are sent inline.
   * Allowed values are 0-5.
   * Field introduced in 18.2.3.
   * Default value when not specified in API or module is interpreted by Avi Controller as 0.
   * @return asyncInterval
   */
  @VsoMethod
  public Integer getAsyncInterval() {
    return asyncInterval;
  }

  /**
   * This is the setter method to the attribute.
   * Frequency with which messages are propagated to vs mgr.
   * Value of 0 disables async behavior and rpc are sent inline.
   * Allowed values are 0-5.
   * Field introduced in 18.2.3.
   * Default value when not specified in API or module is interpreted by Avi Controller as 0.
   * @param asyncInterval set the asyncInterval.
   */
  @VsoMethod
  public void setAsyncInterval(Integer  asyncInterval) {
    this.asyncInterval = asyncInterval;
  }

  /**
   * This is the getter method this will return the attribute value.
   * Max retries after which the remote site is treated as a fresh start.
   * In fresh start all the configs are downloaded.
   * Allowed values are 1-1024.
   * Default value when not specified in API or module is interpreted by Avi Controller as 20.
   * @return clearOnMaxRetries
   */
  @VsoMethod
  public Integer getClearOnMaxRetries() {
    return clearOnMaxRetries;
  }

  /**
   * This is the setter method to the attribute.
   * Max retries after which the remote site is treated as a fresh start.
   * In fresh start all the configs are downloaded.
   * Allowed values are 1-1024.
   * Default value when not specified in API or module is interpreted by Avi Controller as 20.
   * @param clearOnMaxRetries set the clearOnMaxRetries.
   */
  @VsoMethod
  public void setClearOnMaxRetries(Integer  clearOnMaxRetries) {
    this.clearOnMaxRetries = clearOnMaxRetries;
  }

  /**
   * This is the getter method this will return the attribute value.
   * Group to specify if the client ip addresses are public or private.
   * Field introduced in 17.1.2.
   * @return clientIpAddrGroup
   */
  @VsoMethod
  public GslbClientIpAddrGroup getClientIpAddrGroup() {
    return clientIpAddrGroup;
  }

  /**
   * This is the setter method to the attribute.
   * Group to specify if the client ip addresses are public or private.
   * Field introduced in 17.1.2.
   * @param clientIpAddrGroup set the clientIpAddrGroup.
   */
  @VsoMethod
  public void setClientIpAddrGroup(GslbClientIpAddrGroup clientIpAddrGroup) {
    this.clientIpAddrGroup = clientIpAddrGroup;
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
   * Sub domain configuration for the gslb.
   * Gslb service's fqdn must be a match one of these subdomains.
   * @return dnsConfigs
   */
  @VsoMethod
  public List<DNSConfig> getDnsConfigs() {
    return dnsConfigs;
  }

  /**
   * This is the setter method. this will set the dnsConfigs
   * Sub domain configuration for the gslb.
   * Gslb service's fqdn must be a match one of these subdomains.
   * @return dnsConfigs
   */
  @VsoMethod
  public void setDnsConfigs(List<DNSConfig>  dnsConfigs) {
    this.dnsConfigs = dnsConfigs;
  }

  /**
   * This is the setter method this will set the dnsConfigs
   * Sub domain configuration for the gslb.
   * Gslb service's fqdn must be a match one of these subdomains.
   * @return dnsConfigs
   */
  @VsoMethod
  public Gslb addDnsConfigsItem(DNSConfig dnsConfigsItem) {
    if (this.dnsConfigs == null) {
      this.dnsConfigs = new ArrayList<DNSConfig>();
    }
    this.dnsConfigs.add(dnsConfigsItem);
    return this;
  }


  /**
   * This is the getter method this will return the attribute value.
   * Frequency with which errored messages are resynced to follower sites.
   * Value of 0 disables resync behavior.
   * Allowed values are 60-3600.
   * Special values are 0 - 'disable'.
   * Field introduced in 18.2.3.
   * Default value when not specified in API or module is interpreted by Avi Controller as 300.
   * @return errorResyncInterval
   */
  @VsoMethod
  public Integer getErrorResyncInterval() {
    return errorResyncInterval;
  }

  /**
   * This is the setter method to the attribute.
   * Frequency with which errored messages are resynced to follower sites.
   * Value of 0 disables resync behavior.
   * Allowed values are 60-3600.
   * Special values are 0 - 'disable'.
   * Field introduced in 18.2.3.
   * Default value when not specified in API or module is interpreted by Avi Controller as 300.
   * @param errorResyncInterval set the errorResyncInterval.
   */
  @VsoMethod
  public void setErrorResyncInterval(Integer  errorResyncInterval) {
    this.errorResyncInterval = errorResyncInterval;
  }

  /**
   * This is the getter method this will return the attribute value.
   * This field indicates that this object is replicated across gslb federation.
   * Field introduced in 17.1.3.
   * Default value when not specified in API or module is interpreted by Avi Controller as true.
   * @return isFederated
   */
  @VsoMethod
  public Boolean getIsFederated() {
    return isFederated;
  }

  /**
   * This is the setter method to the attribute.
   * This field indicates that this object is replicated across gslb federation.
   * Field introduced in 17.1.3.
   * Default value when not specified in API or module is interpreted by Avi Controller as true.
   * @param isFederated set the isFederated.
   */
  @VsoMethod
  public void setIsFederated(Boolean  isFederated) {
    this.isFederated = isFederated;
  }

  /**
   * This is the getter method this will return the attribute value.
   * Mark this site as leader of gslb configuration.
   * This site is the one among the avi sites.
   * @return leaderClusterUuid
   */
  @VsoMethod
  public String getLeaderClusterUuid() {
    return leaderClusterUuid;
  }

  /**
   * This is the setter method to the attribute.
   * Mark this site as leader of gslb configuration.
   * This site is the one among the avi sites.
   * @param leaderClusterUuid set the leaderClusterUuid.
   */
  @VsoMethod
  public void setLeaderClusterUuid(String  leaderClusterUuid) {
    this.leaderClusterUuid = leaderClusterUuid;
  }

  /**
   * This is the getter method this will return the attribute value.
   * This field disables the configuration operations on the leader for all federated objects.
   * Cud operations on gslb, gslbservice, gslbgeodbprofile and other federated objects will be rejected.
   * The rest-api disabling helps in upgrade scenarios where we don't want configuration sync operations to the gslb member when the member is being
   * upgraded.
   * This configuration programmatically blocks the leader from accepting new gslb configuration when member sites are undergoing upgrade.
   * Field introduced in 17.2.1.
   * Default value when not specified in API or module is interpreted by Avi Controller as false.
   * @return maintenanceMode
   */
  @VsoMethod
  public Boolean getMaintenanceMode() {
    return maintenanceMode;
  }

  /**
   * This is the setter method to the attribute.
   * This field disables the configuration operations on the leader for all federated objects.
   * Cud operations on gslb, gslbservice, gslbgeodbprofile and other federated objects will be rejected.
   * The rest-api disabling helps in upgrade scenarios where we don't want configuration sync operations to the gslb member when the member is being
   * upgraded.
   * This configuration programmatically blocks the leader from accepting new gslb configuration when member sites are undergoing upgrade.
   * Field introduced in 17.2.1.
   * Default value when not specified in API or module is interpreted by Avi Controller as false.
   * @param maintenanceMode set the maintenanceMode.
   */
  @VsoMethod
  public void setMaintenanceMode(Boolean  maintenanceMode) {
    this.maintenanceMode = maintenanceMode;
  }

  /**
   * This is the getter method this will return the attribute value.
   * Name for the gslb object.
   * @return name
   */
  @VsoMethod
  public String getName() {
    return name;
  }

  /**
   * This is the setter method to the attribute.
   * Name for the gslb object.
   * @param name set the name.
   */
  @VsoMethod
  public void setName(String  name) {
    this.name = name;
  }

  /**
   * This is the getter method this will return the attribute value.
   * Policy for replicating configuration to the active follower sites.
   * Field introduced in 20.1.1.
   * @return replicationPolicy
   */
  @VsoMethod
  public ReplicationPolicy getReplicationPolicy() {
    return replicationPolicy;
  }

  /**
   * This is the setter method to the attribute.
   * Policy for replicating configuration to the active follower sites.
   * Field introduced in 20.1.1.
   * @param replicationPolicy set the replicationPolicy.
   */
  @VsoMethod
  public void setReplicationPolicy(ReplicationPolicy replicationPolicy) {
    this.replicationPolicy = replicationPolicy;
  }

  /**
   * This is the getter method this will return the attribute value.
   * Frequency with which group members communicate.
   * Allowed values are 1-3600.
   * Default value when not specified in API or module is interpreted by Avi Controller as 15.
   * @return sendInterval
   */
  @VsoMethod
  public Integer getSendInterval() {
    return sendInterval;
  }

  /**
   * This is the setter method to the attribute.
   * Frequency with which group members communicate.
   * Allowed values are 1-3600.
   * Default value when not specified in API or module is interpreted by Avi Controller as 15.
   * @param sendInterval set the sendInterval.
   */
  @VsoMethod
  public void setSendInterval(Integer  sendInterval) {
    this.sendInterval = sendInterval;
  }

  /**
   * This is the getter method this will return the attribute value.
   * The user can specify a send-interval while entering maintenance mode.
   * The validity of this 'maintenance send-interval' is only during maintenance mode.
   * When the user leaves maintenance mode, the original send-interval is reinstated.
   * This internal variable is used to store the original send-interval.
   * Field introduced in 18.2.3.
   * @return sendIntervalPriorToMaintenanceMode
   */
  @VsoMethod
  public Integer getSendIntervalPriorToMaintenanceMode() {
    return sendIntervalPriorToMaintenanceMode;
  }

  /**
   * This is the setter method to the attribute.
   * The user can specify a send-interval while entering maintenance mode.
   * The validity of this 'maintenance send-interval' is only during maintenance mode.
   * When the user leaves maintenance mode, the original send-interval is reinstated.
   * This internal variable is used to store the original send-interval.
   * Field introduced in 18.2.3.
   * @param sendIntervalPriorToMaintenanceMode set the sendIntervalPriorToMaintenanceMode.
   */
  @VsoMethod
  public void setSendIntervalPriorToMaintenanceMode(Integer  sendIntervalPriorToMaintenanceMode) {
    this.sendIntervalPriorToMaintenanceMode = sendIntervalPriorToMaintenanceMode;
  }

  /**
   * This is the getter method this will return the attribute value.
   * Select avi site member belonging to this gslb.
   * @return sites
   */
  @VsoMethod
  public List<GslbSite> getSites() {
    return sites;
  }

  /**
   * This is the setter method. this will set the sites
   * Select avi site member belonging to this gslb.
   * @return sites
   */
  @VsoMethod
  public void setSites(List<GslbSite>  sites) {
    this.sites = sites;
  }

  /**
   * This is the setter method this will set the sites
   * Select avi site member belonging to this gslb.
   * @return sites
   */
  @VsoMethod
  public Gslb addSitesItem(GslbSite sitesItem) {
    if (this.sites == null) {
      this.sites = new ArrayList<GslbSite>();
    }
    this.sites.add(sitesItem);
    return this;
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
   * Third party site member belonging to this gslb.
   * Field introduced in 17.1.1.
   * @return thirdPartySites
   */
  @VsoMethod
  public List<GslbThirdPartySite> getThirdPartySites() {
    return thirdPartySites;
  }

  /**
   * This is the setter method. this will set the thirdPartySites
   * Third party site member belonging to this gslb.
   * Field introduced in 17.1.1.
   * @return thirdPartySites
   */
  @VsoMethod
  public void setThirdPartySites(List<GslbThirdPartySite>  thirdPartySites) {
    this.thirdPartySites = thirdPartySites;
  }

  /**
   * This is the setter method this will set the thirdPartySites
   * Third party site member belonging to this gslb.
   * Field introduced in 17.1.1.
   * @return thirdPartySites
   */
  @VsoMethod
  public Gslb addThirdPartySitesItem(GslbThirdPartySite thirdPartySitesItem) {
    if (this.thirdPartySites == null) {
      this.thirdPartySites = new ArrayList<GslbThirdPartySite>();
    }
    this.thirdPartySites.add(thirdPartySitesItem);
    return this;
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
   * Uuid of the gslb object.
   * @return uuid
   */
  @VsoMethod
  public String getUuid() {
    return uuid;
  }

  /**
   * This is the setter method to the attribute.
   * Uuid of the gslb object.
   * @param uuid set the uuid.
   */
  @VsoMethod
  public void setUuid(String  uuid) {
    this.uuid = uuid;
  }

  /**
   * This is the getter method this will return the attribute value.
   * The view-id is used in change-leader mode to differentiate partitioned groups while they have the same gslb namespace.
   * Each partitioned group will be able to operate independently by using the view-id.
   * Default value when not specified in API or module is interpreted by Avi Controller as 0.
   * @return viewId
   */
  @VsoMethod
  public Integer getViewId() {
    return viewId;
  }

  /**
   * This is the setter method to the attribute.
   * The view-id is used in change-leader mode to differentiate partitioned groups while they have the same gslb namespace.
   * Each partitioned group will be able to operate independently by using the view-id.
   * Default value when not specified in API or module is interpreted by Avi Controller as 0.
   * @param viewId set the viewId.
   */
  @VsoMethod
  public void setViewId(Integer  viewId) {
    this.viewId = viewId;
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
  Gslb objGslb = (Gslb) o;
  return   Objects.equals(this.uuid, objGslb.uuid)&&
  Objects.equals(this.tenantRef, objGslb.tenantRef)&&
  Objects.equals(this.maintenanceMode, objGslb.maintenanceMode)&&
  Objects.equals(this.viewId, objGslb.viewId)&&
  Objects.equals(this.description, objGslb.description)&&
  Objects.equals(this.thirdPartySites, objGslb.thirdPartySites)&&
  Objects.equals(this.sites, objGslb.sites)&&
  Objects.equals(this.clientIpAddrGroup, objGslb.clientIpAddrGroup)&&
  Objects.equals(this.errorResyncInterval, objGslb.errorResyncInterval)&&
  Objects.equals(this.sendInterval, objGslb.sendInterval)&&
  Objects.equals(this.dnsConfigs, objGslb.dnsConfigs)&&
  Objects.equals(this.isFederated, objGslb.isFederated)&&
  Objects.equals(this.replicationPolicy, objGslb.replicationPolicy)&&
  Objects.equals(this.leaderClusterUuid, objGslb.leaderClusterUuid)&&
  Objects.equals(this.asyncInterval, objGslb.asyncInterval)&&
  Objects.equals(this.clearOnMaxRetries, objGslb.clearOnMaxRetries)&&
  Objects.equals(this.sendIntervalPriorToMaintenanceMode, objGslb.sendIntervalPriorToMaintenanceMode)&&
  Objects.equals(this.name, objGslb.name);
}

@Override
public String toString() {
  StringBuilder sb = new StringBuilder();
  sb.append("class Gslb {\n");
      sb.append("    asyncInterval: ").append(toIndentedString(asyncInterval)).append("\n");
        sb.append("    clearOnMaxRetries: ").append(toIndentedString(clearOnMaxRetries)).append("\n");
        sb.append("    clientIpAddrGroup: ").append(toIndentedString(clientIpAddrGroup)).append("\n");
        sb.append("    description: ").append(toIndentedString(description)).append("\n");
        sb.append("    dnsConfigs: ").append(toIndentedString(dnsConfigs)).append("\n");
        sb.append("    errorResyncInterval: ").append(toIndentedString(errorResyncInterval)).append("\n");
        sb.append("    isFederated: ").append(toIndentedString(isFederated)).append("\n");
        sb.append("    leaderClusterUuid: ").append(toIndentedString(leaderClusterUuid)).append("\n");
        sb.append("    maintenanceMode: ").append(toIndentedString(maintenanceMode)).append("\n");
        sb.append("    name: ").append(toIndentedString(name)).append("\n");
        sb.append("    replicationPolicy: ").append(toIndentedString(replicationPolicy)).append("\n");
        sb.append("    sendInterval: ").append(toIndentedString(sendInterval)).append("\n");
        sb.append("    sendIntervalPriorToMaintenanceMode: ").append(toIndentedString(sendIntervalPriorToMaintenanceMode)).append("\n");
        sb.append("    sites: ").append(toIndentedString(sites)).append("\n");
        sb.append("    tenantRef: ").append(toIndentedString(tenantRef)).append("\n");
        sb.append("    thirdPartySites: ").append(toIndentedString(thirdPartySites)).append("\n");
            sb.append("    uuid: ").append(toIndentedString(uuid)).append("\n");
        sb.append("    viewId: ").append(toIndentedString(viewId)).append("\n");
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
