
package clientsoap.generated;

import javax.xml.namespace.QName;
import jakarta.xml.bind.JAXBElement;
import jakarta.xml.bind.annotation.XmlElementDecl;
import jakarta.xml.bind.annotation.XmlRegistry;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the clientsoap.generated package. 
 * <p>An ObjectFactory allows you to programatically 
 * construct new instances of the Java representation 
 * for XML content. The Java representation of XML 
 * content can consist of schema derived interfaces 
 * and classes representing the binding of schema 
 * type definitions, element declarations and model 
 * groups.  Factory methods for each of these are 
 * provided in this class.
 * 
 */
@XmlRegistry
public class ObjectFactory {

    private final static QName _Division_QNAME = new QName("http://Service/", "division");
    private final static QName _DivisionResponse_QNAME = new QName("http://Service/", "divisionResponse");
    private final static QName _Multiplication_QNAME = new QName("http://Service/", "multiplication");
    private final static QName _MultiplicationResponse_QNAME = new QName("http://Service/", "multiplicationResponse");
    private final static QName _Resultat_QNAME = new QName("http://Service/", "resultat");
    private final static QName _Somme_QNAME = new QName("http://Service/", "somme");
    private final static QName _SommeResponse_QNAME = new QName("http://Service/", "sommeResponse");
    private final static QName _Substract_QNAME = new QName("http://Service/", "substract");
    private final static QName _SubstractResponse_QNAME = new QName("http://Service/", "substractResponse");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: clientsoap.generated
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link Division }
     * 
     * @return
     *     the new instance of {@link Division }
     */
    public Division createDivision() {
        return new Division();
    }

    /**
     * Create an instance of {@link DivisionResponse }
     * 
     * @return
     *     the new instance of {@link DivisionResponse }
     */
    public DivisionResponse createDivisionResponse() {
        return new DivisionResponse();
    }

    /**
     * Create an instance of {@link Multiplication }
     * 
     * @return
     *     the new instance of {@link Multiplication }
     */
    public Multiplication createMultiplication() {
        return new Multiplication();
    }

    /**
     * Create an instance of {@link MultiplicationResponse }
     * 
     * @return
     *     the new instance of {@link MultiplicationResponse }
     */
    public MultiplicationResponse createMultiplicationResponse() {
        return new MultiplicationResponse();
    }

    /**
     * Create an instance of {@link Resultat }
     * 
     * @return
     *     the new instance of {@link Resultat }
     */
    public Resultat createResultat() {
        return new Resultat();
    }

    /**
     * Create an instance of {@link Somme }
     * 
     * @return
     *     the new instance of {@link Somme }
     */
    public Somme createSomme() {
        return new Somme();
    }

    /**
     * Create an instance of {@link SommeResponse }
     * 
     * @return
     *     the new instance of {@link SommeResponse }
     */
    public SommeResponse createSommeResponse() {
        return new SommeResponse();
    }

    /**
     * Create an instance of {@link Substract }
     * 
     * @return
     *     the new instance of {@link Substract }
     */
    public Substract createSubstract() {
        return new Substract();
    }

    /**
     * Create an instance of {@link SubstractResponse }
     * 
     * @return
     *     the new instance of {@link SubstractResponse }
     */
    public SubstractResponse createSubstractResponse() {
        return new SubstractResponse();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Division }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link Division }{@code >}
     */
    @XmlElementDecl(namespace = "http://Service/", name = "division")
    public JAXBElement<Division> createDivision(Division value) {
        return new JAXBElement<>(_Division_QNAME, Division.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DivisionResponse }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link DivisionResponse }{@code >}
     */
    @XmlElementDecl(namespace = "http://Service/", name = "divisionResponse")
    public JAXBElement<DivisionResponse> createDivisionResponse(DivisionResponse value) {
        return new JAXBElement<>(_DivisionResponse_QNAME, DivisionResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Multiplication }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link Multiplication }{@code >}
     */
    @XmlElementDecl(namespace = "http://Service/", name = "multiplication")
    public JAXBElement<Multiplication> createMultiplication(Multiplication value) {
        return new JAXBElement<>(_Multiplication_QNAME, Multiplication.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link MultiplicationResponse }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link MultiplicationResponse }{@code >}
     */
    @XmlElementDecl(namespace = "http://Service/", name = "multiplicationResponse")
    public JAXBElement<MultiplicationResponse> createMultiplicationResponse(MultiplicationResponse value) {
        return new JAXBElement<>(_MultiplicationResponse_QNAME, MultiplicationResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Resultat }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link Resultat }{@code >}
     */
    @XmlElementDecl(namespace = "http://Service/", name = "resultat")
    public JAXBElement<Resultat> createResultat(Resultat value) {
        return new JAXBElement<>(_Resultat_QNAME, Resultat.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Somme }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link Somme }{@code >}
     */
    @XmlElementDecl(namespace = "http://Service/", name = "somme")
    public JAXBElement<Somme> createSomme(Somme value) {
        return new JAXBElement<>(_Somme_QNAME, Somme.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SommeResponse }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link SommeResponse }{@code >}
     */
    @XmlElementDecl(namespace = "http://Service/", name = "sommeResponse")
    public JAXBElement<SommeResponse> createSommeResponse(SommeResponse value) {
        return new JAXBElement<>(_SommeResponse_QNAME, SommeResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Substract }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link Substract }{@code >}
     */
    @XmlElementDecl(namespace = "http://Service/", name = "substract")
    public JAXBElement<Substract> createSubstract(Substract value) {
        return new JAXBElement<>(_Substract_QNAME, Substract.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SubstractResponse }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link SubstractResponse }{@code >}
     */
    @XmlElementDecl(namespace = "http://Service/", name = "substractResponse")
    public JAXBElement<SubstractResponse> createSubstractResponse(SubstractResponse value) {
        return new JAXBElement<>(_SubstractResponse_QNAME, SubstractResponse.class, null, value);
    }

}
