package com.bati.tests;

import com.bati.config.ApiConfig;
import io.restassured.RestAssured;
import org.junit.jupiter.api.BeforeAll;

public class BaseTest {

    @BeforeAll
    static void setup() {
        RestAssured.baseURI = ApiConfig.BASE_URL;
    }
}
