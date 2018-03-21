# TsuruApi

All URIs are relative to *https://localhost*

Method | HTTP request | Description
------------- | ------------- | -------------
[**appBuild**](TsuruApi.md#appBuild) | **POST** /1.5/apps/{name}/build | Build application
[**appCreate**](TsuruApi.md#appCreate) | **POST** /1.0/apps | Create application
[**appDeploy**](TsuruApi.md#appDeploy) | **POST** /1.0/apps/{name}/deploy | Deploy application
[**appDeployRebuild**](TsuruApi.md#appDeployRebuild) | **POST** /1.3/apps/{name}/deploy/rebuild | Rebuild deploy application deployment
[**appDeployRollback**](TsuruApi.md#appDeployRollback) | **POST** /1.0/apps/{name}/deploy/rollback | Rollback application deployment
[**appDeployRollbackUpdate**](TsuruApi.md#appDeployRollbackUpdate) | **PUT** /1.0/apps/{name}/deploy/rollback/update | Rollback application deployment
[**appGrant**](TsuruApi.md#appGrant) | **PUT** /1.0/apps/{name}/teams/{team} | Grant isPublic application
[**appInfo**](TsuruApi.md#appInfo) | **GET** /1.0/apps/{name} | Application information
[**appList**](TsuruApi.md#appList) | **GET** /1.0/apps | Get Applications
[**appLog**](TsuruApi.md#appLog) | **GET** /1.0/apps/{name}/log | Get application logs.
[**appRemove**](TsuruApi.md#appRemove) | **DELETE** /1.0/apps/{name} | Delete application
[**appRestart**](TsuruApi.md#appRestart) | **POST** /1.0/apps/{name}/restart | Restart application
[**appRevoke**](TsuruApi.md#appRevoke) | **DELETE** /1.0/apps/{name}/teams/{team} | Revoke isPublic on application
[**appRun**](TsuruApi.md#appRun) | **POST** /1.0/apps/{name}/run | Run command inside app container
[**appStart**](TsuruApi.md#appStart) | **POST** /1.0/apps/{name}/start | Start application
[**appStop**](TsuruApi.md#appStop) | **POST** /1.0/apps/{name}/stop | Stop application
[**appSwap**](TsuruApi.md#appSwap) | **POST** /1.0/swap | Swap applications
[**appUpdate**](TsuruApi.md#appUpdate) | **PUT** /1.0/apps/{name} | Update application
[**envSet**](TsuruApi.md#envSet) | **POST** /apps/{name}/env | Set env on application
[**envUnset**](TsuruApi.md#envUnset) | **DELETE** /apps/{name}/env | Set env on application
[**getApiKey**](TsuruApi.md#getApiKey) | **GET** /1.0/users/api-key | Get ApiKey for user.
[**regenerateApiKey**](TsuruApi.md#regenerateApiKey) | **POST** /1.0/users/api-key | Regenerate ApiKey for user.
[**userList**](TsuruApi.md#userList) | **GET** /1.0/users | Get Users.


<a name="appBuild"></a>
# **appBuild**
> String appBuild(name, tag, file)

Build application

The backend endpoint the backend. 

### Example
```java
// Import classes:
//import io.tsuru.client.ApiException;
//import io.swagger.client.api.TsuruApi;


TsuruApi apiInstance = new TsuruApi();
String name = "name_example"; // String | Application name.
String tag = "tag_example"; // String | 
File file = new File("/path/to/file.txt"); // File | 
try {
    String result = apiInstance.appBuild(name, tag, file);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling TsuruApi#appBuild");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **name** | **String**| Application name. |
 **tag** | **String**|  |
 **file** | **File**|  |

### Return type

**String**

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: multipart/form-data
 - **Accept**: Not defined

<a name="appCreate"></a>
# **appCreate**
> String appCreate(name, platform, plan, teamOwner, pool, description, tag, router, routeropts)

Create application

The backend endpoint the backend. 

### Example
```java
// Import classes:
//import io.tsuru.client.ApiException;
//import io.swagger.client.api.TsuruApi;


TsuruApi apiInstance = new TsuruApi();
String name = "name_example"; // String | 
String platform = "platform_example"; // String | 
String plan = "plan_example"; // String | 
String teamOwner = "teamOwner_example"; // String | 
String pool = "pool_example"; // String | 
String description = "description_example"; // String | 
List<String> tag = Arrays.asList("tag_example"); // List<String> | 
String router = "router_example"; // String | 
List<String> routeropts = Arrays.asList("routeropts_example"); // List<String> | 
try {
    String result = apiInstance.appCreate(name, platform, plan, teamOwner, pool, description, tag, router, routeropts);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling TsuruApi#appCreate");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **name** | **String**|  | [optional]
 **platform** | **String**|  | [optional]
 **plan** | **String**|  | [optional]
 **teamOwner** | **String**|  | [optional]
 **pool** | **String**|  | [optional]
 **description** | **String**|  | [optional]
 **tag** | [**List&lt;String&gt;**](String.md)|  | [optional]
 **router** | **String**|  | [optional]
 **routeropts** | [**List&lt;String&gt;**](String.md)|  | [optional]

### Return type

**String**

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/x-www-form-urlencoded
 - **Accept**: Not defined

<a name="appDeploy"></a>
# **appDeploy**
> String appDeploy(name, file, image)

Deploy application

The backend endpoint the backend. 

### Example
```java
// Import classes:
//import io.tsuru.client.ApiException;
//import io.swagger.client.api.TsuruApi;


TsuruApi apiInstance = new TsuruApi();
String name = "name_example"; // String | Application name.
File file = new File("/path/to/file.txt"); // File | 
String image = "image_example"; // String | 
try {
    String result = apiInstance.appDeploy(name, file, image);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling TsuruApi#appDeploy");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **name** | **String**| Application name. |
 **file** | **File**|  |
 **image** | **String**|  |

### Return type

**String**

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: multipart/form-data
 - **Accept**: Not defined

<a name="appDeployRebuild"></a>
# **appDeployRebuild**
> String appDeployRebuild(name, origin)

Rebuild deploy application deployment

The backend endpoint the backend. 

### Example
```java
// Import classes:
//import io.tsuru.client.ApiException;
//import io.swagger.client.api.TsuruApi;


TsuruApi apiInstance = new TsuruApi();
String name = "name_example"; // String | Application name.
String origin = "origin_example"; // String | 
try {
    String result = apiInstance.appDeployRebuild(name, origin);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling TsuruApi#appDeployRebuild");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **name** | **String**| Application name. |
 **origin** | **String**|  | [optional]

### Return type

**String**

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/x-www-form-urlencoded
 - **Accept**: Not defined

<a name="appDeployRollback"></a>
# **appDeployRollback**
> String appDeployRollback(name, origin, image)

Rollback application deployment

The backend endpoint the backend. 

### Example
```java
// Import classes:
//import io.tsuru.client.ApiException;
//import io.swagger.client.api.TsuruApi;


TsuruApi apiInstance = new TsuruApi();
String name = "name_example"; // String | Application name.
String origin = "origin_example"; // String | 
String image = "image_example"; // String | 
try {
    String result = apiInstance.appDeployRollback(name, origin, image);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling TsuruApi#appDeployRollback");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **name** | **String**| Application name. |
 **origin** | **String**|  | [optional]
 **image** | **String**|  | [optional]

### Return type

**String**

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/x-www-form-urlencoded
 - **Accept**: Not defined

<a name="appDeployRollbackUpdate"></a>
# **appDeployRollbackUpdate**
> String appDeployRollbackUpdate(name, origin, reason, disable, image)

Rollback application deployment

The backend endpoint the backend. 

### Example
```java
// Import classes:
//import io.tsuru.client.ApiException;
//import io.swagger.client.api.TsuruApi;


TsuruApi apiInstance = new TsuruApi();
String name = "name_example"; // String | Application name.
String origin = "origin_example"; // String | 
String reason = "reason_example"; // String | 
Boolean disable = true; // Boolean | 
String image = "image_example"; // String | 
try {
    String result = apiInstance.appDeployRollbackUpdate(name, origin, reason, disable, image);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling TsuruApi#appDeployRollbackUpdate");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **name** | **String**| Application name. |
 **origin** | **String**|  | [optional]
 **reason** | **String**|  | [optional]
 **disable** | **Boolean**|  | [optional]
 **image** | **String**|  | [optional]

### Return type

**String**

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/x-www-form-urlencoded
 - **Accept**: Not defined

<a name="appGrant"></a>
# **appGrant**
> String appGrant(name, team)

Grant isPublic application

The backend endpoint the backend. 

### Example
```java
// Import classes:
//import io.tsuru.client.ApiException;
//import io.swagger.client.api.TsuruApi;


TsuruApi apiInstance = new TsuruApi();
String name = "name_example"; // String | Application name.
String team = "team_example"; // String | Team name.
try {
    String result = apiInstance.appGrant(name, team);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling TsuruApi#appGrant");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **name** | **String**| Application name. |
 **team** | **String**| Team name. |

### Return type

**String**

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

<a name="appInfo"></a>
# **appInfo**
> Application appInfo(name)

Application information

The backend endpoint returns the address that the application is published. 

### Example
```java
// Import classes:
//import io.tsuru.client.ApiException;
//import io.swagger.client.api.TsuruApi;


TsuruApi apiInstance = new TsuruApi();
String name = "name_example"; // String | Application name.
try {
    Application result = apiInstance.appInfo(name);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling TsuruApi#appInfo");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **name** | **String**| Application name. |

### Return type

[**Application**](Application.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

<a name="appList"></a>
# **appList**
> List&lt;Application&gt; appList()

Get Applications

The backend endpoint returns the address that the application is published. 

### Example
```java
// Import classes:
//import io.tsuru.client.ApiException;
//import io.swagger.client.api.TsuruApi;


TsuruApi apiInstance = new TsuruApi();
try {
    List<Application> result = apiInstance.appList();
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling TsuruApi#appList");
    e.printStackTrace();
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

[**List&lt;Application&gt;**](Application.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

<a name="appLog"></a>
# **appLog**
> String appLog(name, lines)

Get application logs.

The backend endpoint the backend. 

### Example
```java
// Import classes:
//import io.tsuru.client.ApiException;
//import io.swagger.client.api.TsuruApi;


TsuruApi apiInstance = new TsuruApi();
String name = "name_example"; // String | 
Integer lines = 56; // Integer | 
try {
    String result = apiInstance.appLog(name, lines);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling TsuruApi#appLog");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **name** | **String**|  |
 **lines** | **Integer**|  |

### Return type

**String**

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

<a name="appRemove"></a>
# **appRemove**
> String appRemove(name)

Delete application

The backend endpoint deletes the backend. 

### Example
```java
// Import classes:
//import io.tsuru.client.ApiException;
//import io.swagger.client.api.TsuruApi;


TsuruApi apiInstance = new TsuruApi();
String name = "name_example"; // String | Application name.
try {
    String result = apiInstance.appRemove(name);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling TsuruApi#appRemove");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **name** | **String**| Application name. |

### Return type

**String**

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

<a name="appRestart"></a>
# **appRestart**
> String appRestart(name, process)

Restart application

The backend endpoint the backend. 

### Example
```java
// Import classes:
//import io.tsuru.client.ApiException;
//import io.swagger.client.api.TsuruApi;


TsuruApi apiInstance = new TsuruApi();
String name = "name_example"; // String | Application name.
String process = "process_example"; // String | 
try {
    String result = apiInstance.appRestart(name, process);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling TsuruApi#appRestart");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **name** | **String**| Application name. |
 **process** | **String**|  | [optional]

### Return type

**String**

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/x-www-form-urlencoded
 - **Accept**: Not defined

<a name="appRevoke"></a>
# **appRevoke**
> String appRevoke(name, team)

Revoke isPublic on application

The backend endpoint the backend. 

### Example
```java
// Import classes:
//import io.tsuru.client.ApiException;
//import io.swagger.client.api.TsuruApi;


TsuruApi apiInstance = new TsuruApi();
String name = "name_example"; // String | Application name.
String team = "team_example"; // String | Team name.
try {
    String result = apiInstance.appRevoke(name, team);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling TsuruApi#appRevoke");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **name** | **String**| Application name. |
 **team** | **String**| Team name. |

### Return type

**String**

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

<a name="appRun"></a>
# **appRun**
> String appRun(name, command, once, isolated)

Run command inside app container

The backend endpoint the backend. 

### Example
```java
// Import classes:
//import io.tsuru.client.ApiException;
//import io.swagger.client.api.TsuruApi;


TsuruApi apiInstance = new TsuruApi();
String name = "name_example"; // String | Application name.
String command = "command_example"; // String | 
Boolean once = true; // Boolean | 
String isolated = "isolated_example"; // String | 
try {
    String result = apiInstance.appRun(name, command, once, isolated);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling TsuruApi#appRun");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **name** | **String**| Application name. |
 **command** | **String**|  |
 **once** | **Boolean**|  |
 **isolated** | **String**|  |

### Return type

**String**

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/x-www-form-urlencoded
 - **Accept**: Not defined

<a name="appStart"></a>
# **appStart**
> String appStart(name, process)

Start application

The backend endpoint the backend. 

### Example
```java
// Import classes:
//import io.tsuru.client.ApiException;
//import io.swagger.client.api.TsuruApi;


TsuruApi apiInstance = new TsuruApi();
String name = "name_example"; // String | Application name.
String process = "process_example"; // String | 
try {
    String result = apiInstance.appStart(name, process);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling TsuruApi#appStart");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **name** | **String**| Application name. |
 **process** | **String**|  | [optional]

### Return type

**String**

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/x-www-form-urlencoded
 - **Accept**: Not defined

<a name="appStop"></a>
# **appStop**
> String appStop(name, process)

Stop application

The backend endpoint the backend. 

### Example
```java
// Import classes:
//import io.tsuru.client.ApiException;
//import io.swagger.client.api.TsuruApi;


TsuruApi apiInstance = new TsuruApi();
String name = "name_example"; // String | Application name.
String process = "process_example"; // String | 
try {
    String result = apiInstance.appStop(name, process);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling TsuruApi#appStop");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **name** | **String**| Application name. |
 **process** | **String**|  | [optional]

### Return type

**String**

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/x-www-form-urlencoded
 - **Accept**: Not defined

<a name="appSwap"></a>
# **appSwap**
> String appSwap(app1, app2, force, cnameOnly)

Swap applications

The backend endpoint the backend. 

### Example
```java
// Import classes:
//import io.tsuru.client.ApiException;
//import io.swagger.client.api.TsuruApi;


TsuruApi apiInstance = new TsuruApi();
String app1 = "app1_example"; // String | 
String app2 = "app2_example"; // String | 
Boolean force = true; // Boolean | 
Boolean cnameOnly = true; // Boolean | 
try {
    String result = apiInstance.appSwap(app1, app2, force, cnameOnly);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling TsuruApi#appSwap");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **app1** | **String**|  |
 **app2** | **String**|  |
 **force** | **Boolean**|  |
 **cnameOnly** | **Boolean**|  |

### Return type

**String**

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/x-www-form-urlencoded
 - **Accept**: Not defined

<a name="appUpdate"></a>
# **appUpdate**
> String appUpdate(name, platform, plan, teamOwner, pool, description, tag)

Update application

The backend endpoint the backend. 

### Example
```java
// Import classes:
//import io.tsuru.client.ApiException;
//import io.swagger.client.api.TsuruApi;


TsuruApi apiInstance = new TsuruApi();
String name = "name_example"; // String | Application name.
String platform = "platform_example"; // String | 
String plan = "plan_example"; // String | 
String teamOwner = "teamOwner_example"; // String | 
String pool = "pool_example"; // String | 
String description = "description_example"; // String | 
List<String> tag = Arrays.asList("tag_example"); // List<String> | 
try {
    String result = apiInstance.appUpdate(name, platform, plan, teamOwner, pool, description, tag);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling TsuruApi#appUpdate");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **name** | **String**| Application name. |
 **platform** | **String**|  | [optional]
 **plan** | **String**|  | [optional]
 **teamOwner** | **String**|  | [optional]
 **pool** | **String**|  | [optional]
 **description** | **String**|  | [optional]
 **tag** | [**List&lt;String&gt;**](String.md)|  | [optional]

### Return type

**String**

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/x-www-form-urlencoded
 - **Accept**: Not defined

<a name="envSet"></a>
# **envSet**
> String envSet(name, envs, noRestart, _private)

Set env on application

The backend endpoint the backend. 

### Example
```java
// Import classes:
//import io.tsuru.client.ApiException;
//import io.swagger.client.api.TsuruApi;


TsuruApi apiInstance = new TsuruApi();
String name = "name_example"; // String | 
String envs = "envs_example"; // String | 
Boolean noRestart = true; // Boolean | 
Boolean _private = true; // Boolean | 
try {
    String result = apiInstance.envSet(name, envs, noRestart, _private);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling TsuruApi#envSet");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **name** | **String**|  |
 **envs** | **String**|  |
 **noRestart** | **Boolean**|  |
 **_private** | **Boolean**|  |

### Return type

**String**

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/x-www-form-urlencoded
 - **Accept**: Not defined

<a name="envUnset"></a>
# **envUnset**
> String envUnset(name, env, noRestart)

Set env on application

The backend endpoint the backend. 

### Example
```java
// Import classes:
//import io.tsuru.client.ApiException;
//import io.swagger.client.api.TsuruApi;


TsuruApi apiInstance = new TsuruApi();
String name = "name_example"; // String | 
List<String> env = Arrays.asList("env_example"); // List<String> | 
Boolean noRestart = true; // Boolean | 
try {
    String result = apiInstance.envUnset(name, env, noRestart);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling TsuruApi#envUnset");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **name** | **String**|  |
 **env** | [**List&lt;String&gt;**](String.md)|  |
 **noRestart** | **Boolean**|  |

### Return type

**String**

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

<a name="getApiKey"></a>
# **getApiKey**
> InlineResponse200 getApiKey(user)

Get ApiKey for user.

The backend endpoint the backend. 

### Example
```java
// Import classes:
//import io.tsuru.client.ApiException;
//import io.swagger.client.api.TsuruApi;


TsuruApi apiInstance = new TsuruApi();
String user = "user_example"; // String | 
try {
    InlineResponse200 result = apiInstance.getApiKey(user);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling TsuruApi#getApiKey");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **user** | **String**|  | [optional]

### Return type

[**InlineResponse200**](InlineResponse200.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

<a name="regenerateApiKey"></a>
# **regenerateApiKey**
> InlineResponse200 regenerateApiKey(user)

Regenerate ApiKey for user.

The backend endpoint the backend. 

### Example
```java
// Import classes:
//import io.tsuru.client.ApiException;
//import io.swagger.client.api.TsuruApi;


TsuruApi apiInstance = new TsuruApi();
String user = "user_example"; // String | 
try {
    InlineResponse200 result = apiInstance.regenerateApiKey(user);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling TsuruApi#regenerateApiKey");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **user** | **String**|  | [optional]

### Return type

[**InlineResponse200**](InlineResponse200.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

<a name="userList"></a>
# **userList**
> List&lt;User&gt; userList(userEmail, role, context)

Get Users.

The backend endpoint the backend. 

### Example
```java
// Import classes:
//import io.tsuru.client.ApiException;
//import io.swagger.client.api.TsuruApi;


TsuruApi apiInstance = new TsuruApi();
String userEmail = "userEmail_example"; // String | 
String role = "role_example"; // String | 
String context = "context_example"; // String | 
try {
    List<User> result = apiInstance.userList(userEmail, role, context);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling TsuruApi#userList");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **userEmail** | **String**|  | [optional]
 **role** | **String**|  | [optional]
 **context** | **String**|  | [optional]

### Return type

[**List&lt;User&gt;**](User.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

