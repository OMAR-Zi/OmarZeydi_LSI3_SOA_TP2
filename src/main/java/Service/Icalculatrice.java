package Service;

import jakarta.jws.WebMethod;
import jakarta.jws.WebParam;
import jakarta.jws.WebService;

@WebService(name ="Icalculatrice")
public interface Icalculatrice {
    @WebMethod(operationName = "somme")
    int somme(@WebParam(name = "a")int a ,@WebParam(name = "b")int b    );
    @WebMethod(operationName = "multiplication")
    int multiplication(@WebParam(name = "a")int a ,@WebParam(name = "b")int b    );
    @WebMethod(operationName = "division")
    double division(@WebParam(name = "a")double a ,@WebParam(name = "b")double b    );
    @WebMethod(operationName = "substract")
    int substract(@WebParam(name = "a")int a ,@WebParam(name = "b")int b    );
}
