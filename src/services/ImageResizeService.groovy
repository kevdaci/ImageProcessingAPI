package services;

import models.requests.*;
import models.responses.*;

class ImageResizeService {

	private static ImageResizeService imageResizeService = new ImageResizeService();

	private ImageResizeService() {

	}

	static ImageResizeService getInstance() {
		return this.imageResizeService;
	}

	Response processRequest(Request request) {
		ImageResizeRequest imageResizeRequest = (ImageResizeRequest) request;
		Response imageResizeResponse = new ImageResizeResponse(imageResizeRequest.getImageDataBase64() + "abc", imageResizeRequest.getDimensions());
		return imageResizeResponse;
	}
}