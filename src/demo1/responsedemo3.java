package demo1;

import java.io.IOException;
import java.io.OutputStream;

import javax.servlet.ServletException;
import javax.servlet.ServletOutputStream;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.xml.ws.Response;

/**
 * Servlet implementation class responsedemo3
 */
public class responsedemo3 extends HttpServlet {
	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	   //使用字节流输出中文
//		ServletOutputStream servletOutputStream=response.getOutputStream();
//	   response.setHeader("Content-Type", "text/html;charset=UTF-8");
//	   servletOutputStream.write("中文".getBytes("UTF-8"));
		//使用字符流输出中文
//		response.getWriter().println("中文");
		//一定会产生乱码
//		字符流有缓冲区的，response获得字符流，response设计编码是iso-8859-1
//		不支持中文
//		设置response字符流缓冲区的编码，设置浏览器打开时编码
//		response.setHeader("content-type", "text/html;charset=UTF-8");
//		response.setCharacterEncoding("UTF-8");
		response.setContentType("text/html;charset=UTF-8");
		//简化代码 ，一句顶上面两句
		response.getWriter().println("中文");
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doGet(request, response);
	}

}
