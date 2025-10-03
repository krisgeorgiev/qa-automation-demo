package com.example.api;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import static io.restassured.RestAssured.*;
import static org.hamcrest.Matchers.*;

public class ApiSmokeTest {

    @BeforeAll
    static void setup() {
        baseURI = "https://jsonplaceholder.typicode.com";
    }

    @Test
    void getPostById_shouldReturnExpectedShape() {
        given()
        .when()
            .get("/posts/1")
        .then()
            .statusCode(200)
            .body("id", equalTo(1))
            .body("$", hasKey("title"))
            .body("userId", greaterThanOrEqualTo(1));
    }
}

