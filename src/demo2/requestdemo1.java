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
          System.out.println("����ʽ��"+request.getMethod());
         System.out.println("�ͻ�IP��ַ��"+ request.getRemoteAddr());
         System.out.println("����������ַ�����"+request.getQueryString());
         System.out.println("����·����URL:"+request.getRequestURL());
         System.out.println("����·����URI:"+request.getRequestURI());
         System.out.println("��ȡ�ͻ�������������ͣ�"+request.getHeader("user-agent"));
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		doGet(request, response);
	}

}
