package apitest;

import org.testng.annotations.Test;
import static io.restassured.RestAssured.*;
import static io.restassured.matcher.RestAssuredMatchers.*;
import static org.hamcrest.Matchers.*;
public class FirstTest {
    public String BaseURL = "http://reqres.in/";
    @Test
    public void getUsers(){

        given().baseUri("http://reqres.in/")
        .when()
                .get("/api/users?page=2")
        .then()
                .statusCode(200)
        .log().all();
    }

}
