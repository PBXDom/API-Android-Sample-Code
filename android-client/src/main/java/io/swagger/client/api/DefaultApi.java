package io.swagger.client.api;

import io.swagger.client.ApiInvoker;
import io.swagger.client.ApiException;
import io.swagger.client.Pair;

import io.swagger.client.model.*;

import java.util.*;

import com.android.volley.Response;
import com.android.volley.VolleyError;

import io.swagger.client.model.InlineResponse200;
import java.math.BigDecimal;

import org.apache.http.HttpEntity;
import org.apache.http.entity.mime.MultipartEntityBuilder;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.TimeoutException;

public class DefaultApi {
  String basePath = "https://api.pbxdom.com";
  ApiInvoker apiInvoker = ApiInvoker.getInstance();

  public void addHeader(String key, String value) {
    getInvoker().addDefaultHeader(key, value);
  }

  public ApiInvoker getInvoker() {
    return apiInvoker;
  }

  public void setBasePath(String basePath) {
    this.basePath = basePath;
  }

  public String getBasePath() {
    return basePath;
  }

  /**
  * 
  * Gets &#x60;Calls&#x60; info. 
   * @param rptType Report type. (0 report, 1 widget, 2 chart).
   * @param rptId Report id.
   * @param start Start offset.
   * @param limit Number of results to return. Max 10K.
   * @param sortBy Sort column.
   * @param sortType Sort mode asc/desc.
   * @param fromDate Start date time.
   * @param toDate End date time.
   * @param duration Duration range.
   * @param phone List of caller phone.
   * @param phone1 List of dialled phones.
   * @param co List of trunk/co.
   * @param ext list of extensions.
   * @param pbxId list of PBX Ids.
   * @param callSource list of callsource.
   * @param callType list of call type signatures.(5 Unanswered Calls, 7 Transfered Calls, 8 Forwarded Calls)
   * @param direction list of direction.(0 incoming, 1 outgoing, 2 internal)
   * @param callerName list of caller name.
   * @param did list of did.
   * @param dnis list of dnis.
   * @param acc list of account code.
   * @param ring Ring range.Seconds unit.
   * @param cost Cost range.
   * @param group Department/Group id.
   * @return List<InlineResponse200>
  */
  public List<InlineResponse200> callsGet (Double rptType, Double rptId, BigDecimal start, BigDecimal limit, String sortBy, String sortType, String fromDate, String toDate, BigDecimal duration, String phone, String phone1, String co, String ext, BigDecimal pbxId, BigDecimal callSource, BigDecimal callType, BigDecimal direction, String callerName, String did, String dnis, String acc, BigDecimal ring, BigDecimal cost, BigDecimal group) throws TimeoutException, ExecutionException, InterruptedException, ApiException {
     Object postBody = null;
  
      // verify the required parameter 'rptType' is set
      if (rptType == null) {
      VolleyError error = new VolleyError("Missing the required parameter 'rptType' when calling callsGet",
      new ApiException(400, "Missing the required parameter 'rptType' when calling callsGet"));
      }
  
      // verify the required parameter 'rptId' is set
      if (rptId == null) {
      VolleyError error = new VolleyError("Missing the required parameter 'rptId' when calling callsGet",
      new ApiException(400, "Missing the required parameter 'rptId' when calling callsGet"));
      }
  

  // create path and map variables
  String path = "/Calls".replaceAll("\\{format\\}","json");

  // query params
  List<Pair> queryParams = new ArrayList<Pair>();
      // header params
      Map<String, String> headerParams = new HashMap<String, String>();
      // form params
      Map<String, String> formParams = new HashMap<String, String>();

          queryParams.addAll(ApiInvoker.parameterToPairs("", "rptType", rptType));
          queryParams.addAll(ApiInvoker.parameterToPairs("", "rptId", rptId));
          queryParams.addAll(ApiInvoker.parameterToPairs("", "start", start));
          queryParams.addAll(ApiInvoker.parameterToPairs("", "limit", limit));
          queryParams.addAll(ApiInvoker.parameterToPairs("", "sortBy", sortBy));
          queryParams.addAll(ApiInvoker.parameterToPairs("", "sortType", sortType));
          queryParams.addAll(ApiInvoker.parameterToPairs("", "fromDate", fromDate));
          queryParams.addAll(ApiInvoker.parameterToPairs("", "toDate", toDate));
          queryParams.addAll(ApiInvoker.parameterToPairs("", "duration", duration));
          queryParams.addAll(ApiInvoker.parameterToPairs("", "phone", phone));
          queryParams.addAll(ApiInvoker.parameterToPairs("", "phone1", phone1));
          queryParams.addAll(ApiInvoker.parameterToPairs("", "co", co));
          queryParams.addAll(ApiInvoker.parameterToPairs("", "ext", ext));
          queryParams.addAll(ApiInvoker.parameterToPairs("", "pbxId", pbxId));
          queryParams.addAll(ApiInvoker.parameterToPairs("", "callSource", callSource));
          queryParams.addAll(ApiInvoker.parameterToPairs("", "callType", callType));
          queryParams.addAll(ApiInvoker.parameterToPairs("", "direction", direction));
          queryParams.addAll(ApiInvoker.parameterToPairs("", "callerName", callerName));
          queryParams.addAll(ApiInvoker.parameterToPairs("", "did", did));
          queryParams.addAll(ApiInvoker.parameterToPairs("", "dnis", dnis));
          queryParams.addAll(ApiInvoker.parameterToPairs("", "acc", acc));
          queryParams.addAll(ApiInvoker.parameterToPairs("", "ring", ring));
          queryParams.addAll(ApiInvoker.parameterToPairs("", "cost", cost));
          queryParams.addAll(ApiInvoker.parameterToPairs("", "group", group));


      String[] contentTypes = {
  
      };
      String contentType = contentTypes.length > 0 ? contentTypes[0] : "application/json";

      if (contentType.startsWith("multipart/form-data")) {
      // file uploading
      MultipartEntityBuilder localVarBuilder = MultipartEntityBuilder.create();
  

      HttpEntity httpEntity = localVarBuilder.build();
      postBody = httpEntity;
      } else {
      // normal form params
        }

      String[] authNames = new String[] {  };

      try {
        String localVarResponse = apiInvoker.invokeAPI (basePath, path, "GET", queryParams, postBody, headerParams, formParams, contentType, authNames);
        if(localVarResponse != null){
           return (List<InlineResponse200>) ApiInvoker.deserialize(localVarResponse, "array", InlineResponse200.class);
        } else {
           return null;
        }
      } catch (ApiException ex) {
         throw ex;
      } catch (InterruptedException ex) {
         throw ex;
      } catch (ExecutionException ex) {
         if(ex.getCause() instanceof VolleyError) {
	    VolleyError volleyError = (VolleyError)ex.getCause();
	    if (volleyError.networkResponse != null) {
	       throw new ApiException(volleyError.networkResponse.statusCode, volleyError.getMessage());
	    }
         }
         throw ex;
      } catch (TimeoutException ex) {
         throw ex;
      }
  }

      /**
   * 
   * Gets &#x60;Calls&#x60; info. 
   * @param rptType Report type. (0 report, 1 widget, 2 chart).   * @param rptId Report id.   * @param start Start offset.   * @param limit Number of results to return. Max 10K.   * @param sortBy Sort column.   * @param sortType Sort mode asc/desc.   * @param fromDate Start date time.   * @param toDate End date time.   * @param duration Duration range.   * @param phone List of caller phone.   * @param phone1 List of dialled phones.   * @param co List of trunk/co.   * @param ext list of extensions.   * @param pbxId list of PBX Ids.   * @param callSource list of callsource.   * @param callType list of call type signatures.(5 Unanswered Calls, 7 Transfered Calls, 8 Forwarded Calls)   * @param direction list of direction.(0 incoming, 1 outgoing, 2 internal)   * @param callerName list of caller name.   * @param did list of did.   * @param dnis list of dnis.   * @param acc list of account code.   * @param ring Ring range.Seconds unit.   * @param cost Cost range.   * @param group Department/Group id.
  */
  public void callsGet (Double rptType, Double rptId, BigDecimal start, BigDecimal limit, String sortBy, String sortType, String fromDate, String toDate, BigDecimal duration, String phone, String phone1, String co, String ext, BigDecimal pbxId, BigDecimal callSource, BigDecimal callType, BigDecimal direction, String callerName, String did, String dnis, String acc, BigDecimal ring, BigDecimal cost, BigDecimal group, final Response.Listener<List<InlineResponse200>> responseListener, final Response.ErrorListener errorListener) {
    Object postBody = null;

  
    // verify the required parameter 'rptType' is set
    if (rptType == null) {
       VolleyError error = new VolleyError("Missing the required parameter 'rptType' when calling callsGet",
         new ApiException(400, "Missing the required parameter 'rptType' when calling callsGet"));
    }
    
    // verify the required parameter 'rptId' is set
    if (rptId == null) {
       VolleyError error = new VolleyError("Missing the required parameter 'rptId' when calling callsGet",
         new ApiException(400, "Missing the required parameter 'rptId' when calling callsGet"));
    }
    

    // create path and map variables
    String path = "/Calls".replaceAll("\\{format\\}","json");

    // query params
    List<Pair> queryParams = new ArrayList<Pair>();
    // header params
    Map<String, String> headerParams = new HashMap<String, String>();
    // form params
    Map<String, String> formParams = new HashMap<String, String>();

    queryParams.addAll(ApiInvoker.parameterToPairs("", "rptType", rptType));
    queryParams.addAll(ApiInvoker.parameterToPairs("", "rptId", rptId));
    queryParams.addAll(ApiInvoker.parameterToPairs("", "start", start));
    queryParams.addAll(ApiInvoker.parameterToPairs("", "limit", limit));
    queryParams.addAll(ApiInvoker.parameterToPairs("", "sortBy", sortBy));
    queryParams.addAll(ApiInvoker.parameterToPairs("", "sortType", sortType));
    queryParams.addAll(ApiInvoker.parameterToPairs("", "fromDate", fromDate));
    queryParams.addAll(ApiInvoker.parameterToPairs("", "toDate", toDate));
    queryParams.addAll(ApiInvoker.parameterToPairs("", "duration", duration));
    queryParams.addAll(ApiInvoker.parameterToPairs("", "phone", phone));
    queryParams.addAll(ApiInvoker.parameterToPairs("", "phone1", phone1));
    queryParams.addAll(ApiInvoker.parameterToPairs("", "co", co));
    queryParams.addAll(ApiInvoker.parameterToPairs("", "ext", ext));
    queryParams.addAll(ApiInvoker.parameterToPairs("", "pbxId", pbxId));
    queryParams.addAll(ApiInvoker.parameterToPairs("", "callSource", callSource));
    queryParams.addAll(ApiInvoker.parameterToPairs("", "callType", callType));
    queryParams.addAll(ApiInvoker.parameterToPairs("", "direction", direction));
    queryParams.addAll(ApiInvoker.parameterToPairs("", "callerName", callerName));
    queryParams.addAll(ApiInvoker.parameterToPairs("", "did", did));
    queryParams.addAll(ApiInvoker.parameterToPairs("", "dnis", dnis));
    queryParams.addAll(ApiInvoker.parameterToPairs("", "acc", acc));
    queryParams.addAll(ApiInvoker.parameterToPairs("", "ring", ring));
    queryParams.addAll(ApiInvoker.parameterToPairs("", "cost", cost));
    queryParams.addAll(ApiInvoker.parameterToPairs("", "group", group));


    String[] contentTypes = {
      
    };
    String contentType = contentTypes.length > 0 ? contentTypes[0] : "application/json";

    if (contentType.startsWith("multipart/form-data")) {
      // file uploading
      MultipartEntityBuilder localVarBuilder = MultipartEntityBuilder.create();
      

      HttpEntity httpEntity = localVarBuilder.build();
      postBody = httpEntity;
    } else {
      // normal form params
          }

      String[] authNames = new String[] {  };

    try {
      apiInvoker.invokeAPI(basePath, path, "GET", queryParams, postBody, headerParams, formParams, contentType, authNames,
        new Response.Listener<String>() {
          @Override
          public void onResponse(String localVarResponse) {
            try {
              responseListener.onResponse((List<InlineResponse200>) ApiInvoker.deserialize(localVarResponse,  "array", InlineResponse200.class));
            } catch (ApiException exception) {
               errorListener.onErrorResponse(new VolleyError(exception));
            }
          }
      }, new Response.ErrorListener() {
          @Override
          public void onErrorResponse(VolleyError error) {
            errorListener.onErrorResponse(error);
          }
      });
    } catch (ApiException ex) {
      errorListener.onErrorResponse(new VolleyError(ex));
    }
  }
  /**
  * 
  * Gets &#x60;Charts&#x60; list. 
   * @return List<InlineResponse200>
  */
  public List<InlineResponse200> featuresChartsGet () throws TimeoutException, ExecutionException, InterruptedException, ApiException {
     Object postBody = null;
  

  // create path and map variables
  String path = "/Features/charts".replaceAll("\\{format\\}","json");

  // query params
  List<Pair> queryParams = new ArrayList<Pair>();
      // header params
      Map<String, String> headerParams = new HashMap<String, String>();
      // form params
      Map<String, String> formParams = new HashMap<String, String>();



      String[] contentTypes = {
  
      };
      String contentType = contentTypes.length > 0 ? contentTypes[0] : "application/json";

      if (contentType.startsWith("multipart/form-data")) {
      // file uploading
      MultipartEntityBuilder localVarBuilder = MultipartEntityBuilder.create();
  

      HttpEntity httpEntity = localVarBuilder.build();
      postBody = httpEntity;
      } else {
      // normal form params
        }

      String[] authNames = new String[] {  };

      try {
        String localVarResponse = apiInvoker.invokeAPI (basePath, path, "GET", queryParams, postBody, headerParams, formParams, contentType, authNames);
        if(localVarResponse != null){
           return (List<InlineResponse200>) ApiInvoker.deserialize(localVarResponse, "array", InlineResponse200.class);
        } else {
           return null;
        }
      } catch (ApiException ex) {
         throw ex;
      } catch (InterruptedException ex) {
         throw ex;
      } catch (ExecutionException ex) {
         if(ex.getCause() instanceof VolleyError) {
	    VolleyError volleyError = (VolleyError)ex.getCause();
	    if (volleyError.networkResponse != null) {
	       throw new ApiException(volleyError.networkResponse.statusCode, volleyError.getMessage());
	    }
         }
         throw ex;
      } catch (TimeoutException ex) {
         throw ex;
      }
  }

      /**
   * 
   * Gets &#x60;Charts&#x60; list. 

  */
  public void featuresChartsGet (final Response.Listener<List<InlineResponse200>> responseListener, final Response.ErrorListener errorListener) {
    Object postBody = null;

  

    // create path and map variables
    String path = "/Features/charts".replaceAll("\\{format\\}","json");

    // query params
    List<Pair> queryParams = new ArrayList<Pair>();
    // header params
    Map<String, String> headerParams = new HashMap<String, String>();
    // form params
    Map<String, String> formParams = new HashMap<String, String>();



    String[] contentTypes = {
      
    };
    String contentType = contentTypes.length > 0 ? contentTypes[0] : "application/json";

    if (contentType.startsWith("multipart/form-data")) {
      // file uploading
      MultipartEntityBuilder localVarBuilder = MultipartEntityBuilder.create();
      

      HttpEntity httpEntity = localVarBuilder.build();
      postBody = httpEntity;
    } else {
      // normal form params
          }

      String[] authNames = new String[] {  };

    try {
      apiInvoker.invokeAPI(basePath, path, "GET", queryParams, postBody, headerParams, formParams, contentType, authNames,
        new Response.Listener<String>() {
          @Override
          public void onResponse(String localVarResponse) {
            try {
              responseListener.onResponse((List<InlineResponse200>) ApiInvoker.deserialize(localVarResponse,  "array", InlineResponse200.class));
            } catch (ApiException exception) {
               errorListener.onErrorResponse(new VolleyError(exception));
            }
          }
      }, new Response.ErrorListener() {
          @Override
          public void onErrorResponse(VolleyError error) {
            errorListener.onErrorResponse(error);
          }
      });
    } catch (ApiException ex) {
      errorListener.onErrorResponse(new VolleyError(ex));
    }
  }
  /**
  * 
  * Gets &#x60;Reports&#x60; list. 
   * @return List<InlineResponse200>
  */
  public List<InlineResponse200> featuresReportsGet () throws TimeoutException, ExecutionException, InterruptedException, ApiException {
     Object postBody = null;
  

  // create path and map variables
  String path = "/Features/reports".replaceAll("\\{format\\}","json");

  // query params
  List<Pair> queryParams = new ArrayList<Pair>();
      // header params
      Map<String, String> headerParams = new HashMap<String, String>();
      // form params
      Map<String, String> formParams = new HashMap<String, String>();



      String[] contentTypes = {
  
      };
      String contentType = contentTypes.length > 0 ? contentTypes[0] : "application/json";

      if (contentType.startsWith("multipart/form-data")) {
      // file uploading
      MultipartEntityBuilder localVarBuilder = MultipartEntityBuilder.create();
  

      HttpEntity httpEntity = localVarBuilder.build();
      postBody = httpEntity;
      } else {
      // normal form params
        }

      String[] authNames = new String[] {  };

      try {
        String localVarResponse = apiInvoker.invokeAPI (basePath, path, "GET", queryParams, postBody, headerParams, formParams, contentType, authNames);
        if(localVarResponse != null){
           return (List<InlineResponse200>) ApiInvoker.deserialize(localVarResponse, "array", InlineResponse200.class);
        } else {
           return null;
        }
      } catch (ApiException ex) {
         throw ex;
      } catch (InterruptedException ex) {
         throw ex;
      } catch (ExecutionException ex) {
         if(ex.getCause() instanceof VolleyError) {
	    VolleyError volleyError = (VolleyError)ex.getCause();
	    if (volleyError.networkResponse != null) {
	       throw new ApiException(volleyError.networkResponse.statusCode, volleyError.getMessage());
	    }
         }
         throw ex;
      } catch (TimeoutException ex) {
         throw ex;
      }
  }

      /**
   * 
   * Gets &#x60;Reports&#x60; list. 

  */
  public void featuresReportsGet (final Response.Listener<List<InlineResponse200>> responseListener, final Response.ErrorListener errorListener) {
    Object postBody = null;

  

    // create path and map variables
    String path = "/Features/reports".replaceAll("\\{format\\}","json");

    // query params
    List<Pair> queryParams = new ArrayList<Pair>();
    // header params
    Map<String, String> headerParams = new HashMap<String, String>();
    // form params
    Map<String, String> formParams = new HashMap<String, String>();



    String[] contentTypes = {
      
    };
    String contentType = contentTypes.length > 0 ? contentTypes[0] : "application/json";

    if (contentType.startsWith("multipart/form-data")) {
      // file uploading
      MultipartEntityBuilder localVarBuilder = MultipartEntityBuilder.create();
      

      HttpEntity httpEntity = localVarBuilder.build();
      postBody = httpEntity;
    } else {
      // normal form params
          }

      String[] authNames = new String[] {  };

    try {
      apiInvoker.invokeAPI(basePath, path, "GET", queryParams, postBody, headerParams, formParams, contentType, authNames,
        new Response.Listener<String>() {
          @Override
          public void onResponse(String localVarResponse) {
            try {
              responseListener.onResponse((List<InlineResponse200>) ApiInvoker.deserialize(localVarResponse,  "array", InlineResponse200.class));
            } catch (ApiException exception) {
               errorListener.onErrorResponse(new VolleyError(exception));
            }
          }
      }, new Response.ErrorListener() {
          @Override
          public void onErrorResponse(VolleyError error) {
            errorListener.onErrorResponse(error);
          }
      });
    } catch (ApiException ex) {
      errorListener.onErrorResponse(new VolleyError(ex));
    }
  }
  /**
  * 
  * Gets &#x60;Widgets&#x60; list. 
   * @return List<InlineResponse200>
  */
  public List<InlineResponse200> featuresWidgetGet () throws TimeoutException, ExecutionException, InterruptedException, ApiException {
     Object postBody = null;
  

  // create path and map variables
  String path = "/Features/widget".replaceAll("\\{format\\}","json");

  // query params
  List<Pair> queryParams = new ArrayList<Pair>();
      // header params
      Map<String, String> headerParams = new HashMap<String, String>();
      // form params
      Map<String, String> formParams = new HashMap<String, String>();



      String[] contentTypes = {
  
      };
      String contentType = contentTypes.length > 0 ? contentTypes[0] : "application/json";

      if (contentType.startsWith("multipart/form-data")) {
      // file uploading
      MultipartEntityBuilder localVarBuilder = MultipartEntityBuilder.create();
  

      HttpEntity httpEntity = localVarBuilder.build();
      postBody = httpEntity;
      } else {
      // normal form params
        }

      String[] authNames = new String[] {  };

      try {
        String localVarResponse = apiInvoker.invokeAPI (basePath, path, "GET", queryParams, postBody, headerParams, formParams, contentType, authNames);
        if(localVarResponse != null){
           return (List<InlineResponse200>) ApiInvoker.deserialize(localVarResponse, "array", InlineResponse200.class);
        } else {
           return null;
        }
      } catch (ApiException ex) {
         throw ex;
      } catch (InterruptedException ex) {
         throw ex;
      } catch (ExecutionException ex) {
         if(ex.getCause() instanceof VolleyError) {
	    VolleyError volleyError = (VolleyError)ex.getCause();
	    if (volleyError.networkResponse != null) {
	       throw new ApiException(volleyError.networkResponse.statusCode, volleyError.getMessage());
	    }
         }
         throw ex;
      } catch (TimeoutException ex) {
         throw ex;
      }
  }

      /**
   * 
   * Gets &#x60;Widgets&#x60; list. 

  */
  public void featuresWidgetGet (final Response.Listener<List<InlineResponse200>> responseListener, final Response.ErrorListener errorListener) {
    Object postBody = null;

  

    // create path and map variables
    String path = "/Features/widget".replaceAll("\\{format\\}","json");

    // query params
    List<Pair> queryParams = new ArrayList<Pair>();
    // header params
    Map<String, String> headerParams = new HashMap<String, String>();
    // form params
    Map<String, String> formParams = new HashMap<String, String>();



    String[] contentTypes = {
      
    };
    String contentType = contentTypes.length > 0 ? contentTypes[0] : "application/json";

    if (contentType.startsWith("multipart/form-data")) {
      // file uploading
      MultipartEntityBuilder localVarBuilder = MultipartEntityBuilder.create();
      

      HttpEntity httpEntity = localVarBuilder.build();
      postBody = httpEntity;
    } else {
      // normal form params
          }

      String[] authNames = new String[] {  };

    try {
      apiInvoker.invokeAPI(basePath, path, "GET", queryParams, postBody, headerParams, formParams, contentType, authNames,
        new Response.Listener<String>() {
          @Override
          public void onResponse(String localVarResponse) {
            try {
              responseListener.onResponse((List<InlineResponse200>) ApiInvoker.deserialize(localVarResponse,  "array", InlineResponse200.class));
            } catch (ApiException exception) {
               errorListener.onErrorResponse(new VolleyError(exception));
            }
          }
      }, new Response.ErrorListener() {
          @Override
          public void onErrorResponse(VolleyError error) {
            errorListener.onErrorResponse(error);
          }
      });
    } catch (ApiException ex) {
      errorListener.onErrorResponse(new VolleyError(ex));
    }
  }
}
