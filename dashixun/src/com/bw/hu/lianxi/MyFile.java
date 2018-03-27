/**
 * 
 */
package com.bw.hu.lianxi;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.OutputStream;
import java.io.PrintStream;
import java.io.PrintWriter;

/**
 * @author 胡建明
 *
 * 2018年2月6日上午9:02:04
 */
public class MyFile {

	@SuppressWarnings("resource")
	public static void main(String[] args) throws FileNotFoundException {
		String hjm = "E:" + File.separator + "hujianming.txt";
		File file = new File(hjm);
		if(!file.exists()){
			try {
				file.createNewFile();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
//		try {
//			PrintStream stream = new PrintStream(hjm);
//			stream.println("2018-02-06");
//		} catch (FileNotFoundException e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		}
		PrintWriter printWriter = new PrintWriter(hjm);
		try {
			printWriter.write("2018-02-06");
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally {
			printWriter.close();
		}
		
	}
}
