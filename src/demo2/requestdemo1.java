package demo2;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class requestdemo1
 */
public class requestdemo1 extends HttpServlet {

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
          System.out.println("请求方式："+request.getMethod());
         System.out.println("客户IP地址："+ request.getRemoteAddr());
         System.out.println("请求参数的字符串："+request.getQueryString());
         System.out.println("请求路径的URL:"+request.getRequestURL());
         System.out.println("请求路径的URI:"+request.getRequestURI());
         System.out.println("获取客户机浏览器的类型："+request.getHeader("user-agent"));
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		doGet(request, response);
	}

}
