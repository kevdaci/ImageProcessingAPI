package utils;

import javax.servlet.http.*;
import groovy.json.JsonSlurper;
import models.requests.*;


class RequestHandler {

	public static def getRequestBody(HttpServletRequest httpServletRequest) {
		StringBuilder sb = new StringBuilder();
		def requestString = httpServletRequest.getReader().lines();
		requestString.each( { sb.append(it) } );
		def jsonSlurper = new JsonSlurper();
		def json = jsonSlurper.parseText(sb.toString());
		return json;
	}

	public static Request getImageResizeRequest(HttpServletRequest httpServletRequest) {
		def requestBody = getRequestBody(httpServletRequest);
		Request imageResizeRequest = ImageResizeRequest.createRequest(requestBody);
		return imageResizeRequest;
	}

}