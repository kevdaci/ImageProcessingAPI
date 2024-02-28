package servlets.ImageServlet;

import javax.servlet.http.*;
import java.servlet.*;
import groovy.json.JsonOutput;
import groovy.json.JsonSlurper;
import utils.*;
import models.requests.*;
import models.responses.*;
import services.ImageResizeService;

class ImageServlet extends HttpServlet {

    private ImageResizeService imageResizeService;

    void init() {
        this.imageResizeService = ImageResizeService.getInstance(); 
    }

    void doPost(HttpServletRequest httpServletRequest, HttpServletResponse httpServletResponse) {
        Request request = RequestHandler.getImageResizeRequest(httpServletRequest);
        Response imageResizeResponse = this.imageResizeService.processRequest(request);
        ResponseHandler.printJsonResponse(httpServletResponse, imageResizeResponse);
    }

}

