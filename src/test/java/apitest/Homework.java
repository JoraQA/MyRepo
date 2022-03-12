package apitest;

import org.testng.annotations.Test;


import static io.restassured.RestAssured.baseURI;
import static io.restassured.RestAssured.given;
import static org.hamcrest.Matchers.equalTo;

public class Homework {
    @Test
    public void getProductTest() {
        String endpoint = "/public/v2/users";
        given().baseUri("https://gorest.co.in").queryParam("id", 2)
                .when().get(endpoint).
                then().assertThat().log().body().statusCode(200).log();

    }
         @Test
                 public void createProductTest(){
             String endpoint="/public/v2/users";
             String requestBody= """
                     { "email":"a@a.a",
                      "name":"AAA",
                       "gender" : "male",
                        "status":"active" }
                     """;
             var response = given().baseUri("https://gorest.co.in").body(requestBody)
                     .when().post(endpoint)
                     .then().log().body();
        }
        @Test
     public  void editProductTest(){
        String endpoint="/public/v2/users";
        String requestBody= """
                { "id": 25,
                { "email":"a@a.a",
                "name":"AAA",
                 "gender" : "male",
                "status":"active"
                "category_id": 4
                }
                """;
            var response = given().baseUri("https://gorest.co.in").body(requestBody)
                    .when().put("/public/v2/users")
                    .then().log().body();
        }
}
