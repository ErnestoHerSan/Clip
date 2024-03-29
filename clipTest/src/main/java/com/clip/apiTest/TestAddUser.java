package com.clip.apiTest;

import java.util.logging.Logger;

import org.junit.Assert;
import org.junit.Test;

import com.clip.model.ApiResponseAddUser;
import com.google.gson.Gson;

import io.restassured.RestAssured;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;

public class TestAddUser {

	Logger Log = Logger.getLogger("TestGetList");
	String url="https://clip-automation-practice.free.beeceptor.com";

	@Test
	public void postAddUserCode() {
		RestAssured.baseURI = url;
		RequestSpecification request = RestAssured.given();
		request.header("Content-Type", "application/json");
		Response response = request.post("/addUser");

		Log.info("Response code: "+response.getStatusCode());
		Assert.assertEquals(200, response.getStatusCode());
	}

	@Test
	public void postAddUserBody() {
		RestAssured.baseURI = url;
		RequestSpecification request = RestAssured.given();
		request.header("Content-Type", "application/json");
		Response response = request.post("/addUser");

		Gson gson = new Gson();
		ApiResponseAddUser[] users = gson.fromJson(response.asString(),ApiResponseAddUser[].class);

		Log.info("Response status: "+users[0].status);
		Assert.assertEquals(100, users[0].status);
	}

	@Test
	public void postAddUserMessage() {
		RestAssured.baseURI = url;
		RequestSpecification request = RestAssured.given();
		request.header("Content-Type", "application/json");
		Response response = request.post("/addUser");

		Gson gson = new Gson();
		ApiResponseAddUser[] users = gson.fromJson(response.asString(),ApiResponseAddUser[].class);

		Log.info("Response message: "+users[0].message);
		Assert.assertEquals("User added", users[0].message);
	}

}
