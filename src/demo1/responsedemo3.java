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
	   //ʹ���ֽ����������
//		ServletOutputStream servletOutputStream=response.getOutputStream();
//	   response.setHeader("Content-Type", "text/html;charset=UTF-8");
//	   servletOutputStream.write("����".getBytes("UTF-8"));
		//ʹ���ַ����������
//		response.getWriter().println("����");
		//һ�����������
//		�ַ����л������ģ�response����ַ�����response��Ʊ�����iso-8859-1
//		��֧������
//		����response�ַ����������ı��룬�����������ʱ����
//		response.setHeader("content-type", "text/html;charset=UTF-8");
//		response.setCharacterEncoding("UTF-8");
		response.setContentType("text/html;charset=UTF-8");
		//�򻯴��� ��һ�䶥��������
		response.getWriter().println("����");
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doGet(request, response);
	}

}
