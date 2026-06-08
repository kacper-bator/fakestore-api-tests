package com.bati.api;

import io.restassured.response.Response;

import static io.restassured.RestAssured.given;

public class ProductApi {

    public Response getAll() {
        return given()
                .when()
                .get("/products");
    }

    public Response getById(int id) {
        return given()
                .when()
                .get("/products/" + id);
    }
}
