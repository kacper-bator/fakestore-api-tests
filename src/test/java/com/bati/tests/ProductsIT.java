package com.bati.tests;

import com.bati.api.ProductApi;
import org.junit.jupiter.api.Test;

import static org.hamcrest.Matchers.equalTo;
import static org.hamcrest.Matchers.greaterThan;

public class ProductsIT extends BaseTest {

    private final ProductApi productsApi = new ProductApi();

    @Test
    void shouldReturnAllProducts() {
        productsApi.getAll()
                .then()
                .statusCode(200)
                .body("size()", greaterThan(0));
    }

    @Test
    void shouldReturnSingleProduct() {
        productsApi.getById(1)
                .then()
                .statusCode(200)
                .body("id", equalTo(1));
    }
}