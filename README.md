# tsuru-client-java

## Requirements

Building the API client library requires [Maven](https://maven.apache.org/) to be installed.

## Installation

To install the API client library to your local Maven repository, simply execute:

```shell
mvn install
```

To deploy it to a remote Maven repository instead, configure the settings of the repository and execute:

```shell
mvn deploy
```

Refer to the [official documentation](https://maven.apache.org/plugins/maven-deploy-plugin/usage.html) for more information.

### Maven users

Add this dependency to your project's POM:

```xml
<dependency>
    <groupId>io.tsuru</groupId>
    <artifactId>tsuru-client-java</artifactId>
    <version>1.0.0</version>
    <scope>compile</scope>
</dependency>
```

### Gradle users

Add this dependency to your project's build file:

```groovy
compile "io.tsuru:tsuru-client-java:1.0.0"
```

### Others

At first generate the JAR by executing:

    mvn package

Then manually install the following JARs:

* target/tsuru-client-java-1.0.0.jar
* target/lib/*.jar

## Getting Started

Please follow the [installation](#installation) instruction and execute the following Java code:

```java

import io.tsuru.client.*;
import io.tsuru.client.auth.*;
import io.tsuru.client.model.*;
import io.tsuru.client.api.TsuruApi;

import java.io.File;
import java.util.*;

public class TsuruApiExample {

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

```

## Documentation for API Endpoints

All URIs are relative to *https://localhost*

Class | Method | HTTP request | Description
------------ | ------------- | ------------- | -------------
*TsuruApi* | [**appBuild**](docs/TsuruApi.md#appBuild) | **POST** /1.5/apps/{name}/build | Build application
*TsuruApi* | [**appCreate**](docs/TsuruApi.md#appCreate) | **POST** /1.0/apps | Create application
*TsuruApi* | [**appDeploy**](docs/TsuruApi.md#appDeploy) | **POST** /1.0/apps/{name}/deploy | Deploy application
*TsuruApi* | [**appDeployRebuild**](docs/TsuruApi.md#appDeployRebuild) | **POST** /1.3/apps/{name}/deploy/rebuild | Rebuild deploy application deployment
*TsuruApi* | [**appDeployRollback**](docs/TsuruApi.md#appDeployRollback) | **POST** /1.0/apps/{name}/deploy/rollback | Rollback application deployment
*TsuruApi* | [**appDeployRollbackUpdate**](docs/TsuruApi.md#appDeployRollbackUpdate) | **PUT** /1.0/apps/{name}/deploy/rollback/update | Rollback application deployment
*TsuruApi* | [**appGrant**](docs/TsuruApi.md#appGrant) | **PUT** /1.0/apps/{name}/teams/{team} | Grant isPublic application
*TsuruApi* | [**appInfo**](docs/TsuruApi.md#appInfo) | **GET** /1.0/apps/{name} | Application information
*TsuruApi* | [**appList**](docs/TsuruApi.md#appList) | **GET** /1.0/apps | Get Applications
*TsuruApi* | [**appLog**](docs/TsuruApi.md#appLog) | **GET** /1.0/apps/{name}/log | Get application logs.
*TsuruApi* | [**appRemove**](docs/TsuruApi.md#appRemove) | **DELETE** /1.0/apps/{name} | Delete application
*TsuruApi* | [**appRestart**](docs/TsuruApi.md#appRestart) | **POST** /1.0/apps/{name}/restart | Restart application
*TsuruApi* | [**appRevoke**](docs/TsuruApi.md#appRevoke) | **DELETE** /1.0/apps/{name}/teams/{team} | Revoke isPublic on application
*TsuruApi* | [**appRun**](docs/TsuruApi.md#appRun) | **POST** /1.0/apps/{name}/run | Run command inside app container
*TsuruApi* | [**appStart**](docs/TsuruApi.md#appStart) | **POST** /1.0/apps/{name}/start | Start application
*TsuruApi* | [**appStop**](docs/TsuruApi.md#appStop) | **POST** /1.0/apps/{name}/stop | Stop application
*TsuruApi* | [**appSwap**](docs/TsuruApi.md#appSwap) | **POST** /1.0/swap | Swap applications
*TsuruApi* | [**appUpdate**](docs/TsuruApi.md#appUpdate) | **PUT** /1.0/apps/{name} | Update application
*TsuruApi* | [**envSet**](docs/TsuruApi.md#envSet) | **POST** /apps/{name}/env | Set env on application
*TsuruApi* | [**envUnset**](docs/TsuruApi.md#envUnset) | **DELETE** /apps/{name}/env | Set env on application
*TsuruApi* | [**getApiKey**](docs/TsuruApi.md#getApiKey) | **GET** /1.0/users/api-key | Get ApiKey for user.
*TsuruApi* | [**regenerateApiKey**](docs/TsuruApi.md#regenerateApiKey) | **POST** /1.0/users/api-key | Regenerate ApiKey for user.
*TsuruApi* | [**userList**](docs/TsuruApi.md#userList) | **GET** /1.0/users | Get Users.


## Documentation for Models

 - [Application](docs/Application.md)
 - [Error](docs/Error.md)
 - [InlineResponse200](docs/InlineResponse200.md)
 - [InlineResponseDefault](docs/InlineResponseDefault.md)
 - [User](docs/User.md)


## Documentation for Authorization

All endpoints do not require authorization.
Authentication schemes defined for the API:

## Recommendation

It's recommended to create an instance of `ApiClient` per thread in a multithreaded environment to avoid any potential issues.

## Author

http://github.com/gfleury
