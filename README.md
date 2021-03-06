# swagger-java-client

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
    <groupId>com.sensedia</groupId>
    <artifactId>agillitas-java-client</artifactId>
    <version>1.0.0</version>
    <scope>compile</scope>
</dependency>
```

### Gradle users

Add this dependency to your project's build file:

```groovy
compile "com.sensedia:agillitas-java-client:1.0.0"
```

### Others

At first generate the JAR by executing:

    mvn package

Then manually install the following JARs:

* target/agillitas-java-client-1.0.0.jar
* target/lib/*.jar

## Getting Started

Please follow the [installation](#installation) instruction and execute the following Java code:

```java

import io.swagger.client.*;
import io.swagger.client.auth.*;
import io.swagger.client.model.*;
import io.swagger.client.api.CartoesApi;

import java.io.File;
import java.util.*;

public class CartoesApiExample {

    public static void main(String[] args) {
        
        CartoesApi apiInstance = new CartoesApi();
        String clientId = "clientId_example"; // String | Identificador do cliente utilizado na autenticação.
        String accessToken = "accessToken_example"; // String | Token de acesso utilizado na autenticação.
        String idCartao = "idCartao_example"; // String | Número identificador referente ao proxy localizado no verso do cartão.
        LocalDate dataInicial = new LocalDate(); // LocalDate | Data inicial para a consulta (YYYY-MM-DD).
        LocalDate dataFinal = new LocalDate(); // LocalDate | Data final para a consulta (YYYY-MM-DD)..
        try {
            ExtratoResponse result = apiInstance.getExtrato(clientId, accessToken, idCartao, dataInicial, dataFinal);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println(getExtrato);
            e.printStackTrace();
        }
    }
}

```

