package com.clip.apiTest;


import java.util.logging.Logger;

import org.junit.Assert;
import org.junit.Test;

import com.clip.model.ApiResponseGetList;
import com.google.gson.Gson;

import io.restassured.RestAssured;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;

public class TestGetList {

	Logger Log = Logger.getLogger("TestGetList");
	String url="https://clip-automation-practice.free.beeceptor.com";

	@Test 
	public void requestGetListCode() {
		RestAssured.baseURI = url;
		RequestSpecification httpRequest = RestAssured.given();
		Response response = httpRequest.get("/getList");
		int statusCode = response.getStatusCode();
		System.out.println(response.asString());
		Log.info("Response code: "+statusCode);
		Assert.assertEquals(200, statusCode);
	}

	@Test
	public void requestGetListAge() {
		RestAssured.baseURI = url;
		RequestSpecification httpRequest = RestAssured.given();
		Response response = httpRequest.get("/getList");
		Gson gson = new Gson();
		ApiResponseGetList[] persons = gson.fromJson(response.asString(),ApiResponseGetList[].class);
		Log.info("Response Age: "+persons[1].age);
		Assert.assertEquals(26, persons[1].age);
	}

	@Test
	public void requestGetListName() {
		RestAssured.baseURI = url;
		RequestSpecification httpRequest = RestAssured.given();
		Response response = httpRequest.get("/getList");
		Gson gson = new Gson();
		ApiResponseGetList[] persons = gson.fromJson(response.asString(),ApiResponseGetList[].class);
		Log.info("Respose name: "+persons[0].name);
		Assert.assertEquals("Pedro", persons[0].name);
	}

	@Test
	public void requestGetListSurname() {
		RestAssured.baseURI = url;
		RequestSpecification httpRequest = RestAssured.given();
		Response response = httpRequest.get("/getList");
		Gson gson = new Gson();
		ApiResponseGetList[] persons = gson.fromJson(response.asString(),ApiResponseGetList[].class);
		Log.info("Response surname: "+persons[2].surname);
		Assert.assertEquals("Diana", persons[2].surname);
	}

}
