package Service;
import Model.Resultat;
import jakarta.jws.WebMethod;
import jakarta.jws.WebParam;
import jakarta.jws.WebService;

@WebService(name ="ICalculWS")
public interface ICalculWS {
    @WebMethod(operationName = "somme")
    Resultat somme(@WebParam(name = "a")double a ,@WebParam(name = "b")double b    );
    @WebMethod(operationName = "multiplication")
    Resultat multiplication(@WebParam(name = "a")double a ,@WebParam(name = "b")double b    );
    @WebMethod(operationName = "division")
    Resultat division(@WebParam(name = "a")double a ,@WebParam(name = "b")double b    );
    @WebMethod(operationName = "substract")
    Resultat substract(@WebParam(name = "a")double a ,@WebParam(name = "b")double b    );


}
