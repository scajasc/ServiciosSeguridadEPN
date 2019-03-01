package ec.edu.epn.contratos.webservices;

import java.net.MalformedURLException;
import java.net.URL;
import javax.xml.namespace.QName;
import javax.xml.ws.WebEndpoint;
import javax.xml.ws.WebServiceClient;
import javax.xml.ws.WebServiceFeature;
import javax.xml.ws.Service;

/**
 * This class was generated by Apache CXF 2.7.14.redhat-1
 * 2016-07-20T18:39:39.898-05:00
 * Generated source version: 2.7.14.redhat-1
 * 
 */
@WebServiceClient(name = "ServiceContratos", 
                  wsdlLocation = "http://172.31.4.130:8080/WSContratosM/GeneracionContratosWS?wsdl",
                  targetNamespace = "http://entities.cpa.epn.edu.ec/") 
public class ServiceContratos extends Service {

    public final static URL WSDL_LOCATION;

    public final static QName SERVICE = new QName("http://entities.cpa.epn.edu.ec/", "ServiceContratos");
    public final static QName GeneracionContratosWSPort = new QName("http://entities.cpa.epn.edu.ec/", "GeneracionContratosWSPort");
    static {
        URL url = null;
        try {
            url = new URL("http://172.31.4.130:8080/WSContratosM/GeneracionContratosWS?wsdl");
        } catch (MalformedURLException e) {
            java.util.logging.Logger.getLogger(ServiceContratos.class.getName())
                .log(java.util.logging.Level.INFO, 
                     "Can not initialize the default wsdl from {0}", "http://172.31.4.130:8080/WSContratosM/GeneracionContratosWS?wsdl");
        }
        WSDL_LOCATION = url;
    }

    public ServiceContratos(URL wsdlLocation) {
        super(wsdlLocation, SERVICE);
    }

    public ServiceContratos(URL wsdlLocation, QName serviceName) {
        super(wsdlLocation, serviceName);
    }

    public ServiceContratos() {
        super(WSDL_LOCATION, SERVICE);
    }
    
    //This constructor requires JAX-WS API 2.2. You will need to endorse the 2.2
    //API jar or re-run wsdl2java with "-frontend jaxws21" to generate JAX-WS 2.1
    //compliant code instead.
    public ServiceContratos(WebServiceFeature ... features) {
        super(WSDL_LOCATION, SERVICE, features);
    }

    //This constructor requires JAX-WS API 2.2. You will need to endorse the 2.2
    //API jar or re-run wsdl2java with "-frontend jaxws21" to generate JAX-WS 2.1
    //compliant code instead.
    public ServiceContratos(URL wsdlLocation, WebServiceFeature ... features) {
        super(wsdlLocation, SERVICE, features);
    }

    //This constructor requires JAX-WS API 2.2. You will need to endorse the 2.2
    //API jar or re-run wsdl2java with "-frontend jaxws21" to generate JAX-WS 2.1
    //compliant code instead.
    public ServiceContratos(URL wsdlLocation, QName serviceName, WebServiceFeature ... features) {
        super(wsdlLocation, serviceName, features);
    }

    /**
     *
     * @return
     *     returns GeneracionContratosWS
     */
    @WebEndpoint(name = "GeneracionContratosWSPort")
    public GeneracionContratosWS getGeneracionContratosWSPort() {
        return super.getPort(GeneracionContratosWSPort, GeneracionContratosWS.class);
    }

    /**
     * 
     * @param features
     *     A list of {@link javax.xml.ws.WebServiceFeature} to configure on the proxy.  Supported features not in the <code>features</code> parameter will have their default values.
     * @return
     *     returns GeneracionContratosWS
     */
    @WebEndpoint(name = "GeneracionContratosWSPort")
    public GeneracionContratosWS getGeneracionContratosWSPort(WebServiceFeature... features) {
        return super.getPort(GeneracionContratosWSPort, GeneracionContratosWS.class, features);
    }

}