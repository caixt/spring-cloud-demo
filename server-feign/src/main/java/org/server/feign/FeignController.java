package org.server.feign;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class FeignController {
  @Autowired
  private TestFeignClient testFeignClient;

  @RequestMapping(value = "/haha" , method = RequestMethod.GET)
  public String add() {
    String string = this.testFeignClient.add(1, 2);
    return string;
  }
  
  //B服务调用A服务
  @RequestMapping(value="/",method=RequestMethod.GET)
  public String all(){
  	return "haha";
  }
}