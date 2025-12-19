package kr.ac.koreatech.devops_step1;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import lombok.extern.slf4j.Slf4j;


@Controller
@Slf4j
public class HomeController {

    @Value("${APP_NAME:default_app}")
    private String appName;

    @GetMapping("/")
    public String index(Model model) {
        model.addAttribute("name", appName);
        log.info("hello world");
        return "index.html";
    }
}
