package hello


import org.springframework.boot._
import org.springframework.boot.autoconfigure._
import org.springframework.stereotype._
import org.springframework.web.bind.annotation._
import org.springframework.context.annotation.Configuration
import org.springframework.context.annotation.ComponentScan

@Controller
@Configuration
@EnableAutoConfiguration
@ComponentScan
class HelloConfig {

        @RequestMapping(Array("/"))
        @ResponseBody
        def home(): String = "Hello World!"
}