package springbootquickstart;

import org.springframework.http.MediaType;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.*;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;

@RestController
@SpringBootApplication
public class Example extends SpringBootServletInitializer {

  @RequestMapping("/Hi")
    String home() {
        return "Hello World Again!";
    }
	
	
	
	//@RequestMapping("/hello")
	@GetMapping("/hello")
    public String hello(@RequestParam("name") String name) {
        String message = "Hello, " + name;
        return message;
    }
	
	@GetMapping(value = "/Bye", produces = MediaType.TEXT_PLAIN_VALUE)
	public String index() {

    return "Bye, Do Visit Later";
}
	
	
	
	 public static void main(String[] args) {
        SpringApplication.run(Example.class, args);
		//SpringApplication app = new SpringApplication (Example.class);
		//app.setBannerMode(Banner.Mode.OFF);
		//app.run(args);
    } 
   
   @Override
   protected SpringApplicationBuilder configure(SpringApplicationBuilder builder) {
   return builder.sources(Example.class);
   
   }


}
