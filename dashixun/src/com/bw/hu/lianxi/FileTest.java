/**
 * 
 */
package com.bw.hu.lianxi;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.Reader;

/**
 * @author 胡建明
 *
 * 2018年2月9日上午10:21:55
 */
public class FileTest {

	@SuppressWarnings("resource")
	public static void main(String[] args) {
	String file = "E:"+File.separator+"1510c.txt";
	File file2 = new File(file);
	System.out.println(file2);
	try {
		file2.createNewFile();
	} catch (IOException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	try {
		FileOutputStream outputStream = new FileOutputStream(file2);
		String s = "你好";
		try {
			outputStream.write(s.getBytes());
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	} catch (FileNotFoundException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	
	}
}
