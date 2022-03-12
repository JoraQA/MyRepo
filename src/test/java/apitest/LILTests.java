package apitest;
import org.testng.annotations.Test;

import static io.restassured.RestAssured.given;


public class LILTests {
    @Test
    public void getProductTest() {
            String baseUrl = "localhost";
            String endpoint = "/api_testing/product/read.php";
            given().baseUri(baseUrl).when().get(endpoint).then();

    }
}


