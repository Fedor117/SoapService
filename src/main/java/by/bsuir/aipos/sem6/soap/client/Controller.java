package by.bsuir.aipos.sem6.soap.client;

import by.bsuir.aipos.sem6.soap.artifacts.SoapService;
import by.bsuir.aipos.sem6.soap.artifacts.SoapServiceService;

/**
 * Created by Dzmitry Saladukha on 15.04.2016.
 */
public class Controller {
    private SoapService soapService;

    public Controller() {
        SoapServiceService soapServiceService = new SoapServiceService();
        soapService = soapServiceService.getSoapServicePort();
    }

    public String create(String name, String definition) {
        String response = null;
        response = soapService.requestToCreateRecord(name, definition);
        return response;
    }

    public String read(String name) {
        String response = null;
        response = soapService.requestToRetrieveRecord(name);
        return response;
    }

    public String update(String name, String definition) {
        String response = null;
        response = soapService.requestToUpdateRecord(name, definition);
        return response;
    }

    public String delete(String name) {
        String response = null;
        response = soapService.requestToDeleteRecord(name);
        return response;
    }
}
