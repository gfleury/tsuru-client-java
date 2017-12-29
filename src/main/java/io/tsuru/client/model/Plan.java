package io.tsuru.client.model;

import com.google.gson.annotations.SerializedName;

@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2017-12-29T00:11:08.586Z")
public class Plan {
    @SerializedName("name")
    private String name = null;

    @SerializedName("memory")
    private Integer memory = null;

    @SerializedName("swap")
    private Integer swap = null;

    @SerializedName("cpushare")
    private Integer cpushare = null;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getMemory() {
        return memory;
    }

    public void setMemory(Integer memory) {
        this.memory = memory;
    }

    public Integer getCpushare() {
        return cpushare;
    }

    public void setCpushare(Integer cpushare) {
        this.cpushare = cpushare;
    }

    public Integer getSwap() {
        return swap;
    }

    public void setSwap(Integer swap) {
        this.swap = swap;
    }

}
