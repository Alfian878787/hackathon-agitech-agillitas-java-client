

package io.swagger.client.api;

import com.google.gson.reflect.TypeToken;
import io.swagger.client.*;
import io.swagger.client.model.*;
import org.joda.time.LocalDate;

import java.io.IOException;
import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class CartoesApi {
    private ApiClient apiClient;

    public CartoesApi() {
        this(Configuration.getDefaultApiClient());
    }

    public CartoesApi(ApiClient apiClient) {
        this.apiClient = apiClient;
    }

    public ApiClient getApiClient() {
        return apiClient;
    }

    public void setApiClient(ApiClient apiClient) {
        this.apiClient = apiClient;
    }

    /* Build call for getExtrato */
    private com.squareup.okhttp.Call cartoesIdCartaoExtratoGetCall(String clientId, String accessToken, String idCartao, LocalDate dataInicial, LocalDate dataFinal, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        Object localVarPostBody = null;

        // verify the required parameter 'clientId' is set
        if (clientId == null) {
            throw new ApiException("Missing the required parameter 'clientId' when calling getExtrato(Async)");
        }

        // verify the required parameter 'accessToken' is set
        if (accessToken == null) {
            throw new ApiException("Missing the required parameter 'accessToken' when calling getExtrato(Async)");
        }

        // verify the required parameter 'idCartao' is set
        if (idCartao == null) {
            throw new ApiException("Missing the required parameter 'idCartao' when calling getExtrato(Async)");
        }

        // verify the required parameter 'dataInicial' is set
        if (dataInicial == null) {
            throw new ApiException("Missing the required parameter 'dataInicial' when calling getExtrato(Async)");
        }

        // verify the required parameter 'dataFinal' is set
        if (dataFinal == null) {
            throw new ApiException("Missing the required parameter 'dataFinal' when calling getExtrato(Async)");
        }


        // create path and map variables
        String localVarPath = "/cartoes/{idCartao}/extrato".replaceAll("\\{format\\}", "json")
                .replaceAll("\\{" + "idCartao" + "\\}", apiClient.escapeString(idCartao.toString()));

        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        if (dataInicial != null)
            localVarQueryParams.addAll(apiClient.parameterToPairs("", "dataInicial", dataInicial));
        if (dataFinal != null)
            localVarQueryParams.addAll(apiClient.parameterToPairs("", "dataFinal", dataFinal));

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
        return apiClient.buildCall(localVarPath, "GET", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAuthNames, progressRequestListener);
    }

    /**
     * Consulta o extrato do cartão
     * &lt;p&gt;Permite a consulta dos movimentos por período de um determinado cartão. A janela máxima de observação é de 30 dias, e as datas inicial e final de observação pode ser configuradas, conforme necessidade.&lt;/p&gt;
     *
     * @param clientId    Identificador do cliente utilizado na autenticação. (required)
     * @param accessToken Token de acesso utilizado na autenticação. (required)
     * @param idCartao    Número identificador referente ao proxy localizado no verso do cartão. (required)
     * @param dataInicial Data inicial para a consulta (YYYY-MM-DD). (required)
     * @param dataFinal   Data final para a consulta (YYYY-MM-DD).. (required)
     * @return ExtratoResponse
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ExtratoResponse getExtrato(String clientId, String accessToken, String idCartao, LocalDate dataInicial, LocalDate dataFinal) throws ApiException {
        ApiResponse<ExtratoResponse> resp = cartoesIdCartaoExtratoGetWithHttpInfo(clientId, accessToken, idCartao, dataInicial, dataFinal);
        return resp.getData();
    }

    /**
     * Consulta o extrato do cartão
     * &lt;p&gt;Permite a consulta dos movimentos por período de um determinado cartão. A janela máxima de observação é de 30 dias, e as datas inicial e final de observação pode ser configuradas, conforme necessidade.&lt;/p&gt;
     *
     * @param clientId    Identificador do cliente utilizado na autenticação. (required)
     * @param accessToken Token de acesso utilizado na autenticação. (required)
     * @param idCartao    Número identificador referente ao proxy localizado no verso do cartão. (required)
     * @param dataInicial Data inicial para a consulta (YYYY-MM-DD). (required)
     * @param dataFinal   Data final para a consulta (YYYY-MM-DD).. (required)
     * @return ApiResponse&lt;ExtratoResponse&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    private ApiResponse<ExtratoResponse> cartoesIdCartaoExtratoGetWithHttpInfo(String clientId, String accessToken, String idCartao, LocalDate dataInicial, LocalDate dataFinal) throws ApiException {
        com.squareup.okhttp.Call call = cartoesIdCartaoExtratoGetCall(clientId, accessToken, idCartao, dataInicial, dataFinal, null, null);
        Type localVarReturnType = new TypeToken<ExtratoResponse>() {
        }.getType();
        return apiClient.execute(call, localVarReturnType);
    }

    /* Build call for getPortador */
    private com.squareup.okhttp.Call cartoesIdCartaoPortadorGetCall(String clientId, String accessToken, String idCartao, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        Object localVarPostBody = null;

        // verify the required parameter 'clientId' is set
        if (clientId == null) {
            throw new ApiException("Missing the required parameter 'clientId' when calling getPortador(Async)");
        }

        // verify the required parameter 'accessToken' is set
        if (accessToken == null) {
            throw new ApiException("Missing the required parameter 'accessToken' when calling getPortador(Async)");
        }

        // verify the required parameter 'idCartao' is set
        if (idCartao == null) {
            throw new ApiException("Missing the required parameter 'idCartao' when calling getPortador(Async)");
        }


        // create path and map variables
        String localVarPath = "/cartoes/{idCartao}/portador".replaceAll("\\{format\\}", "json")
                .replaceAll("\\{" + "idCartao" + "\\}", apiClient.escapeString(idCartao.toString()));

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
        return apiClient.buildCall(localVarPath, "GET", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAuthNames, progressRequestListener);
    }

    /**
     * Consuta informações do portador do cartão
     * &lt;p&gt;Permite a consulta de informações cadastrais de um determinado portador de cartão.&lt;/p&gt;
     *
     * @param clientId    Identificador do cliente utilizado na autenticação. (required)
     * @param accessToken Token de acesso utilizado na autenticação. (required)
     * @param idCartao    Número identificador referente ao proxy localizado no verso do cartão. (required)
     * @return PortadorResponse
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public PortadorResponse getPortador(String clientId, String accessToken, String idCartao) throws ApiException {
        ApiResponse<PortadorResponse> resp = cartoesIdCartaoPortadorGetWithHttpInfo(clientId, accessToken, idCartao);
        return resp.getData();
    }

    /**
     * Consuta informações do portador do cartão
     * &lt;p&gt;Permite a consulta de informações cadastrais de um determinado portador de cartão.&lt;/p&gt;
     *
     * @param clientId    Identificador do cliente utilizado na autenticação. (required)
     * @param accessToken Token de acesso utilizado na autenticação. (required)
     * @param idCartao    Número identificador referente ao proxy localizado no verso do cartão. (required)
     * @return ApiResponse&lt;PortadorResponse&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    private ApiResponse<PortadorResponse> cartoesIdCartaoPortadorGetWithHttpInfo(String clientId, String accessToken, String idCartao) throws ApiException {
        com.squareup.okhttp.Call call = cartoesIdCartaoPortadorGetCall(clientId, accessToken, idCartao, null, null);
        Type localVarReturnType = new TypeToken<PortadorResponse>() {
        }.getType();
        return apiClient.execute(call, localVarReturnType);
    }

    /* Build call for getSaldo */
    private com.squareup.okhttp.Call cartoesIdCartaoSaldoGetCall(String clientId, String accessToken, String idCartao, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        Object localVarPostBody = null;

        // verify the required parameter 'clientId' is set
        if (clientId == null) {
            throw new ApiException("Missing the required parameter 'clientId' when calling getSaldo(Async)");
        }

        // verify the required parameter 'accessToken' is set
        if (accessToken == null) {
            throw new ApiException("Missing the required parameter 'accessToken' when calling getSaldo(Async)");
        }

        // verify the required parameter 'idCartao' is set
        if (idCartao == null) {
            throw new ApiException("Missing the required parameter 'idCartao' when calling getSaldo(Async)");
        }


        // create path and map variables
        String localVarPath = "/cartoes/{idCartao}/saldo".replaceAll("\\{format\\}", "json")
                .replaceAll("\\{" + "idCartao" + "\\}", apiClient.escapeString(idCartao.toString()));

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
        return apiClient.buildCall(localVarPath, "GET", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAuthNames, progressRequestListener);
    }

    /**
     * Consulta o saldo do cartão
     * &lt;p&gt;Permite a consulta do saldo disponível de um determinado cartão.&lt;/p&gt;
     *
     * @param clientId    Identificador do cliente utilizado na autenticação. (required)
     * @param accessToken Token de acesso utilizado na autenticação. (required)
     * @param idCartao    Número identificador referente ao proxy localizado no verso do cartão. (required)
     * @return Saldo
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public Saldo getSaldo(String clientId, String accessToken, String idCartao) throws ApiException {
        ApiResponse<Saldo> resp = cartoesIdCartaoSaldoGetWithHttpInfo(clientId, accessToken, idCartao);
        return resp.getData();
    }

    /**
     * Consulta o saldo do cartão
     * &lt;p&gt;Permite a consulta do saldo disponível de um determinado cartão.&lt;/p&gt;
     *
     * @param clientId    Identificador do cliente utilizado na autenticação. (required)
     * @param accessToken Token de acesso utilizado na autenticação. (required)
     * @param idCartao    Número identificador referente ao proxy localizado no verso do cartão. (required)
     * @return ApiResponse&lt;Saldo&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    private ApiResponse<Saldo> cartoesIdCartaoSaldoGetWithHttpInfo(String clientId, String accessToken, String idCartao) throws ApiException {
        com.squareup.okhttp.Call call = cartoesIdCartaoSaldoGetCall(clientId, accessToken, idCartao, null, null);
        Type localVarReturnType = new TypeToken<Saldo>() {
        }.getType();
        return apiClient.execute(call, localVarReturnType);
    }

    /* Build call for atualizarSaldo */
    private com.squareup.okhttp.Call cartoesIdCartaoSaldoPutCall(String clientId, String accessToken, String idCartao, SetSaldo saldo, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        Object localVarPostBody = saldo;

        // verify the required parameter 'clientId' is set
        if (clientId == null) {
            throw new ApiException("Missing the required parameter 'clientId' when calling atualizarSaldo(Async)");
        }

        // verify the required parameter 'accessToken' is set
        if (accessToken == null) {
            throw new ApiException("Missing the required parameter 'accessToken' when calling atualizarSaldo(Async)");
        }

        // verify the required parameter 'idCartao' is set
        if (idCartao == null) {
            throw new ApiException("Missing the required parameter 'idCartao' when calling atualizarSaldo(Async)");
        }

        // verify the required parameter 'saldo' is set
        if (saldo == null) {
            throw new ApiException("Missing the required parameter 'saldo' when calling atualizarSaldo(Async)");
        }


        // create path and map variables
        String localVarPath = "/cartoes/{idCartao}/saldo".replaceAll("\\{format\\}", "json")
                .replaceAll("\\{" + "idCartao" + "\\}", apiClient.escapeString(idCartao.toString()));

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
        return apiClient.buildCall(localVarPath, "PUT", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAuthNames, progressRequestListener);
    }

    /**
     * Credita ou debita valor da conta de um cartão.
     * &lt;p&gt;Permite creditar ou debitar um valor especifico em um determinado cartão.&lt;/p&gt;&lt;br/&gt;&lt;p class&#x3D;&#39;obs obs-danger&#39;&gt;Este recurso deve ser utilizado somente pelo reseller e quando o credito do cartão for de responsabilidade e propriedade do Reseller.&lt;/p&gt;
     *
     * @param clientId    Identificador do cliente utilizado na autenticação. (required)
     * @param accessToken Token de acesso utilizado na autenticação. (required)
     * @param idCartao    Número identificador referente ao proxy localizado no verso do cartão. (required)
     * @param saldo       Objeto de requisição (required)
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public void atualizarSaldo(String clientId, String accessToken, String idCartao, SetSaldo saldo) throws ApiException {
        ApiResponse<Void> response = cartoesIdCartaoSaldoPutWithHttpInfo(clientId, accessToken, idCartao, saldo);
    }

    /**
     * Credita ou debita valor da conta de um cartão.
     * &lt;p&gt;Permite creditar ou debitar um valor especifico em um determinado cartão.&lt;/p&gt;&lt;br/&gt;&lt;p class&#x3D;&#39;obs obs-danger&#39;&gt;Este recurso deve ser utilizado somente pelo reseller e quando o credito do cartão for de responsabilidade e propriedade do Reseller.&lt;/p&gt;
     *
     * @param clientId    Identificador do cliente utilizado na autenticação. (required)
     * @param accessToken Token de acesso utilizado na autenticação. (required)
     * @param idCartao    Número identificador referente ao proxy localizado no verso do cartão. (required)
     * @param saldo       Objeto de requisição (required)
     * @return ApiResponse&lt;Void&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    private ApiResponse<Void> cartoesIdCartaoSaldoPutWithHttpInfo(String clientId, String accessToken, String idCartao, SetSaldo saldo) throws ApiException {
        com.squareup.okhttp.Call call = cartoesIdCartaoSaldoPutCall(clientId, accessToken, idCartao, saldo, null, null);
        return apiClient.execute(call);
    }

    /* Build call for getCartaoStatus */
    private com.squareup.okhttp.Call cartoesIdCartaoStatusGetCall(String clientId, String accessToken, String idCartao, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        Object localVarPostBody = null;

        // verify the required parameter 'clientId' is set
        if (clientId == null) {
            throw new ApiException("Missing the required parameter 'clientId' when calling getCartaoStatus(Async)");
        }

        // verify the required parameter 'accessToken' is set
        if (accessToken == null) {
            throw new ApiException("Missing the required parameter 'accessToken' when calling getCartaoStatus(Async)");
        }

        // verify the required parameter 'idCartao' is set
        if (idCartao == null) {
            throw new ApiException("Missing the required parameter 'idCartao' when calling getCartaoStatus(Async)");
        }


        // create path and map variables
        String localVarPath = "/cartoes/{idCartao}/status".replaceAll("\\{format\\}", "json")
                .replaceAll("\\{" + "idCartao" + "\\}", apiClient.escapeString(idCartao.toString()));

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
        return apiClient.buildCall(localVarPath, "GET", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAuthNames, progressRequestListener);
    }

    /**
     * Consulta o status do cartão
     * &lt;p&gt;Permite a consulta do status de um determinado cartão. O status do cartão nos permite saber se o cartão esta ativo, bloqueado, desbloqueado ou cancelado.&lt;/p&gt;
     *
     * @param clientId    Identificador do cliente utilizado na autenticação. (required)
     * @param accessToken Token de acesso utilizado na autenticação. (required)
     * @param idCartao    Número identificador referente ao proxy localizado no verso do cartão. (required)
     * @return StatusCartaoResponse
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public StatusCartaoResponse getCartaoStatus(String clientId, String accessToken, String idCartao) throws ApiException {
        ApiResponse<StatusCartaoResponse> resp = cartoesIdCartaoStatusGetWithHttpInfo(clientId, accessToken, idCartao);
        return resp.getData();
    }

    /**
     * Consulta o status do cartão
     * &lt;p&gt;Permite a consulta do status de um determinado cartão. O status do cartão nos permite saber se o cartão esta ativo, bloqueado, desbloqueado ou cancelado.&lt;/p&gt;
     *
     * @param clientId    Identificador do cliente utilizado na autenticação. (required)
     * @param accessToken Token de acesso utilizado na autenticação. (required)
     * @param idCartao    Número identificador referente ao proxy localizado no verso do cartão. (required)
     * @return ApiResponse&lt;StatusCartaoResponse&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    private ApiResponse<StatusCartaoResponse> cartoesIdCartaoStatusGetWithHttpInfo(String clientId, String accessToken, String idCartao) throws ApiException {
        com.squareup.okhttp.Call call = cartoesIdCartaoStatusGetCall(clientId, accessToken, idCartao, null, null);
        Type localVarReturnType = new TypeToken<StatusCartaoResponse>() {
        }.getType();
        return apiClient.execute(call, localVarReturnType);
    }

    /* Build call for atualizarStatusCartao */
    private com.squareup.okhttp.Call cartoesIdCartaoStatusPutCall(String clientId, String accessToken, String idCartao, SetCardStatus status, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        Object localVarPostBody = status;

        // verify the required parameter 'clientId' is set
        if (clientId == null) {
            throw new ApiException("Missing the required parameter 'clientId' when calling atualizarStatusCartao(Async)");
        }

        // verify the required parameter 'accessToken' is set
        if (accessToken == null) {
            throw new ApiException("Missing the required parameter 'accessToken' when calling atualizarStatusCartao(Async)");
        }

        // verify the required parameter 'idCartao' is set
        if (idCartao == null) {
            throw new ApiException("Missing the required parameter 'idCartao' when calling atualizarStatusCartao(Async)");
        }

        // verify the required parameter 'status' is set
        if (status == null) {
            throw new ApiException("Missing the required parameter 'status' when calling atualizarStatusCartao(Async)");
        }


        // create path and map variables
        String localVarPath = "/cartoes/{idCartao}/status".replaceAll("\\{format\\}", "json")
                .replaceAll("\\{" + "idCartao" + "\\}", apiClient.escapeString(idCartao.toString()));

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
        return apiClient.buildCall(localVarPath, "PUT", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAuthNames, progressRequestListener);
    }

    /**
     * Altera status do cartão
     * &lt;p&gt;Permite o bloqueio e desbloqueio de um determinado cartão.&lt;/p&gt;
     *
     * @param clientId    Identificador do cliente utilizado na autenticação. (required)
     * @param accessToken Token de acesso utilizado na autenticação. (required)
     * @param idCartao    Número identificador referente ao proxy localizado no verso do cartão. (required)
     * @param status      Objeto de requisição (required)
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public void atualizarStatusCartao(String clientId, String accessToken, String idCartao, SetCardStatus status) throws ApiException {
        cartoesIdCartaoStatusPutWithHttpInfo(clientId, accessToken, idCartao, status);
    }

    /**
     * Altera status do cartão
     * &lt;p&gt;Permite o bloqueio e desbloqueio de um determinado cartão.&lt;/p&gt;
     *
     * @param clientId    Identificador do cliente utilizado na autenticação. (required)
     * @param accessToken Token de acesso utilizado na autenticação. (required)
     * @param idCartao    Número identificador referente ao proxy localizado no verso do cartão. (required)
     * @param status      Objeto de requisição (required)
     * @return ApiResponse&lt;Void&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    private ApiResponse<Void> cartoesIdCartaoStatusPutWithHttpInfo(String clientId, String accessToken, String idCartao, SetCardStatus status) throws ApiException {
        com.squareup.okhttp.Call call = cartoesIdCartaoStatusPutCall(clientId, accessToken, idCartao, status, null, null);
        return apiClient.execute(call);
    }

    /* Build call for criarCartao */
    private com.squareup.okhttp.Call cartoesPostCall(String clientId, String accessToken, SetNovoCartao cartao, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        Object localVarPostBody = cartao;

        // verify the required parameter 'clientId' is set
        if (clientId == null) {
            throw new ApiException("Missing the required parameter 'clientId' when calling criarCartao(Async)");
        }

        // verify the required parameter 'accessToken' is set
        if (accessToken == null) {
            throw new ApiException("Missing the required parameter 'accessToken' when calling criarCartao(Async)");
        }

        // verify the required parameter 'cartao' is set
        if (cartao == null) {
            throw new ApiException("Missing the required parameter 'cartao' when calling criarCartao(Async)");
        }


        // create path and map variables
        String localVarPath = "/cartoes".replaceAll("\\{format\\}", "json");

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
     * Associa um número de proxy de cartão a um portador.
     * &lt;p&gt;Operação responsável por associar um número proxy de cartão a um portador.&lt;/p&gt;&lt;br/&gt; &lt;p&gt;Esse processo de liberação é assíncrono.&lt;/p&gt;
     *
     * @param clientId    Identificador do cliente utilizado na autenticação. (required)
     * @param accessToken Token de acesso utilizado na autenticação. (required)
     * @param cartao      Objeto de requisição (required)
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public void criarCartao(String clientId, String accessToken, SetNovoCartao cartao) throws ApiException {
        cartoesPostWithHttpInfo(clientId, accessToken, cartao);
    }

    /**
     * Associa um número de proxy de cartão a um portador.
     * &lt;p&gt;Operação responsável por associar um número proxy de cartão a um portador.&lt;/p&gt;&lt;br/&gt; &lt;p&gt;Esse processo de liberação é assíncrono.&lt;/p&gt;
     *
     * @param clientId    Identificador do cliente utilizado na autenticação. (required)
     * @param accessToken Token de acesso utilizado na autenticação. (required)
     * @param cartao      Objeto de requisição (required)
     * @return ApiResponse&lt;Void&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    private ApiResponse<Void> cartoesPostWithHttpInfo(String clientId, String accessToken, SetNovoCartao cartao) throws ApiException {
        com.squareup.okhttp.Call call = cartoesPostCall(clientId, accessToken, cartao, null, null);
        return apiClient.execute(call);
    }
}
