package cc.silentio.bookservice.generated;

import java.net.URL;
import javax.xml.namespace.QName;
import jakarta.xml.ws.WebEndpoint;
import jakarta.xml.ws.WebServiceClient;
import jakarta.xml.ws.WebServiceFeature;
import jakarta.xml.ws.Service;

/**
 * This class was generated by Apache CXF 4.0.3
 * Generated source version: 4.0.3
 *
 */
@WebServiceClient(name = "BookService",
                  wsdlLocation = "book.wsdl",
                  targetNamespace = "https://www.silentio.cc/bookservice/")
public class BookService_Service extends Service {

    public final static URL WSDL_LOCATION;

    public final static QName SERVICE = new QName("https://www.silentio.cc/bookservice/", "BookService");
    public final static QName BookServiceSOAP = new QName("https://www.silentio.cc/bookservice/", "BookServiceSOAP");
    static {
        URL url = BookService_Service.class.getResource("book.wsdl");
        if (url == null) {
            url = BookService_Service.class.getClassLoader().getResource("book.wsdl");
        }
        if (url == null) {
            java.util.logging.Logger.getLogger(BookService_Service.class.getName())
                .log(java.util.logging.Level.INFO,
                     "Can not initialize the default wsdl from {0}", "book.wsdl");
        }
        WSDL_LOCATION = url;
    }

    public BookService_Service(URL wsdlLocation) {
        super(wsdlLocation, SERVICE);
    }

    public BookService_Service(URL wsdlLocation, QName serviceName) {
        super(wsdlLocation, serviceName);
    }

    public BookService_Service() {
        super(WSDL_LOCATION, SERVICE);
    }

    public BookService_Service(WebServiceFeature ... features) {
        super(WSDL_LOCATION, SERVICE, features);
    }

    public BookService_Service(URL wsdlLocation, WebServiceFeature ... features) {
        super(wsdlLocation, SERVICE, features);
    }

    public BookService_Service(URL wsdlLocation, QName serviceName, WebServiceFeature ... features) {
        super(wsdlLocation, serviceName, features);
    }




    /**
     *
     * @return
     *     returns BookService
     */
    @WebEndpoint(name = "BookServiceSOAP")
    public BookService getBookServiceSOAP() {
        return super.getPort(BookServiceSOAP, BookService.class);
    }

    /**
     *
     * @param features
     *     A list of {@link jakarta.xml.ws.WebServiceFeature} to configure on the proxy.  Supported features not in the <code>features</code> parameter will have their default values.
     * @return
     *     returns BookService
     */
    @WebEndpoint(name = "BookServiceSOAP")
    public BookService getBookServiceSOAP(WebServiceFeature... features) {
        return super.getPort(BookServiceSOAP, BookService.class, features);
    }

}
