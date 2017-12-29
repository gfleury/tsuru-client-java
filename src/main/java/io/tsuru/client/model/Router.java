package io.tsuru.client.model;

import com.google.gson.annotations.SerializedName;

import java.util.HashMap;

public class Router {

    @SerializedName("name")
    private String name = null;

    @SerializedName("opts")
    private HashMap<String, String> opts = null;

    @SerializedName("address")
    private String address = null;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public HashMap<String, String> getOpts() {
        return opts;
    }

    public void setOpts(HashMap<String, String> opts) {
        this.opts = opts;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

}
