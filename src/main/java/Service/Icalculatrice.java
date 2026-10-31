package Service;

import jakarta.jws.WebMethod;
import jakarta.jws.WebParam;
import jakarta.jws.WebService;

@WebService(name ="Icalculatrice")
public interface Icalculatrice {
    @WebMethod(operationName = "somme")
    int somme(@WebParam(name = "a")int a ,@WebParam(name = "b")int b    );
}
