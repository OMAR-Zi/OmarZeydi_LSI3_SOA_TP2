package Model;

import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlRootElement;

@XmlRootElement(name = "resultat")
public class Resultat {
    private double operande1;
    private double operande2;
    private String operation;
    private double valeur;

    public Resultat() {
    }

    public Resultat(double operande1, double operande2, String operation, double
            valeur) {
        this.operande1 = operande1;
        this.operande2 = operande2;


        this.operation = operation;
        this.valeur = valeur;
    }

    @XmlElement
    public double getOperande1() {
        return operande1;
    }

    public void setOperande1(double operande1) {
        this.operande1 = operande1;
    }

    @XmlElement
    public double getOperande2() {
        return operande2;
    }

    public void setOperande2(double operande2) {
        this.operande2 = operande2;
    }

    @XmlElement
    public String getOperation() {
        return operation;
    }

    public void setOperation(String operation) {
        this.operation = operation;
    }

    @XmlElement
    public double getValeur() {
        return valeur;
    }

    public void setValeur(double valeur) {
        this.valeur = valeur;
    }
}
