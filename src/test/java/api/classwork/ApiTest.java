package api.classwork;

import io.restassured.RestAssured;
import org.junit.Test;

public class ApiTest {


    @Test
    public void testMethod() {

        String name = "a";

        RestAssured
                .given()
                .spec(BaseSteps.REQUEST_SPECIFICATION)
                .body(new Search(name, true))
                .when()
                .post()
                .then()
                .extract().body().as(Data.class).getData().get(0).equals(BaseSteps.getUser(name));

    }


    @Test
    public void shortNameSearch() {

        String name = "berta";

        RestAssured
                .given()
                .spec(BaseSteps.REQUEST_SPECIFICATION)
                .body(new Search(name, true))
                .when()
                .post()
                .then()
                .extract().body().as(Data.class).getData().get(0).equals(BaseSteps.getUser(name));

    }

    @Test
    public void longNameSearch() {

        String name = "Saldo Rush";

        RestAssured
                .given()
                .spec(BaseSteps.REQUEST_SPECIFICATION)
                .body(new Search(name, true))
                .when()
                .post()
                .then()
                .extract().body().as(Data.class).getData().get(0).equals(BaseSteps.getUserRealName(name));

    }

    @Test
    public void partialSearch() {

        String name = "rang";

        RestAssured
                .given()
                .spec(BaseSteps.REQUEST_SPECIFICATION)
                .body(new Search(name, false))
                .when()
                .post()
                .then()
                .extract().body().as(Data.class).getData().get(0).equals(BaseSteps.getUserPartial(name));


    }

    @Test
    public void partialSearchLongName() {

        String name = "Sal";

        RestAssured
                .given()
                .spec(BaseSteps.REQUEST_SPECIFICATION)
                .body(new Search(name, false))
                .when()
                .post()
                .then()
                .extract().body().as(Data.class).getData().get(0).equals(BaseSteps.getUserRealNamePartial(name));

    }


}