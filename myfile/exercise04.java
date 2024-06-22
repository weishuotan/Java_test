package com.atguigu.myfile;
import java.io.*;
public class exercise04 {

	public static void main(String[] args) throws IOException{
		// TODO Auto-generated method stub
		InputStream input = new FileInputStream("hello.txt");
		
		try {
			byte[] buf = new byte[1024];
			int off = 0;
			int bytesread = 0;
			while((bytesread = input.read(buf, off, 1024-off))!=-1) {
				off = off+bytesread;
			}
			String data = new String(buf,0,off,"UTF-8");
			System.out.println(data);
		}finally {
			input.close();
		}
		
	}

}
