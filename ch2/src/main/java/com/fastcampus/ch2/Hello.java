package com.fastcampus.ch2;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

// 1. 원격 호출가능한 프로그램으로 등록
@Controller
public class Hello {
<<<<<<< HEAD
	int iv = 10; // 인스턴스 변수
	static int cv = 20; // static변수
	
	// 2. URL과 메서드를 연결
	@RequestMapping("/hello")
	private void main() { // 인스턴스 메서드 - iv, cv를 둘다 사용가능
		System.out.println("Hello - private ");
		System.out.println(cv); // OK
//		System.out.println(iv); // OK		
	}
	
	public static void main2() { // static메서드 - cv만 사용가능
		System.out.println(cv); // OK
//		System.out.println(iv); // 에러
=======
	int iv = 10;		// 인스턴스 변수
	static int cv = 20;	// static 변수
	
	// 2. URL과 메서드를 연결
	@RequestMapping("/hello")
	// 인스턴스 메서드 - iv, cv를 둘 다 사용가능
	private void main() {	
		System.out.println("Hello");
		System.out.println(cv);	// OK
		System.out.println(iv);	// OK
	}
	
	// static 메서드 - cv만 사용가능
	public static void main2() {	
		System.out.println(cv);	// OK
//		System.out.println(iv);	// 에러
>>>>>>> ea0814e3185df4db3e6d2bc9422fbff170cbc5fb
	}
}
