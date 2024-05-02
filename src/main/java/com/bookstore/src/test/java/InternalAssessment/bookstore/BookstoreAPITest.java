package InternalAssessment.bookstore;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import io.restassured.RestAssured;
import io.restassured.http.ContentType;

public class BookstoreAPITest {
	@BeforeClass
	public void setUp() {
		RestAssured.baseURI= "https://bookstore.toolsqa.com/swagger/";
		
	}
	@Test
	public void testGetBookDetails() {
		
				RestAssured.given()
				.contentType("application/json")
				.when()
				.get("baseURI+\"/Books\"")
				.then()
				.statusCode(200)
				.log().all();
					
	}

	@Test
	public void postBookDetails() {
		String book="Harry Potter";
			RestAssured.given()
			.contentType("application/json")
			.body(book)
			.when()
			.post("baseURI+\"/Books\"")
			.then()
			.statusCode(400);
	}
}

