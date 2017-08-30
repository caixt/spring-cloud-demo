package org.server.remote;


import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RefreshScope
@RestController
public class ComputeController {


	@Value("${from}")
	private String from;

    @RequestMapping(value = "/api/test" ,method = RequestMethod.GET)
    public String test(@RequestParam Integer a, @RequestParam Integer b) {
    	System.out.println("!!!!!!!!!!!!!!!!!!!!!!!!!!!");
    	return a + b + "!" + from;
    }
}