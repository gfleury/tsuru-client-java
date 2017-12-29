package io.tsuru.client.main;

import io.tsuru.client.ApiException;
import io.tsuru.client.api.TsuruApi;
import io.tsuru.client.model.Application;

import java.util.List;

public class Main {
    public static void main(String [] args) {
        System.out.println("Testing Tsuru Java Client");

        TsuruApi apiInstance = new TsuruApi();
        apiInstance.getApiClient().setBasePath("http://tsuru.paas.fleuryg.myinstance.com");
        apiInstance.getApiClient().addDefaultHeader("Authorization", "bearer add98c609526779a0e6e3a22702941c7224e90bf");

        try {
            List<Application> result = apiInstance.appList();
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling ApplicationsApi#10AppsGet");
            e.printStackTrace();
        }
    }
}
