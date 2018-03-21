package io.tsuru.client.main;

import io.tsuru.client.ApiException;
import io.tsuru.client.api.TsuruApi;
import io.tsuru.client.model.Application;
import io.tsuru.client.model.EnvVars;
import io.tsuru.client.model.LoginToken;

import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;

public class Main {
    public static void main(String [] args) throws ApiException {
        System.out.println("Testing Tsuru Java Client");

        TsuruApi apiInstance = new TsuruApi();
        apiInstance.getApiClient().setBasePath("http://localhost:8080");
        LoginToken token = apiInstance.login("gfleury@gmail.com", "password");

        try {
            List<EnvVars> routerOpts = new LinkedList<>();
            routerOpts.add(new EnvVars("xurupita", "salve"));
            //String result = apiInstance.appCreate("pr-1-exampe", "python", null, null, null,
            //        null, null, null, routerOpts);
            String result = apiInstance.envSet("exampleeee", routerOpts, true, false);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling appList");
            e.printStackTrace();
        }
    }
}
