package com.techacademy;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class InputController {

	@GetMapping("/input")
	public String getInput() {
		// input.htmlに画面遷移
		return "input";
	}
}