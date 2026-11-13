package Metier;
import Model.Resultat;
public class Calculatrice implements ICalculatrice{
    @Override
    public Resultat somme(double a,double b){
        double res= a+b;
        return new Resultat(a,b,"+",res);
    }

    @Override
    public Resultat multiplication(double a, double b) {
        double res=a*b;
        return new Resultat(a,b,"*",res);
    }

    @Override
    public Resultat division(double a, double b) {
        if (b == 0) throw new IllegalArgumentException("Division par zéro");
        double res=a/b;
        return new Resultat(a,b,"/",res);
    }

    @Override
    public Resultat substract(double a, double b) {
        double res=a-b;
        return new Resultat(a,b,"-",res);
    }
}
