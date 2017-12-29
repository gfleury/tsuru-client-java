package io.tsuru.client.main;

import io.tsuru.client.ApiException;
import io.tsuru.client.api.TsuruApi;
import io.tsuru.client.model.Application;
import io.tsuru.client.model.LoginToken;

import java.util.List;

public class Main {
    public static void main(String [] args) throws ApiException {
        System.out.println("Testing Tsuru Java Client");

        TsuruApi apiInstance = new TsuruApi();
        apiInstance.getApiClient().setBasePath("http://tsuru.paas.example.com");
        LoginToken token = apiInstance.login("user@example.com", "password");

        try {
            List<Application> result = apiInstance.appList();
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling appList");
            e.printStackTrace();
        }
    }
}
