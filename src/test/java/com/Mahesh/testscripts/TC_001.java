package com.Mahesh.testscripts;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import com.jayway.restassured.response.Response;



public class TC_001 {

	Response response;
	
	@BeforeClass
	public void steup(){
		
	}
	@Test(priority = 0)
	public void Get(){
		
		String url = com.Mahesh.utills.URL.fixedURL+com.Mahesh.utills.EndPointURL.POST.resourcePath();
		response = com.Mahesh.webservices.webservices.Get(url);
		System.out.println(response.getBody().asString());
		System.out.println("******************************************************************");
}
	

	@Test(priority = 1)
	public void Post(){
		
		String url = com.Mahesh.utills.URL.fixedURL+com.Mahesh.utills.EndPointURL.POST.resourcePath();
		response = com.Mahesh.webservices.webservices.Post(url);
		System.out.println(response.getBody().asString());
		
	}

}
