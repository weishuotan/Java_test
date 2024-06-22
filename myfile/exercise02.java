package com.atguigu.myfile;

import java.io.*;

public class exercise02 {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		InputStream input = new FileInputStream("hello.txt");
		
		try {
			byte[] buf = new byte[1024];
			int bytesread = input.read(buf);
			String data = new String(buf,0,bytesread,"UTF-8");
			System.out.println(data);
			System.out.println(bytesread);
		}finally {
			input.close();
		}
		
	}

}
