package com.rv.product_service;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.web.server.LocalServerPort;
import org.springframework.test.web.reactive.server.WebTestClient;

import static org.springframework.boot.test.context.SpringBootTest.WebEnvironment.RANDOM_PORT;

//@SpringBootTest(webEnvironment = RANDOM_PORT)
class ProductServiceApplicationTests {

    @LocalServerPort
    private int port;

    private WebTestClient webTestClient() {
        return WebTestClient.bindToServer()
                .baseUrl("http://localhost:" + port)
                .build();
    }


    //@Test
    void get200() {
        int PRODUCT_ID = 1;
        webTestClient().get()
                .uri("/product/" + PRODUCT_ID)
                .exchange()
                .expectStatus().isOk()
                .expectHeader().contentType("application/json")
                .expectBody()
                .jsonPath("$.productId").isEqualTo(1);

    }

    //@Test
    void get404() {
        int PRODUCT_ID = 1;
        webTestClient().get()
                .uri("/product/")
                .exchange()
                .expectStatus().isNotFound()
                .expectHeader().contentType("application/json")
                .expectBody();


    }

}
