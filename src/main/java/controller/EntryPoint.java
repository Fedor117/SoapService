package controller;

import javax.xml.ws.Endpoint;

/**
 * Created by Fedor on 16.04.2016.
 */
public class EntryPoint {
    public static void main(String[] args) {
        Object implementor = new SoapService();
        String address = "http://localhost:9000/controller.SoapService";
        Endpoint.publish(address, implementor);
    }
}
