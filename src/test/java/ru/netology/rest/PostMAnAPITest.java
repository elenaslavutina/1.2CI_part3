package ru.netology.rest;

import org.junit.jupiter.api.Test;

import static io.restassured.RestAssured.given;
import static org.hamcrest.Matchers.equalTo;

public class PostMAnAPITest {
    @Test
    public void shouldPost(){
        given()
                .baseUri("https://postman-echo.com")
                .body( "Herman Melville" )

        // отправляемые данные (заголовки и query можно выставлять аналогично)
// Выполняемые действия
                .when()
                .post("/post")
// Проверки
                .then()
                .log().all()
                .statusCode(200)
                .body("data", equalTo("Herman Melville"))

        ;
    }
}
