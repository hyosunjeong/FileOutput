package com.biz.fileread;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class FileReader02 {

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
		
		// TextFile을 읽을 때는 FileReader를 다른 Reader에 연결해서
		// 읽는것이 편리하다.
		
		BufferedReader buffer;
		
			try {
				//FileReader로 읽을 파일을 open하고
				fr = new FileReader(readFile); 
				
				// 그 정보를 BufferedReader에게 전달하면
				// BufferedReader는 모든 파일을 읽어서
				// 메모리 buffer에 저장 해 둔다.
				buffer = new BufferedReader(fr);
				
				// buffer에서 파일 내용을 읽기
				while(true) {

					// buffer에게 한 라인을 읽어서 문자열로 return 해달라고 요청
					String strLine = buffer.readLine();
					
					// 만약 buffer가 return한 문자열이 null이면
					// 더이상 읽을 내용이 없다는 것이다.
					if(strLine == null) {
						// 그래서 읽기를 종료한다.
						break;
					}
					
					// null이 아니면 console에 내용을 보여라
					System.out.println(strLine);
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
