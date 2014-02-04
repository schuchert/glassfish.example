package shoe.glassfish.example;

import org.junit.Test;
import shoe.glassfish.example.bean.HelloWorldService;

import javax.ejb.embeddable.EJBContainer;
import java.io.File;
import java.util.HashMap;
import java.util.Map;

public class StartEmbeddedContainer {
    @Test
    public void ejbContainer() throws Exception {
        Map<String, Object> properties = new HashMap<String, Object>();
        properties.put(EJBContainer.MODULES, new File("target/classes"));
        EJBContainer c = EJBContainer.createEJBContainer(properties);
        HelloWorldService service= (HelloWorldService) c.getContext().lookup("java:global/classes/HelloWorldServiceImpl");
        service.sayHelloTo("brett");
        c.close();
    }
}
