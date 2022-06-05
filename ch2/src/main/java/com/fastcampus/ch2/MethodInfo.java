package com.fastcampus.ch2;

import java.lang.reflect.Method;
import java.lang.reflect.Parameter;
import java.util.StringJoiner;

public class MethodInfo {
	public static void main(String[] args) throws Exception{

<<<<<<< HEAD
		// 1. YoilTellerŬ������ ��ü�� ���� 
=======
		// 1. YoilTeller Ŭ������ ��ü ����
>>>>>>> ea0814e3185df4db3e6d2bc9422fbff170cbc5fb
		Class clazz = Class.forName("com.fastcampus.ch2.YoilTellerMVC");
		Object obj = clazz.newInstance();
		
		// 2. ��� �޼��� ������ �����ͼ� �迭�� ����
		Method[] methodArr = clazz.getDeclaredMethods();
		
		for(Method m : methodArr) {
<<<<<<< HEAD
			String name = m.getName(); // �޼����� �̸� 
			Parameter[] paramArr = m.getParameters(); // �Ű����� ��� 
//			Class[] paramTypeArr = m.getParameterTypes();
			Class returnType = m.getReturnType(); // ��ȯ Ÿ�� 
=======
			String name = m.getName();  // �޼����� �̸�
			Parameter[] paramArr = m.getParameters();  // �Ű����� ���
//			Class[] paramTypeArr = m.getParameterTypes();
			Class returnType = m.getReturnType();  // ��ȯ Ÿ��
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
