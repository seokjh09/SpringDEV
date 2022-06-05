package com.fastcampus.ch2;

import java.lang.reflect.Method;
import java.lang.reflect.Parameter;
import java.util.StringJoiner;

public class MethodInfo {
	public static void main(String[] args) throws Exception{

<<<<<<< HEAD
		// 1. YoilTeller클래스의 객체를 생성 
=======
		// 1. YoilTeller 클래스의 객체 생성
>>>>>>> ea0814e3185df4db3e6d2bc9422fbff170cbc5fb
		Class clazz = Class.forName("com.fastcampus.ch2.YoilTellerMVC");
		Object obj = clazz.newInstance();
		
		// 2. 모든 메서드 정보를 가져와서 배열에 저장
		Method[] methodArr = clazz.getDeclaredMethods();
		
		for(Method m : methodArr) {
<<<<<<< HEAD
			String name = m.getName(); // 메서드의 이름 
			Parameter[] paramArr = m.getParameters(); // 매개변수 목록 
//			Class[] paramTypeArr = m.getParameterTypes();
			Class returnType = m.getReturnType(); // 반환 타입 
=======
			String name = m.getName();  // 메서드의 이름
			Parameter[] paramArr = m.getParameters();  // 매개변수 목록
//			Class[] paramTypeArr = m.getParameterTypes();
			Class returnType = m.getReturnType();  // 반환 타입
>>>>>>> ea0814e3185df4db3e6d2bc9422fbff170cbc5fb
			
			StringJoiner paramList = new StringJoiner(", ", "(", ")");
			
			for(Parameter param : paramArr) {
				String paramName = param.getName();
				Class  paramType = param.getType();
				
				paramList.add(paramType.getName() + " " + paramName);
			}
			
			System.out.printf("%s %s%s%n", returnType.getName(), name, paramList);
		}
	} // main
<<<<<<< HEAD
}
=======
}
>>>>>>> ea0814e3185df4db3e6d2bc9422fbff170cbc5fb
