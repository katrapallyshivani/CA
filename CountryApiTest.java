import org.testng.annotations.Test;
import static io.restassured.RestAssured.*;
import static org.hamcrest.Matchers.*;

public class CountryApiTest {
    private static final String BASE_URL = "https://restcountries.com/v3.1/alpha/";

    @Test
    public void testPositiveCase() {
        given()
            .when()
                .get(BASE_URL + "co")
            .then()
                .statusCode(200)
                .body("name", equalTo("Colombia"));
    }

    @Test
    public void testNegativeCase() {
        given()
            .when()
                .get(BASE_URL + "xyz")
            .then()
                .statusCode(404);
    }
}
