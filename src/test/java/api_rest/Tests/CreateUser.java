package api_rest.Tests;

import api_rest.configUSER.ApiConfigUser;
import api_rest.factoryRequest.FactoryRequest;
import api_rest.factoryRequest.RequestInfo;
import io.restassured.response.Response;
import org.json.JSONObject;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class CreateUser {

    public RequestInfo request = new RequestInfo();
    public Response response;
    public String auth="";
    public String valueAuth="";
    public JSONObject body = new JSONObject();

    @Test
    @DisplayName("Verify Create User")
    public void createUserTest() {
        body.put("Email","Thompson@email.com");
        body.put("FullName","Thompson");
        body.put("Password","root1234");
        request.setUrl(ApiConfigUser.CREATE_USER)
                .setBody(body.toString());
        response = FactoryRequest.makeRequest("post").send(request);
        response.then().assertThat().statusCode(200);
    }
}
