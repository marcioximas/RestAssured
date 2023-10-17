import functions.Requests;
import org.hamcrest.Matchers;
import org.testng.annotations.Test;

import java.io.IOException;

import static io.restassured.RestAssured.given;

public class TestsRequests  extends Requests {
    //wrong way
    @Test
    public void requisition_get(){
    given()
            .when()
            .get("https://regres.in/api/user/2")
            .then().log().body().body("data.id", Matchers.equalTo(2));
    }


    @Test
    public void request_get() throws IOException {
      System.out.println(getProps("base"));
    }

}
