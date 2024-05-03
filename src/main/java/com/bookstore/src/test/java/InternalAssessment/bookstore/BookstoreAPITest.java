package InternalAssessment.bookstore;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import io.restassured.RestAssured;
import io.restassured.http.ContentType;

public class BookstoreAPITest {
	@BeforeClass
	public void setUp() {
		RestAssured.baseURI= "https://bookstore.toolsqa.com/BookStore/v1/Books";
	}
	@Test
	public void testGetBookDetails() {
		
				RestAssured.given()
				.contentType("application/json")
				.when()
				.get("")
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
			.post("")
			.then()
			.statusCode(400);
	}
}

