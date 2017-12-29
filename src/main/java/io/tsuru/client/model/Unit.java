package io.tsuru.client.model;

import com.google.gson.annotations.SerializedName;

public class Unit {
    @SerializedName("ID")
    private String id = null;

    @SerializedName("Name")
    private String name = null;

    @SerializedName("AppName")
    private String appName = null;

    @SerializedName("ProcessName")
    private String processName = null;

    @SerializedName("Type")
    private String type = null;

    @SerializedName("Status")
    private String status = null;

    @SerializedName("Address")
    private Address address = null;

    @SerializedName("HostAddr")
    private String hostAddr = null;

    @SerializedName("HostPort")
    private String hostPort = null;

    @SerializedName("IP")
    private String ip = null;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAppName() {
        return appName;
    }

    public void setAppName(String appName) {
        this.appName = appName;
    }

    public String getProcessName() {
        return processName;
    }

    public void setProcessName(String processName) {
        this.processName = processName;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public Address getAddress() {
        return address;
    }

    public void setAddress(Address address) {
        this.address = address;
    }

    public String getHostAddr() {
        return hostAddr;
    }

    public void setHostAddr(String hostAddr) {
        this.hostAddr = hostAddr;
    }

    public String getHostPort() {
        return hostPort;
    }

    public void setHostPort(String hostPort) {
        this.hostPort = hostPort;
    }

    public String getIp() {
        return ip;
    }

    public void setIp(String ip) {
        this.ip = ip;
    }
}
