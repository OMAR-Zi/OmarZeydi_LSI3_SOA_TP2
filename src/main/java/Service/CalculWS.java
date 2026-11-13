package Service;


import Model.Resultat;
import jakarta.jws.WebService;
import Metier.Calculatrice;

@WebService(
        endpointInterface = "Service.ICalculWS"
)
public class CalculWS implements ICalculWS{
    private Calculatrice calculatrice=new Calculatrice();
    @Override
    public Resultat somme(double a,double b){
        return calculatrice.somme(a,b);
    }

    @Override
    public Resultat multiplication(double a, double b) {
        return calculatrice.multiplication(a,b);
    }

    @Override
    public Resultat division(double a, double b) {
        return calculatrice.division(a,b);
    }

    @Override
    public Resultat substract(double a, double b) {
        return calculatrice.substract(a,b);
    }
}
