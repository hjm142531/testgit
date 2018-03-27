/**
 * 
 */
package com.bw.hu.lianxi;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;

/**
 * @author 胡建明
 *
 * 2018年3月14日下午9:38:28
 */
public class Lianxi0314 {

	@SuppressWarnings("resource")
	public static void main(String[] args) {
		String fileDir = "E:"+File.separator+"hu";
		String fileString = "www.txt";
		File file = new File(fileDir);
		
		System.out.println(fileDir);
		OutputStream outputStream = null;
		if(!file.isDirectory()){
			file.mkdirs();
		}
		String filePathString = fileDir+File.separator+fileString;
		File file2 = new File(filePathString);
		try {
			file2.createNewFile();
			outputStream = new FileOutputStream(file2);
			String string = "学习使你快乐！";
			outputStream.write(string.getBytes());
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

	
}
