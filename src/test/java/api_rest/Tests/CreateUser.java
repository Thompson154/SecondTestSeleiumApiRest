package api_rest.Tests;

import api_rest.configUSER.ApiConfigUser;
import api_rest.factoryRequest.FactoryRequest;
import api_rest.factoryRequest.RequestInfo;
import io.restassured.response.Response;
import org.json.JSONObject;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.util.Base64;
import java.util.Date;

import static org.hamcrest.Matchers.equalTo;

public class CreateUser {

    public RequestInfo request = new RequestInfo();
    public Response response;
    public String auth="Thompson" + + new Date().getTime() +"@email.com";
    public String valueAuth="root1234";
    public JSONObject body = new JSONObject();



//    @BeforeEach
//    public void before() {
//        body.put("Content","Thompson");
//        auth="Authorization";
//        valueAuth="Basic "+ Base64.getEncoder().encodeToString((auth+":"+valueAuth).getBytes());
//    }
//
//    @AfterEach
//    public void after() {
//    }

    @Test
    @DisplayName("Verify Create User")
    public void createUserTest() {
        body.put("Email",auth);
        body.put("FullName","Thompson" + new Date().getTime());
        body.put("Password",valueAuth);
        request.setUrl(ApiConfigUser.CREATE_USER)
                .setBody(body.toString());
        response = FactoryRequest.makeRequest("post").send(request);
        response.then().statusCode(200).body("Email",equalTo(body.get("Email")));
        response.then().assertThat().statusCode(200);
    }
}
