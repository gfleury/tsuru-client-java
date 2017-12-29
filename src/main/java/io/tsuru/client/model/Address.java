package io.tsuru.client.model;

import com.google.gson.annotations.SerializedName;

public class Address {
    @SerializedName("Fragment")
    private String fragment = null;

    @SerializedName("RawQuery")
    private String rawQuery = null;

    @SerializedName("ForceQuery")
    private Boolean forceQuery = false;

    @SerializedName("RawPath")
    private String rawPath = null;

    @SerializedName("Path")
    private String path = null;

    @SerializedName("Host")
    private String host = null;

    @SerializedName("User")
    private String user = null;

    @SerializedName("Opaque")
    private String opaque = null;

    @SerializedName("Scheme")
    private String scheme = null;

    public String getFragment() {
        return fragment;
    }

    public void setFragment(String fragment) {
        this.fragment = fragment;
    }

    public String getRawQuery() {
        return rawQuery;
    }

    public void setRawQuery(String rawQuery) {
        this.rawQuery = rawQuery;
    }

    public Boolean getForceQuery() {
        return forceQuery;
    }

    public void setForceQuery(Boolean forceQuery) {
        this.forceQuery = forceQuery;
    }

    public String getRawPath() {
        return rawPath;
    }

    public void setRawPath(String rawPath) {
        this.rawPath = rawPath;
    }

    public String getPath() {
        return path;
    }

    public void setPath(String path) {
        this.path = path;
    }

    public String getHost() {
        return host;
    }

    public void setHost(String host) {
        this.host = host;
    }

    public String getUser() {
        return user;
    }

    public void setUser(String user) {
        this.user = user;
    }

    public String getOpaque() {
        return opaque;
    }

    public void setOpaque(String opaque) {
        this.opaque = opaque;
    }

    public String getScheme() {
        return scheme;
    }

    public void setScheme(String scheme) {
        this.scheme = scheme;
    }
}
