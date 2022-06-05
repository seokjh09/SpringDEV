package com.fastcampus.ch2;

<<<<<<< HEAD
=======
import java.io.IOException;
>>>>>>> ea0814e3185df4db3e6d2bc9422fbff170cbc5fb
import java.util.Calendar;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
<<<<<<< HEAD
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class YoilTellerMVC5 {
	@ExceptionHandler(Exception.class)
	public String catcher(Exception ex, BindingResult result) {
		   System.out.println("result="+result);
=======
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

// ������� �Է��ϸ� ������ �˷��ִ� ���α׷�
@Controller
public class YoilTellerMVC5 {
	@ExceptionHandler(Exception.class)
	public String catcher(Exception ex) {
>>>>>>> ea0814e3185df4db3e6d2bc9422fbff170cbc5fb
		ex.printStackTrace();
		return "yoilError";
	}
	
<<<<<<< HEAD
    @RequestMapping("/getYoilMVC5") // http://localhost/ch2/getYoilMVC6
//    public String main(@ModelAttribute("myDate") MyDate date, Model model) { // �Ʒ��� ����
        public String main(MyDate date, BindingResult result) {
   System.out.println("result="+result);
 
        // 1. ��ȿ�� �˻�
    	if(!isValid(date)) 
    		return "yoilError";  // ��ȿ���� ������, /WEB-INF/views/yoilError.jsp�� �̵�
    	
        // 2. ó��
//    	char yoil = getYoil(date);

        // 3. Model�� �۾� ��� ����
//        model.addAttribute("myDate", date);
//        model.addAttribute("yoil", yoil);
        
        // 4. �۾� ����� ������ View�� �̸��� ��ȯ
        return "yoil"; // /WEB-INF/views/yoil.jsp
    }
    
    private boolean isValid(MyDate date) {
		return isValid(date.getYear(), date.getMonth(), date.getDay());
=======
	@RequestMapping("/getYoilMVC5")
//	public String main(@ModelAttribute("myDate") MyDate date, Model model) throws IOException {
	public String main(@ModelAttribute MyDate date, Model model) throws IOException {

		// 1. ��ȿ�� �˻�
		if(!isValid(date))
			return "yoilError";
		
		// 2. ���� ���
//		char yoil = getYoil(date);
		
		// 3. ����� ����� model�� ����
//		model.addAttribute("myDate", date);
//		model.addAttribute("yoil", yoil);
		
		// 4. �۾� ����� ������ view�� �̸��� ��ȯ
		return "yoil";  //WEB-INF/views/yoil.jsp

>>>>>>> ea0814e3185df4db3e6d2bc9422fbff170cbc5fb
	}

	private @ModelAttribute("yoil") char getYoil(MyDate date) {
		return getYoil(date.getYear(), date.getMonth(), date.getDay());
	}

	private char getYoil(int year, int month, int day) {
<<<<<<< HEAD
        Calendar cal = Calendar.getInstance();
        cal.set(year, month - 1, day);

        int dayOfWeek = cal.get(Calendar.DAY_OF_WEEK);
        return " �Ͽ�ȭ�������".charAt(dayOfWeek);
    }
    
    private boolean isValid(int year, int month, int day) {    
    	if(year==-1 || month==-1 || day==-1) 
    		return false;
    	
    	return (1<=month && month<=12) && (1<=day && day<=31); // ������ üũ 
    }
} 
=======
		Calendar cal = Calendar.getInstance();
		cal.set(year, month - 1, day);
		
		int dayOfWeek = cal.get(Calendar.DAY_OF_WEEK);
		return " �Ͽ�ȭ�������".charAt(dayOfWeek);
	}
	
	private boolean isValid(MyDate date) {
		return isValid(date.getYear(), date.getMonth(), date.getDay());
	}
	
	private boolean isValid(int year, int month, int day) {
		if(year==-1 || month==-1 || day==-1)
			return false;
		
		return (1<=month && month<=12) && (1<=day && day<=31);
	}

}
>>>>>>> ea0814e3185df4db3e6d2bc9422fbff170cbc5fb
