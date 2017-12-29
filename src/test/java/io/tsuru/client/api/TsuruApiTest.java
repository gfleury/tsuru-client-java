/*
 * Tsuru API
 * Tsuru API integration to other external clients (only partial, not all endpoints)
 *
 * OpenAPI spec version: 1.4.0
 * 
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 */


package io.tsuru.client.api;

import io.tsuru.client.ApiException;
import io.tsuru.client.model.ApiKey;
import io.tsuru.client.model.Application;
import java.io.File;

import io.tsuru.client.model.User;
import org.junit.Test;
import org.junit.Ignore;

import java.util.List;

/**
 * API tests for TsuruApi
 */
@Ignore
public class TsuruApiTest {

    private final TsuruApi api = new TsuruApi();

    
    /**
     * Build application
     *
     * The backend endpoint the backend. 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void appBuildTest() throws ApiException {
        String name = null;
        String tag = null;
        File file = null;
        String response = api.appBuild(name, tag, file);

        // TODO: test validations
    }
    
    /**
     * Create application
     *
     * The backend endpoint the backend. 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void appCreateTest() throws ApiException {
        String name = null;
        String platform = null;
        String plan = null;
        String teamOwner = null;
        String pool = null;
        String description = null;
        List<String> tag = null;
        String router = null;
        List<String> routeropts = null;
        String response = api.appCreate(name, platform, plan, teamOwner, pool, description, tag, router, routeropts);

        // TODO: test validations
    }
    
    /**
     * Deploy application
     *
     * The backend endpoint the backend. 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void appDeployTest() throws ApiException {
        String name = null;
        File file = null;
        String image = null;
        String response = api.appDeploy(name, file, image);

        // TODO: test validations
    }
    
    /**
     * Rebuild deploy application deployment
     *
     * The backend endpoint the backend. 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void appDeployRebuildTest() throws ApiException {
        String name = null;
        String origin = null;
        String response = api.appDeployRebuild(name, origin);

        // TODO: test validations
    }
    
    /**
     * Rollback application deployment
     *
     * The backend endpoint the backend. 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void appDeployRollbackTest() throws ApiException {
        String name = null;
        String origin = null;
        String image = null;
        String response = api.appDeployRollback(name, origin, image);

        // TODO: test validations
    }
    
    /**
     * Rollback application deployment
     *
     * The backend endpoint the backend. 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void appDeployRollbackUpdateTest() throws ApiException {
        String name = null;
        String origin = null;
        String reason = null;
        Boolean disable = null;
        String image = null;
        String response = api.appDeployRollbackUpdate(name, origin, reason, disable, image);

        // TODO: test validations
    }
    
    /**
     * Grant permission application
     *
     * The backend endpoint the backend. 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void appGrantTest() throws ApiException {
        String name = null;
        String team = null;
        String response = api.appGrant(name, team);

        // TODO: test validations
    }
    
    /**
     * Application information
     *
     * The backend endpoint returns the address that the application is published. 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void appInfoTest() throws ApiException {
        String name = null;
        Application response = api.appInfo(name);

        // TODO: test validations
    }
    
    /**
     * Get Applications
     *
     * The backend endpoint returns the address that the application is published. 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void appListTest() throws ApiException {
        List<Application> response = api.appList();

        // TODO: test validations
    }
    
    /**
     * Get application logs.
     *
     * The backend endpoint the backend. 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void appLogTest() throws ApiException {
        String name = null;
        Integer lines = null;
        String response = api.appLog(name, lines);

        // TODO: test validations
    }
    
    /**
     * Delete application
     *
     * The backend endpoint deletes the backend. 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void appRemoveTest() throws ApiException {
        String name = null;
        String response = api.appRemove(name);

        // TODO: test validations
    }
    
    /**
     * Restart application
     *
     * The backend endpoint the backend. 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void appRestartTest() throws ApiException {
        String name = null;
        String process = null;
        String response = api.appRestart(name, process);

        // TODO: test validations
    }
    
    /**
     * Revoke permission on application
     *
     * The backend endpoint the backend. 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void appRevokeTest() throws ApiException {
        String name = null;
        String team = null;
        String response = api.appRevoke(name, team);

        // TODO: test validations
    }
    
    /**
     * Run command inside app container
     *
     * The backend endpoint the backend. 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void appRunTest() throws ApiException {
        String name = null;
        String command = null;
        Boolean once = null;
        String isolated = null;
        String response = api.appRun(name, command, once, isolated);

        // TODO: test validations
    }
    
    /**
     * Start application
     *
     * The backend endpoint the backend. 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void appStartTest() throws ApiException {
        String name = null;
        String process = null;
        String response = api.appStart(name, process);

        // TODO: test validations
    }
    
    /**
     * Stop application
     *
     * The backend endpoint the backend. 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void appStopTest() throws ApiException {
        String name = null;
        String process = null;
        String response = api.appStop(name, process);

        // TODO: test validations
    }
    
    /**
     * Swap applications
     *
     * The backend endpoint the backend. 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void appSwapTest() throws ApiException {
        String app1 = null;
        String app2 = null;
        Boolean force = null;
        Boolean cnameOnly = null;
        String response = api.appSwap(app1, app2, force, cnameOnly);

        // TODO: test validations
    }
    
    /**
     * Update application
     *
     * The backend endpoint the backend. 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void appUpdateTest() throws ApiException {
        String name = null;
        String platform = null;
        String plan = null;
        String teamOwner = null;
        String pool = null;
        String description = null;
        List<String> tag = null;
        String response = api.appUpdate(name, platform, plan, teamOwner, pool, description, tag);

        // TODO: test validations
    }
    
    /**
     * Set env on application
     *
     * The backend endpoint the backend. 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void envSetTest() throws ApiException {
        String name = null;
        String envs = null;
        Boolean noRestart = null;
        Boolean _private = null;
        String response = api.envSet(name, envs, noRestart, _private);

        // TODO: test validations
    }
    
    /**
     * Set env on application
     *
     * The backend endpoint the backend. 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void envUnsetTest() throws ApiException {
        String name = null;
        List<String> env = null;
        Boolean noRestart = null;
        String response = api.envUnset(name, env, noRestart);

        // TODO: test validations
    }
    
    /**
     * Get ApiKey for user.
     *
     * The backend endpoint the backend. 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getApiKeyTest() throws ApiException {
        String user = null;
        ApiKey response = api.getApiKey(user);

        // TODO: test validations
    }
    
    /**
     * Regenerate ApiKey for user.
     *
     * The backend endpoint the backend. 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void regenerateApiKeyTest() throws ApiException {
        String user = null;
        ApiKey response = api.regenerateApiKey(user);

        // TODO: test validations
    }
    
    /**
     * Get Users.
     *
     * The backend endpoint the backend. 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void userListTest() throws ApiException {
        String userEmail = null;
        String role = null;
        String context = null;
        List<User> response = api.userList(userEmail, role, context);

        // TODO: test validations
    }
    
}
