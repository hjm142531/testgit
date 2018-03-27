/**
 * 
 */
package com.bw.hu.web;

import java.io.FileOutputStream;
import java.io.OutputStream;
import java.io.UnsupportedEncodingException;
import java.net.URLEncoder;
import java.util.Date;
import java.util.List;

import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServletResponse;

import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.bw.hu.entity.User;
import com.bw.hu.service.LianxiService;

/**
 * @author 胡建明
 *
 * 2018年3月17日上午9:28:16
 */
@Controller
public class LianxiController {

	@Autowired
	private LianxiService lianxiService;
	
	@RequestMapping("list")
	@ResponseBody
	public List<User> list(){
		List<User> list = lianxiService.selectAll();
		
		HSSFWorkbook wb = new HSSFWorkbook();
		Sheet sheet = wb.createSheet("111");
		
		// List<ItemCat> list=JdbcUtils.getList(ItemCat.class, "select * from vip");

         
          //创建行
          Row row=sheet.createRow(0);
          //创建单元格。这里是把数据库的字段写到第一行单元格
          row.createCell(0).setCellValue("ID");
          row.createCell(1).setCellValue("name");
          row.createCell(2).setCellValue("sex");
          row.createCell(3).setCellValue("code");
           //循环将数据写入到excel
            int i=1;
               for (User vip : list) {
                  row=sheet.createRow(i);
                  row.createCell(0).setCellValue(vip.getId());
                  row.createCell(1).setCellValue(vip.getName());
                  row.createCell(2).setCellValue(vip.getSex());
                  row.createCell(3).setCellValue(vip.getCode());
                  i++;
               }
         //输出
          OutputStream out;
		try {
			out = new FileOutputStream("G://Test.xls");
			wb.write(out);
	        out.close();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
          
          System.out.println("OK");
		
		return list;
	}
	
	@RequestMapping("upload")
	public String upload(){
		return "upload";
	}
	/*@RequestMapping(value="doUpload",method=RequestMethod.POST)
	public String doUpload(@RequestParam("file") MultipartFile file){
		if(!file.isEmpty()){  
            try {  
                  
                //这里将上传得到的文件保存至 d:\\temp\\file 目录  
                FileUtils.copyInputStreamToFile(file.getInputStream(), new File("G:\\temp\\file\\",   
                        System.currentTimeMillis()+ file.getOriginalFilename()));  
            } catch (IOException e) {  
                e.printStackTrace();  
            }  
        }  
		return "success";
	}*/
	@RequestMapping("getCookie")
	public String getCookie(HttpServletResponse response) throws Exception{
		String name = "张三";
		String sex = "男";
		String age = "13";
		
		Cookie cookie = new Cookie("name", URLEncoder.encode(name, "UTF-8"));
		Cookie cookie1 = new Cookie("sex", URLEncoder.encode(sex, "UTF-8"));
		Cookie cookie2 = new Cookie("age", URLEncoder.encode(age, "UTF-8"));
		cookie.setMaxAge(60*60*24*365*5);
		response.addCookie(cookie);
		response.addCookie(cookie1);
		response.addCookie(cookie2);
		return "cookie";
	}
	
}
