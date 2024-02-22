package servlets.ImageServlet;

import javax.servlet.http.*;
import java.servlet.*;
import groovy.json.JsonOutput;
import groovy.json.JsonSlurper;
import utils.*;
import models.requests.*;

class ImageServlet extends HttpServlet {

    void doPost(HttpServletRequest request, HttpServletResponse response) {
        Request imageResizeRequest = RequestHandler.getImageResizeRequest(request);
        ResponseHandler.printJsonResponse(response, imageResizeRequest);
    }

}

