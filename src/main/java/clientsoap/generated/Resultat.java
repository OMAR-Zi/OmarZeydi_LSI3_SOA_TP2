
package clientsoap.generated;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for resultat complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>{@code
 * <complexType name="resultat">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <sequence>
 *         <element name="operande1" type="{http://www.w3.org/2001/XMLSchema}double"/>
 *         <element name="operande2" type="{http://www.w3.org/2001/XMLSchema}double"/>
 *         <element name="operation" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         <element name="valeur" type="{http://www.w3.org/2001/XMLSchema}double"/>
 *       </sequence>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "resultat", propOrder = {
    "operande1",
    "operande2",
    "operation",
    "valeur"
})
public class Resultat {

    protected double operande1;
    protected double operande2;
    protected String operation;
    protected double valeur;

    /**
     * Gets the value of the operande1 property.
     * 
     */
    public double getOperande1() {
        return operande1;
    }

    /**
     * Sets the value of the operande1 property.
     * 
     */
    public void setOperande1(double value) {
        this.operande1 = value;
    }

    /**
     * Gets the value of the operande2 property.
     * 
     */
    public double getOperande2() {
        return operande2;
    }

    /**
     * Sets the value of the operande2 property.
     * 
     */
    public void setOperande2(double value) {
        this.operande2 = value;
    }

    /**
     * Gets the value of the operation property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOperation() {
        return operation;
    }

    /**
     * Sets the value of the operation property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOperation(String value) {
        this.operation = value;
    }

    /**
     * Gets the value of the valeur property.
     * 
     */
    public double getValeur() {
        return valeur;
    }

    /**
     * Sets the value of the valeur property.
     * 
     */
    public void setValeur(double value) {
        this.valeur = value;
    }

}
