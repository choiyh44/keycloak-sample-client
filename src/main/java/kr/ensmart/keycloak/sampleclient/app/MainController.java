/**
 * 
 */
package kr.ensmart.keycloak.sampleclient.app;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * @author choiyh44
 * @version 1.0
 * @since 2023. 3. 28.
 *
 */
@Controller
public class MainController {
    @GetMapping("")
    public String mainRedirect() {
        return "redirect:/main";
    }
    
    @GetMapping({"/", "/main","/index","/home"})
    @ResponseBody
    public String main() {
        return "Hello, World!!!";
    }

}
