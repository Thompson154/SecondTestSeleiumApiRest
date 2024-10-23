package api_rest.Tests;

import api_rest.config.ApiConfig;
import api_rest.config.ApiConfig;
import api_rest.configUSER.ApiConfigUser;
import api_rest.factoryRequest.FactoryRequest;
import org.junit.jupiter.api.Test;

public class DeleteUser extends CreateUser {

    @Test
    public void deleteUsertest() {
        request.setUrl(ApiConfigUser.DELETE_USER)
                .setHeaders(auth, valueAuth)
                .setBody(body.toString());
        response = FactoryRequest.makeRequest("delete").send(request);
        response.then().statusCode(200);

        request.setUrl(ApiConfig.CREATE_PROJECT)
                .setHeaders(auth, valueAuth)
                .setBody(body.toString());

        response = FactoryRequest.makeRequest("post").send(request);
        response.then().statusCode(404);
    }
}
