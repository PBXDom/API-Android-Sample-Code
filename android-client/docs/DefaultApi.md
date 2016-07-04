# DefaultApi

All URIs are relative to *https://api.pbxdom.com*

Method | HTTP request | Description
------------- | ------------- | -------------
[**callsGet**](DefaultApi.md#callsGet) | **GET** /Calls | 
[**featuresChartsGet**](DefaultApi.md#featuresChartsGet) | **GET** /Features/charts | 
[**featuresReportsGet**](DefaultApi.md#featuresReportsGet) | **GET** /Features/reports | 
[**featuresWidgetGet**](DefaultApi.md#featuresWidgetGet) | **GET** /Features/widget | 


<a name="callsGet"></a>
# **callsGet**
> List&lt;InlineResponse200&gt; callsGet(rptType, rptId, start, limit, sortBy, sortType, fromDate, toDate, duration, phone, phone1, co, ext, pbxId, callSource, callType, direction, callerName, did, dnis, acc, ring, cost, group)



Gets &#x60;Calls&#x60; info. 

### Example
```java
// Import classes:
//import io.swagger.client.api.DefaultApi;

DefaultApi apiInstance = new DefaultApi();
Double rptType = 3.4D; // Double | Report type. (0 report, 1 widget, 2 chart).
Double rptId = 3.4D; // Double | Report id.
BigDecimal start = new BigDecimal(); // BigDecimal | Start offset.
BigDecimal limit = new BigDecimal(); // BigDecimal | Number of results to return. Max 10K.
String sortBy = "sortBy_example"; // String | Sort column.
String sortType = "sortType_example"; // String | Sort mode asc/desc.
String fromDate = "fromDate_example"; // String | Start date time.
String toDate = "toDate_example"; // String | End date time.
BigDecimal duration = new BigDecimal(); // BigDecimal | Duration range.
String phone = "phone_example"; // String | List of caller phone.
String phone1 = "phone1_example"; // String | List of dialled phones.
String co = "co_example"; // String | List of trunk/co.
String ext = "ext_example"; // String | list of extensions.
BigDecimal pbxId = new BigDecimal(); // BigDecimal | list of PBX Ids.
BigDecimal callSource = new BigDecimal(); // BigDecimal | list of callsource.
BigDecimal callType = new BigDecimal(); // BigDecimal | list of call type signatures.(5 Unanswered Calls, 7 Transfered Calls, 8 Forwarded Calls)
BigDecimal direction = new BigDecimal(); // BigDecimal | list of direction.(0 incoming, 1 outgoing, 2 internal)
String callerName = "callerName_example"; // String | list of caller name.
String did = "did_example"; // String | list of did.
String dnis = "dnis_example"; // String | list of dnis.
String acc = "acc_example"; // String | list of account code.
BigDecimal ring = new BigDecimal(); // BigDecimal | Ring range.Seconds unit.
BigDecimal cost = new BigDecimal(); // BigDecimal | Cost range.
BigDecimal group = new BigDecimal(); // BigDecimal | Department/Group id.
try {
    List<InlineResponse200> result = apiInstance.callsGet(rptType, rptId, start, limit, sortBy, sortType, fromDate, toDate, duration, phone, phone1, co, ext, pbxId, callSource, callType, direction, callerName, did, dnis, acc, ring, cost, group);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling DefaultApi#callsGet");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **rptType** | **Double**| Report type. (0 report, 1 widget, 2 chart). |
 **rptId** | **Double**| Report id. |
 **start** | **BigDecimal**| Start offset. | [optional]
 **limit** | **BigDecimal**| Number of results to return. Max 10K. | [optional]
 **sortBy** | **String**| Sort column. | [optional]
 **sortType** | **String**| Sort mode asc/desc. | [optional]
 **fromDate** | **String**| Start date time. | [optional]
 **toDate** | **String**| End date time. | [optional]
 **duration** | **BigDecimal**| Duration range. | [optional]
 **phone** | **String**| List of caller phone. | [optional]
 **phone1** | **String**| List of dialled phones. | [optional]
 **co** | **String**| List of trunk/co. | [optional]
 **ext** | **String**| list of extensions. | [optional]
 **pbxId** | **BigDecimal**| list of PBX Ids. | [optional]
 **callSource** | **BigDecimal**| list of callsource. | [optional]
 **callType** | **BigDecimal**| list of call type signatures.(5 Unanswered Calls, 7 Transfered Calls, 8 Forwarded Calls) | [optional]
 **direction** | **BigDecimal**| list of direction.(0 incoming, 1 outgoing, 2 internal) | [optional]
 **callerName** | **String**| list of caller name. | [optional]
 **did** | **String**| list of did. | [optional]
 **dnis** | **String**| list of dnis. | [optional]
 **acc** | **String**| list of account code. | [optional]
 **ring** | **BigDecimal**| Ring range.Seconds unit. | [optional]
 **cost** | **BigDecimal**| Cost range. | [optional]
 **group** | **BigDecimal**| Department/Group id. | [optional]

### Return type

[**List&lt;InlineResponse200&gt;**](InlineResponse200.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

<a name="featuresChartsGet"></a>
# **featuresChartsGet**
> List&lt;InlineResponse200&gt; featuresChartsGet()



Gets &#x60;Charts&#x60; list. 

### Example
```java
// Import classes:
//import io.swagger.client.api.DefaultApi;

DefaultApi apiInstance = new DefaultApi();
try {
    List<InlineResponse200> result = apiInstance.featuresChartsGet();
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling DefaultApi#featuresChartsGet");
    e.printStackTrace();
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

[**List&lt;InlineResponse200&gt;**](InlineResponse200.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

<a name="featuresReportsGet"></a>
# **featuresReportsGet**
> List&lt;InlineResponse200&gt; featuresReportsGet()



Gets &#x60;Reports&#x60; list. 

### Example
```java
// Import classes:
//import io.swagger.client.api.DefaultApi;

DefaultApi apiInstance = new DefaultApi();
try {
    List<InlineResponse200> result = apiInstance.featuresReportsGet();
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling DefaultApi#featuresReportsGet");
    e.printStackTrace();
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

[**List&lt;InlineResponse200&gt;**](InlineResponse200.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

<a name="featuresWidgetGet"></a>
# **featuresWidgetGet**
> List&lt;InlineResponse200&gt; featuresWidgetGet()



Gets &#x60;Widgets&#x60; list. 

### Example
```java
// Import classes:
//import io.swagger.client.api.DefaultApi;

DefaultApi apiInstance = new DefaultApi();
try {
    List<InlineResponse200> result = apiInstance.featuresWidgetGet();
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling DefaultApi#featuresWidgetGet");
    e.printStackTrace();
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

[**List&lt;InlineResponse200&gt;**](InlineResponse200.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

