package com.fastcampus.ch2;

import java.net.URLEncoder;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
<<<<<<< HEAD
import org.springframework.web.bind.annotation.GetMapping;
=======
>>>>>>> ea0814e3185df4db3e6d2bc9422fbff170cbc5fb
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

<<<<<<< HEAD
@Controller // ctrl+shift+o �ڵ� import
@RequestMapping("/register")
public class RegisterController {
	@RequestMapping(value="/add", method={RequestMethod.GET, RequestMethod.POST})
//	@GetMapping("/add")
	public String register() {
		return "registerForm"; // WEB-INF/views/registerForm.jsp
	}
	
//	@RequestMapping(value="/save", method=RequestMethod.POST)
	@PostMapping("/save")  // 4.3���� 
	public String save(User user, Model m) throws Exception {
		// 1. ��ȿ�� �˻�
		if(!isValid(user)) {
			String msg = URLEncoder.encode("id�� �߸��Է��ϼ̽��ϴ�.", "utf-8");
			
			m.addAttribute("msg", msg);
			return "forward:/register/add";
//			return "redirect:/register/add?msg="+msg; // URL���ۼ�(rewriting)
		}
		
		// 2. DB�� �ű�ȸ�� ������ ���� 
=======
@Controller
public class RegisterController {
	@RequestMapping(value="/register/add", method={RequestMethod.GET, RequestMethod.POST})
	public String register() {
		return "registerForm";  // WEB-INF/views/registerForm.jsp
	}
	
//	@RequestMapping(value="/register/save", method=RequestMethod.POST)
	@PostMapping("/register/save")  // 4.3����
	public String save(User user, Model m) throws Exception {
		// 1. ��ȿ�� �˻�
		if(!isValid(user)) {
			String msg = URLEncoder.encode("id�� �߸� �Է��ϼ̽��ϴ�.", "utf-8");
			
			m.addAttribute("msg", msg);
			return "forward:/register/add";
//			return "redirect:/register/add?msg="+msg;  // URL���ۼ�(rewriting)
		}
		
		// 2. DB�� �ű�ȸ�� ������ ����
		
>>>>>>> ea0814e3185df4db3e6d2bc9422fbff170cbc5fb
		return "registerInfo";
	}

	private boolean isValid(User user) {
<<<<<<< HEAD
		return false;
	}
=======

		return false;
	}	
>>>>>>> ea0814e3185df4db3e6d2bc9422fbff170cbc5fb
}
