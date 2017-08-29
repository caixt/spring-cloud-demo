package org.server.ribbon;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.client.loadbalancer.LoadBalanced;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@RestController
public class ConsumerController {

    @Autowired
    @LoadBalanced
    private RestTemplate restTemplate;
    
    @RequestMapping(value = "/api/test", method = RequestMethod.GET)
    public String add(@RequestParam Integer a,@RequestParam Integer b) {
        return restTemplate.getForEntity("http://server-a/api/test?a="+a+"&b="+b, String.class).getBody();
    	
    }
    
}