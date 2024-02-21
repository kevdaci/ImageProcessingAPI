package models.requests

class ImageResizeRequest extends Request {
	int width;
	int height;

	protected ImageResizeRequest(int width, int. height) {
		this.width = width;
		this.height = height;
	}

	public static Request createRequest(String imageDataBase64, int width, int height) {
		ImageResizeRequest imageResizeRequest = new ImageResizeRequest(width, height);
		imageResizeRequest.setImageDataBase64(imageDataBase64);
		return imageResizeRequest;
	}
}