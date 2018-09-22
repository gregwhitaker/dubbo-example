package dubbo.example.provider;

import dubbo.example.api.DemoService;

public class DefaultDemoService implements DemoService {

    @Override
    public String sayHello(String name) {
        return String.format("Hello, %s!", name);
    }
}
