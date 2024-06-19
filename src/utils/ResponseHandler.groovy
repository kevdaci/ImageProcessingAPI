package utils;

import javax.servlet.http.*;
import groovy.json.JsonOutput;

class ResponseHandler {

	private static void setContentTypeToApplicationJson(HttpServletResponse httpServletResponse) {
		httpServletResponse.setContentType("application/json");
	}

	private static def toJsonResponse(response) {
		return JsonOutput.toJson(response);
	}

	static void printJsonResponse(HttpServletResponse httpServletResponse, response) {
		setContentTypeToApplicationJson(httpServletResponse);
		def jsonResponse = toJsonResponse(response);
		println("Response: " + jsonResponse);
		PrintWriter out = httpServletResponse.getWriter();
		out.println(jsonResponse);
	}
	
}