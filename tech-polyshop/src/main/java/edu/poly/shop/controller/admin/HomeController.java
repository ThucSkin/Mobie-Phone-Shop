package edu.poly.shop.controller.admin;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import net.bytebuddy.asm.Advice.Return;

@Controller

public class HomeController {
	@RequestMapping("home")
    public String index() {
		return "/admin/home";
	}
}
