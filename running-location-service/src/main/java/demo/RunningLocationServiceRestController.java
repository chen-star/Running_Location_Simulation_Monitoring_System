package demo;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

public class RunningLocationServiceRestController {

    @RequestMapping(value = "/", method = RequestMethod.GET)
    public String isOk() {
        return "OK";
    }
}
