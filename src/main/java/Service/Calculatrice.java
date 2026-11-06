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

    @Override
    public int multiplication(int a, int b) {
        return a*b;
    }

    @Override
    public double division(double a, double b) {
        if (b!=0) {return a/b;}
        else {return 0;}
    }

    @Override
    public int substract(int a, int b) {
        return a-b;
    }
}
