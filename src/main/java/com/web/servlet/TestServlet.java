/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.web.servlet;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.annotation.MultipartConfig;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author User
 */


@WebServlet(urlPatterns = {"/servlet/test"})
@MultipartConfig(
        fileSizeThreshold = 1024 * 1024 * 1,
        maxFileSize = 1024 * 1024 * 10,
        maxRequestSize = 1024 * 1024 * 20,
        location = "C:/upload"
)
public class TestServlet extends HttpServlet{

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
            File file = new File("C:\\temp2");
	    listDir(file,resp);	//列出當前路徑下的所有檔案以及資料夾路徑
    }
     public static void listDir(File file ,HttpServletResponse resp)throws ServletException, IOException {
        String newPath = "C:\\upload";
        PrintWriter out = resp.getWriter();
        if(file.isDirectory()){	 // 是一個目錄
            // 列出目錄中的全部內容
            File results[] = file.listFiles();
            if(results != null){
                for(int i=0;i<results.length;i++){
                    listDir(results[i],resp);	// 繼續一次判斷
                }
            }
        }
        else{	// 是檔案
            String fileStr = (file.getName()).toString();
            String fileFormat = "JPG,PNG,MP4";
            String suffixStr = "";
            if(null != fileStr && !"".equals(fileStr)){
                suffixStr = fileStr.substring(fileStr.lastIndexOf(".")+1,
                        fileStr.length());
                if(fileFormat.indexOf(suffixStr.toUpperCase()) != -1){
                    newPath = newPath + "/" + fileStr;
//                    copyFile(file,newPath);
                    System.out.println(fileStr);
                    String imagePath = "/JavaWeb0727/servlet/image?fname=" + fileStr;
                    out.println(String.format("<p><img width='150' src='%s'>", imagePath));
                }
            }
        
        }
        //file.delete(); //刪除!!!!! 根目錄,慎操作
        //獲取完整路徑
//                             out.print(file.getName());
        
    }

	/**
	 * 拷貝檔案到指定目錄
	 * @param oldFile
	 * @param newPath
	 */
    public static void copyFile(File oldFile, String newPath){
        try{
            if (oldFile.isFile()) {
                FileInputStream input = new FileInputStream(oldFile);
                FileOutputStream output = new FileOutputStream(newPath);
                byte[] b = new byte[1024 * 5];
                int len;
                while ((len = input.read(b)) != -1) {
                    output.write(b, 0, len);
                }
                output.flush();
                output.close();
                input.close();
            }
        }catch(Exception e){
            e.printStackTrace();
        }
    }
}
