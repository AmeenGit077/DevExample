package base.bobvic.web.controller;

import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

import org.springframework.web.multipart.MultipartFile;
import org.springframework.web.servlet.ModelAndView;

public class AllBaseRequirement {

	public ModelAndView allProcess(String uName, String pwd) {
		
		ModelAndView model=new ModelAndView();
		String userName="v";
		String passWord="v";
		if(userName.equalsIgnoreCase(uName) || passWord.equalsIgnoreCase(pwd)){
			System.out.println("Inside Login");
			model.setViewName("data");	
		}else{
			model.setViewName("login");
		}
		return model;
	}

	public ModelAndView multyPartFileProcess(MultipartFile myFile ) {
		System.out.println("***************Inside multipart File*********************");
		
		ModelAndView model =new ModelAndView();
		System.out.println(myFile.getOriginalFilename().toString());
		try {
			System.out.println("----------------------CsvUpload Services Started--------------------------");
			
			byte[] bytes = myFile.getBytes();
			
			String path[]=myFile.getOriginalFilename().toString().split("\\.");
			String inputCsv="C:/Users/win7/Downloads/DevExampleMfile"+path[0]+"."+path[1];
			
			BufferedOutputStream stream = new BufferedOutputStream(new FileOutputStream(new File(inputCsv)));
	        stream.write(bytes);
	        stream.close();

	        System.out.println("----------------------CsvUpload Services Ended--------------------------");
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		model.setViewName("data");
		return model;
	}
}
