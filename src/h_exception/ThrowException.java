package h_exception;

import java.io.IOException;

public class ThrowException {

	public static void main(String[] args){
		/*
		 * 예외 발생시키기
		 * - throw new Exception();
		 * - throw 예약어와 예외 클래스의 객체로 예외를 고의로 발생시킬 수 있다.
		 * 
		 */
		
		IOException ioe = new IOException();
		
		try {
			//runfileexception()의 자식이 아니라서 안해주면 컴파일에러가 뜬다.
			throw ioe;
		} catch (IOException e) {
			e.printStackTrace();
		}
		//runfileexception()의 자식이라서 안해줘도 된다.
		throw new NullPointerException();
		
		
	}
}
