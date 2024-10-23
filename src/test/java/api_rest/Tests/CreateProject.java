package api_rest.Tests;

import api_rest.config.ApiConfig;
import api_rest.factoryRequest.FactoryRequest;
import org.junit.jupiter.api.Test;
import selenium_todoist.testSuite.CreateTask;

import static org.hamcrest.Matchers.equalTo;

public class CreateProject extends CreateUser {

    @Test
    public void createProject5times() {
        for (int i = 0; i < 5; i++) {
            request.setUrl(ApiConfig.CREATE_PROJECT)
                    .setHeaders(auth, valueAuth)
                    .setBody(body.toString());

            response = FactoryRequest.makeRequest("post").send(request);
            response.then().statusCode(200);

            String id = response.then().extract().path("Id") + "";

            request.setUrl(ApiConfig.DELETE_PROJECT.replace("{id}", id));
            response = FactoryRequest.makeRequest("delete").send(request);
            response.then().statusCode(200).body("Deleted", equalTo(true));
        }
    }

}
