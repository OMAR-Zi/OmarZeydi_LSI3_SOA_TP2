package Service;

import jakarta.jws.WebService;

@WebService(
        endpointInterface = "Service.Icalculatrice",
        serviceName = "Calculatrice",
        portName = "CalculatricePort"
)
public class Calculatrice implements Icalculatrice{
    public int somme(int a,int b){
        return a+b;
    }
}
