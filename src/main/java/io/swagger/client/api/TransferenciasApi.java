

package io.swagger.client.api;

import io.swagger.client.*;
import io.swagger.client.model.Transferencia;
import io.swagger.client.model.TransferenciaCadastroBenificiario;

import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class TransferenciasApi {
    private ApiClient apiClient;

    public TransferenciasApi() {
        this(Configuration.getDefaultApiClient());
    }

    public TransferenciasApi(ApiClient apiClient) {
        this.apiClient = apiClient;
    }

    public ApiClient getApiClient() {
        return apiClient;
    }

    public void setApiClient(ApiClient apiClient) {
        this.apiClient = apiClient;
    }

    /* Build call for cadastrarBeneficiario */
    private com.squareup.okhttp.Call transferenciasCadastrosPostCall(String clientId, String accessToken, TransferenciaCadastroBenificiario beneficiario, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        Object localVarPostBody = beneficiario;
        
        // verify the required parameter 'clientId' is set
        if (clientId == null) {
            throw new ApiException("Missing the required parameter 'clientId' when calling cadastrarBeneficiario(Async)");
        }
        
        // verify the required parameter 'accessToken' is set
        if (accessToken == null) {
            throw new ApiException("Missing the required parameter 'accessToken' when calling cadastrarBeneficiario(Async)");
        }
        
        // verify the required parameter 'beneficiario' is set
        if (beneficiario == null) {
            throw new ApiException("Missing the required parameter 'beneficiario' when calling cadastrarBeneficiario(Async)");
        }
        

        // create path and map variables
        String localVarPath = "/transferencias/cadastros".replaceAll("\\{format\\}","json");

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

        if(progressListener != null) {
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

        String[] localVarAuthNames = new String[] {  };
        return apiClient.buildCall(localVarPath, "POST", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAuthNames, progressRequestListener);
    }

    /**
     * Cadastro de beneficiário para Transferencia
     * &lt;p&gt;Permite o cadastro de beneficiário para uma transferencia.&lt;/p&gt;
     * @param clientId Identificador do cliente utilizado na autenticação. (required)
     * @param accessToken Token de acesso utilizado na autenticação. (required)
     * @param beneficiario Objeto de requisição (required)
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public void cadastrarBeneficiario(String clientId, String accessToken, TransferenciaCadastroBenificiario beneficiario) throws ApiException {
        transferenciasCadastrosPostWithHttpInfo(clientId, accessToken, beneficiario);
    }

    /**
     * Cadastro de beneficiário para Transferencia
     * &lt;p&gt;Permite o cadastro de beneficiário para uma transferencia.&lt;/p&gt;
     * @param clientId Identificador do cliente utilizado na autenticação. (required)
     * @param accessToken Token de acesso utilizado na autenticação. (required)
     * @param beneficiario Objeto de requisição (required)
     * @return ApiResponse&lt;Void&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    private ApiResponse<Void> transferenciasCadastrosPostWithHttpInfo(String clientId, String accessToken, TransferenciaCadastroBenificiario beneficiario) throws ApiException {
        com.squareup.okhttp.Call call = transferenciasCadastrosPostCall(clientId, accessToken, beneficiario, null, null);
        return apiClient.execute(call);
    }


    /* Build call for transferirValores */
    private com.squareup.okhttp.Call transferenciasPostCall(String clientId, String accessToken, Transferencia transferencia, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        Object localVarPostBody = transferencia;
        
        // verify the required parameter 'clientId' is set
        if (clientId == null) {
            throw new ApiException("Missing the required parameter 'clientId' when calling transferirValores(Async)");
        }
        
        // verify the required parameter 'accessToken' is set
        if (accessToken == null) {
            throw new ApiException("Missing the required parameter 'accessToken' when calling transferirValores(Async)");
        }
        
        // verify the required parameter 'transferencia' is set
        if (transferencia == null) {
            throw new ApiException("Missing the required parameter 'transferencia' when calling transferirValores(Async)");
        }
        

        // create path and map variables
        String localVarPath = "/transferencias".replaceAll("\\{format\\}","json");

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

        if(progressListener != null) {
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

        String[] localVarAuthNames = new String[] {  };
        return apiClient.buildCall(localVarPath, "POST", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAuthNames, progressRequestListener);
    }

    /**
     * Transferência de valores entre contas
     * &lt;p&gt;Permite a transferência de valor entre dois cartões pré cadastrados.&lt;/p&gt;
     * @param clientId Identificador do cliente utilizado na autenticação. (required)
     * @param accessToken Token de acesso utilizado na autenticação. (required)
     * @param transferencia Objeto de requisição (required)
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public void transferirValores(String clientId, String accessToken, Transferencia transferencia) throws ApiException {
        transferenciasPostWithHttpInfo(clientId, accessToken, transferencia);
    }

    /**
     * Transferência de valores entre contas
     * &lt;p&gt;Permite a transferência de valor entre dois cartões pré cadastrados.&lt;/p&gt;
     * @param clientId Identificador do cliente utilizado na autenticação. (required)
     * @param accessToken Token de acesso utilizado na autenticação. (required)
     * @param transferencia Objeto de requisição (required)
     * @return ApiResponse&lt;Void&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    private ApiResponse<Void> transferenciasPostWithHttpInfo(String clientId, String accessToken, Transferencia transferencia) throws ApiException {
        com.squareup.okhttp.Call call = transferenciasPostCall(clientId, accessToken, transferencia, null, null);
        return apiClient.execute(call);
    }

}
