package pl.edu.wroc.pwr.ds.swagger.rest;

import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiParam;
import io.swagger.annotations.ApiResponse;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloEndpoint {

    @RequestMapping(value = "/hello", method = RequestMethod.GET)
    public String helloGet() {
        return "Hello";
    }
//     describe REST operation for Swagger
    @ApiOperation(value = "Say hello to given name")
//    Say spring to do apropriate routing
    @RequestMapping(value = "/hello", method = RequestMethod.POST)
//    Describe possible operation results
    @ApiResponse(code=200, message="Hello message")
//    describe operation param as method argument
    public String helloPost(@ApiParam(name="name to say hello") String name) {
        return String.format("Hello %s", name);
    }

}
