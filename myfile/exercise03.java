package com.atguigu.myfile;

import java.io.*;

public class exercise03 {

	public static void main(String[] args) throws IOException{
		// TODO Auto-generated method stub
		InputStream input = new FileInputStream("hello.txt");
		
		try {
			byte[] buf = new byte[1024];
			int b=-1;
			int bytesread = 0;
			while((b=input.read())!=-1) {
				buf[bytesread++] = (byte)b;
			}
			String data = new String(buf,0,bytesread,"UTF-8");
			System.out.println(data);
		}finally {
			input.close();
		}
		
	}

}
