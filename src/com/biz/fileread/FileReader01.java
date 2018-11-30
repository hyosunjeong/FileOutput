package com.biz.fileread;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class FileReader01 {

	/*
	 * 파일을 저장할 때 몇개(라인)을 저장할지 알고 있다.
	 * 하지만 읽을때는 몇개가 저장되어 있는지 모르는 경우가 대부분이다.
	 * 그래서 읽을때는 읽는 방법을 연구할 필요가 있다.
	 */
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String readFile ="D:/bizwork/workspace/ExFiles/gradeList.txt";
		
		// 파일을 읽기 위한 GileReader 객체 선언
		FileReader fr;
		
		
			try {
				
				fr = new FileReader(readFile); 
				
			/*	// 파일을 읽을 때 몇개(몇라인)이나 읽어야 될지 모르는 상황에서
				// 읽을 라인을 설정하는 것은 좋은 방법이 아니다.
				for(int i = 0; i < 30; i++) {
					int intRead = fr.read(); // (fr.read() => 파일로부터 한 줄을 읽어라) 
					System.out.print((char)intRead);
				}*/
				
				// 파일을 읽을 때는 while() 반복문을 사용해서  
				// 읽는것이 기본코드 원칙이다.
				while(true) {
					int intRead = fr.read();
					if(intRead < 0) {
						break;
					}
					System.out.print((char)intRead);
				}
				
			} catch (FileNotFoundException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		

	}

}
