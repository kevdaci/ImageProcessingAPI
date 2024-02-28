package models.requests;

abstract class Request {

	private String imageDataBase64;

	void setImageDataBase64(String imageDataBase64) {
		this.imageDataBase64 = imageDataBase64;
	}

	String getImageDataBase64() {
		return this.imageDataBase64;
	}

}