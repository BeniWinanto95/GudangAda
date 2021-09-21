import io.restassured.RestAssured;
import io.restassured.response.Response;
import org.junit.Assert;
import org.junit.Test;

public class ApiTest {

    @Test
    void testGet(){

        Response response = RestAssured.get("localhost8080:/driver/registration/status/check?email={email}");

        System.out.println("Response : "+response.asString());
        System.out.println("Status Code : "+response.getStatusCode());
        System.out.println("Body : "+response.getBody());

        int statusCode = response.getStatusCode();
        Assert.assertEquals(statusCode, 200);
    }

    @Test
    void postCreate(){

        RestAssured.post("localhost:8080/driver/registration/create/");

        String body = "\"email\": \"test@yopmail.com\",\n" +
                "    \"password\": \"test\",\n" +
                "    \"phone_number\": \"08124546655\",\n" +
                "    \"name\": \"tester\",\n" +
                "    \"date_of_birth\": \"1995-01-11\",\n" +
                "    \"license_type\": \"SIM A\",\n" +
                "    \"license_expiry_date\": \"2021-01-11\",\n" +
                "    \"preferred_region\": \"JAKARTA\"";

        RestAssured.post(body).getStatusCode();
    }

    @Test
    void postCreate1(){

        RestAssured.post("localhost:8080/driver/registration/create/");

        String body = "\"email\": \"test!yopmail.com\",\n" +
                "    \"password\": \"test\",\n" +
                "    \"phone_number\": \"08124546655\",\n" +
                "    \"name\": \"tester\",\n" +
                "    \"date_of_birth\": \"1995-01-11\",\n" +
                "    \"license_type\": \"SIM A\",\n" +
                "    \"license_expiry_date\": \"2021-01-11\",\n" +
                "    \"preferred_region\": \"JAKARTA\"";

        RestAssured.post(body).getStatusCode();
    }

    @Test
    void postCreate2(){

        RestAssured.post("localhost:8080/driver/registration/create/");

        String body = "\"email\": \"\",\n" +
                "    \"password\": \"test\",\n" +
                "    \"phone_number\": \"08124546655\",\n" +
                "    \"name\": \"tester\",\n" +
                "    \"date_of_birth\": \"1995-01-11\",\n" +
                "    \"license_type\": \"SIM A\",\n" +
                "    \"license_expiry_date\": \"2021-01-11\",\n" +
                "    \"preferred_region\": \"JAKARTA\"";

        RestAssured.post(body).getStatusCode();
    }

    @Test
    void postCreate3(){

        RestAssured.post("localhost:8080/driver/registration/create/");

        String body = "\"email\": \"test@yopmail.com\",\n" +
                "    \"password\": \"\",\n" +
                "    \"phone_number\": \"08124546655\",\n" +
                "    \"name\": \"tester\",\n" +
                "    \"date_of_birth\": \"1995-01-11\",\n" +
                "    \"license_type\": \"SIM A\",\n" +
                "    \"license_expiry_date\": \"2021-01-11\",\n" +
                "    \"preferred_region\": \"JAKARTA\"";

        RestAssured.post(body).getStatusCode();
    }

    @Test
    void postCreate4(){

        RestAssured.post("localhost:8080/driver/registration/create/");

        String body = "\"email\": \"test@yopmail.com\",\n" +
                "    \"password\": \"test\",\n" +
                "    \"phone_number\": \"08124546655\",\n" +
                "    \"name\": \"tester\",\n" +
                "    \"date_of_birth\": \"1995-01-11\",\n" +
                "    \"license_type\": \"SIM A\",\n" +
                "    \"license_expiry_date\": \"2021-01-11\",\n" +
                "    \"preferred_region\": \"JAKARTA\"";

        RestAssured.post(body).getStatusCode();
    }

    @Test
    void postCreate5(){

        RestAssured.post("localhost:8080/driver/registration/create/");

        String body = "\"email\": \"test@yopmail.com\",\n" +
                "    \"password\": \"test\",\n" +
                "    \"phone_number\": \"08124\",\n" +
                "    \"name\": \"tester\",\n" +
                "    \"date_of_birth\": \"1995-01-11\",\n" +
                "    \"license_type\": \"SIM A\",\n" +
                "    \"license_expiry_date\": \"2021-01-11\",\n" +
                "    \"preferred_region\": \"JAKARTA\"";

        RestAssured.post(body).getStatusCode();
    }

    @Test
    void postCreate6(){

        RestAssured.post("localhost:8080/driver/registration/create/");

        String body = "\"email\": \"test@yopmail.com\",\n" +
                "    \"password\": \"test\",\n" +
                "    \"phone_number\": \"08124546651212135\",\n" +
                "    \"name\": \"tester\",\n" +
                "    \"date_of_birth\": \"1995-01-11\",\n" +
                "    \"license_type\": \"SIM A\",\n" +
                "    \"license_expiry_date\": \"2021-01-11\",\n" +
                "    \"preferred_region\": \"JAKARTA\"";

        RestAssured.post(body).getStatusCode();
    }

    @Test
    void postCreate7(){

        RestAssured.post("localhost:8080/driver/registration/create/");

        String body = "\"email\": \"test@yopmail.com\",\n" +
                "    \"password\": \"test\",\n" +
                "    \"phone_number\": \"\",\n" +
                "    \"name\": \"tester\",\n" +
                "    \"date_of_birth\": \"1995-01-11\",\n" +
                "    \"license_type\": \"SIM A\",\n" +
                "    \"license_expiry_date\": \"2021-01-11\",\n" +
                "    \"preferred_region\": \"JAKARTA\"";

        RestAssured.post(body).getStatusCode();
    }

    @Test
    void postCreate8(){

        RestAssured.post("localhost:8080/driver/registration/create/");

        String body = "\"email\": \"test@yopmail.com\",\n" +
                "    \"password\": \"test\",\n" +
                "    \"phone_number\": \"08124546655\",\n" +
                "    \"name\": \"tester123\",\n" +
                "    \"date_of_birth\": \"1995-01-11\",\n" +
                "    \"license_type\": \"SIM A\",\n" +
                "    \"license_expiry_date\": \"2021-01-11\",\n" +
                "    \"preferred_region\": \"JAKARTA\"";

        RestAssured.post(body).getStatusCode();
    }

    @Test
    void postCreate9(){

        RestAssured.post("localhost:8080/driver/registration/create/");

        String body = "\"email\": \"test@yopmail.com\",\n" +
                "    \"password\": \"test\",\n" +
                "    \"phone_number\": \"08124546655\",\n" +
                "    \"name\": \"tester\",\n" +
                "    \"date_of_birth\": \"\",\n" +
                "    \"license_type\": \"SIM A\",\n" +
                "    \"license_expiry_date\": \"2021-01-11\",\n" +
                "    \"preferred_region\": \"JAKARTA\"";

        RestAssured.post(body).getStatusCode();
    }

    @Test
    void postCreate10(){

        RestAssured.post("localhost:8080/driver/registration/create/");

        String body = "\"email\": \"test@yopmail.com\",\n" +
                "    \"password\": \"test\",\n" +
                "    \"phone_number\": \"08124546655\",\n" +
                "    \"name\": \"tester\",\n" +
                "    \"date_of_birth\": \"1995-01-11\",\n" +
                "    \"license_type\": \"\",\n" +
                "    \"license_expiry_date\": \"2021-01-11\",\n" +
                "    \"preferred_region\": \"JAKARTA\"";

        RestAssured.post(body).getStatusCode();
    }

    @Test
    void postCreate11(){

        RestAssured.post("localhost:8080/driver/registration/create/");

        String body = "\"email\": \"test@yopmail.com\",\n" +
                "    \"password\": \"test\",\n" +
                "    \"phone_number\": \"08124546655\",\n" +
                "    \"name\": \"tester\",\n" +
                "    \"date_of_birth\": \"1995-01-11\",\n" +
                "    \"license_type\": \"SIM A\",\n" +
                "    \"license_expiry_date\": \"\",\n" +
                "    \"preferred_region\": \"JAKARTA\"";

        RestAssured.post(body).getStatusCode();
    }

    @Test
    void postLogin(){

        RestAssured.post("localhost:8080/driver/login/");

        String body = "{\n" +
                "  \"email\": \"tester@yopmail.com\",\n" +
                "  \"password\": \"1995-01-11\"\n" +
                "}";

        RestAssured.post(body).getStatusCode();
    }

    @Test
    void postLogin1(){

        RestAssured.post("localhost:8080/driver/login/");

        String body = "{\n" +
                "  \"email\": \"tester#yopmail.com\",\n" +
                "  \"password\": \"1995-01-11\"\n" +
                "}";

        RestAssured.post(body).getStatusCode();
    }

    @Test
    void postLogin2(){

        RestAssured.post("localhost:8080/driver/login/");

        String body = "{\n" +
                "  \"email\": \"\",\n" +
                "  \"password\": \"1995-01-11\"\n" +
                "}";

        RestAssured.post(body).getStatusCode();
    }

    @Test
    void postLogin3(){

        RestAssured.post("localhost:8080/driver/login/");

        String body = "{\n" +
                "  \"email\": \"tester@yopmail.com\",\n" +
                "  \"password\": \"\"\n" +
                "}";

        RestAssured.post(body).getStatusCode();
    }
}