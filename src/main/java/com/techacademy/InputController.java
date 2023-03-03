package com.techacademy;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class InputController {

	@GetMapping("/input")
	public String getInput() {
		// input.htmlに画面遷移
		return "input";
	}
	//model.addAttributeを使ってpreviousをModelに登録
	@GetMapping("/input/{previous}/")
	public String getOutput(@RequestParam("previous")String previous,Model model) {
		//フォームから送信されてきた値をModelに登録
		model.addAttribute("previous", previous);
		// index.htmlに画面遷移
		return "input";
	}
}