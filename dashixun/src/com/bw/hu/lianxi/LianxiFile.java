/**
 * 
 */
package com.bw.hu.lianxi;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.PrintWriter;

/**
 * @author 胡建明
 *
 * 2018年2月7日下午8:50:09
 */
public class LianxiFile {

	@SuppressWarnings("resource")
	public static void main(String[] args) {
		String s = "E:" + File.separator + "file.txt";
		File file = new File(s);
		try {
			file.createNewFile();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		try {
			OutputStreamWriter writer = new OutputStreamWriter(new FileOutputStream(file));
			try {
				writer.write("HelloWorld");
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}finally {
				try {
					writer.close();
				} catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}	
		try {
			InputStreamReader reader = new InputStreamReader(new FileInputStream(file));
			char[] c = new char[1024];
			try {
				int read = reader.read(c);
				System.out.println(new String(c,0,read));
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
