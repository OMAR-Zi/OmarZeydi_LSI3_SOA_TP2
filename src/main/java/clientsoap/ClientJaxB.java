package clientsoap;
import clientsoap.generated.CalculWSService;
import clientsoap.generated.ICalculWS;
import clientsoap.generated.Resultat;
public class ClientJaxB {
    public static void  main(String[] args){
        double a = 34;
        double b = 39;
        Resultat resultat = effectuerAddition(a, b);
        afficherResultat(resultat);
    }

    private static Resultat effectuerAddition(double a, double b) {
        CalculWSService service = new CalculWSService();
        ICalculWS port = service.getCalculWSPort();
        return port.somme(a, b);
    }

    private static void afficherResultat(Resultat resultat) {
        System.out.println("Opération : " + resultat.getOperande1() + " " +
                resultat.getOperation() + " " + resultat.getOperande2());
        System.out.println("Résultat : " + resultat.getValeur());
    }
}
