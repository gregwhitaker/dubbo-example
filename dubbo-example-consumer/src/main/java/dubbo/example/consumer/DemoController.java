package dubbo.example.consumer;

import com.alibaba.dubbo.config.annotation.Reference;
import dubbo.example.api.DemoService;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DemoController {

    @Reference(version = "1.0.0",
            application = "${dubbo.application.id}",
            url = "dubbo://localhost:12345")
    private DemoService demoService;

    @RequestMapping("/hello")
    public String sayHello(@RequestParam String name) {
        return demoService.sayHello(name);
    }

    @RequestMapping("/goodbye")
    public String sayGoodbye() {
        return demoService.sayGoodbye();
    }
}
