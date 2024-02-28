package models.responses;

import models.Dimensions;

class ImageResizeResponse extends Response {
	
	Dimensions dimensions;

	public ImageResizeResponse(String imageDataBase64, Dimensions dimensions) {
		this.setImageDataBase64(imageDataBase64);
		this.dimensions = dimensions;
	}

}