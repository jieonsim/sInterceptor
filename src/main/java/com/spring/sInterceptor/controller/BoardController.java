package com.spring.sInterceptor.controller;

import java.util.Locale;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
@RequestMapping("/board")
public class BoardController {
	
	@RequestMapping(value = "/boardList", method = RequestMethod.GET)
	public String getBoardList(Locale locale, Model model) {
		System.out.println("이 곳은 boardController의 boardList 메소드입니다.");
		
		model.addAttribute("data", "board 컨트롤러의 BoardList 메소드에서 보냅니다.");
		return "board/boardList";
	}
	
	
	@RequestMapping(value = "/boardInput", method = RequestMethod.GET)
	public String getBoardInput(Locale locale, Model model) {
		System.out.println("이 곳은 boardController의 boardInput 메소드입니다.");
		
		model.addAttribute("data", "board 컨트롤러의 boardInput 메소드에서 보냅니다.");
		return "board/boardInput";
	}
	
	@RequestMapping(value = "/boardUpdate", method = RequestMethod.GET)
	public String getBoardUpdate(Locale locale, Model model) {
		System.out.println("이 곳은 boardController의 boardUpdate 메소드입니다.");
		
		model.addAttribute("data", "board 컨트롤러의 boardUpdate 메소드에서 보냅니다.");
		return "board/boardUpdate";
	}
}
