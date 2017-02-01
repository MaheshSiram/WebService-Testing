package com.Mahesh.utills;


public enum EndPointURL {
	
	POST("/posts");
	
	String resourcePath;
	
	EndPointURL(String resourcePath){
		this.resourcePath = resourcePath;
	}
	
	public String resourcePath(){
		return this.resourcePath;
	}
	
	public String getresourcePath(String data){
		return this.resourcePath+data;
	}
	public static void main(String[] args) {
		System.out.println(EndPointURL.POST.resourcePath());
		
		String url = URL.fixedURL+EndPointURL.POST.resourcePath;
		System.out.println(url);
	}

}


