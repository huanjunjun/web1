package demo1;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class responsedemo1
 */
public class responsedemo1 extends HttpServlet {       
    


	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		//response.setStatus(302);
		//����״̬��
		//����ӦӦͷ
		//response.setHeader("location", "/web1/responsedemo2");
		
		//��ʱˢ��
		response.setContentType("text/html;charset=UTF-8");
		response.getWriter().println("����֮��ҳ����ת��");
		
		response.setHeader("refresh", "5;url=/web1/responsedemo2");
		
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
