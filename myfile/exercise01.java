package com.atguigu.myfile;

import java.io.*;
import java.nio.charset.Charset;

public class exercise01 {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		OutputStream output = new FileOutputStream("hello.txt");
		
		try {
			String data = "hello, 123, 老马";
			byte[] bytes = data.getBytes(Charset.forName("UTF-8"));
			output.write(bytes);
		}finally {
			output.close();
		}
		
		
	}
	

}
