package controller;

import controller.operations.CreateOperator;
import controller.operations.DbOperation;
import controller.operations.DeleteOperator;
import controller.operations.RetrieveOperator;
import controller.operations.UpdateOperator;
import model.DbConnection;

import javax.jws.WebMethod;
import javax.jws.WebService;
import javax.jws.soap.SOAPBinding;

/**
 * Created by Fedor on 16.04.2016.
 */
@WebService()
@SOAPBinding(style = SOAPBinding.Style.DOCUMENT, use = SOAPBinding.Use.LITERAL)
public class SoapService {

    public SoapService() {
        DbConnection connection = DbConnection.getInstance();
        connection.connectToDb();
    }

    @WebMethod
    public String requestToCreateRecord(String name, String definition) {
        DbOperation operation = new CreateOperator();
        return operation.requestToDb(name, definition);
    }

    @WebMethod
    public String requestToRetrieveRecord(String name) {
        DbOperation operation = new RetrieveOperator();
        return operation.requestToDb(name, null);
    }

    @WebMethod
    public String requestToUpdateRecord(String name, String definition) {
        DbOperation operation = new UpdateOperator();
        return operation.requestToDb(name, definition);
    }

    @WebMethod
    public String requestToDeleteRecord(String name) {
        DbOperation operation = new DeleteOperator();
        return operation.requestToDb(name, null);
    }

}
