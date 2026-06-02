package com.bati.tests;

import com.bati.config.ApiConfig;
import io.restassured.RestAssured;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import static io.restassured.RestAssured.given;
import static org.hamcrest.Matchers.equalTo;
import static org.hamcrest.Matchers.greaterThan;

public class ProductsIT {

    @BeforeAll
    static void setup() {
        RestAssured.baseURI = ApiConfig.BASE_URL;
    }

    @Test
    void shouldReturnAllProducts() {
        given()
                .when()
                .get("/products")
                .then()
                .statusCode(200)
                .body("size()", greaterThan(0));
    }

    @Test
    void shouldReturnSingleProduct() {
        given()
                .when()
                .get("/products/1")
                .then()
                .statusCode(200)
                .body("id", equalTo(1));
    }
}