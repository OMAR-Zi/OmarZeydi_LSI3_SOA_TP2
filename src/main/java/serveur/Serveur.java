package serveur;

import jakarta.xml.ws.Endpoint;
import Service.Calculatrice;

public class Serveur {
    public static void main(String[] args) {
        String URL="http://localhost:8080/calculatrice";
        Endpoint.publish(URL,new Calculatrice());
        System.out.println("Service published :"+URL+"?wsdl");
    }
}
