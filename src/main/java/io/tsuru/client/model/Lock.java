package io.tsuru.client.model;

import com.google.gson.annotations.SerializedName;

public class Lock {
    @SerializedName("Locked")
    private Boolean locked = false;

    @SerializedName("Reason")
    private String reason = null;

    @SerializedName("Owner")
    private String owner = null;

    @SerializedName("AcquireDate")
    private String acquireDate = null;

    public Boolean getLocked() {
        return locked;
    }

    public void setLocked(Boolean locked) {
        this.locked = locked;
    }

    public String getReason() {
        return reason;
    }

    public void setReason(String reason) {
        this.reason = reason;
    }

    public String getOwner() {
        return owner;
    }

    public void setOwner(String owner) {
        this.owner = owner;
    }

    public String getAcquireDate() {
        return acquireDate;
    }

    public void setAcquireDate(String acquireDate) {
        this.acquireDate = acquireDate;
    }


}
