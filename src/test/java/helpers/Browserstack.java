package helpers;

import io.restassured.http.ContentType;

import static io.restassured.RestAssured.given;
import static io.restassured.http.ContentType.JSON;

public class Browserstack {
    public static String videoUrl(String sessionId) {
        return given()
                .auth().basic("bsuser_2WcU64", "SampPkf1nDM6pEjiM386")
                .when()
                .get("https://api-cloud.browserstack.com/app-automate/sessions/" + sessionId +".json")
                .then()
                .statusCode(200)
                .extract()
                .path("automation_session.video_url");
    }
}
