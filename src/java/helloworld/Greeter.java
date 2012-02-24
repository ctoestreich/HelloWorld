package helloworld;

import javax.jws.Oneway;
import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebResult;
import javax.jws.WebService;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.ws.BindingType;
import javax.xml.ws.RequestWrapper;
import javax.xml.ws.ResponseWrapper;

/**
 * This class was generated by Apache CXF 2.5.2
 * 2012-02-24T15:24:15.914+01:00
 * Generated source version: 2.5.2
 * 
 */
@WebService(targetNamespace = "http://apache.org/hello_world_soap12_http", name = "Greeter")
@XmlSeeAlso({ObjectFactory.class})
public interface Greeter {

    @RequestWrapper(localName = "pingMe", targetNamespace = "http://apache.org/hello_world_soap12_http/types", className = "helloworld.PingMe")
    @WebMethod
    @ResponseWrapper(localName = "pingMeResponse", targetNamespace = "http://apache.org/hello_world_soap12_http/types", className = "helloworld.PingMeResponse")
    public void pingMe() throws PingMeFault;

    @Oneway
    @RequestWrapper(localName = "greetMeOneWay", targetNamespace = "http://apache.org/hello_world_soap12_http/types", className = "helloworld.GreetMeOneWay")
    @WebMethod
    public void greetMeOneWay(
        @WebParam(name = "requestType", targetNamespace = "http://apache.org/hello_world_soap12_http/types")
        java.lang.String requestType
    );

    @WebResult(name = "responseType", targetNamespace = "http://apache.org/hello_world_soap12_http/types")
    @RequestWrapper(localName = "sayHi", targetNamespace = "http://apache.org/hello_world_soap12_http/types", className = "helloworld.SayHi")
    @WebMethod
    @ResponseWrapper(localName = "sayHiResponse", targetNamespace = "http://apache.org/hello_world_soap12_http/types", className = "helloworld.SayHiResponse")
    public java.lang.String sayHi();

    @WebResult(name = "responseType", targetNamespace = "http://apache.org/hello_world_soap12_http/types")
    @RequestWrapper(localName = "greetMe", targetNamespace = "http://apache.org/hello_world_soap12_http/types", className = "helloworld.GreetMe")
    @WebMethod
    @ResponseWrapper(localName = "greetMeResponse", targetNamespace = "http://apache.org/hello_world_soap12_http/types", className = "helloworld.GreetMeResponse")
    public java.lang.String greetMe(
        @WebParam(name = "requestType", targetNamespace = "http://apache.org/hello_world_soap12_http/types")
        java.lang.String requestType
    );
}
