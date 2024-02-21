package servlets.ImageServlet;

import javax.servlet.http.*;
import java.servlet.*;
import groovy.json.JsonOutput;
import groovy.json.JsonSlurper;
import utils.ResponseHandler;

class ImageServlet extends HttpServlet {

    void doGet(HttpServletRequest request, HttpServletResponse response) {
        def map = ["Mario": 23, "Luigi": 32];
        ResponseHandler.printJsonResponse(response, map);
    }

    void doPost(HttpServletRequest request, HttpServletResponse response) {
        
    }

}

