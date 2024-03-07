package services;

import models.requests.Request;
import models.responses.Response;

import java.util.Base64;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.awt.image.BufferedImage;
import javax.imageio.ImageIO;

abstract class Service {

	abstract Response processRequest(Request request);

	BufferedImage getCurrentImageFromEncodedString(String encodedImageString) {
		String base64ImageData = encodedImageString.split(",")[1];
		byte[] imageBytes = Base64.getDecoder().decode(base64ImageData.getBytes());
		BufferedImage image = ImageIO.read(new ByteArrayInputStream(imageBytes));
		return image;
	}

	String encodeImageToString(BufferedImage bufferedImage) {
		ByteArrayOutputStream byteArrayOuputStream = new ByteArrayOutputStream();
		ImageIO.write(bufferedImage, "png", byteArrayOuputStream);
		return Base64.getEncoder().encodeToString(byteArrayOuputStream.toByteArray());
	}


}