package com.atguigu.myfile;
import java.io.*;
public class exercise05 {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		InputStream input = new FileInputStream("hello.txt");
		OutputStream output2 = new FileOutputStream("hello2.txt");
		try {
			ByteArrayOutputStream output = new ByteArrayOutputStream();
			byte[] buf = new byte[1024];
			int bytesread = 0;
			
			while((bytesread = input.read(buf))!=-1) {
				output.write(buf,0,bytesread);
			}
			
			String data = output.toString("UTF-8");
			
			byte[] data2 = output.toByteArray();
			
			System.out.println(data);
			System.out.println(data2);
			
			output.writeTo(output2);
			
			System.out.println(output.size());
		}finally {
			input.close();
		}
		
	}

}
