package cc.silentio.bookservice.generated;

import jakarta.jws.WebMethod;
import jakarta.jws.WebParam;
import jakarta.jws.WebResult;
import jakarta.jws.WebService;
import jakarta.jws.soap.SOAPBinding;
import jakarta.xml.bind.annotation.XmlSeeAlso;

/**
 * This class was generated by Apache CXF 4.0.3
 * Generated source version: 4.0.3
 *
 */
@WebService(targetNamespace = "https://www.silentio.cc/bookservice/", name = "BookService")
@XmlSeeAlso({ObjectFactory.class})
@SOAPBinding(parameterStyle = SOAPBinding.ParameterStyle.BARE)
public interface BookService {

    @WebMethod(operationName = "GetAllBooks", action = "https://www.silentio.cc/bookservice/GetAllBooks")
    @WebResult(name = "GetAllBooksResponse", targetNamespace = "https://www.silentio.cc/bookservice/", partName = "parameters")
    public GetAllBooksResponse getAllBooks(

        @WebParam(partName = "parameters", name = "GetAllBooks", targetNamespace = "https://www.silentio.cc/bookservice/")
        GetAllBooks parameters
    );

    @WebMethod(operationName = "AddBook", action = "https://www.silentio.cc/bookservice/AddBook")
    @WebResult(name = "AddBookResponse", targetNamespace = "https://www.silentio.cc/bookservice/", partName = "parameters")
    public AddBookResponse addBook(

        @WebParam(partName = "parameters", name = "AddBook", targetNamespace = "https://www.silentio.cc/bookservice/")
        AddBook parameters
    );

    @WebMethod(operationName = "GetBook", action = "https://www.silentio.cc/bookservice/GetBook")
    @WebResult(name = "GetBookResponse", targetNamespace = "https://www.silentio.cc/bookservice/", partName = "parameters")
    public GetBookResponse getBook(

        @WebParam(partName = "parameters", name = "GetBook", targetNamespace = "https://www.silentio.cc/bookservice/")
        GetBook parameters
    );
}
