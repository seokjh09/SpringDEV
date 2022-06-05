package com.fastcampus.ch2;

import java.lang.reflect.Method;

public class PrivateMethodCall {
<<<<<<< HEAD
	public static void main(String[] args) throws Exception{
//		Hello hello = new Hello();
//		hello.main(); // private�̶� �ܺ� ȣ�� �Ұ�
		
		// Reflection API�� ��� - Ŭ���� ������ ��� �ٷ� �� �ִ� ������ �������
		// java.lang.reflect��Ű���� ����
		// HelloŬ������ Class��ü(Ŭ������ ������ ��� �ִ� ��ü)�� ���´�.
		Class helloClass = Class.forName("com.fastcampus.ch2.Hello");
		Hello hello = (Hello)helloClass.newInstance(); // Class��ü�� ���� ������ ��ü ���� 
		Method main = helloClass.getDeclaredMethod("main");
		main.setAccessible(true); // priavte�� main()�� ȣ�Ⱑ���ϰ� �Ѵ�.
		
		main.invoke(hello); // hello.main()
		
=======
	public static void main(String[] args) throws Exception {
//		Hello hello = new Hello();
//		hello.main();	// private�̶� �ܺ� ȣ�� �Ұ�
		
		// Reflection API�� ��� - Ŭ������ ��� �ٷ� �� �ִ� ������ ��� ����
		// java.lang.reflect ��Ű���� ����
		// Hello Ŭ������ Class ��ü(Ŭ������ ������ ��� �ִ� ��ü)�� ���´�.
		Class helloClass = Class.forName("com.fastcampus.ch2.Hello");
		Hello hello = (Hello)helloClass.newInstance();	// Class�� ���� ������ ��ü ����
		Method main = helloClass.getDeclaredMethod("main");
		main.setAccessible(true);	// private�� main()�� ȣ�Ⱑ���ϰ� �Ѵ�.
		
		main.invoke(hello);	// hello.main()
>>>>>>> ea0814e3185df4db3e6d2bc9422fbff170cbc5fb
	}
}
