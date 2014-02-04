package shoe.glassfish.example.bean;

import javax.ejb.Stateless;

@Stateless
public class HelloWorldServiceImpl implements HelloWorldService {

    public void sayHelloTo(final String name) {
        System.out.printf("Hello to %s\n", name);
    }

}
