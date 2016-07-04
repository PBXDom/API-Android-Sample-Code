# swagger-android-client

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
    <groupId>io.swagger</groupId>
    <artifactId>swagger-android-client</artifactId>
    <version>1.0.0</version>
    <scope>compile</scope>
</dependency>
```

### Gradle users

Add this dependency to your project's build file:

```groovy
compile "io.swagger:swagger-android-client:1.0.0"
```

### Others

At first generate the JAR by executing:

    mvn package

Then manually install the following JARs:

* target/swagger-android-client-1.0.0.jar
* target/lib/*.jar

## Getting Started

Please follow the [installation](#installation) instruction and execute the following Java code:

```java

import io.swagger.client.api.DefaultApi;

public class DefaultApiExample {

    public static void main(String[] args) {
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
    }
}

```

## Documentation for API Endpoints

All URIs are relative to *https://api.pbxdom.com*

Class | Method | HTTP request | Description
------------ | ------------- | ------------- | -------------
*DefaultApi* | [**callsGet**](docs/DefaultApi.md#callsGet) | **GET** /Calls | 
*DefaultApi* | [**featuresChartsGet**](docs/DefaultApi.md#featuresChartsGet) | **GET** /Features/charts | 
*DefaultApi* | [**featuresReportsGet**](docs/DefaultApi.md#featuresReportsGet) | **GET** /Features/reports | 
*DefaultApi* | [**featuresWidgetGet**](docs/DefaultApi.md#featuresWidgetGet) | **GET** /Features/widget | 


## Documentation for Models

 - [InlineResponse200](docs/InlineResponse200.md)


## Documentation for Authorization

All endpoints do not require authorization.
Authentication schemes defined for the API:

## Recommendation

It's recommended to create an instance of `ApiClient` per thread in a multithreaded environment to avoid any potential issue.

## Author



