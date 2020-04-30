package day6_package;

import com.sun.xml.internal.ws.api.model.wsdl.WSDLOutput;
import org.w3c.dom.ls.LSOutput;

public class demo6_interfacedefaultA implements MyinterfaceDefault {
@Override
public void methodAbs()
{
    System.out.println("实现了抽象方法，AAA");
}

}
