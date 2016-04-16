package by.bsuir.aipos.sem6.soap.client;

import by.bsuir.aipos.sem6.soap.artifacts.SoapService;
import by.bsuir.aipos.sem6.soap.artifacts.SoapServiceService;

/**
 * Created by Dzmitry Saladukha on 16.04.2016.
 */
public class EntryPoint {
    public static void main(String[] args) {
        SoapServiceService soapServiceService = new SoapServiceService();
        SoapService soapService = soapServiceService.getSoapServicePort();
        System.out.println(soapService.requestToRetrieveRecord("Сеть"));
    }
}
