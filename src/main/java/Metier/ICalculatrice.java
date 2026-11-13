package Metier;

import Model.Resultat;

public interface ICalculatrice {
    Resultat somme(double a, double b);
    Resultat multiplication(double a,double b);
    Resultat division(double a,double b);
    Resultat substract(double a,double b);
}
