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

	public static void printJsonResponse(HttpServletResponse httpServletResponse, response) {
		def jsonResponse = toJsonResponse(response);
		println(jsonResponse);
		setContentTypeToApplicationJson(httpServletResponse);
		PrintWriter out = httpServletResponse.getWriter();
		out.println(jsonResponse);
	}
	
}