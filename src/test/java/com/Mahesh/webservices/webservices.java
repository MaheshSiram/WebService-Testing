package com.Mahesh.webservices;

import com.jayway.restassured.RestAssured;
import com.jayway.restassured.http.ContentType;
import com.jayway.restassured.response.Response;
import com.jayway.restassured.specification.RequestSpecification;

public class webservices {

	public static Response Get(String URI) {

		RequestSpecification requestSpecification = RestAssured.given();

		requestSpecification.contentType(ContentType.JSON);

		Response response = requestSpecification.get(URI);

		return response;
	}

	public static Response Post(String URI) {

		RequestSpecification requestSpecification = RestAssured.given();

		requestSpecification.content(ContentType.JSON);

		Response response = requestSpecification.post(URI);

		return response;
	}

}
