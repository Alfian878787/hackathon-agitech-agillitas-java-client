package io.swagger.client.api;

import io.swagger.client.*;
import io.swagger.client.model.Pagamento;

import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class PagamentosApi {
    private ApiClient apiClient;

    public PagamentosApi() {
        this(Configuration.getDefaultApiClient());
    }

    public PagamentosApi(ApiClient apiClient) {
        this.apiClient = apiClient;
    }

    public ApiClient getApiClient() {
        return apiClient;
    }

    public void setApiClient(ApiClient apiClient) {
        this.apiClient = apiClient;
    }

    /* Build call for criarPagamento */
    private com.squareup.okhttp.Call pagamentosPostCall(String clientId, String accessToken, Pagamento boleto, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        Object localVarPostBody = boleto;

        // verify the required parameter 'clientId' is set
        if (clientId == null) {
            throw new ApiException("Missing the required parameter 'clientId' when calling criarPagamento(Async)");
        }

        // verify the required parameter 'accessToken' is set
        if (accessToken == null) {
            throw new ApiException("Missing the required parameter 'accessToken' when calling criarPagamento(Async)");
        }

        // verify the required parameter 'boleto' is set
        if (boleto == null) {
            throw new ApiException("Missing the required parameter 'boleto' when calling criarPagamento(Async)");
        }


        // create path and map variables
        String localVarPath = "/pagamentos".replaceAll("\\{format\\}", "json");

        List<Pair> localVarQueryParams = new ArrayList<Pair>();

        Map<String, String> localVarHeaderParams = new HashMap<String, String>();
        if (clientId != null)
            localVarHeaderParams.put("client_id", apiClient.parameterToString(clientId));
        if (accessToken != null)
            localVarHeaderParams.put("access_token", apiClient.parameterToString(accessToken));

        Map<String, Object> localVarFormParams = new HashMap<String, Object>();

        final String[] localVarAccepts = {
                "application/json"
        };
        final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);
        if (localVarAccept != null) localVarHeaderParams.put("Accept", localVarAccept);

        final String[] localVarContentTypes = {
                "application/json"
        };
        final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);
        localVarHeaderParams.put("Content-Type", localVarContentType);

        if (progressListener != null) {
            apiClient.getHttpClient().networkInterceptors().add(new com.squareup.okhttp.Interceptor() {
                @Override
                public com.squareup.okhttp.Response intercept(com.squareup.okhttp.Interceptor.Chain chain) throws IOException {
                    com.squareup.okhttp.Response originalResponse = chain.proceed(chain.request());
                    return originalResponse.newBuilder()
                            .body(new ProgressResponseBody(originalResponse.body(), progressListener))
                            .build();
                }
            });
        }

        String[] localVarAuthNames = new String[]{};
        return apiClient.buildCall(localVarPath, "POST", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAuthNames, progressRequestListener);
    }

    /**
     * Pagamento de boletos.
     * &lt;p&gt;Permite o pagamento de boletos.&lt;/p&gt;
     *
     * @param clientId    Identificador do cliente utilizado na autenticação. (required)
     * @param accessToken Token de acesso utilizado na autenticação. (required)
     * @param boleto      Objeto de requisição (required)
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public void criarPagamento(String clientId, String accessToken, Pagamento boleto) throws ApiException {
        pagamentosPostWithHttpInfo(clientId, accessToken, boleto);
    }

    /**
     * Pagamento de boletos.
     * &lt;p&gt;Permite o pagamento de boletos.&lt;/p&gt;
     *
     * @param clientId    Identificador do cliente utilizado na autenticação. (required)
     * @param accessToken Token de acesso utilizado na autenticação. (required)
     * @param boleto      Objeto de requisição (required)
     * @return ApiResponse&lt;Void&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    private ApiResponse<Void> pagamentosPostWithHttpInfo(String clientId, String accessToken, Pagamento boleto) throws ApiException {
        com.squareup.okhttp.Call call = pagamentosPostCall(clientId, accessToken, boleto, null, null);
        return apiClient.execute(call);
    }

}
