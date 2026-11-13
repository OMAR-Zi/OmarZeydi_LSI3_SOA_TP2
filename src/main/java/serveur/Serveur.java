package serveur;

import Service.CalculWS;
import jakarta.xml.ws.Endpoint;


public class Serveur {
    public static void main(String[] args) {
        String URL="http://localhost:8080/calculatrice";
        Endpoint.publish(URL,new CalculWS());
        System.out.println("Service published :"+URL+"?wsdl");
    }
}
