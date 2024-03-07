package services;

import models.requests.*;
import models.responses.*;
import models.Dimensions;

import java.awt.image.BufferedImage;
import java.awt.Image;
import java.awt.Graphics2D;
import javax.imageio.ImageIO;

class ImageResizeService extends Service {

	private static ImageResizeService imageResizeService = new ImageResizeService();

	private ImageResizeService() {}

	static ImageResizeService getInstance() {
		return this.imageResizeService;
	}

	Response processRequest(Request request) {
		ImageResizeRequest imageResizeRequest = (ImageResizeRequest) request;
		BufferedImage image = this.resizeImage(imageResizeRequest);
		Response imageResizeResponse = new ImageResizeResponse(this.encodeImageToString(image), imageResizeRequest.getDimensions());
		return imageResizeResponse;
	}

	private BufferedImage resizeImage(ImageResizeRequest request) {
		BufferedImage currentBufferedImage = this.getCurrentImageFromEncodedString(request.getImageDataBase64());
		BufferedImage resizedBufferedImage = this.createResizedImage(currentBufferedImage, request.getDimensions());
		return resizedBufferedImage;
	}

	private BufferedImage createResizedImage(BufferedImage bufferedImage, Dimensions dimensions) {
		Image resizedImage = bufferedImage.getScaledInstance(dimensions.getWidth(), dimensions.getHeight(), Image.SCALE_DEFAULT);
		BufferedImage resizedBufferedImage = new BufferedImage(dimensions.getWidth(), dimensions.getHeight(), BufferedImage.TYPE_INT_ARGB);
		Graphics2D g2d = resizedBufferedImage.createGraphics();
		g2d.drawImage(resizedImage, 0, 0, dimensions.getWidth(), dimensions.getHeight(), null);
		return resizedBufferedImage;
	}

}