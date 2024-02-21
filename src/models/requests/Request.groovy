package models.requests;

public abstract class Request {
	private String imageDataBase64;

	public void setImageDataBase64(String imageDataBase64) {
		this.imageDataBase64 = imageDataBase64;
	}

	public String getImageDataBase64() {
		return this.imageDataBase64;
	}

}