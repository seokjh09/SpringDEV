package com.fastcampus.ch2;

import java.net.URLEncoder;

import javax.servlet.http.Cookie;
<<<<<<< HEAD
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.CookieValue;
=======
import javax.servlet.http.HttpServletResponse;

import org.springframework.stereotype.Controller;
>>>>>>> ea0814e3185df4db3e6d2bc9422fbff170cbc5fb
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/login")
public class LoginController {
	@GetMapping("/login")
	public String loginForm() {
		return "loginForm";
	}
	
<<<<<<< HEAD
	@GetMapping("/logout")
	public String logout(HttpSession session) {
		// 1. 세션을 종료
		session.invalidate();
		// 2. 홈으로 이동
		return "redirect:/";
	}

	@PostMapping("/login")
	public String login(String id, String pwd, String toURL, boolean rememberId, 
			HttpServletRequest request, HttpServletResponse response) throws Exception {

		// 1. id와 pwd를 확인
		if(!loginCheck(id, pwd)) {
			// 2-1   일치하지 않으면, loginForm으로 이동
=======
	@PostMapping("/login")
	public String login(String id, String pwd, boolean rememberId, HttpServletResponse response) throws Exception {
		System.out.println("id="+id);
		System.out.println("pwd="+pwd);
		System.out.println("rememberId="+rememberId);

		// 1. id와 pwd를 확인
		if(!loginCheck(id, pwd)) {
			// 2-1. 일치하지 않으면, loginForm으로 이동
>>>>>>> ea0814e3185df4db3e6d2bc9422fbff170cbc5fb
			String msg = URLEncoder.encode("id 또는 pwd가 일치하지 않습니다.", "utf-8");
			
			return "redirect:/login/login?msg="+msg;
		}
		// 2-2. id와 pwd가 일치하면,
<<<<<<< HEAD
		//  세션 객체를 얻어오기
		HttpSession session = request.getSession();
		//  세션 객체에 id를 저장
		session.setAttribute("id", id);
		
		if(rememberId) {
		//     1. 쿠키를 생성
			Cookie cookie = new Cookie("id", id); // ctrl+shift+o 자동 import
//		       2. 응답에 저장
			response.addCookie(cookie);
		} else {
			// 1. 쿠키를 삭제
			Cookie cookie = new Cookie("id", id); // ctrl+shift+o 자동 import
			cookie.setMaxAge(0); // 쿠키를 삭제
//		       2. 응답에 저장
			response.addCookie(cookie);
		}
//		       3. 홈으로 이동
		toURL = toURL==null || toURL.equals("") ? "/" : toURL;
		
		return "redirect:"+toURL;
=======
		if(rememberId) {
			// 쿠키를 생성
//			1. 쿠키를 생성
			Cookie cookie = new Cookie("id", id);
//			2. 응답에 저장
			response.addCookie(cookie);
		} else {
			// 쿠키를 삭제
			Cookie cookie = new Cookie("id", id);
			cookie.setMaxAge(0);
//			2. 응답에 저장
			response.addCookie(cookie);
		}
//		3. 홈으로 이동
		return "redirect:/";
>>>>>>> ea0814e3185df4db3e6d2bc9422fbff170cbc5fb
	}

	private boolean loginCheck(String id, String pwd) {
		return "asdf".equals(id) && "1234".equals(pwd);
	}
}
