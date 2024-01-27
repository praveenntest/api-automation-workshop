package clients;
import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import io.restassured.response.Response;

public class UserClient {
    public Response createUser(String email, String password) {
        String signUpEndpointResource = "/api/auth/signup";
        // String email = "maardaela734@hello.com";
        // String password = "8447_22@11s";

        String signUpRequestBody = String.format("{\"email\": \"%s\", \"password\": \"%s\"}", email, password);
        Response signupresponse = RestAssured.given()
                .contentType(ContentType.JSON)
                .body(signUpRequestBody)
                .post(signUpEndpointResource);

        return  signupresponse;
    }
}