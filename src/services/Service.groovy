package services;

import models.requests.Request;
import models.responses.Response;

abstract class Service {

	abstract Response processRequest(Request request);

}