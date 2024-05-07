package Assessmentquestionone;

import java.io.File;
import java.util.HashMap;
import java.util.Map;
import static org.hamcrest.Matchers.equalTo;
import org.testng.annotations.Test;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import io.restassured.response.Response;
public class AssessmentApiQuestion {

	private static final String Base_URL = "https://reqres.in";
	private static final String USERS_ENDPOINT = "/api/users";
	@Test
	public void createUserWithHashMap(){
	HashMap<String, Object>	requestBody = new HashMap<>();
	requestBody.put("name","Ashwini");
	requestBody.put("job", "Engineer");
	
	RestAssured.given()
				.contentType("application/JSON")
				.body(requestBody)
				.when()
				.post(Base_URL + USERS_ENDPOINT)
				.then()
				.statusCode(201)
				.log().all()
				.body("name",equalTo("Ashwini"))
				.body("job",equalTo("Engineer"));
	  getUser();
      updateUser();
      deleteUser();
	}
	
	@Test
	public void createUserUsingPojoClass() {
		
		User user = new User("Ashwini", "Engineer");
		RestAssured.given()
		.contentType("application/JSON")
		.body(user)
		.when()
		.post(Base_URL + USERS_ENDPOINT)
		.then()
		.statusCode(201)
		.log().all()
		.body("name",equalTo("Ashwini"))
		.body("job", equalTo("Engineer"));
		getUser();
		updateUser();
	    deleteUser();
	}
	@Test
	public void createUserUsingJsonFileData() {
		
		File jsonFile = new File("C:\\Users\\Ashwchau\\eclipse-workspace\\InternalAssessment\\src\\test\\java\\Files\\User.json");
		RestAssured.given()
		.contentType("application/JSON")
		.body(jsonFile)
		.when()
		.post(Base_URL + USERS_ENDPOINT)
		.then()
		.statusCode(201);
		getUser();
		updateUser();
	    deleteUser();
		}


	public class User{
		private String name;
		private String job;
		public User(String name,String job) {
			this.name= name;
			this.job = job;
		}
		public String getName() {
			return name;
		}
		public void setName(String name) {
			this.name = name;
		}
		public String getJob() {
			return job;
		}
		public void setJob(String job) {
			this.job = job;
		}
	}

	public void getUser() {
		Response response = RestAssured.given()
		.when()
		.get(Base_URL + "/api/users/1");
		response.then()
		.statusCode(200)
		.log().all()
		.body("data.id", equalTo(1))
		.body("data.first_name", equalTo("George"))
		.body("data.last_name", equalTo("Bluth"));
	}
	private void updateUser() {
        Map<String, Object> updatedData = new HashMap<>();
        updatedData.put("name", "Ashok");
        updatedData.put("job", "Senior Engineer");

        RestAssured.given()
            .contentType("application/JSON")
            .body(updatedData)
        .when()
            .put(Base_URL + "/api/users/1")
        .then()
            .statusCode(200)
            .log().all()
            .body("name", equalTo("Ashok"))
            .body("job", equalTo("Senior Engineer"));
    }

    private void deleteUser() {
        RestAssured.given()
        .when()
            .delete(Base_URL + "/api/users/1")
        .then()
            .statusCode(204)
            .log().all();
    }

	}

