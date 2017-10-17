package example;

import javax.jws.WebService;
import javax.jws.WebMethod;
/**
 * Created by sasakin on 17.10.2017.
 */
@WebService
public class HelloWorld {
  @WebMethod
  public String sayHelloWorldFrom(String from) {
    String result = "Hello, world, from " + from;
    System.out.println(result);
    return result;
  }
}
