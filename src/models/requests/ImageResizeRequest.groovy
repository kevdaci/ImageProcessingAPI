package models.requests;

import models.Dimensions;

class ImageResizeRequest extends Request {
	
	Dimensions dimensions;

	protected ImageResizeRequest(Dimensions dimensions) {
		this.dimensions = dimensions;
	}

	static Request createRequest(String imageDataBase64, Dimensions dimensions) {
		ImageResizeRequest imageResizeRequest = new ImageResizeRequest(dimensions);
		imageResizeRequest.setImageDataBase64(imageDataBase64);
		return imageResizeRequest;
	}

	static Request createRequest(jsonRequest) {
		def jsonRequestDimensions = jsonRequest["dimensions"];
		Dimensions dimensions = new Dimensions(width: jsonRequestDimensions["width"], height: jsonRequestDimensions["height"]);
		return createRequest(jsonRequest["imageDataBase64"], dimensions);
	}

	Dimensions getDimensions() {
		return this.dimensions;
	}

	void setDimensions(Dimensions dimensions) {
		this.dimensions = dimensions;
	}
	
}